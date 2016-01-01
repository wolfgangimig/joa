/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa;

import com.wilutions.com.AsyncResult;
import com.wilutions.com.BackgTask;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.DispatchImpl;
import com.wilutions.com.WindowHandle;
import com.wilutions.com.reg.DeclRegistryValue;
import com.wilutions.mslib.office.CustomTaskPane;
import com.wilutions.mslib.office.MsoCTPDockPosition;
import com.wilutions.mslib.office._CustomTaskPane;
import com.wilutions.mslib.office._CustomTaskPaneEvents;

/**
 * Base class for task panes.
 * This class wraps a native task pane COM object that is created by 
 * the Microsoft Office application in a call to {@link OfficeAddin#createTaskPaneWindowAsync}.
 * When a TaskPane object is shown in {@link #show}, it is attached to the event interface 
 * {@link _CustomTaskPaneEvents} of the COM object.  
 * http://msdn.microsoft.com/en-us/library/microsoft.office.core._customtaskpaneevents_members.aspx
 * @see http://msdn.microsoft.com/en-us/library/aa942864.aspx
 */
public abstract class TaskPane extends DispatchImpl implements WindowHandle, _CustomTaskPaneEvents {

	/**
	 * Task pane object of the Office application.
	 */
	protected CustomTaskPane customTaskPane;
	
	/**
	 * Persistent dock position.
	 * This member is load and stored in the Windows registry.
	 */
	@DeclRegistryValue("dockPosition")
	MsoCTPDockPosition reg_dockPosition = MsoCTPDockPosition.msoCTPDockPositionRight;

	/**
	 * Persistent visibility.
	 */
	@DeclRegistryValue
	private boolean reg_visible;
	
	/**
	 * Persistent width.
	 * Ignored for top or bottom docking positions.
	 */
	@DeclRegistryValue
	private int reg_width;
	
	/**
	 * Persistent height.
	 * Ignored for left or right docking positions.
	 */
	@DeclRegistryValue
	private int reg_height;

	
	/**
	 * Constructor.
	 */
	public TaskPane() {
	}

	/**
	 * Delete the task pane's view objects.
	 * Call this function to close the task pane.	
	 */
	public void close() {
		
		if (customTaskPane != null) {
			
			// Remind dock position and visibility in persistent members.
			try {
				reg_dockPosition = customTaskPane.getDockPosition();
				reg_visible = customTaskPane.getVisible();
				reg_width = customTaskPane.getWidth();
				reg_height = customTaskPane.getHeight();
			} catch (ComException e) {
				e.printStackTrace();
			}
			
			// DO NOT DELETE CTP, 
			// This causes a crash in Outlook in customTaskPane.releaseComObject
			//customTaskPane.Delete();
			
			// Release the underlying COM object.
			customTaskPane.releaseComObject();		
		}
		
	}
	
	/**
	 * Create and show the task pane's view.
	 * @param hwndParent Native parent window handle.
	 * @param asyncResult Expression to be called after the new task pane was made visible. 
	 * This call is made from the Tookit's UI thread. This parameter can be null. 
	 */
	protected abstract void createAndShowEmbeddedWindowAsync(final long hwndParent, AsyncResult<Boolean> asyncResult);

	/**
	 * Build a Java window inside the given task pane created by Office.
	 * @param taskPane COM object created by Office in a call to {@link OfficeAddin#createTaskPaneWindowAsync(TaskPane, String, Object, com.wilutions.com.AsyncResult)}.
	 * @param asyncResult Callback object to be called after the new task pane is made visible. This parameter can be null. 
	 * @throws ComException
	 */
	public void showAsync(final CustomTaskPane taskPane, AsyncResult<Boolean> asyncResult) throws ComException {

		this.customTaskPane = taskPane;
		
		// Attach this object as event handler for _CustomTaskPaneEvents.
		this.customTaskPane.withEvents(this);

		// Show the task pane at the last dock position.
		customTaskPane.setDockPosition(reg_dockPosition);
		
		// Width/Height
		switch (reg_dockPosition.value) {
		case MsoCTPDockPosition._msoCTPDockPositionLeft:
		case MsoCTPDockPosition._msoCTPDockPositionRight:
			if (reg_width != 0) customTaskPane.setWidth(reg_width);
			break;
		case MsoCTPDockPosition._msoCTPDockPositionTop:
		case MsoCTPDockPosition._msoCTPDockPositionBottom:
			if (reg_height != 0) customTaskPane.setHeight(reg_height);
			break;
		default:
			if (reg_width != 0) customTaskPane.setWidth(reg_width);
			if (reg_height != 0) customTaskPane.setHeight(reg_height);			
		}
		
		// Show the task pane
		if (reg_visible) {
			setVisible(true);
		}
				
		// OfficeAddin.createTaskPaneWindowAsync has created the task pane 
		// and delegates the UI handling to the JoaBridgeCtrl ActiveX.
		// We use the JoaBridgeCtrl as the parent window for the Java window.
		
		// Get the native window handle of the JoaBridgeCtrl
		Dispatch ctrl = taskPane.getContentControl().as(Dispatch.class);
		final long hwndJoaCtrl = ((Number) ctrl._get("HWND")).longValue();
		
		// Create view
		createAndShowEmbeddedWindowAsync(hwndJoaCtrl, asyncResult);
	}

	@Override
	public void onDockPositionStateChange(final _CustomTaskPane ctp) throws ComException {
	}

	@Override
	public void onVisibleStateChange(final _CustomTaskPane ctp) throws ComException {
	}

	/**
	 * Returns true, if the task pane is visible.
	 * @return true, if visible.
	 * @throws ComException
	 */
	public boolean isVisible() throws ComException {
		return customTaskPane != null && customTaskPane.getVisible();
	}

	/**
	 * Show or hide the task pane.
	 * @param v 
	 * @throws ComException
	 */
	public void setVisible(final boolean v) throws ComException {
		setVisible(v, null);
	}

	/**
	 * Show or hide the task pane.
	 * @param v 
	 * @param asyncResult
	 * @throws ComException
	 */
	public void setVisible(final boolean v, AsyncResult<Boolean> asyncResult) throws ComException {
		// Call taskPane.setVisible in background thread.
		// Otherwise Outlook/Java might hang in setVisible().
		if (customTaskPane != null && v != isVisible()) {
			BackgTask.run(() -> {
				Throwable ex = null;
				try {
					customTaskPane.setVisible(Boolean.valueOf(v));
					reg_visible = v;
				} catch (ComException e) {
					e.printStackTrace();
					ex = e;
				}
				finally {
					if (asyncResult != null) {
						asyncResult.setAsyncResult(ex == null, ex);
					}
				}
			});
		}
	}

	/**
	 * Return true, if Office has created a native task pane object.
	 * @return true, if native task pane object was created.
	 */
	public boolean hasWindow() {
		return customTaskPane != null;
	}
	
	
}
