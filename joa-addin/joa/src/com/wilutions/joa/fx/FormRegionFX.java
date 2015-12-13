package com.wilutions.joa.fx;

import com.wilutions.com.AsyncResult;
import com.wilutions.joa.outlook.OutlookFormRegion;

public abstract class FormRegionFX extends OutlookFormRegion implements FrameContentFactory {

	protected final EmbeddedFrameFX embeddedFrame = new EmbeddedFrameFX();
	
	protected void createAndShowEmbeddedWindowAsync(final long hwndParent, final AsyncResult<Boolean> asyncResult) {
		embeddedFrame.createAndShowEmbeddedWindowAsync(hwndParent, this, asyncResult);
	}

	@Override
	public long getWindowHandle() {
		return embeddedFrame.getWindowHandle();
	}

}
