/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.joa.outlook.ex;

import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.IDispatch;
import com.wilutions.com.reg.Registry;
import com.wilutions.joa.IconManager;
import com.wilutions.joa.outlook.OutlookAddin;
import com.wilutions.mslib.office.IRibbonControl;
import com.wilutions.mslib.office.IRibbonUI;
import com.wilutions.mslib.outlook.Explorer;
import com.wilutions.mslib.outlook.ExplorersEvents;
import com.wilutions.mslib.outlook.Inspector;
import com.wilutions.mslib.outlook.InspectorsEvents;
import com.wilutions.mslib.outlook.OlObjectClass;
import com.wilutions.mslib.outlook._Explorer;
import com.wilutions.mslib.outlook._Explorers;
import com.wilutions.mslib.outlook._Inspector;
import com.wilutions.mslib.outlook._Inspectors;

public class OutlookAddinEx extends OutlookAddin implements InspectorsEvents, ExplorersEvents {

	private final IconManager iconManager;
	private IRibbonUI ribbon;
	private final Registry registry;
	
	/**
	 * Inspectors collection.
	 * Need to hold this in order to permanently receive the onNewInspector event.
	 * @see https://groups.google.com/forum/#!topic/microsoft.public.office.developer.com.add_ins/3B5OvWkF_dg 
	 */
	private volatile _Inspectors inspectors;
	
	/**
	 * Explorers collection.
	 * Need to hold this in order to permanently receive the onNewExplore event.
	 */
	private volatile _Explorers explorers;

	public OutlookAddinEx() {
		iconManager = new IconManager(this);
		registry = new Registry(getClass());
	}

	public IRibbonUI getRibbon() {
		return ribbon;
	}

	public Registry getRegistry() {
		return registry;
	}

	public void onLoadRibbon(IRibbonUI ribbon) {
		this.ribbon = ribbon;
	}

	public Dispatch getRibbonIcon(IRibbonControl control) {
		Dispatch picdisp = iconManager.getIconByTag(control);
		return picdisp;
	}

	@Override
	public void onStartup() throws ComException {
		
		try {
			explorers = getApplication().getExplorers();
			Dispatch.withEvents(explorers, this);
			int n = explorers.getCount();
			for (int i = 1; i <= n; i++) {
				Explorer explorer = explorers.Item(i);
				onNewExplorer(explorer);
			}
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		
		try {
			inspectors = getApplication().getInspectors();
			Dispatch.withEvents(inspectors, this);
			int n = inspectors.getCount();
			for (int i = 1; i <= n; i++) {
				Inspector inspector = inspectors.Item(i);
				onNewInspector(inspector);
			}
		}
		catch (Throwable e) {
			e.printStackTrace();
		}

	}

	@Override
	public void onQuit() throws ComException {
		Dispatch.releaseEvents(inspectors, this);
		super.onQuit();
	}

	@Override
	public void onNewInspector(final _Inspector insp) throws ComException {
		Inspector inspector = Dispatch.as(insp, Inspector.class);
		IDispatch dispItem = inspector.getCurrentItem();
		OlObjectClass olclass = OlObjectClass.valueOf((Integer) dispItem._get("Class"));
		System.out.println("new inspector, item=" + dispItem + ", class=" + olclass);
		InspectorWrapper inspectorWrapper = createInspectorWrapper(inspector, olclass);
		if (inspectorWrapper == null) {
			inspectorWrapper = new InspectorWrapper(inspector, dispItem);
		}
		InspectorWrappers.add(inspectorWrapper);
	}

	protected InspectorWrapper createInspectorWrapper(Inspector inspector, OlObjectClass olclass) {
		return null;
	}

	public InspectorWrapper getInspectorWrapper(Inspector inspector) {
		return InspectorWrappers.get(inspector);
	}

	@Override
	public void onNewExplorer(_Explorer expl) throws ComException {
		Explorer explorer = expl.as(Explorer.class);
		ExplorerWrapper explorerWrapper = createExplorerWrapper(explorer);
		if (explorerWrapper == null) {
			explorerWrapper = new ExplorerWrapper(explorer);
		}
		ExplorerWrappers.add(explorerWrapper);
	}

	protected ExplorerWrapper createExplorerWrapper(Explorer explorer) {
		return null;
	}
	
	public ExplorerWrapper getExplorerWrapper(Explorer explorer) {
		return ExplorerWrappers.get(explorer);
	}
}
