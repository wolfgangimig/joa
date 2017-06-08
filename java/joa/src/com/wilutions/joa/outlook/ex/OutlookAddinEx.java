/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.joa.outlook.ex;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.IDispatch;
import com.wilutions.com.reg.Registry;
import com.wilutions.joa.IconManager;
import com.wilutions.joa.outlook.OutlookAddin;
import com.wilutions.joa.ribbon.RibbonButton;
import com.wilutions.joa.ribbon.RibbonComboBox;
import com.wilutions.joa.ribbon.RibbonComboBox.ChangeListener;
import com.wilutions.joa.ribbon.RibbonControl;
import com.wilutions.joa.ribbon.RibbonDynamicMenu;
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

import javafx.util.Callback;

public class OutlookAddinEx extends OutlookAddin implements InspectorsEvents, ExplorersEvents {

	private final IconManager iconManager;
	private IRibbonUI ribbon;
	private final Registry registry;

	/**
	 * Inspectors collection. Need to hold this in order to permanently receive
	 * the onNewInspector event.
	 * 
	 * @see https://groups.google.com/forum/#!topic/microsoft.public.office.
	 *      developer.com.add_ins/3B5OvWkF_dg
	 */
	private volatile _Inspectors inspectors;

	/**
	 * Explorers collection. Need to hold this in order to permanently receive
	 * the onNewExplore event.
	 */
	private volatile _Explorers explorers;

