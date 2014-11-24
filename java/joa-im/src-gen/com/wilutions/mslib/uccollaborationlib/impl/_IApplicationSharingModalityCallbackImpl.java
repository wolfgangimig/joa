/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{46134AC6-D402-9B17-353A-821682FD2761}")
public class _IApplicationSharingModalityCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IApplicationSharingModalityCallback {
  @DeclDISPID(1400)  public void OnStartSharing(com.wilutions.mslib.uccollaborationlib.IApplicationSharingModality _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1400,"OnStartSharing", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1401)  public void OnRequestControl(com.wilutions.mslib.uccollaborationlib.IApplicationSharingModality _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1401,"OnRequestControl", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1402)  public void OnReleaseControl(com.wilutions.mslib.uccollaborationlib.IApplicationSharingModality _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1402,"OnReleaseControl", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1403)  public void OnGrantControl(com.wilutions.mslib.uccollaborationlib.IApplicationSharingModality _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1403,"OnGrantControl", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1404)  public void OnRevokeControl(com.wilutions.mslib.uccollaborationlib.IApplicationSharingModality _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1404,"OnRevokeControl", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1405)  public void OnAcceptControlRequest(com.wilutions.mslib.uccollaborationlib.IApplicationSharingModality _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1405,"OnAcceptControlRequest", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1406)  public void OnDeclineControlRequest(com.wilutions.mslib.uccollaborationlib.IApplicationSharingModality _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1406,"OnDeclineControlRequest", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IApplicationSharingModalityCallbackImpl(String progId) throws ComException {
    super(progId, "{8684D3AD-7061-4056-A894-EBF1270ADB9B}");
  }
  protected _IApplicationSharingModalityCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IApplicationSharingModalityCallbackImpl" + super.toString() + "]";
  }
}
