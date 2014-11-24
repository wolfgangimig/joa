/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A6B-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _IMsoDispObjImpl extends Dispatch implements com.wilutions.mslib.office._IMsoDispObj {
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
  public _IMsoDispObjImpl(String progId) throws ComException {
    super(progId, "{000C0300-0000-0000-C000-000000000046}");
  }
  protected _IMsoDispObjImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IMsoDispObjImpl" + super.toString() + "]";
  }
}
