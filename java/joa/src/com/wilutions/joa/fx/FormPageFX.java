package com.wilutions.joa.fx;

import com.wilutions.com.AsyncResult;
import com.wilutions.joa.outlook.FormPage;

public abstract class FormPageFX extends FormPage implements FrameContentFactory {

	protected final EmbeddedFrameFX embeddedFrame = new EmbeddedFrameFX();

	public void createAndShowEmbeddedWindowAsync(final long hwndParent, final AsyncResult<Boolean> asyncResult) {
		embeddedFrame.createAndShowEmbeddedWindowAsync(hwndParent, this, asyncResult);
	}

	@Override
	public long getWindowHandle() {
		return embeddedFrame.getWindowHandle();
	}

}
