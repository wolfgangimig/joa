/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IContactManager.
 * IContactManager Interface 
 */
@CoInterface(guid="{E6B3F5FA-4208-4C37-AE07-F6435B68D693}")
public interface IContactManager extends IDispatch {
  @DeclDISPID(1610743808)  public IGroupCollection getGroups() throws ComException;
  @DeclDISPID(1610743809)  public IContact GetContactByUri(String _contactUri) throws ComException;
  @DeclDISPID(1610743810)  public IAsynchronousOperation Lookup(String _lookupString, Object _contactsAndGroupsCallback, Object _state) throws ComException;
  @DeclDISPID(1610743811)  public IContactSubscription CreateSubscription() throws ComException;
  @DeclDISPID(1610743812)  public IAsynchronousOperation Search(String _searchString, SearchProviders _providers, SearchFields _searchFields, SearchOptions _searchOptions, Integer _maxResults, Object _contactsAndGroupsCallback, Object _state) throws ComException;
  @DeclDISPID(1610743813)  public IAsynchronousOperation RemoveContactFromAllGroups(IContact _contact, Object _contactsAndGroupsCallback, Object _state) throws ComException;
  @DeclDISPID(1610743814)  public String GetSearchProviderID(SearchProviders _provider) throws ComException;
  @DeclDISPID(1610743815)  public IAsynchronousOperation AddCustomGroup(String _customGroupName, Object _contactsAndGroupsCallback, Object _state) throws ComException;
  @DeclDISPID(1610743816)  public IAsynchronousOperation AddDistributionGroup(IDistributionGroup _distributionGroup, Object _contactsAndGroupsCallback, Object _state) throws ComException;
  @DeclDISPID(1610743817)  public IAsynchronousOperation RemoveGroup(IGroup _group, Object _contactsAndGroupsCallback, Object _state) throws ComException;
  @DeclDISPID(1610743818)  public void SuspendSubscriptions() throws ComException;
  @DeclDISPID(1610743819)  public void ResumeSubscriptions() throws ComException;
  @DeclDISPID(1610743820)  public SearchFields GetSearchFields() throws ComException;
  @DeclDISPID(1610743821)  public SearchProviderStatusType GetSearchProviderStatus(SearchProviders _provider) throws ComException;
  @DeclDISPID(1610743822)  public String GetExpertSearchQueryString(String _searchString) throws ComException;
  @DeclDISPID(1610743823)  public IContact GetSelfContact() throws ComException;
  @DeclDISPID(1610743824)  public IContact GetContactByTel(String _telUri) throws ComException;
}
