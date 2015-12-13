/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9F5-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _ColumnFormatImpl extends Dispatch implements com.wilutions.mslib.outlook._ColumnFormat {
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
  @DeclDISPID(64030)  public String getLabel() throws ComException {
    final Object obj = this._dispatchCall(64030,"Label", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64030)  public void setLabel(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64030,"Label", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64396)  public Integer getFieldFormat() throws ComException {
    final Object obj = this._dispatchCall(64396,"FieldFormat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64396)  public void setFieldFormat(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(64396,"FieldFormat", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8471)  public Integer getWidth() throws ComException {
    final Object obj = this._dispatchCall(8471,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(8471)  public void setWidth(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(8471,"Width", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64034)  public com.wilutions.mslib.outlook.OlAlign getAlign() throws ComException {
    final Object obj = this._dispatchCall(64034,"Align", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlAlign.valueOf((Integer)obj);
  }
  @DeclDISPID(64034)  public void setAlign(final com.wilutions.mslib.outlook.OlAlign value) throws ComException {
    assert(value != null);
    this._dispatchCall(64034,"Align", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64398)  public com.wilutions.mslib.outlook.OlUserPropertyType getFieldType() throws ComException {
    final Object obj = this._dispatchCall(64398,"FieldType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlUserPropertyType.valueOf((Integer)obj);
  }
  public _ColumnFormatImpl(String progId) throws ComException {
    super(progId, "{0006309E-0000-0000-C000-000000000046}");
  }
  protected _ColumnFormatImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_ColumnFormatImpl" + super.toString() + "]";
  }
}
