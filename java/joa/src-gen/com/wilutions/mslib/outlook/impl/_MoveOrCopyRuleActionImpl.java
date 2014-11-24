/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9BB-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _MoveOrCopyRuleActionImpl extends Dispatch implements com.wilutions.mslib.outlook._MoveOrCopyRuleAction {
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
  @DeclDISPID(64271)  public com.wilutions.mslib.outlook.OlRuleActionType getActionType() throws ComException {
    final Object obj = this._dispatchCall(64271,"ActionType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlRuleActionType.valueOf((Integer)obj);
  }
  @DeclDISPID(64273)  public com.wilutions.mslib.outlook.MAPIFolder getFolder() throws ComException {
    final Object obj = this._dispatchCall(64273,"Folder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.MAPIFolderImpl.class);
  }
  @DeclDISPID(64273)  public void setFolder(com.wilutions.mslib.outlook.MAPIFolder value) throws ComException {
    this._dispatchCall(64273,"Folder", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  public _MoveOrCopyRuleActionImpl(String progId) throws ComException {
    super(progId, "{000630D0-0000-0000-C000-000000000046}");
  }
  protected _MoveOrCopyRuleActionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_MoveOrCopyRuleActionImpl" + super.toString() + "]";
  }
}
