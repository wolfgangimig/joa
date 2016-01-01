package com.wilutions.joa.ribbon;

public class RibbonListItem {
	private String id;
	private String label;
	private String image;

	public RibbonListItem() {
		
	}
	
	public RibbonListItem(String id, String label, String image) {
		this.id = id;
		this.setLabel(label);
		this.image = image;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
