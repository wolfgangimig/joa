/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Recipient.
 * 
 */
@CoInterface(guid="{00063045-0000-0000-C000-000000000046}")
public interface Recipient extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(109)  public IDispatch getParent() throws ComException;
  @DeclDISPID(12291)  public String getAddress() throws ComException;
  @DeclDISPID(121)  public AddressEntry getAddressEntry() throws ComException;
  @DeclDISPID(121)  public void setAddressEntry(final AddressEntry value) throws ComException;
  @DeclDISPID(106)  public String getAutoResponse() throws ComException;
  @DeclDISPID(106)  public void setAutoResponse(final String value) throws ComException;
  @DeclDISPID(14592)  public OlDisplayType getDisplayType() throws ComException;
  @DeclDISPID(61470)  public String getEntryID() throws ComException;
  @DeclDISPID(91)  public Integer getIndex() throws ComException;
  @DeclDISPID(102)  public OlResponseStatus getMeetingResponseStatus() throws ComException;
  @DeclDISPID(12289)  public String getName() throws ComException;
  @DeclDISPID(100)  public Boolean getResolved() throws ComException;
  @DeclDISPID(118)  public OlTrackingStatus getTrackingStatus() throws ComException;
  @DeclDISPID(118)  public void setTrackingStatus(final OlTrackingStatus value) throws ComException;
  @DeclDISPID(119)  public java.util.Date getTrackingStatusTime() throws ComException;
  @DeclDISPID(119)  public void setTrackingStatusTime(final java.util.Date value) throws ComException;
  @DeclDISPID(3093)  public Integer getType() throws ComException;
  @DeclDISPID(3093)  public void setType(final Integer value) throws ComException;
  @DeclDISPID(110)  public void Delete() throws ComException;
  @DeclDISPID(111)  public String FreeBusy(final java.util.Date Start, final Integer MinPerChar, final Object CompleteFormat) throws ComException;
  @DeclDISPID(113)  public Boolean Resolve() throws ComException;
  @DeclDISPID(64253)  public PropertyAccessor getPropertyAccessor() throws ComException;
  @DeclDISPID(64628)  public Boolean getSendable() throws ComException;
  @DeclDISPID(64628)  public void setSendable(final Boolean value) throws ComException;
}
