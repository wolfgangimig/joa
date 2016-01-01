package com.wilutions.joa.outlook.ex;

import com.wilutions.com.IDispatch;
import com.wilutions.joa.ribbon.RibbonControls;
import com.wilutions.mslib.office.IRibbonControl;

public interface Wrapper {
	public IDispatch getWrappedObject();
	public void addRibbonControlDispatchReference(IRibbonControl control);
	public RibbonControls getRibbonControls();
}
