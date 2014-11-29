/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{06F7CE19-99FE-9FE6-2994-2C774343C219}")
public class _IGroupCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IGroupCallback {
  @DeclDISPID(551)  public void OnAddContact(final com.wilutions.mslib.uccollaborationlib.IGroup _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(551,"OnAddContact", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(552)  public void OnRemoveContact(final com.wilutions.mslib.uccollaborationlib.IGroup _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(552,"OnRemoveContact", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(550)  public void OnRename(final com.wilutions.mslib.uccollaborationlib.ICustomGroup _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(550,"OnRename", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(553)  public void OnExpand(final com.wilutions.mslib.uccollaborationlib.IDistributionGroup _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(553,"OnExpand", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(554)  public void OnGetAllMembers(final com.wilutions.mslib.uccollaborationlib.IDistributionGroup _source, final com.wilutions.mslib.uccollaborationlib.IContactCollection _members, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(554,"OnGetAllMembers", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_members!=null?_members:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(555)  public void OnGetOwner(final com.wilutions.mslib.uccollaborationlib.IDistributionGroup _source, final com.wilutions.mslib.uccollaborationlib.IContact _owner, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(555,"OnGetOwner", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_owner!=null?_owner:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IGroupCallbackImpl(String progId) throws ComException {
    super(progId, "{C6605772-3D9D-44A7-B43A-4590E6B43EE3}");
  }
  protected _IGroupCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IGroupCallbackImpl" + super.toString() + "]";
  }
}