	public OutlookAddinEx() {
		iconManager = new IconManager(this);
		registry = new Registry(getClass());
		
		iconManager.getFileTypeIcon(".msg");
		iconManager.getFileTypeIcon(".mhtml");
		iconManager.getFileTypeIcon(".rtf");
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
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "onNewExplorer(");
		if (expl != null) {
			Explorer explorer = expl.as(Explorer.class);
			ExplorerWrapper explorerWrapper = createExplorerWrapper(explorer);
			if (explorerWrapper == null) {
				explorerWrapper = new ExplorerWrapper(explorer);
			}
			ExplorerWrappers.add(explorerWrapper);
		}
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, ")onNewExplorer");
	}

	protected ExplorerWrapper createExplorerWrapper(Explorer explorer) {
		return new ExplorerWrapper(explorer);
	}

	public ExplorerWrapper getExplorerWrapper(Explorer explorer) {
		return ExplorerWrappers.get(explorer);
	}

	/**
	 * Execute passed function for control's context.
	 * 
	 * @param control
	 *            ribbon control (button, etc.)
	 * @param call
	 *            function to be called
	 * @return value returned from call
	 */
	protected <T> T forContextWrapper(IRibbonControl control, Callback<Wrapper, T> call) {
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "forContextWrapper(");

		T ret = null;
		Wrapper wrapper = null;
		try {
			IDispatch dispContext = control.getContext();
			if (dispContext != null && !dispContext.equals(Dispatch.NULL)) {
				if (dispContext.is(Inspector.class)) {
					Inspector inspector = dispContext.as(Inspector.class);
					wrapper = (Wrapper) getInspectorWrapper(inspector);
					if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "inspector wrapper=" + wrapper);
				}
				else {
	
	// solved in joa.dll: JoaDll.deleteDispatch does only set ndisp=0 if reference count is 0. 
	//				// ITJ-43: Sometimes the dispContext.ndisp is 0 at this point. 
	//				// Workaround, check whether it is 0 and call getContext again if necessary.
	//				
	//				if (dispContext.equals(Dispatch.NULL)) {
	//					log.warning("GC removed ndisp");
	//					dispContext = control.getContext();
	//				}
					
					if (dispContext.is(Explorer.class)) {
						Explorer explorer = dispContext.as(Explorer.class);
						wrapper = getExplorerWrapper(explorer);
						if (wrapper == null) {
							wrapper = createExplorerWrapper(explorer);
						}
						if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "explorer wrapper=" + wrapper);
					}
				}
	
				if (wrapper != null) {
					if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "addRibbonControl");
					wrapper.addRibbonControlDispatchReference(control);
					if (call != null) {
						if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "call");
						ret = call.call(wrapper);
					}
				}
			}
		}
		catch (ComException e) {
			log.log(Level.WARNING, "forContextWrapper failed", e);
			e.printStackTrace();
			throw e;
		}
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, ")forContextWrapper=" + ret);
		return ret;
	}

	public void Ribbon_onAction(IRibbonControl control, Boolean pressed) {
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "Ribbon_onAction(" + pressed);
		forContextWrapper(control, (context) -> {
			String controlId = control.getId();
			RibbonControl rctrl = context.getRibbonControls().get(controlId);
			if (rctrl instanceof RibbonButton) {
				RibbonButton bn = (RibbonButton) rctrl;
				if (pressed != null) {
					bn.setPressed(pressed);
				}
				RibbonButton.ActionHandler action = bn.getOnAction();
				if (action != null) {
					action.f(control, context, pressed);
				}
			}
			return Boolean.TRUE;
		});
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, ")Ribbon_onAction");
	}

	public boolean Ribbon_getEnabled(IRibbonControl control) {
		RibbonControl rctrl = forContextWrapper(control, (context) -> {
			String controlId = control.getId();
			return context.getRibbonControls().get(controlId);
		});
		return rctrl != null ? rctrl.isEnabled() : true;
	}

	public boolean Ribbon_getVisible(IRibbonControl control) {
		RibbonControl rctrl = forContextWrapper(control, (context) -> {
			String controlId = control.getId();
			return context.getRibbonControls().get(controlId);
		});
		return rctrl != null ? rctrl.isVisible() : true;
	}

	public boolean Ribbon_getPressed(IRibbonControl control) {
		RibbonButton rctrl = forContextWrapper(control, (context) -> {
			String controlId = control.getId();
			return (RibbonButton) context.getRibbonControls().get(controlId);
		});
		return rctrl != null ? rctrl.isPressed() : false;
	}

	public String Ribbon_getLabel(IRibbonControl control) {
		RibbonControl rctrl = forContextWrapper(control, (context) -> {
			String controlId = control.getId();
			return context.getRibbonControls().get(controlId);
		});
		return rctrl != null ? rctrl.getLabel() : control.getId();
	}

	@SuppressWarnings("rawtypes")
	public String Ribbon_getText(IRibbonControl control) {
		RibbonComboBox rctrl = forContextWrapper(control, (context) -> {
			String controlId = control.getId();
			return (RibbonComboBox) context.getRibbonControls().get(controlId);
		});
		return rctrl != null ? rctrl.getText() : "";
	}

	@SuppressWarnings("rawtypes")
	public int Ribbon_getItemCount(IRibbonControl control) {
		RibbonComboBox rctrl = forContextWrapper(control, (context) -> {
			String controlId = control.getId();
			return (RibbonComboBox) context.getRibbonControls().get(controlId);
		});
		return rctrl != null ? rctrl.getItems().size() : 0;
	}

	@SuppressWarnings("rawtypes")
	public String Ribbon_getItemLabel(IRibbonControl control, Integer idx) {
		RibbonComboBox rctrl = forContextWrapper(control, (context) -> {
			String controlId = control.getId();
			return (RibbonComboBox) context.getRibbonControls().get(controlId);
		});
		String ret = rctrl != null ? rctrl.getItemLabel(idx) : Integer.toString(idx);
		return ret;
	}

	@SuppressWarnings("rawtypes")
	public String Ribbon_getItemID(IRibbonControl control, Integer idx) {
		RibbonComboBox rctrl = forContextWrapper(control, (context) -> {
			String controlId = control.getId();
			return (RibbonComboBox) context.getRibbonControls().get(controlId);
		});
		String ret = rctrl != null ? rctrl.getItemID(idx) : Integer.toString(idx);
		return ret;
	}

	@SuppressWarnings("rawtypes")
	public Dispatch Ribbon_getItemImage(IRibbonControl control, Integer idx) {
		RibbonComboBox rctrl = forContextWrapper(control, (context) -> {
			String controlId = control.getId();
			return (RibbonComboBox) context.getRibbonControls().get(controlId);
		});
		Dispatch ret = rctrl != null ? rctrl.getItemImage(iconManager, idx) : null;
		return ret;
	}

	@SuppressWarnings("rawtypes")
	public int Ribbon_getSelectedItemIndex(IRibbonControl control) {
		RibbonComboBox rctrl = forContextWrapper(control, (context) -> {
			String controlId = control.getId();
			return (RibbonComboBox) context.getRibbonControls().get(controlId);
		});
		return rctrl != null ? rctrl.getSelectedIndex() : -1;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void Ribbon_onChange(IRibbonControl control, String text) {
		forContextWrapper(control, (context) -> {
			String controlId = control.getId();
			RibbonComboBox rctrl = (RibbonComboBox) context.getRibbonControls().get(controlId);
			if (rctrl != null) {
				int indexNow = rctrl.findItemIndex(text);
				int indexBefore = rctrl.getSelectedIndex();
				rctrl.setSelectedIndex(indexNow);
				Object itemBefore = indexBefore >= 0 ? rctrl.getItems().get(indexBefore) : null;
				Object itemNow = indexNow >= 0 ? rctrl.getItems().get(indexNow) : null;
				ChangeListener lsn = rctrl.getOnChange();
				if (lsn != null) {
					lsn.f(control, itemBefore, itemNow);
				}
			}
			else {
				// You missed to add the control to member ribbonControls.
				// Use this.getRibbonControls().add(...)
			}
			return Boolean.TRUE;
		});
	}

	public Dispatch Ribbon_getImage(IRibbonControl control) {
		RibbonButton rctrl = forContextWrapper(control, (context) -> {
			String controlId = control.getId();
			return (RibbonButton) context.getRibbonControls().get(controlId);
		});
		String icon = rctrl != null ? rctrl.getImage() : null;
		Dispatch disp = icon != null && !icon.isEmpty() ? iconManager.get(icon) : null;
		return disp;
	}

	public String Ribbon_getContent(IRibbonControl control) {
		RibbonDynamicMenu rctrl = forContextWrapper(control, (context) -> {
			String controlId = control.getId();
			return (RibbonDynamicMenu) context.getRibbonControls().get(controlId);
		});
		String content = rctrl.getContent();
		System.out.println("content=" + content);
		return content;
	}

	private Logger log = Logger.getLogger("OutlookAddinEx");

	public IconManager getIconManager() {
		return iconManager;
	}
}
