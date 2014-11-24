/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{9F3EB7CC-CA0D-91C3-12A3-79984F025BA7}")
public class _IConversationHistoryCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IConversationHistoryCallback {
  @DeclDISPID(1091)  public void OnSaveAllHistory(com.wilutions.mslib.uccollaborationlib.IConversationHistory _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1091,"OnSaveAllHistory", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1092)  public void OnRetrievePastHistory(com.wilutions.mslib.uccollaborationlib.IConversationHistory _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1092,"OnRetrievePastHistory", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1093)  public void OnRetrievePastHistoryByEntryId(com.wilutions.mslib.uccollaborationlib.IConversationHistory _source, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1093,"OnRetrievePastHistoryByEntryId", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IConversationHistoryCallbackImpl(String progId) throws ComException {
    super(progId, "{5FA92EA7-6E6E-4A82-8F0D-107FEAF5A75D}");
  }
  protected _IConversationHistoryCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IConversationHistoryCallbackImpl" + super.toString() + "]";
  }
}
