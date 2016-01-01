package com.wilutions.joa.ribbon;

import java.util.HashMap;

public class RibbonControls {
	
	private HashMap<String, RibbonControl> map = new HashMap<String, RibbonControl>();
	
	public RibbonControl get(String id) {
		return map.get(id);
	}
	
	public RibbonControls add(RibbonControl rctrl) {
		map.put(rctrl.getId(), rctrl);
		return this;
	}
	
	public <T extends RibbonControl> T add(Class<T> controlClass, String id, String label) {
		T rctrl = null;
		try {
			rctrl = controlClass.newInstance();
			rctrl.setId(id);
			rctrl.setLabel(label);
			add(rctrl);
		}
		catch (Exception e) {
		}
		return rctrl;
	}
	
	public RibbonButton button(String id, String label) {
		return add(RibbonButton.class, id, label);
	}

	public RibbonToggleButton toggleButton(String id, String label) {
		return add(RibbonToggleButton.class, id, label);
	}

	public RibbonGroup group(String id, String label) {
		return add(RibbonGroup.class, id, label);
	}
	
	public RibbonLabel label(String id, String label) {
		return add(RibbonLabel.class, id, label);
	}
}
