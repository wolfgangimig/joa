/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Inspector.
 * 
 */
@CoInterface(guid="{00063005-0000-0000-C000-000000000046}")
public interface _Inspector extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException;
  @DeclDISPID(8450)  public Dispatch getCurrentItem() throws ComException;
  @DeclDISPID(8464)  public OlEditorType getEditorType() throws ComException;
  @DeclDISPID(8454)  public Dispatch getModifiedFormPages() throws ComException;
  @DeclDISPID(8451)  public void Close(OlInspectorClose SaveMode) throws ComException;
  @DeclDISPID(8452)  public void Display(Object Modal) throws ComException;
  @DeclDISPID(8456)  public void HideFormPage(String PageName) throws ComException;
  @DeclDISPID(8453)  public Boolean IsWordMail() throws ComException;
  @DeclDISPID(8460)  public void SetCurrentFormPage(String PageName) throws ComException;
  @DeclDISPID(8457)  public void ShowFormPage(String PageName) throws ComException;
  @DeclDISPID(8463)  public Dispatch getWordEditor() throws ComException;
  @DeclDISPID(8465)  public String getCaption() throws ComException;
  @DeclDISPID(8468)  public Integer getHeight() throws ComException;
  @DeclDISPID(8468)  public void setHeight(Integer value) throws ComException;
  @DeclDISPID(8469)  public Integer getLeft() throws ComException;
  @DeclDISPID(8469)  public void setLeft(Integer value) throws ComException;
  @DeclDISPID(8470)  public Integer getTop() throws ComException;
  @DeclDISPID(8470)  public void setTop(Integer value) throws ComException;
  @DeclDISPID(8471)  public Integer getWidth() throws ComException;
  @DeclDISPID(8471)  public void setWidth(Integer value) throws ComException;
  @DeclDISPID(8466)  public OlWindowState getWindowState() throws ComException;
  @DeclDISPID(8466)  public void setWindowState(OlWindowState value) throws ComException;
  @DeclDISPID(8467)  public void Activate() throws ComException;
  @DeclDISPID(64201)  public void SetControlItemProperty(Dispatch Control, String PropertyName) throws ComException;
  @DeclDISPID(64493)  public Dispatch NewFormRegion() throws ComException;
  @DeclDISPID(64511)  public Dispatch OpenFormRegion(String Path) throws ComException;
  @DeclDISPID(64512)  public void SaveFormRegion(Dispatch Page, String FileName) throws ComException;
  @DeclDISPID(64632)  public _AttachmentSelection getAttachmentSelection() throws ComException;
  @DeclDISPID(64647)  public void SetSchedulingStartTime(java.util.Date Start) throws ComException;
}
