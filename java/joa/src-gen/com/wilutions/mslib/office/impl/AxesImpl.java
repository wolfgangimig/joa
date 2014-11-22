/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E79-A463-DB41-5DAE-69E7A5F7FCBC}")
public class AxesImpl extends Dispatch implements com.wilutions.mslib.office.Axes {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.office.IMsoAxis getItem(com.wilutions.mslib.office.XlAxisType Type, com.wilutions.mslib.office.XlAxisGroup AxisGroup) throws ComException {
    assert(Type != null);
    assert(AxisGroup != null);
    final Object obj = this._dispatchCall(1610743809,"Item", DISPATCH_PROPERTYGET,null,Type.value,AxisGroup.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.IMsoAxisImpl.class);
  }
  @DeclDISPID(1610743810)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(148)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(148,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(149)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(149,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.IMsoAxis get_Default(com.wilutions.mslib.office.XlAxisType Type, com.wilutions.mslib.office.XlAxisGroup AxisGroup) throws ComException {
    assert(Type != null);
    assert(AxisGroup != null);
    final Object obj = this._dispatchCall(0,"_Default", DISPATCH_PROPERTYGET,null,Type.value,AxisGroup.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.IMsoAxisImpl.class);
  }
  @DeclDISPID(150)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  public AxesImpl(String progId) throws ComException {
    super(progId, "{000C1712-0000-0000-C000-000000000046}");
  }
  protected AxesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AxesImpl" + super.toString() + "]";
  }
}
