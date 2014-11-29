/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _RuleActions.
 * 
 */
@CoInterface(guid="{000630CE-0000-0000-C000-000000000046}")
public interface _RuleActions extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public _RuleAction Item(final Integer Index) throws ComException;
  @DeclDISPID(64274)  public MoveOrCopyRuleAction getCopyToFolder() throws ComException;
  @DeclDISPID(64275)  public RuleAction getDeletePermanently() throws ComException;
  @DeclDISPID(61509)  public RuleAction getDelete() throws ComException;
  @DeclDISPID(64279)  public RuleAction getDesktopAlert() throws ComException;
  @DeclDISPID(64278)  public RuleAction getNotifyDelivery() throws ComException;
  @DeclDISPID(64277)  public RuleAction getNotifyRead() throws ComException;
  @DeclDISPID(64276)  public RuleAction getStop() throws ComException;
  @DeclDISPID(64280)  public MoveOrCopyRuleAction getMoveToFolder() throws ComException;
  @DeclDISPID(64281)  public SendRuleAction getCC() throws ComException;
  @DeclDISPID(64282)  public SendRuleAction getForward() throws ComException;
  @DeclDISPID(64283)  public SendRuleAction getForwardAsAttachment() throws ComException;
  @DeclDISPID(64284)  public SendRuleAction getRedirect() throws ComException;
  @DeclDISPID(64290)  public AssignToCategoryRuleAction getAssignToCategory() throws ComException;
  @DeclDISPID(64291)  public PlaySoundRuleAction getPlaySound() throws ComException;
  @DeclDISPID(64294)  public MarkAsTaskRuleAction getMarkAsTask() throws ComException;
  @DeclDISPID(64296)  public NewItemAlertRuleAction getNewItemAlert() throws ComException;
  @DeclDISPID(64530)  public RuleAction getClearCategories() throws ComException;
}
