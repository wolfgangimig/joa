package com.wilutions.joa.ribbon;

import java.lang.reflect.Field;

public class RibbonControl {

	private final String type;

	@RibbonControlAttribute
	private String id;

	@RibbonControlAttribute
	private boolean enabled = true;

	@RibbonControlAttribute
	private boolean visible = true;

	@RibbonControlAttribute
	private String label = "";

	public RibbonControl(String type) {
		this.type = type;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	protected void addXmlAttribute(StringBuilder sbuf, String tag, Object value) {
		if (value != null) {
			String svalue = value.toString();
			if (!svalue.isEmpty()) {
				sbuf.append(tag).append("=\"").append(svalue).append("\"\n");
			}
		}
	}

	protected void addXmlAttributes(Class<?> clazz, StringBuilder sbuf) {
		
		Class<?> superClass = clazz.getSuperclass();
		
		if (RibbonControl.class.isAssignableFrom(superClass)) {
			addXmlAttributes(superClass, sbuf);
		}
		
		for (Field f : clazz.getDeclaredFields()) {
			RibbonControlAttribute attr = f.getAnnotation(RibbonControlAttribute.class);
			if (attr != null) {
				try {
					f.setAccessible(true);
					String attrValue = attr.value();
					Object value = attrValue.isEmpty() ? f.get(this) : attrValue;
					addXmlAttribute(sbuf, f.getName(), value);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
			RibbonControlCallback callback = f.getAnnotation(RibbonControlCallback.class);
			if (callback != null) {
				try {
					f.setAccessible(true);
					String fieldName = f.getName();
					String callbackName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1); 
					addXmlAttribute(sbuf, callbackName, "Ribbon_" + callbackName);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public String toXML() {
		StringBuilder sbuf = new StringBuilder();
		sbuf.append("<").append(type).append("\n");
		addXmlAttributes(this.getClass(), sbuf);
		sbuf.append("/>");
		return sbuf.toString();
	}
}
