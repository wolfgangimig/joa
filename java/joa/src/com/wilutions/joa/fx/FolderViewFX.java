package com.wilutions.joa.fx;

import com.wilutions.com.AsyncResult;
import com.wilutions.joa.outlook.FolderView;

public abstract class FolderViewFX extends FolderView implements FrameContentFactory {

	protected final EmbeddedFrameFX embeddedFrame = new EmbeddedFrameFX();

	protected void createAndShowEmbeddedWindowAsync(final long hwndParent, final AsyncResult<Boolean> asyncResult) {
		embeddedFrame.createAndShowEmbeddedWindowAsync(hwndParent, this, asyncResult);
	}

	@Override
	public long getWindowHandle() {
		return embeddedFrame.getWindowHandle();
	}
}
