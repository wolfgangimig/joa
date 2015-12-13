/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * PlaySoundRuleAction.
 * 
 */
@CoClass(guid="{000610D5-0000-0000-C000-000000000046}")
public class PlaySoundRuleAction extends Dispatch implements _PlaySoundRuleAction {
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
  @DeclDISPID(64221)  public String getFilePath() throws ComException {
    final Object obj = this._dispatchCall(64221,"FilePath", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64221)  public void setFilePath(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64221,"FilePath", DISPATCH_PROPERTYPUT,value);
  }
  public PlaySoundRuleAction() throws ComException {
    super("{000610D5-0000-0000-C000-000000000046}", "{000630D5-0000-0000-C000-000000000046}");
  }
  protected PlaySoundRuleAction(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PlaySoundRuleAction" + super.toString() + "]";
  }
}
