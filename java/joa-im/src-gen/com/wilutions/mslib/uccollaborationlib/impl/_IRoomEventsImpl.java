/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{F099CFC8-6A6B-95F2-02E6-39BD04953520}")
public class _IRoomEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IRoomEvents {
  @DeclDISPID(4200)  public void onOnPropertyChanged(final com.wilutions.mslib.uccollaborationlib.IRoom _eventSource, final com.wilutions.mslib.uccollaborationlib.IRoomPropertyChangedEventData _eventData) throws ComException {
    this._dispatchCall(4200,"OnPropertyChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(4201)  public void onOnUnreadMessageCountChanged(final com.wilutions.mslib.uccollaborationlib.IRoom _eventSource, final com.wilutions.mslib.uccollaborationlib.IUnreadMessageCountChangedEventData _eventData) throws ComException {
    this._dispatchCall(4201,"OnUnreadMessageCountChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(4202)  public void onOnIsSendingMessage(final com.wilutions.mslib.uccollaborationlib.IRoom _eventSource, final com.wilutions.mslib.uccollaborationlib.IRoomMessageEventData _eventData) throws ComException {
    this._dispatchCall(4202,"OnIsSendingMessage", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(4203)  public void onOnMessagesReceived(final com.wilutions.mslib.uccollaborationlib.IRoom _eventSource, final com.wilutions.mslib.uccollaborationlib.IRoomMessagesEventData _eventData) throws ComException {
    this._dispatchCall(4203,"OnMessagesReceived", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(4204)  public void onOnParticipantAdded(final com.wilutions.mslib.uccollaborationlib.IRoom _eventSource, final com.wilutions.mslib.uccollaborationlib.IRoomParticipantsEventData _eventData) throws ComException {
    this._dispatchCall(4204,"OnParticipantAdded", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(4205)  public void onOnParticipantRemoved(final com.wilutions.mslib.uccollaborationlib.IRoom _eventSource, final com.wilutions.mslib.uccollaborationlib.IRoomParticipantsEventData _eventData) throws ComException {
    this._dispatchCall(4205,"OnParticipantRemoved", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(4206)  public void onOnJoinStateChanged(final com.wilutions.mslib.uccollaborationlib.IRoom _eventSource, final com.wilutions.mslib.uccollaborationlib.IRoomJoinStateChangedEventData _eventData) throws ComException {
    this._dispatchCall(4206,"OnJoinStateChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IRoomEventsImpl(String progId) throws ComException {
    super(progId, "{300E56A3-CE08-4EB3-9F48-505AA162C9DA}");
  }
  protected _IRoomEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IRoomEventsImpl" + super.toString() + "]";
  }
}
