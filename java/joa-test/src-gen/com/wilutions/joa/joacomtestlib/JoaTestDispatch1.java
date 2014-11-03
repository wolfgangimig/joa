package com.wilutions.joa.joacomtestlib;
import com.wilutions.com.*;

/**
 * JoaTestDispatch1.
 * 
 */
@CoClass(guid="{23DBE989-E203-42E4-A169-0862F12E9582}")
public class JoaTestDispatch1 extends Dispatch implements IJoaTestDispatch1 {
  @DeclDISPID(1)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1)  public void setName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"Name", DISPATCH_PROPERTYPUT,value);
  }
  public JoaTestDispatch1() throws ComException {
    super("{23DBE989-E203-42E4-A169-0862F12E9582}");
  }
  protected JoaTestDispatch1(long ndisp) {
    super(ndisp);
  }
  public JoaTestDispatch1(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[JoaTestDispatch1" + super.toString() + "]";
  }
}
