/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9F0-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _OrderFieldImpl extends Dispatch implements com.wilutions.mslib.outlook._OrderField {
  @DeclDISPID(61440)  public com.wilutions.mslib.outlook._Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public com.wilutions.mslib.outlook.OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public com.wilutions.mslib.outlook._NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(8450)  public String getViewXMLSchemaName() throws ComException {
    final Object obj = this._dispatchCall(8450,"ViewXMLSchemaName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64394)  public Boolean getIsDescending() throws ComException {
    final Object obj = this._dispatchCall(64394,"IsDescending", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64394)  public void setIsDescending(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64394,"IsDescending", DISPATCH_PROPERTYPUT,value);
  }
  public _OrderFieldImpl(String progId) throws ComException {
    super(progId, "{0006309B-0000-0000-C000-000000000046}");
  }
  protected _OrderFieldImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_OrderFieldImpl" + super.toString() + "]";
  }
}
