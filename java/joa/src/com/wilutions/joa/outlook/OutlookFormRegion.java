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

import javafx.application.Platform;
import javafx.scene.Scene;

import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.DispatchImpl;
import com.wilutions.joa.OfficeAddinUtil;
import com.wilutions.joa.fx.EmbeddedWindow;
import com.wilutions.joa.fx.EmbeddedWindowFactory;
import com.wilutions.mslib.msforms.Control;
import com.wilutions.mslib.msforms.UserForm;
import com.wilutions.mslib.outlook.FormRegion;
import com.wilutions.mslib.outlook.FormRegionEvents;

public abstract class OutlookFormRegion extends DispatchImpl implements FormRegionEvents {

	protected FormRegion formRegion;
	protected UserForm userForm;
	protected Control joaCtrl;
	protected EmbeddedWindow fxFrame;

	// protected float initialWidth;
	// protected float initialHeight;

	protected OutlookFormRegion() {
		Dispatch.addEventToBeCalledInBackground(FormRegionEvents.class, "");
	}

	public String toString() {
		return "[OutlookFormRegion " + super.toString() + " ]";
	}

	protected abstract Scene createScene() throws ComException;

	public void show(FormRegion formRegion) throws ComException {

		this.formRegion = formRegion;
		this.formRegion.withEvents(OutlookFormRegion.this);

		userForm = formRegion.getForm().as(UserForm.class);
		joaCtrl = userForm.getControls().Item("JoaCtrl").as(Control.class);

		createSceneAndShowWindow();
	}

	private void createSceneAndShowWindow() throws ComException {

		System.out.println("createSceneAndShowWindow");

		Platform.runLater(() -> {
			try {
				final long hwndJoaCtrl = joaCtrl._GethWnd().longValue();
				final Scene scene = createScene();
				fxFrame = EmbeddedWindowFactory.getInstance().create(hwndJoaCtrl, scene);
			} catch (Throwable e) {
				e.printStackTrace();
			}
		});

	}

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
		System.out.println("onExpanded " + Expand);
	}

	public void onClose() throws ComException {
		System.out.println(getClass() + " onClose");
	}

	public void onLayout() throws ComException {
		System.out.println(getClass() + " onLayout");
	}

}