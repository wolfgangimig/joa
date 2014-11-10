/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E66-A463-DB41-5DAE-69E7A5F7FCBC}")
public class PointsImpl extends Dispatch implements com.wilutions.mslib.office.Points {
  @DeclDISPID(150)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(118)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(118,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(170)  public com.wilutions.mslib.office.ChartPoint Item(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(170,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.ChartPoint)obj;
  }
  @DeclDISPID(-4)  public Object _NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_METHOD,null);
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
  @DeclDISPID(0)  public com.wilutions.mslib.office.ChartPoint get_Default(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"_Default", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.ChartPoint)obj;
  }
  public PointsImpl(String progId) throws ComException {
    super(progId);
  }
  protected PointsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PointsImpl" + super.toString() + "]";
  }
}
