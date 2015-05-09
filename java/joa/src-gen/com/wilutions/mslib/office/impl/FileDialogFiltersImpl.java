/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A0E-A463-DB41-5DAE-69E7A5F7FCBC}")
public class FileDialogFiltersImpl extends Dispatch implements com.wilutions.mslib.office.FileDialogFilters {
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
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610809346)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610809346,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.FileDialogFilter Item(final Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.FileDialogFilterImpl.class);
  }
  @DeclDISPID(1610809348)  public void Delete(final Object filter) throws ComException {
    assert(filter != null);
    this._dispatchCall(1610809348,"Delete", DISPATCH_METHOD,null,Variant.param(filter));
  }
  @DeclDISPID(1610809349)  public void Clear() throws ComException {
    this._dispatchCall(1610809349,"Clear", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610809350)  public com.wilutions.mslib.office.FileDialogFilter Add(final String Description, final String Extensions, final Object Position) throws ComException {
    assert(Description != null);
    assert(Extensions != null);
    assert(Position != null);
    final Object obj = this._dispatchCall(1610809350,"Add", DISPATCH_METHOD,null,Description,Extensions,Variant.param(Position));
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.FileDialogFilterImpl.class);
  }
  public FileDialogFiltersImpl(String progId) throws ComException {
    super(progId, "{000C0365-0000-0000-C000-000000000046}");
  }
  protected FileDialogFiltersImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[FileDialogFiltersImpl" + super.toString() + "]";
  }
}
