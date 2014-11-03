package com.wilutions.joa.joacomtestlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{260DEE25-58B7-97B8-2FA7-7631DF960A5A}")
public class IJoaTestDispatch1Impl extends Dispatch implements com.wilutions.joa.joacomtestlib.IJoaTestDispatch1 {
  @DeclDISPID(1)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1)  public void setName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"Name", DISPATCH_PROPERTYPUT,value);
  }
  public IJoaTestDispatch1Impl(String progId) throws ComException {
    super(progId);
  }
  protected IJoaTestDispatch1Impl(long ndisp) {
    super(ndisp);
  }
  public IJoaTestDispatch1Impl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IJoaTestDispatch1Impl" + super.toString() + "]";
  }
}
