package com.wilutions.joa.joacomtestlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{8FC76930-057A-969F-313D-A729665A078C}")
public class IJoaTestDispatch2Impl extends Dispatch implements com.wilutions.joa.joacomtestlib.IJoaTestDispatch2 {
  @DeclDISPID(1)  public void Name() throws ComException {
    this._dispatchCall(1,"Name", DISPATCH_METHOD,null);
  }
  public IJoaTestDispatch2Impl(String progId) throws ComException {
    super(progId);
  }
  protected IJoaTestDispatch2Impl(long ndisp) {
    super(ndisp);
  }
  public IJoaTestDispatch2Impl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IJoaTestDispatch2Impl" + super.toString() + "]";
  }
}
