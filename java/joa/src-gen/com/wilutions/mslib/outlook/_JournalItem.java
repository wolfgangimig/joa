/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _JournalItem.
 * 
 */
@CoInterface(guid="{00063022-0000-0000-C000-000000000046}")
public interface _JournalItem extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(63511)  public Actions getActions() throws ComException;
  @DeclDISPID(63509)  public Attachments getAttachments() throws ComException;
  @DeclDISPID(34101)  public String getBillingInformation() throws ComException;
  @DeclDISPID(34101)  public void setBillingInformation(String value) throws ComException;
  @DeclDISPID(37120)  public String getBody() throws ComException;
  @DeclDISPID(37120)  public void setBody(String value) throws ComException;
  @DeclDISPID(36865)  public String getCategories() throws ComException;
  @DeclDISPID(36865)  public void setCategories(String value) throws ComException;
  @DeclDISPID(34107)  public String getCompanies() throws ComException;
  @DeclDISPID(34107)  public void setCompanies(String value) throws ComException;
  @DeclDISPID(64192)  public String getConversationIndex() throws ComException;
  @DeclDISPID(112)  public String getConversationTopic() throws ComException;
  @DeclDISPID(12295)  public java.util.Date getCreationTime() throws ComException;
  @DeclDISPID(61470)  public String getEntryID() throws ComException;
  @DeclDISPID(61589)  public FormDescription getFormDescription() throws ComException;
  @DeclDISPID(61502)  public _Inspector getGetInspector() throws ComException;
  @DeclDISPID(23)  public OlImportance getImportance() throws ComException;
  @DeclDISPID(23)  public void setImportance(OlImportance value) throws ComException;
  @DeclDISPID(12296)  public java.util.Date getLastModificationTime() throws ComException;
  @DeclDISPID(26)  public String getMessageClass() throws ComException;
  @DeclDISPID(26)  public void setMessageClass(String value) throws ComException;
  @DeclDISPID(34100)  public String getMileage() throws ComException;
  @DeclDISPID(34100)  public void setMileage(String value) throws ComException;
  @DeclDISPID(34062)  public Boolean getNoAging() throws ComException;
  @DeclDISPID(34062)  public void setNoAging(Boolean value) throws ComException;
  @DeclDISPID(34130)  public Integer getOutlookInternalVersion() throws ComException;
  @DeclDISPID(34132)  public String getOutlookVersion() throws ComException;
  @DeclDISPID(61603)  public Boolean getSaved() throws ComException;
  @DeclDISPID(54)  public OlSensitivity getSensitivity() throws ComException;
  @DeclDISPID(54)  public void setSensitivity(OlSensitivity value) throws ComException;
  @DeclDISPID(3592)  public Integer getSize() throws ComException;
  @DeclDISPID(55)  public String getSubject() throws ComException;
  @DeclDISPID(55)  public void setSubject(String value) throws ComException;
  @DeclDISPID(61468)  public Boolean getUnRead() throws ComException;
  @DeclDISPID(61468)  public void setUnRead(Boolean value) throws ComException;
  @DeclDISPID(63510)  public UserProperties getUserProperties() throws ComException;
  @DeclDISPID(61475)  public void Close(OlInspectorClose SaveMode) throws ComException;
  @DeclDISPID(61490)  public IDispatch Copy() throws ComException;
  @DeclDISPID(61514)  public void Delete() throws ComException;
  @DeclDISPID(61606)  public void Display(Object Modal) throws ComException;
  @DeclDISPID(61492)  public IDispatch Move(MAPIFolder DestFldr) throws ComException;
  @DeclDISPID(61491)  public void PrintOut() throws ComException;
  @DeclDISPID(61512)  public void Save() throws ComException;
  @DeclDISPID(61521)  public void SaveAs(String Path, Object Type) throws ComException;
  @DeclDISPID(3588)  public String getContactNames() throws ComException;
  @DeclDISPID(3588)  public void setContactNames(String value) throws ComException;
  @DeclDISPID(34577)  public Boolean getDocPosted() throws ComException;
  @DeclDISPID(34577)  public void setDocPosted(Boolean value) throws ComException;
  @DeclDISPID(34574)  public Boolean getDocPrinted() throws ComException;
  @DeclDISPID(34574)  public void setDocPrinted(Boolean value) throws ComException;
  @DeclDISPID(34576)  public Boolean getDocRouted() throws ComException;
  @DeclDISPID(34576)  public void setDocRouted(Boolean value) throws ComException;
  @DeclDISPID(34575)  public Boolean getDocSaved() throws ComException;
  @DeclDISPID(34575)  public void setDocSaved(Boolean value) throws ComException;
  @DeclDISPID(34567)  public Integer getDuration() throws ComException;
  @DeclDISPID(34567)  public void setDuration(Integer value) throws ComException;
  @DeclDISPID(34568)  public java.util.Date getEnd() throws ComException;
  @DeclDISPID(34568)  public void setEnd(java.util.Date value) throws ComException;
  @DeclDISPID(34560)  public String getType() throws ComException;
  @DeclDISPID(34560)  public void setType(String value) throws ComException;
  @DeclDISPID(63508)  public Recipients getRecipients() throws ComException;
  @DeclDISPID(34566)  public java.util.Date getStart() throws ComException;
  @DeclDISPID(34566)  public void setStart(java.util.Date value) throws ComException;
  @DeclDISPID(63507)  public MailItem Forward() throws ComException;
  @DeclDISPID(63504)  public MailItem Reply() throws ComException;
  @DeclDISPID(63505)  public MailItem ReplyAll() throws ComException;
  @DeclDISPID(63269)  public void StartTimer() throws ComException;
  @DeclDISPID(63270)  public void StopTimer() throws ComException;
  @DeclDISPID(64077)  public OlDownloadState getDownloadState() throws ComException;
  @DeclDISPID(64011)  public void ShowCategoriesDialog() throws ComException;
  @DeclDISPID(64009)  public ItemProperties getItemProperties() throws ComException;
  @DeclDISPID(34161)  public OlRemoteStatus getMarkForDownload() throws ComException;
  @DeclDISPID(34161)  public void setMarkForDownload(OlRemoteStatus value) throws ComException;
  @DeclDISPID(64164)  public Boolean getIsConflict() throws ComException;
  @DeclDISPID(64186)  public Boolean getAutoResolvedWinner() throws ComException;
  @DeclDISPID(64187)  public Conflicts getConflicts() throws ComException;
  @DeclDISPID(64253)  public PropertyAccessor getPropertyAccessor() throws ComException;
  @DeclDISPID(64596)  public _Conversation GetConversation() throws ComException;
  @DeclDISPID(64629)  public String getConversationID() throws ComException;
}
