/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * RuleActions.
 * 
 */
@CoClass(guid="{000610CE-0000-0000-C000-000000000046}")
public class RuleActions extends Dispatch implements _RuleActions {
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
  @DeclDISPID(80)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(80,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(81)  public _RuleAction Item(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._RuleActionImpl.class);
  }
  @DeclDISPID(64274)  public MoveOrCopyRuleAction getCopyToFolder() throws ComException {
    final Object obj = this._dispatchCall(64274,"CopyToFolder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(MoveOrCopyRuleAction.class);
  }
  @DeclDISPID(64275)  public RuleAction getDeletePermanently() throws ComException {
    final Object obj = this._dispatchCall(64275,"DeletePermanently", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleAction.class);
  }
  @DeclDISPID(61509)  public RuleAction getDelete() throws ComException {
    final Object obj = this._dispatchCall(61509,"Delete", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleAction.class);
  }
  @DeclDISPID(64279)  public RuleAction getDesktopAlert() throws ComException {
    final Object obj = this._dispatchCall(64279,"DesktopAlert", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleAction.class);
  }
  @DeclDISPID(64278)  public RuleAction getNotifyDelivery() throws ComException {
    final Object obj = this._dispatchCall(64278,"NotifyDelivery", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleAction.class);
  }
  @DeclDISPID(64277)  public RuleAction getNotifyRead() throws ComException {
    final Object obj = this._dispatchCall(64277,"NotifyRead", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleAction.class);
  }
  @DeclDISPID(64276)  public RuleAction getStop() throws ComException {
    final Object obj = this._dispatchCall(64276,"Stop", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleAction.class);
  }
  @DeclDISPID(64280)  public MoveOrCopyRuleAction getMoveToFolder() throws ComException {
    final Object obj = this._dispatchCall(64280,"MoveToFolder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(MoveOrCopyRuleAction.class);
  }
  @DeclDISPID(64281)  public SendRuleAction getCC() throws ComException {
    final Object obj = this._dispatchCall(64281,"CC", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(SendRuleAction.class);
  }
  @DeclDISPID(64282)  public SendRuleAction getForward() throws ComException {
    final Object obj = this._dispatchCall(64282,"Forward", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(SendRuleAction.class);
  }
  @DeclDISPID(64283)  public SendRuleAction getForwardAsAttachment() throws ComException {
    final Object obj = this._dispatchCall(64283,"ForwardAsAttachment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(SendRuleAction.class);
  }
  @DeclDISPID(64284)  public SendRuleAction getRedirect() throws ComException {
    final Object obj = this._dispatchCall(64284,"Redirect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(SendRuleAction.class);
  }
  @DeclDISPID(64290)  public AssignToCategoryRuleAction getAssignToCategory() throws ComException {
    final Object obj = this._dispatchCall(64290,"AssignToCategory", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(AssignToCategoryRuleAction.class);
  }
  @DeclDISPID(64291)  public PlaySoundRuleAction getPlaySound() throws ComException {
    final Object obj = this._dispatchCall(64291,"PlaySound", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(PlaySoundRuleAction.class);
  }
  @DeclDISPID(64294)  public MarkAsTaskRuleAction getMarkAsTask() throws ComException {
    final Object obj = this._dispatchCall(64294,"MarkAsTask", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(MarkAsTaskRuleAction.class);
  }
  @DeclDISPID(64296)  public NewItemAlertRuleAction getNewItemAlert() throws ComException {
    final Object obj = this._dispatchCall(64296,"NewItemAlert", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(NewItemAlertRuleAction.class);
  }
  @DeclDISPID(64530)  public RuleAction getClearCategories() throws ComException {
    final Object obj = this._dispatchCall(64530,"ClearCategories", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleAction.class);
  }
  public RuleActions() throws ComException {
    super("{000610CE-0000-0000-C000-000000000046}", "{000630CE-0000-0000-C000-000000000046}");
  }
  protected RuleActions(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[RuleActions" + super.toString() + "]";
  }
}
