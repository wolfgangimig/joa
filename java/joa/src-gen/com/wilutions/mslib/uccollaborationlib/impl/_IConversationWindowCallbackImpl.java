/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{B6D51B1B-9299-9977-1671-C33C9C0AEF8B}")
public class _IConversationWindowCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IConversationWindowCallback {
  @DeclDISPID(4050)  public void OnOpenExtensibilityWindow(com.wilutions.mslib.uccollaborationlib.IConversationWindow _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(4050,"OnOpenExtensibilityWindow", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IConversationWindowCallbackImpl(String progId) throws ComException {
    super(progId, "{76428270-36FA-4236-8BDF-AADB39FD1371}");
  }
  protected _IConversationWindowCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IConversationWindowCallbackImpl" + super.toString() + "]";
  }
}
