/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E59-A463-DB41-5DAE-69E7A5F7FCBC}")
public class FullSeriesCollectionImpl extends Dispatch implements com.wilutions.mslib.office.FullSeriesCollection {
  @DeclDISPID(150)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(118)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(118,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(170)  public com.wilutions.mslib.office.IMsoSeries Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(170,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoSeries)obj;
  }
  @DeclDISPID(-4)  public Object _NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(148,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(149)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(149,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.IMsoSeries get_Default(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"_Default", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoSeries)obj;
  }
  public FullSeriesCollectionImpl(String progId) throws ComException {
    super(progId, "{000C1732-0000-0000-C000-000000000046}");
  }
  protected FullSeriesCollectionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[FullSeriesCollectionImpl" + super.toString() + "]";
  }
}
