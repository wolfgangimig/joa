/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _ExchangeUser.
 * 
 */
@CoInterface(guid="{000630C9-0000-0000-C000-000000000046}")
public interface _ExchangeUser extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(12291)  public String getAddress() throws ComException;
  @DeclDISPID(12291)  public void setAddress(String value) throws ComException;
  @DeclDISPID(14592)  public OlDisplayType getDisplayType() throws ComException;
  @DeclDISPID(61470)  public String getID() throws ComException;
  @DeclDISPID(12289)  public String getName() throws ComException;
  @DeclDISPID(12289)  public void setName(String value) throws ComException;
  @DeclDISPID(12290)  public String getType() throws ComException;
  @DeclDISPID(12290)  public void setType(String value) throws ComException;
  @DeclDISPID(770)  public void Delete() throws ComException;
  @DeclDISPID(769)  public void Details(Object HWnd) throws ComException;
  @DeclDISPID(774)  public String GetFreeBusy(java.util.Date Start, Integer MinPerChar, Object CompleteFormat) throws ComException;
  @DeclDISPID(768)  public void Update(Object MakePermanent, Object Refresh) throws ComException;
  @DeclDISPID(64240)  public _ContactItem GetContact() throws ComException;
  @DeclDISPID(64241)  public ExchangeUser GetExchangeUser() throws ComException;
  @DeclDISPID(64242)  public OlAddressEntryUserType getAddressEntryUserType() throws ComException;
  @DeclDISPID(64239)  public ExchangeDistributionList GetExchangeDistributionList() throws ComException;
  @DeclDISPID(64253)  public PropertyAccessor getPropertyAccessor() throws ComException;
  @DeclDISPID(64243)  public AddressEntries GetDirectReports() throws ComException;
  @DeclDISPID(64244)  public AddressEntries GetMemberOfList() throws ComException;
  @DeclDISPID(14848)  public String getAlias() throws ComException;
  @DeclDISPID(14896)  public String getAssistantName() throws ComException;
  @DeclDISPID(14896)  public void setAssistantName(String value) throws ComException;
  @DeclDISPID(14856)  public String getBusinessTelephoneNumber() throws ComException;
  @DeclDISPID(14856)  public void setBusinessTelephoneNumber(String value) throws ComException;
  @DeclDISPID(14887)  public String getCity() throws ComException;
  @DeclDISPID(14887)  public void setCity(String value) throws ComException;
  @DeclDISPID(12292)  public String getComments() throws ComException;
  @DeclDISPID(12292)  public void setComments(String value) throws ComException;
  @DeclDISPID(14870)  public String getCompanyName() throws ComException;
  @DeclDISPID(14870)  public void setCompanyName(String value) throws ComException;
  @DeclDISPID(14872)  public String getDepartment() throws ComException;
  @DeclDISPID(14872)  public void setDepartment(String value) throws ComException;
  @DeclDISPID(14854)  public String getFirstName() throws ComException;
  @DeclDISPID(14854)  public void setFirstName(String value) throws ComException;
  @DeclDISPID(14871)  public String getJobTitle() throws ComException;
  @DeclDISPID(14871)  public void setJobTitle(String value) throws ComException;
  @DeclDISPID(14865)  public String getLastName() throws ComException;
  @DeclDISPID(14865)  public void setLastName(String value) throws ComException;
  @DeclDISPID(14876)  public String getMobileTelephoneNumber() throws ComException;
  @DeclDISPID(14876)  public void setMobileTelephoneNumber(String value) throws ComException;
  @DeclDISPID(14873)  public String getOfficeLocation() throws ComException;
  @DeclDISPID(14873)  public void setOfficeLocation(String value) throws ComException;
  @DeclDISPID(14890)  public String getPostalCode() throws ComException;
  @DeclDISPID(14890)  public void setPostalCode(String value) throws ComException;
  @DeclDISPID(64245)  public String getPrimarySmtpAddress() throws ComException;
  @DeclDISPID(14888)  public String getStateOrProvince() throws ComException;
  @DeclDISPID(14888)  public void setStateOrProvince(String value) throws ComException;
  @DeclDISPID(14889)  public String getStreetAddress() throws ComException;
  @DeclDISPID(14889)  public void setStreetAddress(String value) throws ComException;
  @DeclDISPID(64249)  public ExchangeUser GetExchangeUserManager() throws ComException;
  @DeclDISPID(32814)  public String getYomiCompanyName() throws ComException;
  @DeclDISPID(32814)  public void setYomiCompanyName(String value) throws ComException;
  @DeclDISPID(32812)  public String getYomiFirstName() throws ComException;
  @DeclDISPID(32812)  public void setYomiFirstName(String value) throws ComException;
  @DeclDISPID(32813)  public String getYomiLastName() throws ComException;
  @DeclDISPID(32813)  public void setYomiLastName(String value) throws ComException;
  @DeclDISPID(64487)  public String getYomiDisplayName() throws ComException;
  @DeclDISPID(64487)  public void setYomiDisplayName(String value) throws ComException;
  @DeclDISPID(64488)  public String getYomiDepartment() throws ComException;
  @DeclDISPID(64488)  public void setYomiDepartment(String value) throws ComException;
  @DeclDISPID(64631)  public com.wilutions.mslib.stdole.Picture GetPicture() throws ComException;
}
