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

	protected abstract void createAndShowEmbeddedWindowAsync(final long hwndParent, final AsyncResult<Boolean> asyncResult);

}
