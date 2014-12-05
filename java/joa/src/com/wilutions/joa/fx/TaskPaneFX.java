package com.wilutions.joa.fx;

import com.wilutions.com.AsyncResult;
import com.wilutions.joa.TaskPane;

/**
 * Taks pane base class for JavaFX views.
 *
 */
public abstract class TaskPaneFX extends TaskPane implements FrameContentFactory {

	protected final EmbeddedFrameFX embeddedFrame = new EmbeddedFrameFX();

	protected void createAndShowEmbeddedWindowAsync(final long hwndParent, final AsyncResult<Boolean> asyncResult) {
		embeddedFrame.createAndShowEmbeddedWindowAsync(hwndParent, this, asyncResult);
	}

	@Override
	public long getWindowHandle() {
		return embeddedFrame.getWindowHandle();
	}

	@Override
	public void close() {
		super.close();
		embeddedFrame.close();
	}
}
