/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9B6-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _FormNameRuleConditionImpl extends Dispatch implements com.wilutions.mslib.outlook._FormNameRuleCondition {
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
  @DeclDISPID(103)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(103,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(103)  public void setEnabled(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64298)  public com.wilutions.mslib.outlook.OlRuleConditionType getConditionType() throws ComException {
    final Object obj = this._dispatchCall(64298,"ConditionType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlRuleConditionType.valueOf((Integer)obj);
  }
  @DeclDISPID(64326)  public Object getFormName() throws ComException {
    final Object obj = this._dispatchCall(64326,"FormName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(64326)  public void setFormName(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(64326,"FormName", DISPATCH_PROPERTYPUT,value);
  }
  public _FormNameRuleConditionImpl(String progId) throws ComException {
    super(progId, "{000630DD-0000-0000-C000-000000000046}");
  }
  protected _FormNameRuleConditionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_FormNameRuleConditionImpl" + super.toString() + "]";
  }
}
