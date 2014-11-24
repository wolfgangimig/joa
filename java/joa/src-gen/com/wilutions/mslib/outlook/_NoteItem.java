/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _NoteItem.
 * 
 */
@CoInterface(guid="{00063025-0000-0000-C000-000000000046}")
public interface _NoteItem extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(37120)  public String getBody() throws ComException;
  @DeclDISPID(37120)  public void setBody(String value) throws ComException;
  @DeclDISPID(36865)  public String getCategories() throws ComException;
  @DeclDISPID(36865)  public void setCategories(String value) throws ComException;
  @DeclDISPID(12295)  public java.util.Date getCreationTime() throws ComException;
  @DeclDISPID(61470)  public String getEntryID() throws ComException;
  @DeclDISPID(61502)  public _Inspector getGetInspector() throws ComException;
  @DeclDISPID(35587)  public Integer getHeight() throws ComException;
  @DeclDISPID(35587)  public void setHeight(Integer value) throws ComException;
  @DeclDISPID(12296)  public java.util.Date getLastModificationTime() throws ComException;
  @DeclDISPID(35588)  public Integer getLeft() throws ComException;
  @DeclDISPID(35588)  public void setLeft(Integer value) throws ComException;
  @DeclDISPID(26)  public String getMessageClass() throws ComException;
  @DeclDISPID(26)  public void setMessageClass(String value) throws ComException;
  @DeclDISPID(61603)  public Boolean getSaved() throws ComException;
  @DeclDISPID(3592)  public Integer getSize() throws ComException;
  @DeclDISPID(63392)  public String getSubject() throws ComException;
  @DeclDISPID(35589)  public Integer getTop() throws ComException;
  @DeclDISPID(35589)  public void setTop(Integer value) throws ComException;
  @DeclDISPID(35586)  public Integer getWidth() throws ComException;
  @DeclDISPID(35586)  public void setWidth(Integer value) throws ComException;
  @DeclDISPID(61475)  public void Close(OlInspectorClose SaveMode) throws ComException;
  @DeclDISPID(61490)  public IDispatch Copy() throws ComException;
  @DeclDISPID(61514)  public void Delete() throws ComException;
  @DeclDISPID(61606)  public void Display(Object Modal) throws ComException;
  @DeclDISPID(61492)  public IDispatch Move(MAPIFolder DestFldr) throws ComException;
  @DeclDISPID(61491)  public void PrintOut() throws ComException;
  @DeclDISPID(61512)  public void Save() throws ComException;
  @DeclDISPID(61521)  public void SaveAs(String Path, Object Type) throws ComException;
  @DeclDISPID(64077)  public OlDownloadState getDownloadState() throws ComException;
  @DeclDISPID(64009)  public ItemProperties getItemProperties() throws ComException;
  @DeclDISPID(34161)  public OlRemoteStatus getMarkForDownload() throws ComException;
  @DeclDISPID(34161)  public void setMarkForDownload(OlRemoteStatus value) throws ComException;
  @DeclDISPID(64164)  public Boolean getIsConflict() throws ComException;
  @DeclDISPID(64186)  public Boolean getAutoResolvedWinner() throws ComException;
  @DeclDISPID(64187)  public Conflicts getConflicts() throws ComException;
  @DeclDISPID(64253)  public PropertyAccessor getPropertyAccessor() throws ComException;
}
