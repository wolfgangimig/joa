/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{975BBB5E-32A6-92BB-2485-5CE3233133A8}")
public class _IConversationCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IConversationCallback {
  @DeclDISPID(1061)  public void OnMerge(final com.wilutions.mslib.uccollaborationlib.IConversation _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1061,"OnMerge", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1065)  public void OnPark(final com.wilutions.mslib.uccollaborationlib.IConversation _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1065,"OnPark", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1062)  public void OnSetProperty(final com.wilutions.mslib.uccollaborationlib.IConversation _source, final com.wilutions.mslib.uccollaborationlib.ConversationProperty _propertyType, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    assert(_propertyType != null);
    this._dispatchCall(1062,"OnSetProperty", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),_propertyType.value,(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1063)  public void OnAdmitParticipants(final com.wilutions.mslib.uccollaborationlib.IConversation _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1063,"OnAdmitParticipants", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1064)  public void OnDenyParticipants(final com.wilutions.mslib.uccollaborationlib.IConversation _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1064,"OnDenyParticipants", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1066)  public void OnMuteParticipants(final com.wilutions.mslib.uccollaborationlib.IConversation _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1066,"OnMuteParticipants", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1067)  public void OnUnmuteParticipants(final com.wilutions.mslib.uccollaborationlib.IConversation _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1067,"OnUnmuteParticipants", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1068)  public void OnSendInitialContext(final com.wilutions.mslib.uccollaborationlib.IConversation _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1068,"OnSendInitialContext", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1069)  public void OnSendContextData(final com.wilutions.mslib.uccollaborationlib.IConversation _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1069,"OnSendContextData", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IConversationCallbackImpl(String progId) throws ComException {
    super(progId, "{57CC2235-96C5-49FA-B92B-350486C6CF52}");
  }
  protected _IConversationCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IConversationCallbackImpl" + super.toString() + "]";
  }
}
