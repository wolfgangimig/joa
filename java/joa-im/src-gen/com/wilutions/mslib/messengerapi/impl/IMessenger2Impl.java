/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{159BABED-ABEA-93B9-2FAA-5FE3C76A12EA}")
public class IMessenger2Impl extends Dispatch implements com.wilutions.mslib.messengerapi.IMessenger2 {
  @DeclDISPID(1283)  public IDispatch getWindow() throws ComException {
    final Object obj = this._dispatchCall(1283,"Window", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1285)  public void ViewProfile(final Object vContact) throws ComException {
    assert(vContact != null);
    this._dispatchCall(1285,"ViewProfile", DISPATCH_METHOD,null,vContact);
  }
  @DeclDISPID(1280)  public String getReceiveFileDirectory() throws ComException {
    final Object obj = this._dispatchCall(1280,"ReceiveFileDirectory", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1281)  public IDispatch StartVoice(final Object vContact) throws ComException {
    assert(vContact != null);
    final Object obj = this._dispatchCall(1281,"StartVoice", DISPATCH_METHOD,null,vContact);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1295)  public IDispatch InviteApp(final Object vContact, final String bstrAppID) throws ComException {
    assert(vContact != null);
    assert(bstrAppID != null);
    final Object obj = this._dispatchCall(1295,"InviteApp", DISPATCH_METHOD,null,vContact,bstrAppID);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1298)  public void SendMail(final Object vContact) throws ComException {
    assert(vContact != null);
    this._dispatchCall(1298,"SendMail", DISPATCH_METHOD,null,vContact);
  }
  @DeclDISPID(1293)  public void OpenInbox() throws ComException {
    this._dispatchCall(1293,"OpenInbox", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1292)  public IDispatch SendFile(final Object vContact, final String bstrFileName) throws ComException {
    assert(vContact != null);
    assert(bstrFileName != null);
    final Object obj = this._dispatchCall(1292,"SendFile", DISPATCH_METHOD,null,vContact,bstrFileName);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1291)  public void Signout() throws ComException {
    this._dispatchCall(1291,"Signout", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1297)  public void Signin(final Integer hwndParent, final String bstrSigninName, final String bstrPassword) throws ComException {
    assert(hwndParent != null);
    assert(bstrSigninName != null);
    assert(bstrPassword != null);
    this._dispatchCall(1297,"Signin", DISPATCH_METHOD,null,hwndParent,bstrSigninName,bstrPassword);
  }
  @DeclDISPID(1286)  public IDispatch GetContact(final String bstrSigninName, final String bstrServiceId) throws ComException {
    assert(bstrSigninName != null);
    assert(bstrServiceId != null);
    final Object obj = this._dispatchCall(1286,"GetContact", DISPATCH_METHOD,null,bstrSigninName,bstrServiceId);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1287)  public void OptionsPages(final Integer hwndParent, final com.wilutions.mslib.messengerapi.MOPTIONPAGE MOPTIONPAGE) throws ComException {
    assert(hwndParent != null);
    assert(MOPTIONPAGE != null);
    this._dispatchCall(1287,"OptionsPages", DISPATCH_METHOD,null,hwndParent,MOPTIONPAGE.value);
  }
  @DeclDISPID(1288)  public void AddContact(final Integer hwndParent, final String bstrEMail) throws ComException {
    assert(hwndParent != null);
    assert(bstrEMail != null);
    this._dispatchCall(1288,"AddContact", DISPATCH_METHOD,null,hwndParent,bstrEMail);
  }
  @DeclDISPID(1289)  public void FindContact(final Integer hwndParent, final String bstrFirstName, final String bstrLastName, final Object vbstrCity, final Object vbstrState, final Object vbstrCountry) throws ComException {
    assert(hwndParent != null);
    assert(bstrFirstName != null);
    assert(bstrLastName != null);
    assert(vbstrCity != null);
    assert(vbstrState != null);
    assert(vbstrCountry != null);
    this._dispatchCall(1289,"FindContact", DISPATCH_METHOD,null,hwndParent,bstrFirstName,bstrLastName,vbstrCity,vbstrState,vbstrCountry);
  }
  @DeclDISPID(1290)  public IDispatch InstantMessage(final Object vContact) throws ComException {
    assert(vContact != null);
    final Object obj = this._dispatchCall(1290,"InstantMessage", DISPATCH_METHOD,null,vContact);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1300)  public IDispatch Phone(final Object vContact, final com.wilutions.mslib.messengerapi.MPHONE_TYPE ePhoneNumber, final String bstrNumber) throws ComException {
    assert(vContact != null);
    assert(ePhoneNumber != null);
    assert(bstrNumber != null);
    final Object obj = this._dispatchCall(1300,"Phone", DISPATCH_METHOD,null,vContact,ePhoneNumber.value,bstrNumber);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1301)  public void MediaWizard(final Integer hwndParent) throws ComException {
    assert(hwndParent != null);
    this._dispatchCall(1301,"MediaWizard", DISPATCH_METHOD,null,hwndParent);
  }
  @DeclDISPID(1302)  public IDispatch Page(final Object vContact) throws ComException {
    assert(vContact != null);
    final Object obj = this._dispatchCall(1302,"Page", DISPATCH_METHOD,null,vContact);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1299)  public void AutoSignin() throws ComException {
    this._dispatchCall(1299,"AutoSignin", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1303)  public IDispatch getMyContacts() throws ComException {
    final Object obj = this._dispatchCall(1303,"MyContacts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1304)  public String getMySigninName() throws ComException {
    final Object obj = this._dispatchCall(1304,"MySigninName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1282)  public String getMyFriendlyName() throws ComException {
    final Object obj = this._dispatchCall(1282,"MyFriendlyName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1305)  public void setMyStatus(final com.wilutions.mslib.messengerapi.MISTATUS value) throws ComException {
    assert(value != null);
    this._dispatchCall(1305,"MyStatus", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1305)  public com.wilutions.mslib.messengerapi.MISTATUS getMyStatus() throws ComException {
    final Object obj = this._dispatchCall(1305,"MyStatus", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.messengerapi.MISTATUS.valueOf((Integer)obj);
  }
  @DeclDISPID(1284)  public Integer getUnreadEmailCount(final com.wilutions.mslib.messengerapi.MUAFOLDER mFolder) throws ComException {
    assert(mFolder != null);
    final Object obj = this._dispatchCall(1284,"UnreadEmailCount", DISPATCH_PROPERTYGET,null,mFolder.value);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1294)  public String getMyServiceName() throws ComException {
    final Object obj = this._dispatchCall(1294,"MyServiceName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1296)  public String getMyPhoneNumber(final com.wilutions.mslib.messengerapi.MPHONE_TYPE PhoneType) throws ComException {
    assert(PhoneType != null);
    final Object obj = this._dispatchCall(1296,"MyPhoneNumber", DISPATCH_PROPERTYGET,null,PhoneType.value);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1306)  public Object getMyProperty(final com.wilutions.mslib.messengerapi.MCONTACTPROPERTY ePropType) throws ComException {
    assert(ePropType != null);
    final Object obj = this._dispatchCall(1306,"MyProperty", DISPATCH_PROPERTYGET,null,ePropType.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1306)  public void setMyProperty(final com.wilutions.mslib.messengerapi.MCONTACTPROPERTY ePropType, final Object value2) throws ComException {
    assert(value2 != null);
    assert(ePropType != null);
    this._dispatchCall(1306,"MyProperty", DISPATCH_PROPERTYPUT,value2,ePropType.value);
  }
  @DeclDISPID(1307)  public String getMyServiceId() throws ComException {
    final Object obj = this._dispatchCall(1307,"MyServiceId", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1308)  public IDispatch getServices() throws ComException {
    final Object obj = this._dispatchCall(1308,"Services", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1313)  public com.wilutions.mslib.messengerapi.MUASORT getContactsSortOrder() throws ComException {
    final Object obj = this._dispatchCall(1313,"ContactsSortOrder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.messengerapi.MUASORT.valueOf((Integer)obj);
  }
  @DeclDISPID(1313)  public void setContactsSortOrder(final com.wilutions.mslib.messengerapi.MUASORT value) throws ComException {
    assert(value != null);
    this._dispatchCall(1313,"ContactsSortOrder", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1310)  public IDispatch StartVideo(final Object vContact) throws ComException {
    assert(vContact != null);
    final Object obj = this._dispatchCall(1310,"StartVideo", DISPATCH_METHOD,null,vContact);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1311)  public IDispatch getMyGroups() throws ComException {
    final Object obj = this._dispatchCall(1311,"MyGroups", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1312)  public IDispatch CreateGroup(final String bstrName, final Object vService) throws ComException {
    assert(bstrName != null);
    assert(vService != null);
    final Object obj = this._dispatchCall(1312,"CreateGroup", DISPATCH_METHOD,null,bstrName,vService);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  public IMessenger2Impl(String progId) throws ComException {
    super(progId, "{D50C3286-0F89-48F8-B204-3604629DEE10}");
  }
  protected IMessenger2Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMessenger2Impl" + super.toString() + "]";
  }
}
