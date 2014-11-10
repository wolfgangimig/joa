/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9A5-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _RuleActionsImpl extends Dispatch implements com.wilutions.mslib.outlook._RuleActions {
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
  @DeclDISPID(80)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(80,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(81)  public com.wilutions.mslib.outlook._RuleAction Item(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._RuleActionImpl.class);
  }
  @DeclDISPID(64274)  public com.wilutions.mslib.outlook.MoveOrCopyRuleAction getCopyToFolder() throws ComException {
    final Object obj = this._dispatchCall(64274,"CopyToFolder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.MoveOrCopyRuleAction.class);
  }
  @DeclDISPID(64275)  public com.wilutions.mslib.outlook.RuleAction getDeletePermanently() throws ComException {
    final Object obj = this._dispatchCall(64275,"DeletePermanently", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.RuleAction.class);
  }
  @DeclDISPID(61509)  public com.wilutions.mslib.outlook.RuleAction getDelete() throws ComException {
    final Object obj = this._dispatchCall(61509,"Delete", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.RuleAction.class);
  }
  @DeclDISPID(64279)  public com.wilutions.mslib.outlook.RuleAction getDesktopAlert() throws ComException {
    final Object obj = this._dispatchCall(64279,"DesktopAlert", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.RuleAction.class);
  }
  @DeclDISPID(64278)  public com.wilutions.mslib.outlook.RuleAction getNotifyDelivery() throws ComException {
    final Object obj = this._dispatchCall(64278,"NotifyDelivery", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.RuleAction.class);
  }
  @DeclDISPID(64277)  public com.wilutions.mslib.outlook.RuleAction getNotifyRead() throws ComException {
    final Object obj = this._dispatchCall(64277,"NotifyRead", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.RuleAction.class);
  }
  @DeclDISPID(64276)  public com.wilutions.mslib.outlook.RuleAction getStop() throws ComException {
    final Object obj = this._dispatchCall(64276,"Stop", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.RuleAction.class);
  }
  @DeclDISPID(64280)  public com.wilutions.mslib.outlook.MoveOrCopyRuleAction getMoveToFolder() throws ComException {
    final Object obj = this._dispatchCall(64280,"MoveToFolder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.MoveOrCopyRuleAction.class);
  }
  @DeclDISPID(64281)  public com.wilutions.mslib.outlook.SendRuleAction getCC() throws ComException {
    final Object obj = this._dispatchCall(64281,"CC", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.SendRuleAction.class);
  }
  @DeclDISPID(64282)  public com.wilutions.mslib.outlook.SendRuleAction getForward() throws ComException {
    final Object obj = this._dispatchCall(64282,"Forward", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.SendRuleAction.class);
  }
  @DeclDISPID(64283)  public com.wilutions.mslib.outlook.SendRuleAction getForwardAsAttachment() throws ComException {
    final Object obj = this._dispatchCall(64283,"ForwardAsAttachment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.SendRuleAction.class);
  }
  @DeclDISPID(64284)  public com.wilutions.mslib.outlook.SendRuleAction getRedirect() throws ComException {
    final Object obj = this._dispatchCall(64284,"Redirect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.SendRuleAction.class);
  }
  @DeclDISPID(64290)  public com.wilutions.mslib.outlook.AssignToCategoryRuleAction getAssignToCategory() throws ComException {
    final Object obj = this._dispatchCall(64290,"AssignToCategory", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.AssignToCategoryRuleAction.class);
  }
  @DeclDISPID(64291)  public com.wilutions.mslib.outlook.PlaySoundRuleAction getPlaySound() throws ComException {
    final Object obj = this._dispatchCall(64291,"PlaySound", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.PlaySoundRuleAction.class);
  }
  @DeclDISPID(64294)  public com.wilutions.mslib.outlook.MarkAsTaskRuleAction getMarkAsTask() throws ComException {
    final Object obj = this._dispatchCall(64294,"MarkAsTask", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.MarkAsTaskRuleAction.class);
  }
  @DeclDISPID(64296)  public com.wilutions.mslib.outlook.NewItemAlertRuleAction getNewItemAlert() throws ComException {
    final Object obj = this._dispatchCall(64296,"NewItemAlert", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.NewItemAlertRuleAction.class);
  }
  @DeclDISPID(64530)  public com.wilutions.mslib.outlook.RuleAction getClearCategories() throws ComException {
    final Object obj = this._dispatchCall(64530,"ClearCategories", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.RuleAction.class);
  }
  public _RuleActionsImpl(String progId) throws ComException {
    super(progId);
  }
  protected _RuleActionsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_RuleActionsImpl" + super.toString() + "]";
  }
}
