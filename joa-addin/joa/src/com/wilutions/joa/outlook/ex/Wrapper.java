package com.wilutions.joa.outlook.ex;

import com.wilutions.com.IDispatch;
import com.wilutions.mslib.office.IRibbonControl;

public interface Wrapper {
	public IDispatch getWrappedObject();
	public void addRibbonControl(IRibbonControl control);
}
