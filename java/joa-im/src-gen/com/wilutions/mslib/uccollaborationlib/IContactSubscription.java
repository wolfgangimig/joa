/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IContactSubscription.
 * IContactSubscription Interface 
 */
@CoInterface(guid="{95B8D3E8-F3D5-4DC0-BCFE-AB80C835DEA0}")
public interface IContactSubscription extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public void Subscribe(final ContactSubscriptionRefreshRate _subscriptionFreshness, final ContactInformationType[] _contactInformationTypes) throws ComException;
  @DeclDISPID(1610743809)  public void Unsubscribe() throws ComException;
  @DeclDISPID(1610743810)  public void AddContact(final IContact _contact) throws ComException;
  @DeclDISPID(1610743811)  public void RemoveContact(final IContact _contact) throws ComException;
  @DeclDISPID(1610743812)  public ContactSubscriptionRefreshRate getLastSubscribedRefreshRate() throws ComException;
  @DeclDISPID(1610743813)  public ContactInformationType[] getLastSubscribedContactInformation() throws ComException;
  @DeclDISPID(1610743814)  public IContact[] getContacts() throws ComException;
  @DeclDISPID(1610743815)  public void AddContactByUri(final String _contactUri) throws ComException;
  @DeclDISPID(1610743816)  public void AddContacts(final IContact[] _contacts) throws ComException;
}
