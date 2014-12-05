package com.wilutions.joa.swing;

import com.wilutions.com.AsyncResult;
import com.wilutions.joa.outlook.OutlookFormRegion;

public abstract class FormRegionSwing extends OutlookFormRegion implements FrameContentFactory {

	protected final EmbeddedFrameSwing embeddedFrame = new EmbeddedFrameSwing();
	
	protected void createAndShowEmbeddedWindowAsync(final long hwndParent, final AsyncResult<Boolean> asyncResult) {
		embeddedFrame.createAndShowEmbeddedWindowAsync(hwndParent, this, asyncResult);
	}

	@Override
	public long getWindowHandle() {
		return embeddedFrame.getWindowHandle();
	}

}
