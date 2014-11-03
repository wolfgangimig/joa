/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AD1-A463-DB41-5DAE-69E7A5F7FCBC}")
public class TabStops2Impl extends Dispatch implements com.wilutions.mslib.office.TabStops2 {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.TabStop2 Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TabStop2Impl.class);
  }
  @DeclDISPID(1)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(2)  public com.wilutions.mslib.office.TabStop2 Add(com.wilutions.mslib.office.MsoTabStopType Type, Float Position) throws ComException {
    assert(Type != null);
    assert(Position != null);
    final Object obj = this._dispatchCall(2,"Add", DISPATCH_METHOD,null,Type.value,Position);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TabStop2Impl.class);
  }
  @DeclDISPID(3)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(3,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(4)  public Float getDefaultSpacing() throws ComException {
    final Object obj = this._dispatchCall(4,"DefaultSpacing", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(4)  public void setDefaultSpacing(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(4,"DefaultSpacing", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public TabStops2Impl(String progId) throws ComException {
    super(progId);
  }
  protected TabStops2Impl(long ndisp) {
    super(ndisp);
  }
  public TabStops2Impl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[TabStops2Impl" + super.toString() + "]";
  }
}
