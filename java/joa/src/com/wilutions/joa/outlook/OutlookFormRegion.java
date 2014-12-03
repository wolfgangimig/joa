/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa.outlook;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.wilutions.com.AsyncResult;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.DispatchImpl;
import com.wilutions.com.IDispatch;
import com.wilutions.com.WindowHandle;
import com.wilutions.joa.OfficeAddinUtil;
import com.wilutions.mslib.msforms.UserForm;
import com.wilutions.mslib.outlook.FormRegion;
import com.wilutions.mslib.outlook.FormRegionEvents;

public abstract class OutlookFormRegion extends DispatchImpl implements WindowHandle, FormRegionEvents {

	protected FormRegion formRegion;
	protected UserForm userForm;

	// protected float initialWidth;
	// protected float initialHeight;

	protected OutlookFormRegion() {
		Dispatch.addEventToBeCalledInBackground(FormRegionEvents.class, "");
	}

	public String toString() {
		return "[OutlookFormRegion " + super.toString() + " ]";
	}


	public void showAsync(FormRegion formRegion, AsyncResult<Boolean> asyncResult) {
		try {
			this.formRegion = formRegion;
			this.formRegion.withEvents(OutlookFormRegion.this);
	
			userForm = formRegion.getForm().as(UserForm.class);
			
			// Get the native window handle of the JoaBridgeCtrl
			IDispatch joaCtrl = userForm.getControls().Item("JoaCtrl");
			final long hwndJoaCtrl = ((Number) joaCtrl._get("HWND")).longValue();
	
			createAndShowEmbeddedWindowAsync(hwndJoaCtrl, asyncResult);
		}
		catch (Throwable ex) {
			asyncResult.setAsyncResult(false, ex);
		}
	}

	/**
	 * Create and show the form region's view.
	 * @param hwndParent Native parent window handle.
	 * @param asyncResult Expression to be called after the new form region was made visible. 
	 * This call is made from the Tookit's UI thread. This parameter can be null. 
	 */
	protected abstract void createAndShowEmbeddedWindowAsync(final long hwndParent, AsyncResult<Boolean> asyncResult);
	
	public static byte[] getFormRegionOfs() throws IOException {
		InputStream is = null;
		try {
			is = OfficeAddinUtil.class.getClassLoader().getResourceAsStream("com/wilutions/joa/outlook/FormRegion.ofs");
			if (is == null)
				throw new IOException("Resource FormRegion.ofs not found.");
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			byte[] buf = new byte[10000];
			int len = 0;
			while ((len = is.read(buf)) != -1) {
				bos.write(buf, 0, len);
			}
			return bos.toByteArray();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
				}
			}
		}
	}

	/**
	 * Called after the form region window is shown.
	 */
	public void onShow() throws ComException {
	}

	public void onExpanded(Boolean Expand) throws ComException {
	}

	public void onClose() throws ComException {
	}

	public void onLayout() throws ComException {
	}

}