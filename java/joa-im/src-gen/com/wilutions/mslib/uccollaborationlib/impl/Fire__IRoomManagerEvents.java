/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IRoomManagerEvents;

@SuppressWarnings("all")
public class Fire__IRoomManagerEvents {
  public final static void onOnFollowedRoomAdded(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IRoomManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IFollowedRoomsChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IRoomManagerEvents.class, (l)->l.onOnFollowedRoomAdded(_eventSource,_eventData));
  }
  public final static void onOnFollowedRoomRemoved(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IRoomManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IFollowedRoomsChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IRoomManagerEvents.class, (l)->l.onOnFollowedRoomRemoved(_eventSource,_eventData));
  }
  public final static void onOnRoomManagerStateChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IRoomManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IRoomManagerStateChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IRoomManagerEvents.class, (l)->l.onOnRoomManagerStateChanged(_eventSource,_eventData));
  }
}
