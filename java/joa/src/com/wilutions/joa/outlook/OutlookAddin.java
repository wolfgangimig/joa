/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.joa.outlook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javafx.application.Platform;

import com.wilutions.com.AsyncResult;
import com.wilutions.com.BackgTask;
import com.wilutions.com.ByRef;
import com.wilutions.com.CoClass;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.IDispatch;
import com.wilutions.com.JoaDll;
import com.wilutions.com.WindowsUtil;
import com.wilutions.joa.OfficeAddin;
import com.wilutions.joa.OfficeAddinUtil;
import com.wilutions.joa.fx.ModalDialogFX;
import com.wilutions.mslib.outlook.ApplicationEvents_11;
import com.wilutions.mslib.outlook.FormRegion;
import com.wilutions.mslib.outlook.MAPIFolder;
import com.wilutions.mslib.outlook.OlFormRegionIcon;
import com.wilutions.mslib.outlook.OlFormRegionMode;
import com.wilutions.mslib.outlook.OlFormRegionSize;
import com.wilutions.mslib.outlook.PropertyPages;
import com.wilutions.mslib.outlook.Search;
import com.wilutions.mslib.outlook._Explorer;
import com.wilutions.mslib.outlook._FormRegionStartup;
import com.wilutions.mslib.outlook.impl._ExplorerImpl;

// https://social.technet.microsoft.com/Forums/en-US/419e76eb-5728-432f-b3b9-04769b32fe1a/is-it-possible-to-develop-microsoft-outlook-plugins-in-java?forum=outlookdev

/**
 * Base class for Microsoft Outlook Addins. This class implements the following
 * event interfaces:
 * <table>
 * <tr>
 * <td>{@link ApplicationEvents_11}</td>
 * <td>http://msdn.microsoft.com/en-us/library/microsoft.office.interop.outlook.
 * applicationevents_11(v=office.15).aspx</td>
 * </tr>
 * <tr>
 * <td>{@link _FormRegionStartup}</td>
 * <td>http://msdn.microsoft.com/en-us/library/microsoft.office.interop.outlook.
 * _formregionstartup(v=office.15).aspx</td>
 * </tr>
 */
