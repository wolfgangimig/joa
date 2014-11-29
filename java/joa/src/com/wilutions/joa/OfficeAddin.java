/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.joa;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javafx.application.Platform;

import com.wilutions.com.AsyncResult;
import com.wilutions.com.BackgTask;
import com.wilutions.com.ByRef;
import com.wilutions.com.ComException;
import com.wilutions.com.ComModule;
import com.wilutions.com.Dispatch;
import com.wilutions.com.DispatchImpl;
import com.wilutions.com.JoaDll;
import com.wilutions.joactrllib.IJoaUtilAddin;
import com.wilutions.mslib.office.COMAddIn;
import com.wilutions.mslib.office.COMAddIns;
import com.wilutions.mslib.office.CustomTaskPane;
import com.wilutions.mslib.office.ICTPFactory;
import com.wilutions.mslib.office.ICustomTaskPaneConsumer;
import com.wilutions.mslib.office._CustomTaskPane;
import com.wilutions.mslib.office.impl.COMAddInImpl;

/**
 * Base class for Microsoft Office Addins.
 *
 * @param <CoAppType>
 *            Office application object type, e.g.
 *            com.wilutions.joa.outlook.Application
 */
public abstract class OfficeAddin<CoAppType extends Dispatch> extends DispatchImpl implements IDTExtensibiltiy2,
		ICustomTaskPaneConsumer, IRibbonExtensibility, IRibbonCallback {

	protected final ComModule module;
	protected final Class<CoAppType> applicationClass;

	protected CoAppType applicationObject;
	protected ICTPFactory customTaskPaneFactory;
	private static IJoaUtilAddin joaUtil;

	protected final String TASK_PANE_CONTROL_PROGID = "JoaBridgeCtrl.Class";

	protected OfficeAddin(Class<CoAppType> applicationClass) {
		this.module = ComModule.getInstance();
		this.applicationClass = applicationClass;
	}

	/**
	 * Get application object.
	 * 
	 * @return Application object.
	 */
	public CoAppType getApplication() {
		return applicationObject;
	}

	/**
	 * Get module object.
	 * 
	 * @return Module object.
	 */
	public ComModule getModule() {
		return module;
	}

	@Override
	public void onConnection(Dispatch app, ext_ConnectMode connectMode, Dispatch addin, ByRef<Object[]> custom)
			throws ComException {
		applicationObject = app.as(applicationClass);
		applicationObject.withEvents(this);

		COMAddInImpl coAddin = addin.as(COMAddInImpl.class);
		// Currently, a DispatchImpl cannot be converted into a Dispatch.
		// Thus, coAddin.setObject cannot be called. 
		coAddin._put(7, this); // setObject()
	}

	@Override
	public void onDisconnection(ext_DisconnectMode disconnectMode, ByRef<Object[]> reserved) {
	}

	@Override
	public void onAddInsUpdate(ByRef<Object[]> reserved) {
		BackgTask.run(() -> updateJoaUtil());
	}

	@Override
	public void onStartupComplete(ByRef<Object[]> reserved) {
		BackgTask.run(() -> updateJoaUtil());
	}

	@Override
	public void onBeginShutdown(ByRef<Object[]> reserved) {
	}

	@Override
	public void CTPFactoryAvailable(ICTPFactory CTPFactoryInst) throws ComException {
		customTaskPaneFactory = CTPFactoryInst;
	}

	/**
	 * Create a task pane.
	 * 
	 * @param taskPane
	 *            Task pane object.
	 * @param title
	 *            Task pane title.
	 * @param explorerOrInspector
	 * @param asyncResult
	 */
	public void createTaskPaneWindowAsync(final TaskPane taskPane, final String title,
			final Object explorerOrInspector, final AsyncResult<TaskPane> asyncResult) {

		Platform.runLater(new Runnable() {
			public void run() {
				try {
					final _CustomTaskPane _ctp = customTaskPaneFactory.CreateCTP(TASK_PANE_CONTROL_PROGID, title,
							explorerOrInspector);
					final CustomTaskPane ctp = ((Dispatch) _ctp).as(CustomTaskPane.class);
					taskPane.show(ctp);
					if (asyncResult != null) {
						asyncResult.setAsyncResult(taskPane, null);
					}
				} catch (Throwable e) {
					if (asyncResult != null) {
						asyncResult.setAsyncResult(null, e);
					}
				}
			}
		});

	}

	@Override
	public String GetCustomUI(String ribbonId) {

		// Try to find an <ribbonID>.XML file containing the custom UI in the
		// package of the Addin class.
		// Start with the given RibbonID. If it cannot be found,
		// remove the last segment from RibbonID and try this as XML file name.
		// e.g.:
		// Ribbon.Microsoft.Outlook.Explorer.xml
		// Ribbon.Microsoft.Outlook.xml
		// Ribbon.Microsoft.xml
		// Ribbon.xml

		// Menuband IDs are defined here:
		// http://msdn.microsoft.com/de-de/library/ee692172(office.14).aspx#OfficeOLExtendingUI_RibbonIdentifiers

		ribbonId = "Ribbon." + ribbonId;

		ClassLoader classLoader = this.getClass().getClassLoader();
		String pack = this.getClass().getPackage().getName();
		String packPath = pack.replace('.', '/');
		String resourcePath = packPath + "/" + ribbonId + ".xml";
		String customUI = "";

		while (resourcePath.length() != 0) {
			try {
				customUI = OfficeAddinUtil.getResourceAsString(classLoader, resourcePath);
				break;
			} catch (IOException e) {
				if (customUI.length() != 0)
					break;
				int p = ribbonId.lastIndexOf('.');
				if (p < 0)
					break;
				ribbonId = ribbonId.substring(0, p);
				resourcePath = packPath + "/" + ribbonId + ".xml";
			}
		}

		return customUI;
	}

	@Override
	public void onButtonClicked(Dispatch ribbonControl) throws ComException {

	}

	public Dispatch createIPictureDisp(byte[] image, String contentType) throws ComException {
		return (Dispatch) JoaDll.nativeCreateIPictureDisp(image);
	}

	public Map<String, Dispatch> createRibbonIconsFromResources(Class<?> forClass, String[] fileNames)
			throws ComException {
		Map<String, Dispatch> ret = new HashMap<String, Dispatch>(fileNames.length);
		for (String fileName : fileNames) {
			try {
				byte[] image = OfficeAddinUtil.getResourceAsBytes(forClass, fileName);
				String contentType = fileName;
				int p = contentType.lastIndexOf('.');
				if (p >= 0) {
					contentType = contentType.substring(p + 1);
				}
				Dispatch pictureDisp = createIPictureDisp(image, contentType);
				ret.put(fileName, pictureDisp);
			} catch (IOException ex) {
				throw new ComException("Missing resource " + fileName);
			}
		}
		return ret;
	}

	/**
	 * Get the JoaUtilAddin object.
	 * 
	 * @return JoaUtilAddin object.
	 */
	public static IJoaUtilAddin getJoaUtil() throws ComException {
		final long timeout = 10 * 1000;
		long t1 = System.currentTimeMillis();
		synchronized (OfficeAddin.class) {
			while (joaUtil == null) {
				long t2 = System.currentTimeMillis();
				if (t2 - t1 > timeout) {
					break;
				}
				try {
					OfficeAddin.class.wait(1000);
				} catch (InterruptedException e) {
				}
			}
			if (joaUtil == null) {
				throw new ComException("Cannot find JoaUtilAddin.");
			}
		}
		return joaUtil;
	}

	private void updateJoaUtil() {
		synchronized (OfficeAddin.class) {

			if (joaUtil != null)
				return;

			CoAppType app = getApplication();
			if (app == null)
				return;
			Object disp = getApplication()._get("COMAddIns");
			if (disp == null)
				return;

			COMAddIns addins = Dispatch.as(disp, COMAddIns.class);
			if (addins == null)
				return;

			COMAddIn addin = addins.Item("JoaUtilAddin.Class");
			if (addin != null) {
				if (!addin.getConnect()) {
					addin.setConnect(Boolean.TRUE);
				}
				IJoaUtilAddin x = Dispatch.as(addin.getObject(), IJoaUtilAddin.class);
				joaUtil = x;
				OfficeAddin.class.notifyAll();
			}
		}
	}
}
