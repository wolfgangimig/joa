package com.wilutions.joa.ribbon;

import java.util.ArrayList;
import java.util.List;

import com.wilutions.joa.outlook.ex.Wrapper;
import com.wilutions.mslib.office.IRibbonControl;

public class RibbonDynamicMenu extends RibbonControl {
	
	public interface GetContentHandler {
		String f(IRibbonControl control, Wrapper context);
	}


	private ArrayList<RibbonControl> controls = new ArrayList<RibbonControl>();
	
	@RibbonControlAttribute("Ribbon_getContent")
	private GetContentHandler getContent;
	
	public RibbonDynamicMenu() {
		super("dynamicMenu");
	}

	public List<RibbonControl> getControls() {
		return controls;
	}
	
	public String getContent() {
		StringBuilder sbuf = new StringBuilder();
		sbuf.append("<menu xmlns=\"http://schemas.microsoft.com/office/2006/01/customui\">");
		for (RibbonControl rctrl : controls) {
			sbuf.append(rctrl.toXML()).append("\n");
		}
		sbuf.append("</menu>");
		return sbuf.toString();
	}
}
