/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E61-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SeriesCollectionImpl extends Dispatch implements com.wilutions.mslib.office.SeriesCollection {
  @DeclDISPID(150)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(181)  public com.wilutions.mslib.office.IMsoSeries Add(Object Source, com.wilutions.mslib.office.XlRowCol Rowcol, Object SeriesLabels, Object CategoryLabels, Object Replace) throws ComException {
    assert(Source != null);
    assert(Rowcol != null);
    assert(SeriesLabels != null);
    assert(CategoryLabels != null);
    assert(Replace != null);
    final Object obj = this._dispatchCall(181,"Add", DISPATCH_METHOD,null,Source,Rowcol.value,SeriesLabels,CategoryLabels,Replace);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoSeries)obj;
  }
  @DeclDISPID(118)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(118,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(227)  public Object Extend(Object Source, Object Rowcol, Object CategoryLabels) throws ComException {
    assert(Source != null);
    assert(Rowcol != null);
    assert(CategoryLabels != null);
    final Object obj = this._dispatchCall(227,"Extend", DISPATCH_METHOD,null,Source,Rowcol,CategoryLabels);
    if (obj == null) return null;
    return (Object)obj;
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
  @DeclDISPID(211)  public Object Paste(com.wilutions.mslib.office.XlRowCol Rowcol, Object SeriesLabels, Object CategoryLabels, Object Replace, Object NewSeries) throws ComException {
    assert(Rowcol != null);
    assert(SeriesLabels != null);
    assert(CategoryLabels != null);
    assert(Replace != null);
    assert(NewSeries != null);
    final Object obj = this._dispatchCall(211,"Paste", DISPATCH_METHOD,null,Rowcol.value,SeriesLabels,CategoryLabels,Replace,NewSeries);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1117)  public com.wilutions.mslib.office.IMsoSeries NewSeries() throws ComException {
    final Object obj = this._dispatchCall(1117,"NewSeries", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoSeries)obj;
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
  @DeclDISPID(0)  public com.wilutions.mslib.office.IMsoSeries get_Default(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"_Default", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoSeries)obj;
  }
  public SeriesCollectionImpl(String progId) throws ComException {
    super(progId);
  }
  protected SeriesCollectionImpl(long ndisp) {
    super(ndisp);
  }
  public SeriesCollectionImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SeriesCollectionImpl" + super.toString() + "]";
  }
}
