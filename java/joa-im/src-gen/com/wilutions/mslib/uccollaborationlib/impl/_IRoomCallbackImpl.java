/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{A21AE2B6-E1C8-9B0C-18AB-DA4A64A8B9B7}")
public class _IRoomCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IRoomCallback {
  @DeclDISPID(4212)  public void OnSetProperty(final com.wilutions.mslib.uccollaborationlib.IRoom _source, final com.wilutions.mslib.uccollaborationlib.RoomProperty _propertyType, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    assert(_propertyType != null);
    this._dispatchCall(4212,"OnSetProperty", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),_propertyType.value,(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(4210)  public void OnSendMessage(final com.wilutions.mslib.uccollaborationlib.IRoom _source, final com.wilutions.mslib.uccollaborationlib.IRoomMessage _roomMessage, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(4210,"OnSendMessage", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_roomMessage!=null?_roomMessage:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(4211)  public void OnRetrieveAdditionalMessages(final com.wilutions.mslib.uccollaborationlib.IRoom _source, final com.wilutions.mslib.uccollaborationlib.IRoomMessageCollection _roomMessages, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(4211,"OnRetrieveAdditionalMessages", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_roomMessages!=null?_roomMessages:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(4213)  public void OnJoin(final com.wilutions.mslib.uccollaborationlib.IRoom _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(4213,"OnJoin", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(4214)  public void OnLeave(final com.wilutions.mslib.uccollaborationlib.IRoom _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(4214,"OnLeave", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IRoomCallbackImpl(String progId) throws ComException {
    super(progId, "{628D7BDD-45AB-404D-8505-B3ADC15F454D}");
  }
  protected _IRoomCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IRoomCallbackImpl" + super.toString() + "]";
  }
}
