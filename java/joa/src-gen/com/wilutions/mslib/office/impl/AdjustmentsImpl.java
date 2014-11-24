/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A7B-A463-DB41-5DAE-69E7A5F7FCBC}")
public class AdjustmentsImpl extends Dispatch implements com.wilutions.mslib.office.Adjustments {
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
  @DeclDISPID(2)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(2,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public Float getItem(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(0)  public void setItem(Integer Index, Float value2) throws ComException {
    assert(value2 != null);
    assert(Index != null);
    this._dispatchCall(0,"Item", DISPATCH_PROPERTYPUT,value2,Index);
  }
  public AdjustmentsImpl(String progId) throws ComException {
    super(progId, "{000C0310-0000-0000-C000-000000000046}");
  }
  protected AdjustmentsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AdjustmentsImpl" + super.toString() + "]";
  }
}
