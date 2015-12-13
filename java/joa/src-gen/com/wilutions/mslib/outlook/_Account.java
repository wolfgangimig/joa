/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Account.
 * 
 */
@CoInterface(guid="{000630C5-0000-0000-C000-000000000046}")
public interface _Account extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(64210)  public OlAccountType getAccountType() throws ComException;
  @DeclDISPID(12289)  public String getDisplayName() throws ComException;
  @DeclDISPID(64211)  public String getUserName() throws ComException;
  @DeclDISPID(64212)  public String getSmtpAddress() throws ComException;
  @DeclDISPID(64623)  public OlAutoDiscoverConnectionMode getAutoDiscoverConnectionMode() throws ComException;
  @DeclDISPID(64622)  public Recipient getCurrentUser() throws ComException;
  @DeclDISPID(64624)  public String getAutoDiscoverXml() throws ComException;
  @DeclDISPID(64614)  public Store getDeliveryStore() throws ComException;
  @DeclDISPID(64615)  public OlExchangeConnectionMode getExchangeConnectionMode() throws ComException;
  @DeclDISPID(64616)  public String getExchangeMailboxServerName() throws ComException;
  @DeclDISPID(64617)  public String getExchangeMailboxServerVersion() throws ComException;
  @DeclDISPID(64618)  public AddressEntry GetAddressEntryFromID(final String ID) throws ComException;
  @DeclDISPID(64619)  public Recipient GetRecipientFromID(final String EntryID) throws ComException;
}
