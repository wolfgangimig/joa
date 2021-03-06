/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * FormDescription.
 * 
 */
@CoInterface(guid="{00063046-0000-0000-C000-000000000046}")
public interface FormDescription extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(13060)  public String getCategory() throws ComException;
  @DeclDISPID(13060)  public void setCategory(final String value) throws ComException;
  @DeclDISPID(13061)  public String getCategorySub() throws ComException;
  @DeclDISPID(13061)  public void setCategorySub(final String value) throws ComException;
  @DeclDISPID(12292)  public String getComment() throws ComException;
  @DeclDISPID(12292)  public void setComment(final String value) throws ComException;
  @DeclDISPID(13059)  public String getContactName() throws ComException;
  @DeclDISPID(13059)  public void setContactName(final String value) throws ComException;
  @DeclDISPID(12289)  public String getDisplayName() throws ComException;
  @DeclDISPID(12289)  public void setDisplayName(final String value) throws ComException;
  @DeclDISPID(13063)  public Boolean getHidden() throws ComException;
  @DeclDISPID(13063)  public void setHidden(final Boolean value) throws ComException;
  @DeclDISPID(4093)  public String getIcon() throws ComException;
  @DeclDISPID(4093)  public void setIcon(final String value) throws ComException;
  @DeclDISPID(102)  public Boolean getLocked() throws ComException;
  @DeclDISPID(102)  public void setLocked(final Boolean value) throws ComException;
  @DeclDISPID(26)  public String getMessageClass() throws ComException;
  @DeclDISPID(4092)  public String getMiniIcon() throws ComException;
  @DeclDISPID(4092)  public void setMiniIcon(final String value) throws ComException;
  @DeclDISPID(61469)  public String getName() throws ComException;
  @DeclDISPID(61469)  public void setName(final String value) throws ComException;
  @DeclDISPID(104)  public String getNumber() throws ComException;
  @DeclDISPID(104)  public void setNumber(final String value) throws ComException;
  @DeclDISPID(101)  public Boolean getOneOff() throws ComException;
  @DeclDISPID(101)  public void setOneOff(final Boolean value) throws ComException;
  @DeclDISPID(109)  public String getScriptText() throws ComException;
  @DeclDISPID(106)  public String getTemplate() throws ComException;
  @DeclDISPID(106)  public void setTemplate(final String value) throws ComException;
  @DeclDISPID(105)  public Boolean getUseWordMail() throws ComException;
  @DeclDISPID(105)  public void setUseWordMail(final Boolean value) throws ComException;
  @DeclDISPID(13057)  public String getVersion() throws ComException;
  @DeclDISPID(13057)  public void setVersion(final String value) throws ComException;
  @DeclDISPID(107)  public void PublishForm(final OlFormRegistry Registry, final Object Folder) throws ComException;
}
