/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa.outlook;

import java.io.IOException;

import javafx.application.Platform;

import com.wilutions.com.BackgTask;
import com.wilutions.com.ByRef;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.joa.OfficeAddin;
import com.wilutions.joa.OfficeAddinUtil;
import com.wilutions.mslib.outlook.ApplicationEvents_11;
import com.wilutions.mslib.outlook.FormRegion;
import com.wilutions.mslib.outlook.MAPIFolder;
import com.wilutions.mslib.outlook.OlFormRegionIcon;
import com.wilutions.mslib.outlook.OlFormRegionMode;
import com.wilutions.mslib.outlook.OlFormRegionSize;
import com.wilutions.mslib.outlook.PropertyPages;
import com.wilutions.mslib.outlook.Search;
import com.wilutions.mslib.outlook._FormRegionStartup;

// Direkt über Windows-API eingeklinkte Erweiterungen: 
// http://www.codeproject.com/Articles/27262/Additional-custom-panel-in-Microsoft-Outlook

/**
 * Base class for Microsoft Outlook Addins.
 * This class implements the following event interfaces:
 * <table>
 * <tr>
 * <td>{@link ApplicationEvents_11}</td>
 * <td>http://msdn.microsoft.com/en-us/library/microsoft.office.interop.outlook.applicationevents_11(v=office.15).aspx</td>
 * </tr>
 * <tr>
 * <td>{@link _FormRegionStartup}</td>
 * <td>http://msdn.microsoft.com/en-us/library/microsoft.office.interop.outlook._formregionstartup(v=office.15).aspx</td>
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

	/**
	 * Check whether an item (ContactItem, MailItem, ...) is modified.
	 * 
	 * @param item
	 *            ContactItem, MailItem, ...
	 * @return true, if the item is modified (and not jet saved).
	 * @throws ComException
	 * @see http://msdn.microsoft.com/en-us/library/office/gg583879(v=office.14).aspx
	 */
	public static boolean isItemModified(Dispatch item) throws ComException {
		final int dispidModified = 0xF024;
		Object ret = item._get(dispidModified);
		return (Boolean) ret;
	}

	@Override
	public Object GetFormRegionStorage(String FormRegionName, Dispatch Item, Integer LCID,
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
		System.out.println("BeforeFormRegionShow(" + formRegion);

		BackgTask.run(() -> {
			try {
				final OutlookFormRegion myFormRegion = createFormRegion(formRegion);
				myFormRegion.show(formRegion);
			} catch (Throwable e) {
				e.printStackTrace();
			}
		});

		System.out.println(")BeforeFormRegionShow");
	}

	@Override
	public Object GetFormRegionManifest(String FormRegionName, Integer LCID) throws ComException {
		System.out.println("GetFormRegionManifest " + FormRegionName);
		ClassLoader classLoader = this.getClass().getClassLoader();
		String ret = null;
		try {
			ret = OfficeAddinUtil.getResourceAsString(classLoader, "com/wilutions/joa/example1/FormRegionManifest.xml");

		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
		return ret;
	}

	@Override
	public Object GetFormRegionIcon(String FormRegionName, Integer LCID, OlFormRegionIcon Icon) throws ComException {
		System.out.println("GetFormRegionIcon " + FormRegionName);
		return null;
	}

	@Override
	public void onStartup() throws ComException {
		System.out.println(getClass() + " onStartup");
	}

	@Override
	public void onQuit() throws ComException {
		System.out.println(getClass() + " onQuit");
		Platform.exit();
	}

	@Override
	public void onItemSend(Dispatch Item, ByRef<Boolean> Cancel) throws ComException {
	}

	@Override
	public void onNewMail() throws ComException {
	}

	@Override
	public void onReminder(Dispatch Item) throws ComException {
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
	public void onItemLoad(Dispatch Item) throws ComException {
	}

	@Override
	public void onBeforeFolderSharingDialog(MAPIFolder FolderToShare, ByRef<Boolean> Cancel) throws ComException {
	}


}
