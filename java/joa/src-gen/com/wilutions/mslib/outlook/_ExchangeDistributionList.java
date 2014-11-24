/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _ExchangeDistributionList.
 * 
 */
@CoInterface(guid="{000630CA-0000-0000-C000-000000000046}")
public interface _ExchangeDistributionList extends IDispatch {
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
  @DeclDISPID(64244)  public AddressEntries GetMemberOfList() throws ComException;
  @DeclDISPID(64246)  public AddressEntries GetExchangeDistributionListMembers() throws ComException;
  @DeclDISPID(14848)  public String getAlias() throws ComException;
  @DeclDISPID(12292)  public String getComments() throws ComException;
  @DeclDISPID(12292)  public void setComments(String value) throws ComException;
  @DeclDISPID(64245)  public String getPrimarySmtpAddress() throws ComException;
  @DeclDISPID(64247)  public AddressEntries GetOwners() throws ComException;
}
