/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{40FAAB4C-E8DB-9C85-05CA-14AA5103BC93}")
public class _IAutomationCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IAutomationCallback {
  @DeclDISPID(4100)  public void OnStartConversation(com.wilutions.mslib.uccollaborationlib.IAutomation _source, com.wilutions.mslib.uccollaborationlib.IConversationWindow _uiWindow, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(4100,"OnStartConversation", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_uiWindow!=null?_uiWindow:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(4101)  public void OnJoinConference(com.wilutions.mslib.uccollaborationlib.IAutomation _source, com.wilutions.mslib.uccollaborationlib.IConversationWindow _uiWindow, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(4101,"OnJoinConference", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_uiWindow!=null?_uiWindow:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IAutomationCallbackImpl(String progId) throws ComException {
    super(progId, "{806D3227-4CB8-47C4-9864-7D4DF4F44069}");
  }
  protected _IAutomationCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IAutomationCallbackImpl" + super.toString() + "]";
  }
}
