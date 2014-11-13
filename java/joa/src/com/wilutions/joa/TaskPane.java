/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.stage.WindowEvent;

import com.wilutions.com.BackgTask;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.DispatchImpl;
import com.wilutions.com.reg.DeclRegistryValue;
import com.wilutions.joa.fx.EmbeddedWindow;
import com.wilutions.joa.fx.EmbeddedWindowFactory;
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
public abstract class TaskPane extends DispatchImpl implements _CustomTaskPaneEvents {

	/**
	 * Task pane object of the Office application.
	 */
	protected CustomTaskPane customTaskPane;
	
	/**
	 * JavaFX view.
	 */
	protected volatile EmbeddedWindow fxFrame;
	
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
	 * Event handlers usually added to a Stage.
	 * Currently, only WindowEvent.WINDOW_SHOWN is supported.
	 */
	private EventHandler<WindowEvent> eventHandlerWindowShown;
	
	/**
	 * Constructor.
	 */
	public TaskPane() {
	}

	/**
	 * Delete the task pane's view objects.
	 * Call this function to close the task pane.	
	 */
	public void dispose() {
		
		if (customTaskPane != null) {
			
			// Remind dock position and visibility in persistent members.
			try {
				reg_dockPosition = customTaskPane.getDockPosition();
				reg_visible = customTaskPane.getVisible();
			} catch (ComException e) {
				e.printStackTrace();
			}
			
			// DO NOT DELETE CTP, 
			// This causes a crash in Outlook in customTaskPane.releaseComObject
			//customTaskPane.Delete();
			
			// Release the underlying COM object.
			customTaskPane.releaseComObject();		
		}
		
		// Remove the JavaFX view.
		if (fxFrame != null) {
			fxFrame.dispose();
			// ? Platform.runLater(() -> fxFrame.dispose());
		}
		
		System.out.println("TaskPane.dispose");
	}

	/**
	 * Create JavaFX scene.
	 * @return Scene object
	 * @throws ComException
	 */
	protected abstract Scene createScene() throws ComException;

	/**
	 * Build a Java window inside the given task pane created by Office.
	 * @param taskPane COM object created by Office in a call to {@link OfficeAddin#createTaskPaneWindowAsync(TaskPane, String, Object, com.wilutions.com.AsyncResult)}.
	 * @throws ComException
	 */
	public void show(final CustomTaskPane taskPane) throws ComException {

		this.customTaskPane = taskPane;
		
		// Attach this object as event handler for _CustomTaskPaneEvents.
		this.customTaskPane.withEvents(this);

		// Show the task pane at the last dock position.
		customTaskPane.setDockPosition(reg_dockPosition);
		
		// Show the task pane
		if (reg_visible) {
			setVisible(true);
		}
				
		// OfficeAddin.createTaskPaneWindowAsync has created the task pane 
		// and delegates the UI handling to the JoaBridgeCtrl ActiveX.
		// We use the JoaBridgeCtrl as the parent window for the Java window.
		
		// Get the native window handle of the JoaBridgeCtrl
		Dispatch ctrl = taskPane.getContentControl();
		final long hwndJoaCtrl = ((Number) ctrl._get("HWND")).longValue();
		System.out.println("hwndJoaCtrl=" + hwndJoaCtrl);
		
		// Create the Java window as a child window of the JoaBridgeCtrl.
		Platform.runLater(() -> {
			try {
				final Scene scene = TaskPane.this.createScene();
				fxFrame = EmbeddedWindowFactory.getInstance().create(hwndJoaCtrl, scene);
				
				Platform.runLater(() -> {
					if (eventHandlerWindowShown != null) {
						WindowEvent event = new WindowEvent(null, WindowEvent.WINDOW_SHOWN); 
						eventHandlerWindowShown.handle(event);
					}
				});
				
			} catch (ComException e) {
				throw new IllegalStateException(e);
			}
		});
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
		// Call taskPane.setVisible in background thread.
		// Otherwise Outlook/Java might hang in setVisible().
		if (customTaskPane != null) {
			BackgTask.run(() -> {
				try {
					customTaskPane.setVisible(Boolean.valueOf(v));
					reg_visible = v;
				} catch (ComException e) {
					e.printStackTrace();
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
	
	
	/**
	 * Set event handler for WindowEvent.WINDOW_SHOWN.
	 * Only one hander is supported. Only WINDOW_SHOWN is supported.
	 * The handler receives null as source parameter.
	 * @param eventType must be WindowEvent.WINDOW_SHOWN
	 * @param eventHandler handler expression
	 */
	@SuppressWarnings("unchecked")
	public <E extends Event> void addEventHandler(EventType<E> eventType, EventHandler<? super E> eventHandler) {
		assert eventType == WindowEvent.WINDOW_SHOWN;
		assert eventHandler != null;
		eventHandlerWindowShown = (EventHandler<WindowEvent>)eventHandler;
	}

}



/*

WEmbeddedFrame frame = new JFXEmbeddedFrame(hwndJoaCtrl);
frame.setSize(400,200);

//final JPanel jpanel = new JPanel();
//jpanel.setSize(350, 180);
//jpanel.setVisible(true);
//frame.add(jpanel);

final JFXPanel fxPanel = new JoaPanel();
fxPanel.setSize(330, 150);
frame.add(fxPanel);

Scene scene = TaskPane.this.createScene();
fxPanel.setScene(scene);

fxPanel.setVisible(true);

frame.setVisible(true);
*/
