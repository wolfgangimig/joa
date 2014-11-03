/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A6A-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _IMsoOleAccDispObjImpl extends Dispatch implements com.wilutions.mslib.office._IMsoOleAccDispObj {
  @DeclDISPID(1610809344)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610809345)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public _IMsoOleAccDispObjImpl(String progId) throws ComException {
    super(progId);
  }
  protected _IMsoOleAccDispObjImpl(long ndisp) {
    super(ndisp);
  }
  public _IMsoOleAccDispObjImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IMsoOleAccDispObjImpl" + super.toString() + "]";
  }
}
