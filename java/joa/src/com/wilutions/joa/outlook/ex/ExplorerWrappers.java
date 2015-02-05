package com.wilutions.joa.outlook.ex;

import java.util.HashMap;

import com.wilutions.mslib.outlook.Explorer;

public class ExplorerWrappers {

	private final static Map map = new Map();
	
	public static void add(ExplorerWrapper wrapper) {
		map.add(wrapper);
	}
	
	public static ExplorerWrapper get(Explorer Explorer) {
		return map.get(Explorer);
	}
	
	public static void remove(ExplorerWrapper wrapper) {
		map.remove(wrapper);
	}

	public static class Map {
		
		private final HashMap<Explorer, ExplorerWrapper> map = new HashMap<Explorer, ExplorerWrapper>();

		public void add(ExplorerWrapper wrapper) {
			map.put(wrapper.getExplorer(), wrapper);
		}
		
		public ExplorerWrapper get(Explorer Explorer) {
			return map.get(Explorer);
		}
		
		public void remove(ExplorerWrapper wrapper) {
			map.remove(wrapper.getExplorer());
		}
	}

}
