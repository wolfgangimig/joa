package com.wilutions.joa.outlook;

import java.util.HashMap;

import com.wilutions.mslib.outlook._Inspector;

public class InspectorWrappers<T extends InspectorWrapper> {
	
	private final HashMap<_Inspector, T> map = new HashMap<_Inspector, T>();

	public void add(T wrapper) {
		map.put(wrapper.getInspector(), wrapper);
	}
	
	public T get(_Inspector inspector) {
		return map.get(inspector);
	}
	
	public void remove(T wrapper) {
		map.remove(wrapper.getInspector());
	}
}
