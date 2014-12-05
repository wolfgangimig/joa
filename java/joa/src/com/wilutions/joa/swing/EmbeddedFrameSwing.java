package com.wilutions.joa.swing;

import java.awt.Component;

import javax.swing.JMenuBar;
import javax.swing.SwingUtilities;

import sun.awt.windows.WEmbeddedFrame;

import com.wilutions.com.AsyncResult;
import com.wilutions.com.WindowHandle;
import com.wilutions.com.WindowsUtil;

public class EmbeddedFrameSwing implements WindowHandle {

	protected volatile WEmbeddedFrame window;
	protected volatile JMenuBar menuBar;

	/**
	 * Create an embedded window and show the supplied content.
	 * @param hwndParent Parent window.
	 * @param frameContent Frame content
	 * @param asyncResult Expression that is called when the window is made visible. This expression is called on the toolkit's UI thread.
	 */
	protected void createAndShowEmbeddedWindowAsync(final long hwndParent, final Component frameContent,
			final AsyncResult<Boolean> asyncResult) {
		assert hwndParent != 0;
		assert frameContent != null;
		if (SwingUtilities.isEventDispatchThread()) {
			internalCreateAndShow(hwndParent, frameContent, asyncResult);
		} else {
			SwingUtilities.invokeLater(() -> {
				internalCreateAndShow(hwndParent, frameContent, asyncResult);
			});
		}
	}

	/**
	 * Create window content by the supplied factory and show an embedded window.
	 * @param hwndParent Parent window.
	 * @param contentFactory Frame content factory to create the content.
	 * @param asyncResult Expression that is called when the window is made visible. This expression is called on the toolkit's UI thread.
	 */
	protected void createAndShowEmbeddedWindowAsync(final long hwndParent, final FrameContentFactory contentFactory,
			final AsyncResult<Boolean> asyncResult) {
		assert hwndParent != 0;
		assert contentFactory != null;
		if (SwingUtilities.isEventDispatchThread()) {
			Component frameContent = contentFactory.createFrameContent();
			createAndShowEmbeddedWindowAsync(hwndParent, frameContent, asyncResult);
		} else {
			SwingUtilities.invokeLater(() -> {
				Component frameContent = contentFactory.createFrameContent();
				createAndShowEmbeddedWindowAsync(hwndParent, frameContent, asyncResult);
			});
		}
	}

	@Override
	public long getWindowHandle() {
		return WindowsUtil.getWindowHandle(window);
	}

	public void close() {
		if (window != null) {
			window.dispose();
		}
	}

	private void internalCreateAndShow(final long hwndParent, final Component frameContent,
			final AsyncResult<Boolean> asyncResult) {
		Throwable ex = null;
		try {
			// Create the Java window as a child window of the
			// JoaBridgeCtrl.
			window = new WEmbeddedFrame(hwndParent);

			// Create and add the View to the window.
			window.add(frameContent);
			
			window.pack();

			window.setVisible(true);

		} catch (Throwable e) {
			ex = e;
		} finally {
			if (asyncResult != null) {
				asyncResult.setAsyncResult(ex == null, ex);
			}
		}
	}

}
