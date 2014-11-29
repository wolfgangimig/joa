/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * MarkAsTaskRuleAction.
 * 
 */
@CoClass(guid="{000610D6-0000-0000-C000-000000000046}")
public class MarkAsTaskRuleAction extends Dispatch implements _MarkAsTaskRuleAction {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
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
  @DeclDISPID(64271)  public OlRuleActionType getActionType() throws ComException {
    final Object obj = this._dispatchCall(64271,"ActionType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlRuleActionType.valueOf((Integer)obj);
  }
  @DeclDISPID(64292)  public String getFlagTo() throws ComException {
    final Object obj = this._dispatchCall(64292,"FlagTo", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64292)  public void setFlagTo(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64292,"FlagTo", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64293)  public OlMarkInterval getMarkInterval() throws ComException {
    final Object obj = this._dispatchCall(64293,"MarkInterval", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlMarkInterval.valueOf((Integer)obj);
  }
  @DeclDISPID(64293)  public void setMarkInterval(final OlMarkInterval value) throws ComException {
    assert(value != null);
    this._dispatchCall(64293,"MarkInterval", DISPATCH_PROPERTYPUT,value.value);
  }
  public MarkAsTaskRuleAction() throws ComException {
    super("{000610D6-0000-0000-C000-000000000046}", "{000630D6-0000-0000-C000-000000000046}");
  }
  protected MarkAsTaskRuleAction(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[MarkAsTaskRuleAction" + super.toString() + "]";
  }
}
