/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{552F4A83-57B6-9681-2150-C2676DC2225A}")
public class IContactSubscriptionImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IContactSubscription {
  @DeclDISPID(1610743808)  public void Subscribe(com.wilutions.mslib.uccollaborationlib.ContactSubscriptionRefreshRate _subscriptionFreshness, com.wilutions.mslib.uccollaborationlib.ContactInformationType[] _contactInformationTypes) throws ComException {
    assert(_subscriptionFreshness != null);
    assert(_contactInformationTypes != null);
    this._dispatchCall(1610743808,"Subscribe", DISPATCH_METHOD,null,_subscriptionFreshness.value,_contactInformationTypes);
  }
  @DeclDISPID(1610743809)  public void Unsubscribe() throws ComException {
    this._dispatchCall(1610743809,"Unsubscribe", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743810)  public void AddContact(com.wilutions.mslib.uccollaborationlib.IContact _contact) throws ComException {
    this._dispatchCall(1610743810,"AddContact", DISPATCH_METHOD,null,(_contact!=null?_contact:Dispatch.NULL));
  }
  @DeclDISPID(1610743811)  public void RemoveContact(com.wilutions.mslib.uccollaborationlib.IContact _contact) throws ComException {
    this._dispatchCall(1610743811,"RemoveContact", DISPATCH_METHOD,null,(_contact!=null?_contact:Dispatch.NULL));
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.ContactSubscriptionRefreshRate getLastSubscribedRefreshRate() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"LastSubscribedRefreshRate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ContactSubscriptionRefreshRate.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.ContactInformationType[] getLastSubscribedContactInformation() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"LastSubscribedContactInformation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.ContactInformationType[])obj;
  }
  @DeclDISPID(1610743814)  public com.wilutions.mslib.uccollaborationlib.IContact[] getContacts() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"Contacts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.IContact[])obj;
  }
  @DeclDISPID(1610743815)  public void AddContactByUri(String _contactUri) throws ComException {
    assert(_contactUri != null);
    this._dispatchCall(1610743815,"AddContactByUri", DISPATCH_METHOD,null,_contactUri);
  }
  @DeclDISPID(1610743816)  public void AddContacts(com.wilutions.mslib.uccollaborationlib.IContact[] _contacts) throws ComException {
    assert(_contacts != null);
    this._dispatchCall(1610743816,"AddContacts", DISPATCH_METHOD,null,_contacts);
  }
  public IContactSubscriptionImpl(String progId) throws ComException {
    super(progId, "{95B8D3E8-F3D5-4DC0-BCFE-AB80C835DEA0}");
  }
  protected IContactSubscriptionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IContactSubscriptionImpl" + super.toString() + "]";
  }
}
