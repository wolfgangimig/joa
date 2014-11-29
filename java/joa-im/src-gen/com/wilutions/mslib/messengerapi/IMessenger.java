/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * IMessenger.
 * Messenger Interface 
 */
@CoInterface(guid="{D50C3186-0F89-48F8-B204-3604629DEE10}")
public interface IMessenger extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1283)  public IDispatch getWindow() throws ComException;
  @DeclDISPID(1285)  public void ViewProfile(final Object vContact) throws ComException;
  @DeclDISPID(1280)  public String getReceiveFileDirectory() throws ComException;
  @DeclDISPID(1281)  public IDispatch StartVoice(final Object vContact) throws ComException;
  @DeclDISPID(1295)  public IDispatch InviteApp(final Object vContact, final String bstrAppID) throws ComException;
  @DeclDISPID(1298)  public void SendMail(final Object vContact) throws ComException;
  @DeclDISPID(1293)  public void OpenInbox() throws ComException;
  @DeclDISPID(1292)  public IDispatch SendFile(final Object vContact, final String bstrFileName) throws ComException;
  @DeclDISPID(1291)  public void Signout() throws ComException;
  @DeclDISPID(1297)  public void Signin(final Integer hwndParent, final String bstrSigninName, final String bstrPassword) throws ComException;
  @DeclDISPID(1286)  public IDispatch GetContact(final String bstrSigninName, final String bstrServiceId) throws ComException;
  @DeclDISPID(1287)  public void OptionsPages(final Integer hwndParent, final MOPTIONPAGE MOPTIONPAGE) throws ComException;
  @DeclDISPID(1288)  public void AddContact(final Integer hwndParent, final String bstrEMail) throws ComException;
  @DeclDISPID(1289)  public void FindContact(final Integer hwndParent, final String bstrFirstName, final String bstrLastName, final Object vbstrCity, final Object vbstrState, final Object vbstrCountry) throws ComException;
  @DeclDISPID(1290)  public IDispatch InstantMessage(final Object vContact) throws ComException;
  @DeclDISPID(1300)  public IDispatch Phone(final Object vContact, final MPHONE_TYPE ePhoneNumber, final String bstrNumber) throws ComException;
  @DeclDISPID(1301)  public void MediaWizard(final Integer hwndParent) throws ComException;
  @DeclDISPID(1302)  public IDispatch Page(final Object vContact) throws ComException;
  @DeclDISPID(1299)  public void AutoSignin() throws ComException;
  @DeclDISPID(1303)  public IDispatch getMyContacts() throws ComException;
  @DeclDISPID(1304)  public String getMySigninName() throws ComException;
  @DeclDISPID(1282)  public String getMyFriendlyName() throws ComException;
  @DeclDISPID(1305)  public void setMyStatus(final MISTATUS value) throws ComException;
  @DeclDISPID(1305)  public MISTATUS getMyStatus() throws ComException;
  @DeclDISPID(1284)  public Integer getUnreadEmailCount(final MUAFOLDER mFolder) throws ComException;
  @DeclDISPID(1294)  public String getMyServiceName() throws ComException;
  @DeclDISPID(1296)  public String getMyPhoneNumber(final MPHONE_TYPE PhoneType) throws ComException;
  @DeclDISPID(1306)  public Object getMyProperty(final MCONTACTPROPERTY ePropType) throws ComException;
  @DeclDISPID(1306)  public void setMyProperty(final MCONTACTPROPERTY ePropType, final Object value2) throws ComException;
  @DeclDISPID(1307)  public String getMyServiceId() throws ComException;
  @DeclDISPID(1308)  public IDispatch getServices() throws ComException;
}
