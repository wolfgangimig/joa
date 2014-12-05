package com.wilutions.joa.outlook;

import com.wilutions.com.AsyncResult;
import com.wilutions.com.WindowHandle;

public abstract class FolderView implements WindowHandle {
	
	private String id;
	
	public FolderView() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Create and show the view.
	 * 
	 * @param hwndParent
	 *            Native parent window handle.
	 * @param asyncResult
	 *            Expression to be called after the new view was made
	 *            visible. This call is made from the Tookit's UI thread. This
	 *            parameter can be null.
	 */
	protected abstract void createAndShowEmbeddedWindowAsync(final long hwndParent, final AsyncResult<Boolean> asyncResult);

}
