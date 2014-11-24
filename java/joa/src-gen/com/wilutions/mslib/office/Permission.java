/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * Permission.
 * 
 */
@CoInterface(guid="{000C0376-0000-0000-C000-000000000046}")
public interface Permission extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public UserPermission getItem(Object Index) throws ComException;
  @DeclDISPID(1)  public Integer getCount() throws ComException;
  @DeclDISPID(2)  public Boolean getEnableTrustedBrowser() throws ComException;
  @DeclDISPID(2)  public void setEnableTrustedBrowser(Boolean value) throws ComException;
  @DeclDISPID(3)  public UserPermission Add(String UserId, Object Permission, Object ExpirationDate) throws ComException;
  @DeclDISPID(4)  public void ApplyPolicy(String FileName) throws ComException;
  @DeclDISPID(5)  public IDispatch getParent() throws ComException;
  @DeclDISPID(6)  public void RemoveAll() throws ComException;
  @DeclDISPID(7)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(7)  public void setEnabled(Boolean value) throws ComException;
  @DeclDISPID(8)  public String getRequestPermissionURL() throws ComException;
  @DeclDISPID(8)  public void setRequestPermissionURL(String value) throws ComException;
  @DeclDISPID(9)  public String getPolicyName() throws ComException;
  @DeclDISPID(10)  public String getPolicyDescription() throws ComException;
  @DeclDISPID(11)  public Boolean getStoreLicenses() throws ComException;
  @DeclDISPID(11)  public void setStoreLicenses(Boolean value) throws ComException;
  @DeclDISPID(12)  public String getDocumentAuthor() throws ComException;
  @DeclDISPID(12)  public void setDocumentAuthor(String value) throws ComException;
  @DeclDISPID(13)  public Boolean getPermissionFromPolicy() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
