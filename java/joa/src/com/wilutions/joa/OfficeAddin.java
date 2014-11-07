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
import com.wilutions.com.ByRef;
import com.wilutions.com.ComException;
import com.wilutions.com.ComModule;
import com.wilutions.com.Dispatch;
import com.wilutions.com.DispatchImpl;
import com.wilutions.com.JoaDll;
import com.wilutions.mslib.office.CustomTaskPane;
import com.wilutions.mslib.office.ICTPFactory;
import com.wilutions.mslib.office.ICustomTaskPaneConsumer;
import com.wilutions.mslib.office._CustomTaskPane;

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
		System.out.println("OnConnection " + connectMode);
		applicationObject = app.as(applicationClass);
		applicationObject.withEvents(this);
	}

	@Override
	public void onDisconnection(ext_DisconnectMode disconnectMode, ByRef<Object[]> reserved) {
		System.out.println("OnDisconnection " + disconnectMode);
	}

	@Override
	public void onAddInsUpdate(ByRef<Object[]> reserved) {
		System.out.println("OnAddInsUpdate");
	}

	@Override
	public void onStartupComplete(ByRef<Object[]> reserved) {
		System.out.println("OnStartupComplete");
	}

	@Override
	public void onBeginShutdown(ByRef<Object[]> reserved) {
		System.out.println("OnBeginShutdown");
	}

	@Override
	public void CTPFactoryAvailable(ICTPFactory CTPFactoryInst) throws ComException {
		System.out.println("CTPFactoryAvailable");
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
		//return ensureJoaUtil().CreateIPictureDisp(image, contentType);
		return (Dispatch)JoaDll.nativeCreateIPictureDisp(image);
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

}
