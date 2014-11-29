/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{55AD7E59-5159-9A57-31B5-6AC6160CC140}")
public class _ILyncClientEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._ILyncClientEvents {
  @DeclDISPID(100)  public void onOnStateChanged(com.wilutions.mslib.uccollaborationlib.IClient _eventSource, com.wilutions.mslib.uccollaborationlib.IClientStateChangedEventData _eventData) throws ComException {
    this._dispatchCall(100,"OnStateChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(101)  public void onOnNotificationReceived(com.wilutions.mslib.uccollaborationlib.ILyncClient _eventSource, com.wilutions.mslib.uccollaborationlib.ILyncClientNotificationReceivedEventData _eventData) throws ComException {
    this._dispatchCall(101,"OnNotificationReceived", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(103)  public void onOnCredentialRequested(com.wilutions.mslib.uccollaborationlib.ILyncClient _eventSource, com.wilutions.mslib.uccollaborationlib.ICredentialRequestedEventData _eventData) throws ComException {
    this._dispatchCall(103,"OnCredentialRequested", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(102)  public void onOnSignInDelayed(com.wilutions.mslib.uccollaborationlib.ILyncClient _eventSource, com.wilutions.mslib.uccollaborationlib.ISignInDelayedEventData _eventData) throws ComException {
    this._dispatchCall(102,"OnSignInDelayed", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(105)  public void onOnCapabilitiesChanged(com.wilutions.mslib.uccollaborationlib.ILyncClient _eventSource, com.wilutions.mslib.uccollaborationlib.IPreferredCapabilitiesChangedEventData _eventData) throws ComException {
    this._dispatchCall(105,"OnCapabilitiesChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(106)  public void onOnDelegatorClientAdded(com.wilutions.mslib.uccollaborationlib.ILyncClient _eventSource, com.wilutions.mslib.uccollaborationlib.IDelegatorClientCollectionEventData _eventData) throws ComException {
    this._dispatchCall(106,"OnDelegatorClientAdded", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(107)  public void onOnDelegatorClientRemoved(com.wilutions.mslib.uccollaborationlib.ILyncClient _eventSource, com.wilutions.mslib.uccollaborationlib.IDelegatorClientCollectionEventData _eventData) throws ComException {
    this._dispatchCall(107,"OnDelegatorClientRemoved", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _ILyncClientEventsImpl(String progId) throws ComException {
    super(progId, "{953AE732-F53A-4116-AC1B-0321B3FB3DBA}");
  }
  protected _ILyncClientEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_ILyncClientEventsImpl" + super.toString() + "]";
  }
}
