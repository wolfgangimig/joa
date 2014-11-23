/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{044ECA5D-FD2A-9652-3766-EBE43BAB4006}")
public class _IUtilitiesCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IUtilitiesCallback {
  @DeclDISPID(1900)  public void OnAddToExternalContacts(com.wilutions.mslib.uccollaborationlib.IUtilities _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1900,"OnAddToExternalContacts", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1901)  public void OnFindPreviousConversations(com.wilutions.mslib.uccollaborationlib.IUtilities _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1901,"OnFindPreviousConversations", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1902)  public void OnComposeEmail(com.wilutions.mslib.uccollaborationlib.IUtilities _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1902,"OnComposeEmail", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1903)  public void OnScheduleMeeting(com.wilutions.mslib.uccollaborationlib.IUtilities _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1903,"OnScheduleMeeting", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IUtilitiesCallbackImpl(String progId) throws ComException {
    super(progId, "{C4D95336-5949-4D13-AAC8-82039E5CBCFC}");
  }
  protected _IUtilitiesCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IUtilitiesCallbackImpl" + super.toString() + "]";
  }
}
