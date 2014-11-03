/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AAB-A463-DB41-5DAE-69E7A5F7FCBC}")
public class GradientStopsImpl extends Dispatch implements com.wilutions.mslib.office.GradientStops {
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
  @DeclDISPID(0)  public com.wilutions.mslib.office.GradientStop getItem(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.GradientStopImpl.class);
  }
  @DeclDISPID(2)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(2,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(10)  public void Delete(Integer Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(10,"Delete", DISPATCH_METHOD,null,Index);
  }
  @DeclDISPID(11)  public void Insert(com.wilutions.mslib.office.MsoRGBType RGB, Float Position, Float Transparency, Integer Index) throws ComException {
    assert(RGB != null);
    assert(Position != null);
    assert(Transparency != null);
    assert(Index != null);
    this._dispatchCall(11,"Insert", DISPATCH_METHOD,null,RGB.getValue(),Position,Transparency,Index);
  }
  @DeclDISPID(12)  public void Insert2(com.wilutions.mslib.office.MsoRGBType RGB, Float Position, Float Transparency, Integer Index, Float Brightness) throws ComException {
    assert(RGB != null);
    assert(Position != null);
    assert(Transparency != null);
    assert(Index != null);
    assert(Brightness != null);
    this._dispatchCall(12,"Insert2", DISPATCH_METHOD,null,RGB.getValue(),Position,Transparency,Index,Brightness);
  }
  public GradientStopsImpl(String progId) throws ComException {
    super(progId);
  }
  protected GradientStopsImpl(long ndisp) {
    super(ndisp);
  }
  public GradientStopsImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[GradientStopsImpl" + super.toString() + "]";
  }
}
