/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.joactrllib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{4BD46E86-60D6-96FB-2CDA-8131B9B367F2}")
public class IJoaBridgeCtrlImpl extends Dispatch implements com.wilutions.joactrllib.IJoaBridgeCtrl {
  @DeclDISPID(-515)  public com.wilutions.joactrllib.LONG_PTR getHWND() throws ComException {
    final Object obj = this._dispatchCall(-515,"HWND", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new com.wilutions.joactrllib.LONG_PTR(als);
  }
  public IJoaBridgeCtrlImpl(String progId) throws ComException {
    super(progId);
  }
  protected IJoaBridgeCtrlImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IJoaBridgeCtrlImpl" + super.toString() + "]";
  }
}
