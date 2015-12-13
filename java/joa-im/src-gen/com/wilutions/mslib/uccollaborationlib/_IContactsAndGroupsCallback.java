/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IContactsAndGroupsCallback.
 * _IContactsAndGroupsCallback Interface 
 */
@CoInterface(guid="{ABF012A2-2068-4B4D-80D7-6D386BA7C8A2}")
public interface _IContactsAndGroupsCallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(252)  public void OnAddCustomGroup(final IContactManager _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(253)  public void OnAddDistributionGroup(final IContactManager _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(255)  public void OnRemoveContactFromAllGroups(final IContactManager _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(254)  public void OnRemoveGroup(final IContactManager _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(250)  public void OnSearch(final IContactManager _source, final ISearchResults _searchResults, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(251)  public void OnLookup(final IContactManager _source, final IDispatch _lookupResult, final IAsynchronousOperation _asyncOperation) throws ComException;
}
