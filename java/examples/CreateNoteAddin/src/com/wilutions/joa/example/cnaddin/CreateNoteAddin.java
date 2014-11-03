/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa.example.cnaddin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wilutions.com.BackgTask;
import com.wilutions.com.CoClass;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.JoaDll;
import com.wilutions.com.reg.Registry;
import com.wilutions.joa.DeclAddin;
import com.wilutions.joa.LoadBehavior;
import com.wilutions.joa.OfficeApplication;
import com.wilutions.joa.TaskPane;
import com.wilutions.joa.outlook.OutlookAddin;
import com.wilutions.mslib.office.IRibbonControl;
import com.wilutions.mslib.office.IRibbonUI;
import com.wilutions.mslib.outlook.Application;
import com.wilutions.mslib.outlook.Inspector;
import com.wilutions.mslib.outlook.InspectorsEvents;
import com.wilutions.mslib.outlook.MailItem;
import com.wilutions.mslib.outlook._Inspector;
import com.wilutions.mslib.outlook._Inspectors;

// http://msdn.microsoft.com/en-us/library/bb608622(v=vs.90).aspx
//http://www.codeproject.com/Articles/1880/Building-an-Office-K-COM-addin-with-VC-ATL

/**
 * This Add-in 
 *
 */
@CoClass(progId = "JoaExample2.Addin", guid = "{C2A41A22-7858-4C13-88D4-88192CAAEFCF}")
@DeclAddin(application = OfficeApplication.Outlook, loadBehavior = LoadBehavior.LoadOnStart, friendlyName = "Create Note Add-in", description = "Example for an Outlook Add-in developed in Java")
public class CreateNoteAddin extends OutlookAddin implements InspectorsEvents {

	private final ArrayList<TaskPane> taskPanes = new ArrayList<TaskPane>();
	private final HashMap<_Inspector, InspectorWrapper> inspectorWrappers = new HashMap<_Inspector, InspectorWrapper>();
	private final Registry registry = new Registry(getClass());
	private volatile _Inspectors inspectors;
	private volatile IRibbonUI ribbon;
	private volatile Map<String, Dispatch> ribbonIcons;
	
	public CreateNoteAddin() {
		Globals.setThisAddin(this);
	}	

	public List<TaskPane> getTaskPanes() {
		return taskPanes;
	}

	public IRibbonUI getRibbon() {
		return ribbon;
	}

	public Registry getRegistry() {
		return registry;
	}

	public void onLoadRibbon(IRibbonUI ribbon) throws ComException {
		System.out.println("onLoadRibbon " + ribbon);
		this.ribbon = ribbon;
		if (ribbonIcons == null) {
			ribbonIcons = createRibbonIconsFromResources(this.getClass(), 
					new String[] {"Ribbon-Note.png"});
		}
	}

	public Object onGetImage(IRibbonControl control) {
		System.out.println("onGetImage");
		Object picdisp = ribbonIcons.get("Ribbon-Note.png");
		return picdisp;
	}

	public boolean ShowHideTP_getVisible(IRibbonControl control) throws ComException {
		System.out.println("ShowHideTP_getVisible " + control);
		return true;
	}

	public boolean ShowHideTP_getPressed(IRibbonControl control) throws ComException {
		System.out.println("ShowHideTP_getPressed " + control);
		Dispatch ctx = control.getContext();
		boolean ret = false;
		if (ctx != null) {
			Inspector inspector = ctx.as(Inspector.class);
			InspectorWrapper inspectorWrapper = inspectorWrappers.get(inspector);
			System.out.println("inspectorWrapper=" + inspectorWrapper);
			if (inspectorWrapper != null) {
				ret = inspectorWrapper.getTaskPaneVisible();
			}
		}
		return ret;
	}

	public void onButtonClicked(Dispatch control, Boolean pressed) throws ComException {
	}

	public void onShowHideTaskPaneClicked(Dispatch control, Boolean pressed) throws ComException {
		System.out.println("onShowHideTaskPaneClicked: " + control._get("id"));
		Dispatch ctx = (Dispatch) control._get("Context");
		System.out.println("ctx=" + ctx + ", id=" + System.identityHashCode(ctx));

		{
			Inspector inspector = ctx.as(Inspector.class);
			System.out.println("inspector=" + inspector + ", id=" + System.identityHashCode(inspector));
			InspectorWrapper inspectorWrapper = inspectorWrappers.get(inspector);
			System.out.println("inspectorWrapper=" + inspectorWrapper);
			if (inspectorWrapper != null) {
				inspectorWrapper.setTaskPaneVisible(pressed);
			}
		}
	}

	@Override
	public void onStartup() throws ComException {
		System.out.println("Ctp4IptorOutlookAddin.onStartup");
		Application app = getApplication();
		inspectors = app.getInspectors();
		Dispatch.withEvents(inspectors, this);
		int n = inspectors.getCount();
		for (int i = 0; i < n; i++) {
			Inspector inspector = inspectors.Item(i);
			onNewInspector(inspector);
		}
	}

	@Override
	public void onQuit() throws ComException {
		System.out.println("Ctp4IptorOutlookAddin.onQuit");
		Dispatch.releaseEvents(inspectors, this);
		JoaDll.dumpComReferenceMap("before exit");
		super.onQuit();
	}

	@Override
	public void onNewInspector(final _Inspector insp) throws ComException {
		Inspector inspector = Dispatch.as(insp, Inspector.class);
		System.out.println("Ctp4IptorOutlookAddin.onNewInspector " + inspector);
		BackgTask.run(() -> {
			try {
				Dispatch dispItem = inspector.getCurrentItem();
				if (dispItem.is(MailItem.class)) {
					MailItem mailItem = dispItem.as(MailItem.class);
					String id = mailItem.getEntryID();
					
					// Display the task pane only for received or sent mails.
					// Do not display the task pane for new mails to be composed.
					if (id != null && id.length() != 0) {
						inspectorWrappers.put(inspector, new InspectorWrapper(inspector));
					}
				}
			} catch (Throwable e) {
				e.printStackTrace();
			}
		});
	}

	public HashMap<_Inspector, InspectorWrapper> getInspectorWrappers() {
		return inspectorWrappers;
	}

}
