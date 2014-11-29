/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A967-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _ResultsImpl extends Dispatch implements com.wilutions.mslib.outlook._Results {
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
  @DeclDISPID(80)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(80,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(81)  public IDispatch Item(final Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(86)  public IDispatch GetFirst() throws ComException {
    final Object obj = this._dispatchCall(86,"GetFirst", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(88)  public IDispatch GetLast() throws ComException {
    final Object obj = this._dispatchCall(88,"GetLast", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(87)  public IDispatch GetNext() throws ComException {
    final Object obj = this._dispatchCall(87,"GetNext", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(89)  public IDispatch GetPrevious() throws ComException {
    final Object obj = this._dispatchCall(89,"GetPrevious", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(93)  public void ResetColumns() throws ComException {
    this._dispatchCall(93,"ResetColumns", DISPATCH_METHOD,null);
  }
  @DeclDISPID(92)  public void SetColumns(final String Columns) throws ComException {
    assert(Columns != null);
    this._dispatchCall(92,"SetColumns", DISPATCH_METHOD,null,Columns);
  }
  @DeclDISPID(97)  public void Sort(final String Property, final Object Descending) throws ComException {
    assert(Property != null);
    assert(Descending != null);
    this._dispatchCall(97,"Sort", DISPATCH_METHOD,null,Property,Descending);
  }
  @DeclDISPID(64143)  public com.wilutions.mslib.outlook.OlItemType getDefaultItemType() throws ComException {
    final Object obj = this._dispatchCall(64143,"DefaultItemType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlItemType.valueOf((Integer)obj);
  }
  @DeclDISPID(64143)  public void setDefaultItemType(final com.wilutions.mslib.outlook.OlItemType value) throws ComException {
    assert(value != null);
    this._dispatchCall(64143,"DefaultItemType", DISPATCH_PROPERTYPUT,value.value);
  }
  public _ResultsImpl(String progId) throws ComException {
    super(progId, "{0006300C-0000-0000-C000-000000000046}");
  }
  protected _ResultsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_ResultsImpl" + super.toString() + "]";
  }
}
