/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AD0-A463-DB41-5DAE-69E7A5F7FCBC}")
public class TabStop2Impl extends Dispatch implements com.wilutions.mslib.office.TabStop2 {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(2)  public void Clear() throws ComException {
    this._dispatchCall(2,"Clear", DISPATCH_METHOD,null);
  }
  @DeclDISPID(3)  public Float getPosition() throws ComException {
    final Object obj = this._dispatchCall(3,"Position", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(3)  public void setPosition(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(3,"Position", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4)  public com.wilutions.mslib.office.MsoTabStopType getType() throws ComException {
    final Object obj = this._dispatchCall(4,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTabStopType.valueOf((Integer)obj);
  }
  @DeclDISPID(4)  public void setType(com.wilutions.mslib.office.MsoTabStopType value) throws ComException {
    assert(value != null);
    this._dispatchCall(4,"Type", DISPATCH_PROPERTYPUT,value.value);
  }
  public TabStop2Impl(String progId) throws ComException {
    super(progId, "{000C03BB-0000-0000-C000-000000000046}");
  }
  protected TabStop2Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[TabStop2Impl" + super.toString() + "]";
  }
}
