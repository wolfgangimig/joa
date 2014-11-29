/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactSubscription.
 * Represents a subscription to conatct information updates for a collection of contacts. 
 */
@CoClass(guid="{FEAEFFD6-C800-46A0-B634-FDC415FEC211}")
public class ContactSubscription extends Dispatch implements IContactSubscription {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public void Subscribe(ContactSubscriptionRefreshRate _subscriptionFreshness, ContactInformationType[] _contactInformationTypes) throws ComException {
    assert(_subscriptionFreshness != null);
    assert(_contactInformationTypes != null);
    this._dispatchCall(1610743808,"Subscribe", DISPATCH_METHOD,null,_subscriptionFreshness.value,_contactInformationTypes);
  }
  @DeclDISPID(1610743809)  public void Unsubscribe() throws ComException {
    this._dispatchCall(1610743809,"Unsubscribe", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743810)  public void AddContact(IContact _contact) throws ComException {
    this._dispatchCall(1610743810,"AddContact", DISPATCH_METHOD,null,(_contact!=null?_contact:Dispatch.NULL));
  }
  @DeclDISPID(1610743811)  public void RemoveContact(IContact _contact) throws ComException {
    this._dispatchCall(1610743811,"RemoveContact", DISPATCH_METHOD,null,(_contact!=null?_contact:Dispatch.NULL));
  }
  @DeclDISPID(1610743812)  public ContactSubscriptionRefreshRate getLastSubscribedRefreshRate() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"LastSubscribedRefreshRate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ContactSubscriptionRefreshRate.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743813)  public ContactInformationType[] getLastSubscribedContactInformation() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"LastSubscribedContactInformation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (ContactInformationType[])obj;
  }
  @DeclDISPID(1610743814)  public IContact[] getContacts() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"Contacts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IContact[])obj;
  }
  @DeclDISPID(1610743815)  public void AddContactByUri(String _contactUri) throws ComException {
    assert(_contactUri != null);
    this._dispatchCall(1610743815,"AddContactByUri", DISPATCH_METHOD,null,_contactUri);
  }
  @DeclDISPID(1610743816)  public void AddContacts(IContact[] _contacts) throws ComException {
    assert(_contacts != null);
    this._dispatchCall(1610743816,"AddContacts", DISPATCH_METHOD,null,_contacts);
  }
  public ContactSubscription() throws ComException {
    super("{FEAEFFD6-C800-46A0-B634-FDC415FEC211}", "{95B8D3E8-F3D5-4DC0-BCFE-AB80C835DEA0}");
  }
  protected ContactSubscription(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ContactSubscription" + super.toString() + "]";
  }
}