public abstract class OutlookAddin extends OfficeAddin<com.wilutions.mslib.outlook.Application> implements
		ApplicationEvents_11, _FormRegionStartup {

	public OutlookAddin() {
		super(com.wilutions.mslib.outlook.Application.class);
	}

	public String toString() {
		return "[OutlookAddin " + super.toString() + " ]";
	}

	public <T> void showModalDialogAsync(ModalDialogFX<T> dialog, AsyncResult<T> asyncResult) {
		_Explorer _exp = getApplication().ActiveExplorer();
		_ExplorerImpl explorer = Dispatch.as(_exp, _ExplorerImpl.class);
		dialog.showAsync(explorer, asyncResult);
	}

	/**
	 * Check whether an item (ContactItem, MailItem, ...) is modified.
	 * 
	 * @param item
	 *            ContactItem, MailItem, ...
	 * @return true, if the item is modified (and not jet saved).
	 * @throws ComException
	 * @see http
	 *      ://msdn.microsoft.com/en-us/library/office/gg583879(v=office.14).
	 *      aspx
	 */
	public static boolean isItemModified(Dispatch item) throws ComException {
		final int dispidModified = 0xF024;
		Object ret = item._get(dispidModified);
		return (Boolean) ret;
	}

	@Override
	public Object GetFormRegionStorage(String FormRegionName, IDispatch Item, Integer LCID,
			OlFormRegionMode FormRegionMode, OlFormRegionSize FormRegionSize) throws ComException {
		try {
			return OutlookFormRegion.getFormRegionOfs();
		} catch (IOException e) {
			throw new ComException(e.toString());
		}
	}

	protected OutlookFormRegion createFormRegion(FormRegion formRegion) throws ComException {
		OutlookFormRegion ret = null;
		String formRegionClassName = "";
		try {
			// The internal name of the form region is its Java class name.
			// This is ensured by the process of registration.
			formRegionClassName = formRegion.getInternalName();
			Class<?> formRegionClass = Class.forName(formRegionClassName);
			ret = (OutlookFormRegion) formRegionClass.newInstance();
		} catch (Throwable e) {
			throw new ComException("Cannot create form region, internal name=" + formRegionClassName, e);
		}
		return ret;
	}

	@Override
	public final void BeforeFormRegionShow(final FormRegion formRegion) throws ComException {

		BackgTask.run(() -> {
			final OutlookFormRegion myFormRegion = createFormRegion(formRegion);
			myFormRegion.showAsync(formRegion, null);
		});

	}

	@Override
	public Object GetFormRegionManifest(String FormRegionName, Integer LCID) throws ComException {
		String ret = null;
		// FormRegionName == "com.wilutions.itol.IssueFormRegion"
		String resourceName = FormRegionName.replace('.', '/') + ".xml";
		try {
			ClassLoader classLoader = this.getClass().getClassLoader();
			ret = OfficeAddinUtil.getResourceAsString(classLoader, resourceName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ret;
	}

	@Override
	public Object GetFormRegionIcon(String FormRegionName, Integer LCID, OlFormRegionIcon Icon) throws ComException {
		return null;
	}

	@Override
	public void onStartup() throws ComException {
	}

	@Override
	public void onQuit() throws ComException {
		//System.exit(0);
		Platform.exit();
	}

	@Override
	public void onItemSend(IDispatch Item, ByRef<Boolean> Cancel) throws ComException {
	}

	@Override
	public void onNewMail() throws ComException {
	}

	@Override
	public void onReminder(IDispatch Item) throws ComException {
	}

	@Override
	public void onOptionsPagesAdd(PropertyPages Pages) throws ComException {
	}

	@Override
	public void onAdvancedSearchComplete(Search SearchObject) throws ComException {
	}

	@Override
	public void onAdvancedSearchStopped(Search SearchObject) throws ComException {
	}

	@Override
	public void onMAPILogonComplete() throws ComException {
	}

	@Override
	public void onNewMailEx(String EntryIDCollection) throws ComException {
	}

	@Override
	public void onItemLoad(IDispatch Item) throws ComException {
	}

	@Override
	public void onBeforeFolderSharingDialog(MAPIFolder FolderToShare, ByRef<Boolean> Cancel) throws ComException {
	}

	/**
	 * Assign the viewType as view for the folder.
	 * 
	 * @param folder
	 *            Outlook folder
	 * @param viewType
	 *            FolderView class.
	 * @param title
	 *            Folder view title. This title is displayed in the caption bar
	 *            of Outlook.
	 * @param viewId
	 *            Arbitrary string to be passed in
	 *            {@link FolderView#setId(String)}.
	 * @throws IOException
	 */
	public void assignFolderView(MAPIFolder folder, Class<? extends FolderView> viewType, String title, String viewId)
			throws IOException {
		String webViewFile = createFolderViewHtml(viewType, title, viewId);
		folder.setWebViewURL(webViewFile);
		folder.setWebViewOn(true);
	}

	/**
	 * Create an HTML file to display the given view in a folder.
	 * 
	 * @param viewType
	 *            FolderView class. The explorer will call createWebView() to
	 *            create an instance.
	 * @param title
	 *            Folder view title. This title is displayed in the caption bar
	 *            of Outlook.
	 * @param viewId
	 *            Arbitrary string to be passed in
	 *            {@link FolderView#setId(String)}.
	 * @return Temporary file that defines the folder's view.
	 * @throws ComException
	 */
	protected String createFolderViewHtml(Class<? extends FolderView> viewType, String title, String viewId)
			throws ComException {
		PrintWriter pr = null;
		File webViewFile = null;

		CoClass coclass = this.getClass().getAnnotation(CoClass.class);
		if (coclass == null) {
			throw new ComException("OfficeAddin misses annotation CoClass");
		}

		String progId = coclass.progId();

		try {
			File tempDir = JoaDll.getTempDir();
			tempDir.mkdirs();
			String fileName = viewType.getName() + "-" + viewId + ".htm";
			fileName = WindowsUtil.replaceForbiddenFileNameCharsWithUnderscore(fileName);
			webViewFile = new File(tempDir, fileName);

			String html = OfficeAddinUtil.getResourceAsString(this.getClass().getClassLoader(),
					"com/wilutions/joa/outlook/HomePage.html");

			html = html.replace("__webview__title__", title);
			html = html.replace("__addin__progid__", progId);
			html = html.replace("__view__class__name__", viewType.getName());
			html = html.replace("__view__id__", viewId);

			pr = new PrintWriter(new OutputStreamWriter(new FileOutputStream(webViewFile), "UTF-8"));
			pr.println(html);

		} catch (Throwable e) {
			throw new ComException(e.toString());
		} finally {
			if (pr != null) {
				pr.close();
			}
		}

		return webViewFile.getAbsolutePath();
	}

	/**
	 * This function is called from the HTML page of a folder view. Do not call
	 * this function directly. The HTML page has been created by
	 * {@link #createFolderViewHtml(Class, String, String)}.
	 * 
	 * @param hwndJoaCtrlStr
	 *            JoaBridgeCtrl window handle
	 * @param viewClassName
	 *            Class name passed to
	 *            {@link #createFolderViewHtml(Class, String, String)}
	 * @param viewId
	 *            View ID passed to
	 *            {@link #createFolderViewHtml(Class, String, String)}
	 */
	@Deprecated
	public void createWebView(final String hwndJoaCtrlStr, final String viewClassName, final String viewId) {

		// Create the Java window as a child window of the JoaBridgeCtrl.
		try {
			final Class<?> viewClass = Class.forName(viewClassName);
			final FolderView viewObject = (FolderView) viewClass.newInstance();

			viewObject.setId(viewId);

			long hwndJoaCtrl = Long.parseLong(hwndJoaCtrlStr);
			viewObject.createAndShowEmbeddedWindowAsync(hwndJoaCtrl, null);

		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

}
