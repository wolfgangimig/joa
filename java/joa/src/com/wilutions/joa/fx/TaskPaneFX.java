package com.wilutions.joa.fx;

import com.wilutions.com.AsyncResult;
import com.wilutions.joa.TaskPane;

import javafx.stage.Window;

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
	
	public Window getWindow() {
		return embeddedFrame.getWindow();
	}

	@Override
	public void close() {
		super.close();
		embeddedFrame.close();
	}
}
