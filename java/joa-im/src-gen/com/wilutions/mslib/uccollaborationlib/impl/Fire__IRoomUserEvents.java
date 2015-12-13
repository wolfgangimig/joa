/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IRoomUserEvents;

@SuppressWarnings("all")
public class Fire__IRoomUserEvents {
  public final static void onOnCanSendMessageChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IRoomUser _eventSource, final com.wilutions.mslib.uccollaborationlib.IRoomUserChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IRoomUserEvents.class, (l)->l.onOnCanSendMessageChanged(_eventSource,_eventData));
  }
}
