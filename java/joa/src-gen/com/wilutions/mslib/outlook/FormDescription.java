/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * FormDescription.
 * 
 */
@CoInterface(guid="{00063046-0000-0000-C000-000000000046}")
public interface FormDescription extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(13060)  public String getCategory() throws ComException;
  @DeclDISPID(13060)  public void setCategory(String value) throws ComException;
  @DeclDISPID(13061)  public String getCategorySub() throws ComException;
  @DeclDISPID(13061)  public void setCategorySub(String value) throws ComException;
  @DeclDISPID(12292)  public String getComment() throws ComException;
  @DeclDISPID(12292)  public void setComment(String value) throws ComException;
  @DeclDISPID(13059)  public String getContactName() throws ComException;
  @DeclDISPID(13059)  public void setContactName(String value) throws ComException;
  @DeclDISPID(12289)  public String getDisplayName() throws ComException;
  @DeclDISPID(12289)  public void setDisplayName(String value) throws ComException;
  @DeclDISPID(13063)  public Boolean getHidden() throws ComException;
  @DeclDISPID(13063)  public void setHidden(Boolean value) throws ComException;
  @DeclDISPID(4093)  public String getIcon() throws ComException;
  @DeclDISPID(4093)  public void setIcon(String value) throws ComException;
  @DeclDISPID(102)  public Boolean getLocked() throws ComException;
  @DeclDISPID(102)  public void setLocked(Boolean value) throws ComException;
  @DeclDISPID(26)  public String getMessageClass() throws ComException;
  @DeclDISPID(4092)  public String getMiniIcon() throws ComException;
  @DeclDISPID(4092)  public void setMiniIcon(String value) throws ComException;
  @DeclDISPID(61469)  public String getName() throws ComException;
  @DeclDISPID(61469)  public void setName(String value) throws ComException;
  @DeclDISPID(104)  public String getNumber() throws ComException;
  @DeclDISPID(104)  public void setNumber(String value) throws ComException;
  @DeclDISPID(101)  public Boolean getOneOff() throws ComException;
  @DeclDISPID(101)  public void setOneOff(Boolean value) throws ComException;
  @DeclDISPID(109)  public String getScriptText() throws ComException;
  @DeclDISPID(106)  public String getTemplate() throws ComException;
  @DeclDISPID(106)  public void setTemplate(String value) throws ComException;
  @DeclDISPID(105)  public Boolean getUseWordMail() throws ComException;
  @DeclDISPID(105)  public void setUseWordMail(Boolean value) throws ComException;
  @DeclDISPID(13057)  public String getVersion() throws ComException;
  @DeclDISPID(13057)  public void setVersion(String value) throws ComException;
  @DeclDISPID(107)  public void PublishForm(OlFormRegistry Registry, Object Folder) throws ComException;
}
