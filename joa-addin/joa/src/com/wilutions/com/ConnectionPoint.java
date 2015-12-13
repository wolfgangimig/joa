package com.wilutions.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;

public class ConnectionPoint<T extends IUnknown> {

	private int cookieCounter;

	private HashMap<Integer, T> listeners = new HashMap<Integer, T>();

	public ConnectionPoint() {
	}
	
	public synchronized int advise(T listener) {
		int cookie = ++cookieCounter;
		if (cookie < 0)
			throw new ComException("Too many listeners for ConnectionPoint.");
		listeners.put(cookie, listener);
		return cookie;
	}

	public synchronized void unadvise(int cookie) {
		listeners.remove(cookie);
	}

	public void forEach(Consumer<T> action) {
		ArrayList<T> values = null;
		synchronized (this) {
			values = new ArrayList<T>(listeners.values());
		}
		values.forEach(action);
	}
}
