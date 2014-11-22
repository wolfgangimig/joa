/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A937-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _UserDefinedPropertyImpl extends Dispatch implements com.wilutions.mslib.outlook._UserDefinedProperty {
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
  @DeclDISPID(103)  public String getFormula() throws ComException {
    final Object obj = this._dispatchCall(103,"Formula", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(112)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(112,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(109)  public com.wilutions.mslib.outlook.OlUserPropertyType getType() throws ComException {
    final Object obj = this._dispatchCall(109,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlUserPropertyType.valueOf((Integer)obj);
  }
  @DeclDISPID(64039)  public Integer getDisplayFormat() throws ComException {
    final Object obj = this._dispatchCall(64039,"DisplayFormat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64523)  public void Delete() throws ComException {
    this._dispatchCall(64523,"Delete", DISPATCH_METHOD,null);
  }
  public _UserDefinedPropertyImpl(String progId) throws ComException {
    super(progId, "{0006305C-0000-0000-C000-000000000046}");
  }
  protected _UserDefinedPropertyImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_UserDefinedPropertyImpl" + super.toString() + "]";
  }
}
