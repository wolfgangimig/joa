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
  @DeclDISPID(1111)  public Boolean getFitToParent() throws ComException {
    final Object obj = this._dispatchCall(1111,"FitToParent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1111)  public void setFitToParent(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1111,"FitToParent", DISPATCH_PROPERTYPUT,value);
  }
  public IJoaBridgeCtrlImpl(String progId) throws ComException {
    super(progId, "{8B43F7ED-C4B5-4DBA-B174-E8D61C449B08}");
  }
  protected IJoaBridgeCtrlImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IJoaBridgeCtrlImpl" + super.toString() + "]";
  }
}
