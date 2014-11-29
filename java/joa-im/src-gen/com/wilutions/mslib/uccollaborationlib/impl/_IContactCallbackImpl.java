/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{F18A4723-491E-9DBB-03A4-47D6EE881386}")
public class _IContactCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IContactCallback {
  @DeclDISPID(450)  public void OnChangeSetting(final com.wilutions.mslib.uccollaborationlib.IContact _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(450,"OnChangeSetting", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(451)  public void OnMoveToGroup(final com.wilutions.mslib.uccollaborationlib.IContact _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(451,"OnMoveToGroup", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(452)  public void OnGetOrganizationInformation(final com.wilutions.mslib.uccollaborationlib.IContact _source, final com.wilutions.mslib.uccollaborationlib.IContactCollection _managers, final com.wilutions.mslib.uccollaborationlib.IContactCollection _peers, final com.wilutions.mslib.uccollaborationlib.IContactCollection _directors, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(452,"OnGetOrganizationInformation", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_managers!=null?_managers:Dispatch.NULL),(_peers!=null?_peers:Dispatch.NULL),(_directors!=null?_directors:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IContactCallbackImpl(String progId) throws ComException {
    super(progId, "{311DDE48-ED7D-46FA-9E0A-2E314B7FEF7C}");
  }
  protected _IContactCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IContactCallbackImpl" + super.toString() + "]";
  }
}
