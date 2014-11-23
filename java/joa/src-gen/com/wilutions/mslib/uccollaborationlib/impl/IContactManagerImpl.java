/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{26246C91-E66B-9776-33A9-9FA4FE9F2A69}")
public class IContactManagerImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IContactManager {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IGroupCollection getGroups() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Groups", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IGroupCollectionImpl.class);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.IContact GetContactByUri(String _contactUri) throws ComException {
    assert(_contactUri != null);
    final Object obj = this._dispatchCall(1610743809,"GetContactByUri", DISPATCH_METHOD,null,_contactUri);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IContactImpl.class);
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Lookup(String _lookupString, Object _contactsAndGroupsCallback, Object _state) throws ComException {
    assert(_lookupString != null);
    assert(_contactsAndGroupsCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743810,"Lookup", DISPATCH_METHOD,null,_lookupString,_contactsAndGroupsCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.IContactSubscription CreateSubscription() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"CreateSubscription", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IContactSubscriptionImpl.class);
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Search(String _searchString, com.wilutions.mslib.uccollaborationlib.SearchProviders _providers, com.wilutions.mslib.uccollaborationlib.SearchFields _searchFields, com.wilutions.mslib.uccollaborationlib.SearchOptions _searchOptions, Integer _maxResults, Object _contactsAndGroupsCallback, Object _state) throws ComException {
    assert(_searchString != null);
    assert(_providers != null);
    assert(_searchFields != null);
    assert(_searchOptions != null);
    assert(_maxResults != null);
    assert(_contactsAndGroupsCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743812,"Search", DISPATCH_METHOD,null,_searchString,_providers.value,_searchFields.value,_searchOptions.value,_maxResults,_contactsAndGroupsCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation RemoveContactFromAllGroups(com.wilutions.mslib.uccollaborationlib.IContact _contact, Object _contactsAndGroupsCallback, Object _state) throws ComException {
    assert(_contactsAndGroupsCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743813,"RemoveContactFromAllGroups", DISPATCH_METHOD,null,(_contact!=null?_contact:Dispatch.NULL),_contactsAndGroupsCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743814)  public String GetSearchProviderID(com.wilutions.mslib.uccollaborationlib.SearchProviders _provider) throws ComException {
    assert(_provider != null);
    final Object obj = this._dispatchCall(1610743814,"GetSearchProviderID", DISPATCH_METHOD,null,_provider.value);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743815)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation AddCustomGroup(String _customGroupName, Object _contactsAndGroupsCallback, Object _state) throws ComException {
    assert(_customGroupName != null);
    assert(_contactsAndGroupsCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743815,"AddCustomGroup", DISPATCH_METHOD,null,_customGroupName,_contactsAndGroupsCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743816)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation AddDistributionGroup(com.wilutions.mslib.uccollaborationlib.IDistributionGroup _distributionGroup, Object _contactsAndGroupsCallback, Object _state) throws ComException {
    assert(_contactsAndGroupsCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743816,"AddDistributionGroup", DISPATCH_METHOD,null,(_distributionGroup!=null?_distributionGroup:Dispatch.NULL),_contactsAndGroupsCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743817)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation RemoveGroup(com.wilutions.mslib.uccollaborationlib.IGroup _group, Object _contactsAndGroupsCallback, Object _state) throws ComException {
    assert(_contactsAndGroupsCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743817,"RemoveGroup", DISPATCH_METHOD,null,(_group!=null?_group:Dispatch.NULL),_contactsAndGroupsCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743818)  public void SuspendSubscriptions() throws ComException {
    this._dispatchCall(1610743818,"SuspendSubscriptions", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743819)  public void ResumeSubscriptions() throws ComException {
    this._dispatchCall(1610743819,"ResumeSubscriptions", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743820)  public com.wilutions.mslib.uccollaborationlib.SearchFields GetSearchFields() throws ComException {
    final Object obj = this._dispatchCall(1610743820,"GetSearchFields", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.SearchFields.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743821)  public com.wilutions.mslib.uccollaborationlib.SearchProviderStatusType GetSearchProviderStatus(com.wilutions.mslib.uccollaborationlib.SearchProviders _provider) throws ComException {
    assert(_provider != null);
    final Object obj = this._dispatchCall(1610743821,"GetSearchProviderStatus", DISPATCH_METHOD,null,_provider.value);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.SearchProviderStatusType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743822)  public String GetExpertSearchQueryString(String _searchString) throws ComException {
    assert(_searchString != null);
    final Object obj = this._dispatchCall(1610743822,"GetExpertSearchQueryString", DISPATCH_METHOD,null,_searchString);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743823)  public com.wilutions.mslib.uccollaborationlib.IContact GetSelfContact() throws ComException {
    final Object obj = this._dispatchCall(1610743823,"GetSelfContact", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IContactImpl.class);
  }
  @DeclDISPID(1610743824)  public com.wilutions.mslib.uccollaborationlib.IContact GetContactByTel(String _telUri) throws ComException {
    assert(_telUri != null);
    final Object obj = this._dispatchCall(1610743824,"GetContactByTel", DISPATCH_METHOD,null,_telUri);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IContactImpl.class);
  }
  public IContactManagerImpl(String progId) throws ComException {
    super(progId, "{E6B3F5FA-4208-4C37-AE07-F6435B68D693}");
  }
  protected IContactManagerImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IContactManagerImpl" + super.toString() + "]";
  }
}
