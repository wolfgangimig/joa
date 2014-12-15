package com.wilutions.joa.outlook.ex;

import java.util.HashMap;

import com.wilutions.mslib.outlook.Inspector;

public class InspectorWrappers {
	
	private final static Map map = new Map();
	
	public static void add(InspectorWrapper wrapper) {
		map.add(wrapper);
	}
	
	public static InspectorWrapper get(Inspector inspector) {
		return map.get(inspector);
	}
	
	public static void remove(InspectorWrapper wrapper) {
		map.remove(wrapper);
	}

	public static class Map {
		
		private final HashMap<Inspector, InspectorWrapper> map = new HashMap<Inspector, InspectorWrapper>();

		public void add(InspectorWrapper wrapper) {
			map.put(wrapper.getInspector(), wrapper);
		}
		
		public InspectorWrapper get(Inspector inspector) {
			return map.get(inspector);
		}
		
		public void remove(InspectorWrapper wrapper) {
			map.remove(wrapper.getInspector());
		}
	}

}
