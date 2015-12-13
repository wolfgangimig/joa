/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _MobileItem.
 * 
 */
@CoInterface(guid="{000630FE-0000-0000-C000-000000000046}")
public interface _MobileItem extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(63511)  public Actions getActions() throws ComException;
  @DeclDISPID(63509)  public Attachments getAttachments() throws ComException;
  @DeclDISPID(34101)  public String getBillingInformation() throws ComException;
  @DeclDISPID(34101)  public void setBillingInformation(final String value) throws ComException;
  @DeclDISPID(64587)  public String getBody() throws ComException;
  @DeclDISPID(64587)  public void setBody(final String value) throws ComException;
  @DeclDISPID(36865)  public String getCategories() throws ComException;
  @DeclDISPID(36865)  public void setCategories(final String value) throws ComException;
  @DeclDISPID(34107)  public String getCompanies() throws ComException;
  @DeclDISPID(34107)  public void setCompanies(final String value) throws ComException;
  @DeclDISPID(64192)  public String getConversationIndex() throws ComException;
  @DeclDISPID(112)  public String getConversationTopic() throws ComException;
  @DeclDISPID(12295)  public java.util.Date getCreationTime() throws ComException;
  @DeclDISPID(61470)  public String getEntryID() throws ComException;
  @DeclDISPID(61589)  public FormDescription getFormDescription() throws ComException;
  @DeclDISPID(61502)  public _Inspector getGetInspector() throws ComException;
  @DeclDISPID(23)  public OlImportance getImportance() throws ComException;
  @DeclDISPID(23)  public void setImportance(final OlImportance value) throws ComException;
  @DeclDISPID(12296)  public java.util.Date getLastModificationTime() throws ComException;
  @DeclDISPID(26)  public String getMessageClass() throws ComException;
  @DeclDISPID(26)  public void setMessageClass(final String value) throws ComException;
  @DeclDISPID(34100)  public String getMileage() throws ComException;
  @DeclDISPID(34100)  public void setMileage(final String value) throws ComException;
  @DeclDISPID(34062)  public Boolean getNoAging() throws ComException;
  @DeclDISPID(34062)  public void setNoAging(final Boolean value) throws ComException;
  @DeclDISPID(34130)  public Integer getOutlookInternalVersion() throws ComException;
  @DeclDISPID(34132)  public String getOutlookVersion() throws ComException;
  @DeclDISPID(61603)  public Boolean getSaved() throws ComException;
  @DeclDISPID(54)  public OlSensitivity getSensitivity() throws ComException;
  @DeclDISPID(54)  public void setSensitivity(final OlSensitivity value) throws ComException;
  @DeclDISPID(64599)  public Integer getSize() throws ComException;
  @DeclDISPID(55)  public String getSubject() throws ComException;
  @DeclDISPID(55)  public void setSubject(final String value) throws ComException;
  @DeclDISPID(61468)  public Boolean getUnRead() throws ComException;
  @DeclDISPID(61468)  public void setUnRead(final Boolean value) throws ComException;
  @DeclDISPID(63510)  public UserProperties getUserProperties() throws ComException;
  @DeclDISPID(61475)  public void Close(final OlInspectorClose SaveMode) throws ComException;
  @DeclDISPID(61490)  public IDispatch Copy() throws ComException;
  @DeclDISPID(61514)  public void Delete() throws ComException;
  @DeclDISPID(61606)  public void Display(final Object Modal) throws ComException;
  @DeclDISPID(61492)  public IDispatch Move(final MAPIFolder DestFldr) throws ComException;
  @DeclDISPID(61491)  public void PrintOut() throws ComException;
  @DeclDISPID(61512)  public void Save() throws ComException;
  @DeclDISPID(61521)  public void SaveAs(final String Path, final Object Type) throws ComException;
  @DeclDISPID(62468)  public String getHTMLBody() throws ComException;
  @DeclDISPID(62468)  public void setHTMLBody(final String value) throws ComException;
  @DeclDISPID(64588)  public OlMobileFormat getMobileFormat() throws ComException;
  @DeclDISPID(64589)  public String getSMILBody() throws ComException;
  @DeclDISPID(64589)  public void setSMILBody(final String value) throws ComException;
  @DeclDISPID(63504)  public MobileItem Reply() throws ComException;
  @DeclDISPID(63505)  public MobileItem ReplyAll() throws ComException;
  @DeclDISPID(64597)  public void Send(final Boolean ForceSend) throws ComException;
  @DeclDISPID(63508)  public Recipients getRecipients() throws ComException;
  @DeclDISPID(3588)  public String getTo() throws ComException;
  @DeclDISPID(3588)  public void setTo(final String value) throws ComException;
  @DeclDISPID(63507)  public MobileItem Forward() throws ComException;
  @DeclDISPID(80)  public String getReplyRecipientNames() throws ComException;
  @DeclDISPID(61459)  public Recipients getReplyRecipients() throws ComException;
  @DeclDISPID(64598)  public Integer getCount() throws ComException;
  @DeclDISPID(62467)  public Boolean getSubmitted() throws ComException;
  @DeclDISPID(64009)  public ItemProperties getItemProperties() throws ComException;
  @DeclDISPID(3590)  public java.util.Date getReceivedTime() throws ComException;
  @DeclDISPID(64209)  public Account getSendUsingAccount() throws ComException;
  @DeclDISPID(64209)  public void setSendUsingAccount(final Account value) throws ComException;
  @DeclDISPID(62466)  public Boolean getSent() throws ComException;
  @DeclDISPID(57)  public java.util.Date getSentOn() throws ComException;
  @DeclDISPID(64253)  public PropertyAccessor getPropertyAccessor() throws ComException;
  @DeclDISPID(63)  public String getReceivedByEntryID() throws ComException;
  @DeclDISPID(64)  public String getReceivedByName() throws ComException;
  @DeclDISPID(3103)  public String getSenderEmailAddress() throws ComException;
  @DeclDISPID(3102)  public String getSenderEmailType() throws ComException;
  @DeclDISPID(3098)  public String getSenderName() throws ComException;
}
