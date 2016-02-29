package com.wilutions.com;

import java.util.HashMap;


public class ConnectionPointContainer {

	private HashMap<String, ConnectionPoint<?>> connPoints = new HashMap<String, ConnectionPoint<?>>();
	
	//public native <T extends IUnknown> ConnectionPoint<T> findConnectionPoint2(String guid);
	
	@SuppressWarnings("unchecked")
	public synchronized <T extends IUnknown> ConnectionPoint<T> findConnectionPoint(String guid) {
		ConnectionPoint<T> cp = (ConnectionPoint<T>)connPoints.get(guid);
		return cp;
	}
	
	public synchronized <T extends IUnknown> ConnectionPoint<T> findConnectionPoint(Class<T> coInterface) {
		String guid = coInterface.getAnnotation(CoInterface.class).guid();
		return findConnectionPoint(guid);
	}
	
	@SuppressWarnings("rawtypes")
	public synchronized void provideConnectionPoint(String guid) {
		ConnectionPoint<?> cp = connPoints.get(guid);
		if (cp == null) {
			connPoints.put(guid,  new ConnectionPoint());
		}
	}
	
	public synchronized <T extends IUnknown> void provideConnectionPoint(Class<T> coInterface) {
		String guid = coInterface.getAnnotation(CoInterface.class).guid();
		provideConnectionPoint(guid);
	}
	
	public synchronized String[] getAllConnectionPointGuids() {
		String[] arr = new String[connPoints.size()];
		int i = 0;
		for (String cp : connPoints.keySet()) {
			arr[i++] = cp;
		}
		return arr;
	}
	

}
