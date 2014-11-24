/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{6B678BC9-840B-900C-1D79-04DFCE503458}")
public class _IContactsAndGroupsCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IContactsAndGroupsCallback {
  @DeclDISPID(252)  public void OnAddCustomGroup(com.wilutions.mslib.uccollaborationlib.IContactManager _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(252,"OnAddCustomGroup", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(253)  public void OnAddDistributionGroup(com.wilutions.mslib.uccollaborationlib.IContactManager _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(253,"OnAddDistributionGroup", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(255)  public void OnRemoveContactFromAllGroups(com.wilutions.mslib.uccollaborationlib.IContactManager _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(255,"OnRemoveContactFromAllGroups", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(254)  public void OnRemoveGroup(com.wilutions.mslib.uccollaborationlib.IContactManager _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(254,"OnRemoveGroup", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(250)  public void OnSearch(com.wilutions.mslib.uccollaborationlib.IContactManager _source, com.wilutions.mslib.uccollaborationlib.ISearchResults _searchResults, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(250,"OnSearch", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_searchResults!=null?_searchResults:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(251)  public void OnLookup(com.wilutions.mslib.uccollaborationlib.IContactManager _source, Dispatch _lookupResult, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(251,"OnLookup", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_lookupResult!=null?_lookupResult:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IContactsAndGroupsCallbackImpl(String progId) throws ComException {
    super(progId, "{ABF012A2-2068-4B4D-80D7-6D386BA7C8A2}");
  }
  protected _IContactsAndGroupsCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IContactsAndGroupsCallbackImpl" + super.toString() + "]";
  }
}
