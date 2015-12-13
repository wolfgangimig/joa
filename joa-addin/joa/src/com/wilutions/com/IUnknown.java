package com.wilutions.com;

public interface IUnknown {

	default void release() {
		throw new UnsupportedOperationException();
	}

}
