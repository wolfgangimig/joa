/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _StorageItem.
 * 
 */
@CoInterface(guid="{000630CB-0000-0000-C000-000000000046}")
public interface _StorageItem extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(12295)  public java.util.Date getCreationTime() throws ComException;
  @DeclDISPID(12296)  public java.util.Date getLastModificationTime() throws ComException;
  @DeclDISPID(61470)  public String getEntryID() throws ComException;
  @DeclDISPID(61512)  public void Save() throws ComException;
  @DeclDISPID(61514)  public void Delete() throws ComException;
  @DeclDISPID(37120)  public String getBody() throws ComException;
  @DeclDISPID(37120)  public void setBody(final String value) throws ComException;
  @DeclDISPID(63509)  public Attachments getAttachments() throws ComException;
  @DeclDISPID(3592)  public Integer getSize() throws ComException;
  @DeclDISPID(63510)  public UserProperties getUserProperties() throws ComException;
  @DeclDISPID(64253)  public PropertyAccessor getPropertyAccessor() throws ComException;
  @DeclDISPID(55)  public String getSubject() throws ComException;
  @DeclDISPID(55)  public void setSubject(final String value) throws ComException;
  @DeclDISPID(34236)  public String getCreator() throws ComException;
  @DeclDISPID(34236)  public void setCreator(final String value) throws ComException;
}
