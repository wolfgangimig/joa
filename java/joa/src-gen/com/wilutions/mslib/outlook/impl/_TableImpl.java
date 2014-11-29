/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9B9-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _TableImpl extends Dispatch implements com.wilutions.mslib.outlook._Table {
  @DeclDISPID(61440)  public com.wilutions.mslib.outlook._Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public com.wilutions.mslib.outlook.OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public com.wilutions.mslib.outlook._NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(98)  public com.wilutions.mslib.outlook.Row FindRow(final String Filter) throws ComException {
    assert(Filter != null);
    final Object obj = this._dispatchCall(98,"FindRow", DISPATCH_METHOD,null,Filter);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.Row.class);
  }
  @DeclDISPID(99)  public com.wilutions.mslib.outlook.Row FindNextRow() throws ComException {
    final Object obj = this._dispatchCall(99,"FindNextRow", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.Row.class);
  }
  @DeclDISPID(64463)  public Object GetArray(final Integer MaxRows) throws ComException {
    assert(MaxRows != null);
    final Object obj = this._dispatchCall(64463,"GetArray", DISPATCH_METHOD,null,MaxRows);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(87)  public com.wilutions.mslib.outlook.Row GetNextRow() throws ComException {
    final Object obj = this._dispatchCall(87,"GetNextRow", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.Row.class);
  }
  @DeclDISPID(80)  public Integer GetRowCount() throws ComException {
    final Object obj = this._dispatchCall(80,"GetRowCount", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64286)  public void MoveToStart() throws ComException {
    this._dispatchCall(64286,"MoveToStart", DISPATCH_METHOD,null);
  }
  @DeclDISPID(100)  public com.wilutions.mslib.outlook.Table Restrict(final String Filter) throws ComException {
    assert(Filter != null);
    final Object obj = this._dispatchCall(100,"Restrict", DISPATCH_METHOD,null,Filter);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.Table.class);
  }
  @DeclDISPID(97)  public void Sort(final String SortProperty, final Object Descending) throws ComException {
    assert(SortProperty != null);
    assert(Descending != null);
    this._dispatchCall(97,"Sort", DISPATCH_METHOD,null,SortProperty,Descending);
  }
  @DeclDISPID(64403)  public com.wilutions.mslib.outlook.Columns getColumns() throws ComException {
    final Object obj = this._dispatchCall(64403,"Columns", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.Columns.class);
  }
  @DeclDISPID(64287)  public Boolean getEndOfTable() throws ComException {
    final Object obj = this._dispatchCall(64287,"EndOfTable", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public _TableImpl(String progId) throws ComException {
    super(progId, "{000630D2-0000-0000-C000-000000000046}");
  }
  protected _TableImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_TableImpl" + super.toString() + "]";
  }
}
