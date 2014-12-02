package com.wilutions.joa.fx;

import com.wilutions.com.AsyncResult;
import com.wilutions.joa.TaskPane;

/**
 * Taks pane base class for JavaFX views.
 *
 */
public abstract class TaskPaneFX extends TaskPane implements SceneFactory {

	protected final EmbeddedFrameFX frameFX = new EmbeddedFrameFX();

	/**
	 * Create and show the task pane's view.
	 * 
	 * @param hwndParent
	 *            Native parent window handle.
	 * @param asyncResult
	 *            Expression to be called after the new task pane was made
	 *            visible. This call is made from the Tookit's UI thread. This
	 *            parameter can be null.
	 */
	protected void createAndShowEmbeddedWindowAsync(final long hwndParent, final AsyncResult<Boolean> asyncResult) {
		frameFX.createAndShowEmbeddedWindowAsync(hwndParent, this, asyncResult);
	}

	@Override
	public long getWindowHandle() {
		return frameFX.getWindowHandle();
	}

	@Override
	public void close() {
		super.close();
		frameFX.close();
	}
}
