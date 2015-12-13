/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IContactManager.
 * IContactManager Interface 
 */
@CoInterface(guid="{E6B3F5FA-4208-4C37-AE07-F6435B68D693}")
public interface IContactManager extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IGroupCollection getGroups() throws ComException;
  @DeclDISPID(1610743809)  public IContact GetContactByUri(final String _contactUri) throws ComException;
  @DeclDISPID(1610743810)  public IAsynchronousOperation Lookup(final String _lookupString, final Object _contactsAndGroupsCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743811)  public IContactSubscription CreateSubscription() throws ComException;
  @DeclDISPID(1610743812)  public IAsynchronousOperation Search(final String _searchString, final SearchProviders _providers, final SearchFields _searchFields, final SearchOptions _searchOptions, final Integer _maxResults, final Object _contactsAndGroupsCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743813)  public IAsynchronousOperation RemoveContactFromAllGroups(final IContact _contact, final Object _contactsAndGroupsCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743814)  public String GetSearchProviderID(final SearchProviders _provider) throws ComException;
  @DeclDISPID(1610743815)  public IAsynchronousOperation AddCustomGroup(final String _customGroupName, final Object _contactsAndGroupsCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743816)  public IAsynchronousOperation AddDistributionGroup(final IDistributionGroup _distributionGroup, final Object _contactsAndGroupsCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743817)  public IAsynchronousOperation RemoveGroup(final IGroup _group, final Object _contactsAndGroupsCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743818)  public void SuspendSubscriptions() throws ComException;
  @DeclDISPID(1610743819)  public void ResumeSubscriptions() throws ComException;
  @DeclDISPID(1610743820)  public SearchFields GetSearchFields() throws ComException;
  @DeclDISPID(1610743821)  public SearchProviderStatusType GetSearchProviderStatus(final SearchProviders _provider) throws ComException;
  @DeclDISPID(1610743822)  public String GetExpertSearchQueryString(final String _searchString) throws ComException;
  @DeclDISPID(1610743823)  public IContact GetSelfContact() throws ComException;
  @DeclDISPID(1610743824)  public IContact GetContactByTel(final String _telUri) throws ComException;
}
