package com.wilutions.joa.ribbon;

import com.wilutions.joa.outlook.ex.Wrapper;
import com.wilutions.mslib.office.IRibbonControl;

public class RibbonButton extends RibbonControl {
	
	public interface ActionHandler {
		void f(IRibbonControl control, Wrapper context, Boolean pressed);
	}
	
	@RibbonControlAttribute
	private boolean pressed;

	@RibbonControlAttribute("Ribbon_onAction")
	private ActionHandler onAction;
	
	@RibbonControlAttribute
	private String image;
	
	public RibbonButton() {
		super("button");
	}
	
	protected RibbonButton(String type) {
		super(type);
	}
	
	public boolean isPressed() {
		return pressed;
	}

	public void setPressed(boolean pressed) {
		this.pressed = pressed;
	}

	public ActionHandler getOnAction() {
		return onAction;
	}

	public void setOnAction(ActionHandler onAction) {
		this.onAction = onAction;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
}
