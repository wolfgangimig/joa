/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9A6-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _RuleImpl extends Dispatch implements com.wilutions.mslib.outlook._Rule {
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
  @DeclDISPID(8450)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(8450,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8450)  public void setName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(8450,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64267)  public Integer getExecutionOrder() throws ComException {
    final Object obj = this._dispatchCall(64267,"ExecutionOrder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64267)  public void setExecutionOrder(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(64267,"ExecutionOrder", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64268)  public com.wilutions.mslib.outlook.OlRuleType getRuleType() throws ComException {
    final Object obj = this._dispatchCall(64268,"RuleType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlRuleType.valueOf((Integer)obj);
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
  @DeclDISPID(64269)  public Boolean getIsLocalRule() throws ComException {
    final Object obj = this._dispatchCall(64269,"IsLocalRule", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64270)  public void Execute(Object ShowProgress, Object Folder, Object IncludeSubfolders, Object RuleExecuteOption) throws ComException {
    assert(ShowProgress != null);
    assert(Folder != null);
    assert(IncludeSubfolders != null);
    assert(RuleExecuteOption != null);
    this._dispatchCall(64270,"Execute", DISPATCH_METHOD,null,ShowProgress,Folder,IncludeSubfolders,RuleExecuteOption);
  }
  @DeclDISPID(64272)  public com.wilutions.mslib.outlook.RuleActions getActions() throws ComException {
    final Object obj = this._dispatchCall(64272,"Actions", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.RuleActions.class);
  }
  @DeclDISPID(64297)  public com.wilutions.mslib.outlook.RuleConditions getConditions() throws ComException {
    final Object obj = this._dispatchCall(64297,"Conditions", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.RuleConditions.class);
  }
  @DeclDISPID(64307)  public com.wilutions.mslib.outlook.RuleConditions getExceptions() throws ComException {
    final Object obj = this._dispatchCall(64307,"Exceptions", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.RuleConditions.class);
  }
  public _RuleImpl(String progId) throws ComException {
    super(progId);
  }
  protected _RuleImpl(long ndisp) {
    super(ndisp);
  }
  public _RuleImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_RuleImpl" + super.toString() + "]";
  }
}
