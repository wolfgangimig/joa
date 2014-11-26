package com.wilutions.com;

import java.util.Collection;
import java.util.HashMap;


public class ConnectionPointContainer {

	private HashMap<String, ConnectionPoint<?>> connPoints = new HashMap<String, ConnectionPoint<?>>();
	
	@SuppressWarnings("unchecked")
	public <T extends IUnknown> ConnectionPoint<T> findConnectionPoint(String guid) {
		return (ConnectionPoint<T>)connPoints.get(guid);
	}
	
	public <T extends IUnknown> ConnectionPoint<T> findConnectionPoint(Class<T> coInterface) {
		String guid = coInterface.getAnnotation(CoInterface.class).guid();
		return findConnectionPoint(guid);
	}
	
	public Collection<ConnectionPoint<?>> getAllConnectionPoints() {
		return connPoints.values();
	}
	
	
}
