/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _RuleConditions.
 * 
 */
@CoInterface(guid="{000630D8-0000-0000-C000-000000000046}")
public interface _RuleConditions extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public _RuleCondition Item(Integer Index) throws ComException;
  @DeclDISPID(64300)  public RuleCondition getCC() throws ComException;
  @DeclDISPID(64301)  public RuleCondition getHasAttachment() throws ComException;
  @DeclDISPID(64299)  public ImportanceRuleCondition getImportance() throws ComException;
  @DeclDISPID(64302)  public RuleCondition getMeetingInviteOrUpdate() throws ComException;
  @DeclDISPID(64303)  public RuleCondition getNotTo() throws ComException;
  @DeclDISPID(64304)  public RuleCondition getOnlyToMe() throws ComException;
  @DeclDISPID(64305)  public RuleCondition getToMe() throws ComException;
  @DeclDISPID(64306)  public RuleCondition getToOrCc() throws ComException;
  @DeclDISPID(64209)  public AccountRuleCondition getAccount() throws ComException;
  @DeclDISPID(64328)  public TextRuleCondition getBody() throws ComException;
  @DeclDISPID(64329)  public TextRuleCondition getBodyOrSubject() throws ComException;
  @DeclDISPID(64330)  public CategoryRuleCondition getCategory() throws ComException;
  @DeclDISPID(64331)  public FormNameRuleCondition getFormName() throws ComException;
  @DeclDISPID(64332)  public ToOrFromRuleCondition getFrom() throws ComException;
  @DeclDISPID(64334)  public TextRuleCondition getMessageHeader() throws ComException;
  @DeclDISPID(64338)  public AddressRuleCondition getRecipientAddress() throws ComException;
  @DeclDISPID(64335)  public AddressRuleCondition getSenderAddress() throws ComException;
  @DeclDISPID(64336)  public SenderInAddressListRuleCondition getSenderInAddressList() throws ComException;
  @DeclDISPID(64337)  public TextRuleCondition getSubject() throws ComException;
  @DeclDISPID(64339)  public ToOrFromRuleCondition getSentTo() throws ComException;
  @DeclDISPID(64340)  public RuleCondition getOnLocalMachine() throws ComException;
  @DeclDISPID(64473)  public RuleCondition getOnOtherMachine() throws ComException;
  @DeclDISPID(64531)  public RuleCondition getAnyCategory() throws ComException;
  @DeclDISPID(64534)  public RuleCondition getFromAnyRSSFeed() throws ComException;
  @DeclDISPID(64535)  public FromRssFeedRuleCondition getFromRssFeed() throws ComException;
}
