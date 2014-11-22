/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8C5F-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ODSOFiltersImpl extends Dispatch implements com.wilutions.mslib.office.ODSOFilters {
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
  @DeclDISPID(1)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(2,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610809346)  public Dispatch Item(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(1610809346,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610809347)  public void Add(String Column, com.wilutions.mslib.office.MsoFilterComparison Comparison, com.wilutions.mslib.office.MsoFilterConjunction Conjunction, String bstrCompareTo, Boolean DeferUpdate) throws ComException {
    assert(Column != null);
    assert(Comparison != null);
    assert(Conjunction != null);
    assert(bstrCompareTo != null);
    assert(DeferUpdate != null);
    this._dispatchCall(1610809347,"Add", DISPATCH_METHOD,null,Column,Comparison.value,Conjunction.value,bstrCompareTo,DeferUpdate);
  }
  @DeclDISPID(1610809348)  public void Delete(Integer Index, Boolean DeferUpdate) throws ComException {
    assert(Index != null);
    assert(DeferUpdate != null);
    this._dispatchCall(1610809348,"Delete", DISPATCH_METHOD,null,Index,DeferUpdate);
  }
  public ODSOFiltersImpl(String progId) throws ComException {
    super(progId, "{000C1534-0000-0000-C000-000000000046}");
  }
  protected ODSOFiltersImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ODSOFiltersImpl" + super.toString() + "]";
  }
}
