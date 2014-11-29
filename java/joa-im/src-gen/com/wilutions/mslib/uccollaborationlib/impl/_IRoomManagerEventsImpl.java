/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{22514F8B-F68C-9CE3-2007-F48DDFDE5F6B}")
public class _IRoomManagerEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IRoomManagerEvents {
  @DeclDISPID(4220)  public void onOnFollowedRoomAdded(com.wilutions.mslib.uccollaborationlib.IRoomManager _eventSource, com.wilutions.mslib.uccollaborationlib.IFollowedRoomsChangedEventData _eventData) throws ComException {
    this._dispatchCall(4220,"OnFollowedRoomAdded", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(4221)  public void onOnFollowedRoomRemoved(com.wilutions.mslib.uccollaborationlib.IRoomManager _eventSource, com.wilutions.mslib.uccollaborationlib.IFollowedRoomsChangedEventData _eventData) throws ComException {
    this._dispatchCall(4221,"OnFollowedRoomRemoved", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(4222)  public void onOnRoomManagerStateChanged(com.wilutions.mslib.uccollaborationlib.IRoomManager _eventSource, com.wilutions.mslib.uccollaborationlib.IRoomManagerStateChangedEventData _eventData) throws ComException {
    this._dispatchCall(4222,"OnRoomManagerStateChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IRoomManagerEventsImpl(String progId) throws ComException {
    super(progId, "{E2C6D6E0-52EF-47A2-BDA9-9D6A7A29A391}");
  }
  protected _IRoomManagerEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IRoomManagerEventsImpl" + super.toString() + "]";
  }
}
