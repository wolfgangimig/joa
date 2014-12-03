package com.wilutions.joa.swing;

import java.awt.Component;

import javax.swing.SwingUtilities;

import sun.awt.windows.WEmbeddedFrame;

import com.wilutions.com.AsyncResult;
import com.wilutions.com.WindowHandle;
import com.wilutions.com.WindowsUtil;

public class EmbeddedFrameSwing implements WindowHandle {

	protected WEmbeddedFrame window;

	public void createAndShowEmbeddedWindowAsync(final long hwndParent, final FrameContentFactory panelFactory,
			final AsyncResult<Boolean> asyncResult) {
		
		SwingUtilities.invokeLater(() -> {
			Throwable ex = null;
			try {
				// Create the Java window as a child window of the
				// JoaBridgeCtrl.
				window = new WEmbeddedFrame(hwndParent);

				// Create and add the View to the window.
				Component jpanel = panelFactory.createFrameContent();
				window.add(jpanel);

				window.setVisible(true);
				
			} catch (Throwable e) {
				ex = e;
			} finally {
				if (asyncResult != null) {
					asyncResult.setAsyncResult(ex == null, ex);
				}
			}
		});
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

}
