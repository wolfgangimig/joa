/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IGroupEvents;

@SuppressWarnings("all")
public class Fire__IGroupEvents {
  public final static void onOnNameChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupNameChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IGroupEvents.class, (l)->l.onOnNameChanged(_eventSource,_eventData));
  }
  public final static void onOnContactAdded(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupMemberChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IGroupEvents.class, (l)->l.onOnContactAdded(_eventSource,_eventData));
  }
  public final static void onOnContactRemoved(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupMemberChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IGroupEvents.class, (l)->l.onOnContactRemoved(_eventSource,_eventData));
  }
}
