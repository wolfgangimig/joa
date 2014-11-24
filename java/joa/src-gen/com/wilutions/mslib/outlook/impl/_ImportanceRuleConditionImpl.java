/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9B1-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _ImportanceRuleConditionImpl extends Dispatch implements com.wilutions.mslib.outlook._ImportanceRuleCondition {
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
  @DeclDISPID(103)  public void setEnabled(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64298)  public com.wilutions.mslib.outlook.OlRuleConditionType getConditionType() throws ComException {
    final Object obj = this._dispatchCall(64298,"ConditionType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlRuleConditionType.valueOf((Integer)obj);
  }
  @DeclDISPID(64299)  public com.wilutions.mslib.outlook.OlImportance getImportance() throws ComException {
    final Object obj = this._dispatchCall(64299,"Importance", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlImportance.valueOf((Integer)obj);
  }
  @DeclDISPID(64299)  public void setImportance(com.wilutions.mslib.outlook.OlImportance value) throws ComException {
    assert(value != null);
    this._dispatchCall(64299,"Importance", DISPATCH_PROPERTYPUT,value.value);
  }
  public _ImportanceRuleConditionImpl(String progId) throws ComException {
    super(progId, "{000630DA-0000-0000-C000-000000000046}");
  }
  protected _ImportanceRuleConditionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_ImportanceRuleConditionImpl" + super.toString() + "]";
  }
}
