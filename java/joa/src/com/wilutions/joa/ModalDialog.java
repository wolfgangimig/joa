package com.wilutions.joa;

import javafx.scene.Scene;

import com.wilutions.com.AsyncResult;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.DispatchImpl;
import com.wilutions.joa.fx.EmbeddedWindow;
import com.wilutions.joa.fx.EmbeddedWindowFactory;
import com.wilutions.joactrllib.IJoaBridgeDialog;
import com.wilutions.joactrllib._IJoaBridgeDialogEvents;

public abstract class ModalDialog<T> {

	protected Dispatch owner;
	protected IJoaBridgeDialog joaDlg;
	private EmbeddedWindow fxFrame;
	private long hwndParent;
	protected AsyncResult<T> asyncResult;
	private T result;
	
	private double x, y, width, height, minWidth, maxWidth, minHeight, maxHeight;
	private boolean centerOnOwner = true;
	private boolean resizable = true;
	private boolean minimizeBox = false;
	private boolean maximizeBox = true;
	private String title;
	
	public final static int CANCEL = 0;
	public final static int OK = 1;

	private enum State {
		Initialized, HasParentHwnd, IsClosed
	};

	private State state = State.Initialized;

	public ModalDialog() {
	}

	/**
	 * Create JavaFX scene.
	 * 
	 * @return Scene object
	 * @throws ComException
	 */
	protected abstract Scene createScene() throws ComException;
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setCenterOnOwner(boolean v) {
		this.centerOnOwner = v;
	}
	
	public boolean isCenterOnOwner() {
		return this.centerOnOwner;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public boolean isResizable() {
		return resizable;
	}

	public void setResizable(boolean resizable) {
		this.resizable = resizable;
	}
	
	public double getMinWidth() {
		return minWidth;
	}

	public void setMinWidth(double minWidth) {
		this.minWidth = minWidth;
	}

	public double getMaxWidth() {
		return maxWidth;
	}

	public void setMaxWidth(double maxWidth) {
		this.maxWidth = maxWidth;
	}

	public double getMinHeight() {
		return minHeight;
	}

	public void setMinHeight(double minHeight) {
		this.minHeight = minHeight;
	}

	public double getMaxHeight() {
		return maxHeight;
	}

	public void setMaxHeight(double maxHeight) {
		this.maxHeight = maxHeight;
	}
	
	public boolean isMinimizeBox() {
		return minimizeBox;
	}

	public void setMinimizeBox(boolean minimizeBox) {
		this.minimizeBox = minimizeBox;
	}

	public boolean isMaximizeBox() {
		return maximizeBox;
	}

	public void setMaximizeBox(boolean maximizeBox) {
		this.maximizeBox = maximizeBox;
	}

	private Integer toWin(double x) {
		return Double.valueOf(x).intValue();
	}

	public void showAsync(Object _owner, AsyncResult<T> asyncResult) {
		this.owner = Dispatch.as(_owner, Dispatch.class);
		assert this.owner != null;

		System.out.println("CreateBridgeDialog...");
		joaDlg = OfficeAddin.getJoaUtil().CreateBridgeDialog();
		System.out.println("CreateBridgeDialog=" + joaDlg);
		
		joaDlg.setWidth(toWin(width));
		joaDlg.setHeight(toWin(height));
		joaDlg.setX(toWin(x));
		joaDlg.setY(toWin(y));
		joaDlg.setTitle(title != null ? title : "");
		joaDlg.setCenterOnOwner(centerOnOwner);
		joaDlg.setResizable(resizable);
		joaDlg.setMinHeight(toWin(minHeight));
		joaDlg.setMaxHeight(toWin(maxHeight));
		joaDlg.setMinWidth(toWin(minWidth));
		joaDlg.setMaxWidth(toWin(maxWidth));
		joaDlg.setMinimizeBox(minimizeBox);
		joaDlg.setMaximizeBox(maximizeBox);
	
		DialogEventHandler dialogHandler = new DialogEventHandler();
		Dispatch.withEvents(joaDlg, dialogHandler);
		System.out.println("handler assigned");
		
		try {
			
			// Show native dialog
			joaDlg.ShowModal(owner);
			System.out.println("ShowModal OK");

			synchronized (this) {
				while (state == State.Initialized) {
					this.wait();
				}
			}
			
			System.out.println("state=" + state);
	
			if (state == State.HasParentHwnd) {
				Scene scene = createScene();
				System.out.println("scene=" + scene);
				fxFrame = EmbeddedWindowFactory.getInstance().create(hwndParent, scene);
				System.out.println("embedded window OK");
				joaDlg.SetFocusOnFirstChildWindow();
				this.asyncResult = asyncResult;
			}
			else {
				asyncResult.setAsyncResult(null, new IllegalStateException("Excpected response from Office application."));
				dialogHandler.onClosed();
			}

		} catch (Throwable ex) {
			if (asyncResult != null) {
				asyncResult.setAsyncResult(null, ex);
			}
			dialogHandler.onClosed();
		} 
	}

	public void finish(T result) {
		setResult(result);
		close();
	}

	public void close() {
		Throwable ex = null;
		if (joaDlg != null) {
			try {
				joaDlg.Close();
			}
			catch (Throwable ex1) {
				ex = ex1;
			}
		}
		if (asyncResult != null) {
			asyncResult.setAsyncResult(result, ex);
		}
	}
	
	public void setResult(T ret) throws ComException {
		this.result = ret;
	}
	
	public T getResult() {
		return this.result;
	}

	public boolean canClose() throws ComException {
		return true;
	}
	
	private class DialogEventHandler extends DispatchImpl implements _IJoaBridgeDialogEvents {

		@Override
		public void onShow(final Long hwndParent) throws ComException {
			synchronized (ModalDialog.this) {
				ModalDialog.this.hwndParent = hwndParent;
				ModalDialog.this.state = State.HasParentHwnd;
				ModalDialog.this.notify();
			}
		}

		@Override
		public Boolean onCanClose() throws ComException {
			return ModalDialog.this.canClose();
		}

		@Override
		public void onClosed() throws ComException {
			Dispatch.releaseEvents(ModalDialog.this.joaDlg, this);
			ModalDialog.this.fxFrame.dispose();
			synchronized (ModalDialog.this) {
				ModalDialog.this.state = State.IsClosed;
				ModalDialog.this.notify();
			}
		}
		
	}
}
