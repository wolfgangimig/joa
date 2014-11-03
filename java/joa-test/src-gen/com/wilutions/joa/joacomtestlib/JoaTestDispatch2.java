package com.wilutions.joa.joacomtestlib;
import com.wilutions.com.*;

/**
 * JoaTestDispatch2.
 * 
 */
@CoClass(guid="{F8A6BAC0-6A82-46E5-B5CD-D6B56D2E1702}")
public class JoaTestDispatch2 extends Dispatch implements IJoaTestDispatch2 {
  @DeclDISPID(1)  public void Name() throws ComException {
    this._dispatchCall(1,"Name", DISPATCH_METHOD,null);
  }
  public JoaTestDispatch2() throws ComException {
    super("{F8A6BAC0-6A82-46E5-B5CD-D6B56D2E1702}");
  }
  protected JoaTestDispatch2(long ndisp) {
    super(ndisp);
  }
  public JoaTestDispatch2(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[JoaTestDispatch2" + super.toString() + "]";
  }
}
