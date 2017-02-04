package com.wilutions.joa;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.wilutions.com.reg.DeclRegistryValue;
import com.wilutions.mslib.office.MsoCTPDockPosition;

/**
 * Position values of TaskPane.
 * This class is used to make a task pane's position persistent.
 *
 */
public class TaskPanePosition implements Serializable {

	private static final long serialVersionUID = -8846105755641747712L;

	/**
	 * Persistent dock position.
	 * This member is load and stored in the Windows registry.
	 */
	@DeclRegistryValue
	@Expose
	private MsoCTPDockPosition dockPosition = MsoCTPDockPosition.msoCTPDockPositionRight;

	/**
	 * Persistent visibility.
	 */
	@DeclRegistryValue
	@Expose
	private boolean visible;
	
	/**
	 * Persistent width.
	 * Ignored for top or bottom docking positions.
	 */
	@DeclRegistryValue
	@Expose
	private int width;
	
	/**
	 * Persistent height.
	 * Ignored for left or right docking positions.
	 */
	@DeclRegistryValue
	@Expose
	private int height;

	public MsoCTPDockPosition getDockPosition() {
		return dockPosition;
	}

	public void setDockPosition(MsoCTPDockPosition dockPosition) {
		this.dockPosition = dockPosition;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	

}
