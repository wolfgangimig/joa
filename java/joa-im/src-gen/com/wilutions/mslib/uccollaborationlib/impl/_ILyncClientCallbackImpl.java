/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{72F8FD68-D27D-9395-194C-087BB21D17E9}")
public class _ILyncClientCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._ILyncClientCallback {
  @DeclDISPID(150)  public void OnSignIn(final com.wilutions.mslib.uccollaborationlib.ILyncClient _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(150,"OnSignIn", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(151)  public void OnSignOut(final com.wilutions.mslib.uccollaborationlib.ILyncClient _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(151,"OnSignOut", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(152)  public void OnInitialize(final com.wilutions.mslib.uccollaborationlib.ILyncClient _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(152,"OnInitialize", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(153)  public void OnShutdown(final com.wilutions.mslib.uccollaborationlib.ILyncClient _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(153,"OnShutdown", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _ILyncClientCallbackImpl(String progId) throws ComException {
    super(progId, "{B26F6403-761E-48D4-84E2-619C17EAEB13}");
  }
  protected _ILyncClientCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_ILyncClientCallbackImpl" + super.toString() + "]";
  }
}
