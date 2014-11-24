/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * RuleConditions.
 * 
 */
@CoClass(guid="{000610D8-0000-0000-C000-000000000046}")
public class RuleConditions extends Dispatch implements _RuleConditions {
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
  @DeclDISPID(81)  public _RuleCondition Item(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._RuleConditionImpl.class);
  }
  @DeclDISPID(64300)  public RuleCondition getCC() throws ComException {
    final Object obj = this._dispatchCall(64300,"CC", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleCondition.class);
  }
  @DeclDISPID(64301)  public RuleCondition getHasAttachment() throws ComException {
    final Object obj = this._dispatchCall(64301,"HasAttachment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleCondition.class);
  }
  @DeclDISPID(64299)  public ImportanceRuleCondition getImportance() throws ComException {
    final Object obj = this._dispatchCall(64299,"Importance", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(ImportanceRuleCondition.class);
  }
  @DeclDISPID(64302)  public RuleCondition getMeetingInviteOrUpdate() throws ComException {
    final Object obj = this._dispatchCall(64302,"MeetingInviteOrUpdate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleCondition.class);
  }
  @DeclDISPID(64303)  public RuleCondition getNotTo() throws ComException {
    final Object obj = this._dispatchCall(64303,"NotTo", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleCondition.class);
  }
  @DeclDISPID(64304)  public RuleCondition getOnlyToMe() throws ComException {
    final Object obj = this._dispatchCall(64304,"OnlyToMe", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleCondition.class);
  }
  @DeclDISPID(64305)  public RuleCondition getToMe() throws ComException {
    final Object obj = this._dispatchCall(64305,"ToMe", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleCondition.class);
  }
  @DeclDISPID(64306)  public RuleCondition getToOrCc() throws ComException {
    final Object obj = this._dispatchCall(64306,"ToOrCc", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleCondition.class);
  }
  @DeclDISPID(64209)  public AccountRuleCondition getAccount() throws ComException {
    final Object obj = this._dispatchCall(64209,"Account", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(AccountRuleCondition.class);
  }
  @DeclDISPID(64328)  public TextRuleCondition getBody() throws ComException {
    final Object obj = this._dispatchCall(64328,"Body", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(TextRuleCondition.class);
  }
  @DeclDISPID(64329)  public TextRuleCondition getBodyOrSubject() throws ComException {
    final Object obj = this._dispatchCall(64329,"BodyOrSubject", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(TextRuleCondition.class);
  }
  @DeclDISPID(64330)  public CategoryRuleCondition getCategory() throws ComException {
    final Object obj = this._dispatchCall(64330,"Category", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(CategoryRuleCondition.class);
  }
  @DeclDISPID(64331)  public FormNameRuleCondition getFormName() throws ComException {
    final Object obj = this._dispatchCall(64331,"FormName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(FormNameRuleCondition.class);
  }
  @DeclDISPID(64332)  public ToOrFromRuleCondition getFrom() throws ComException {
    final Object obj = this._dispatchCall(64332,"From", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(ToOrFromRuleCondition.class);
  }
  @DeclDISPID(64334)  public TextRuleCondition getMessageHeader() throws ComException {
    final Object obj = this._dispatchCall(64334,"MessageHeader", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(TextRuleCondition.class);
  }
  @DeclDISPID(64338)  public AddressRuleCondition getRecipientAddress() throws ComException {
    final Object obj = this._dispatchCall(64338,"RecipientAddress", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(AddressRuleCondition.class);
  }
  @DeclDISPID(64335)  public AddressRuleCondition getSenderAddress() throws ComException {
    final Object obj = this._dispatchCall(64335,"SenderAddress", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(AddressRuleCondition.class);
  }
  @DeclDISPID(64336)  public SenderInAddressListRuleCondition getSenderInAddressList() throws ComException {
    final Object obj = this._dispatchCall(64336,"SenderInAddressList", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(SenderInAddressListRuleCondition.class);
  }
  @DeclDISPID(64337)  public TextRuleCondition getSubject() throws ComException {
    final Object obj = this._dispatchCall(64337,"Subject", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(TextRuleCondition.class);
  }
  @DeclDISPID(64339)  public ToOrFromRuleCondition getSentTo() throws ComException {
    final Object obj = this._dispatchCall(64339,"SentTo", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(ToOrFromRuleCondition.class);
  }
  @DeclDISPID(64340)  public RuleCondition getOnLocalMachine() throws ComException {
    final Object obj = this._dispatchCall(64340,"OnLocalMachine", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleCondition.class);
  }
  @DeclDISPID(64473)  public RuleCondition getOnOtherMachine() throws ComException {
    final Object obj = this._dispatchCall(64473,"OnOtherMachine", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleCondition.class);
  }
  @DeclDISPID(64531)  public RuleCondition getAnyCategory() throws ComException {
    final Object obj = this._dispatchCall(64531,"AnyCategory", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleCondition.class);
  }
  @DeclDISPID(64534)  public RuleCondition getFromAnyRSSFeed() throws ComException {
    final Object obj = this._dispatchCall(64534,"FromAnyRSSFeed", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleCondition.class);
  }
  @DeclDISPID(64535)  public FromRssFeedRuleCondition getFromRssFeed() throws ComException {
    final Object obj = this._dispatchCall(64535,"FromRssFeed", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(FromRssFeedRuleCondition.class);
  }
  public RuleConditions() throws ComException {
    super("{000610D8-0000-0000-C000-000000000046}", "{000630D8-0000-0000-C000-000000000046}");
  }
  protected RuleConditions(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[RuleConditions" + super.toString() + "]";
  }
}
