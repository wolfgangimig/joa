/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IContactsAndGroupsCallback.
 * _IContactsAndGroupsCallback Interface 
 */
@CoInterface(guid="{ABF012A2-2068-4B4D-80D7-6D386BA7C8A2}")
public interface _IContactsAndGroupsCallback extends IDispatch {
  @DeclDISPID(252)  public void OnAddCustomGroup(IContactManager _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(253)  public void OnAddDistributionGroup(IContactManager _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(255)  public void OnRemoveContactFromAllGroups(IContactManager _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(254)  public void OnRemoveGroup(IContactManager _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(250)  public void OnSearch(IContactManager _source, ISearchResults _searchResults, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(251)  public void OnLookup(IContactManager _source, Dispatch _lookupResult, IAsynchronousOperation _asyncOperation) throws ComException;
}
