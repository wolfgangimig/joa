/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IChannelEvents;

@SuppressWarnings("all")
public class Fire__IChannelEvents {
  public final static void onOnStateChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IChannel _eventSource, final com.wilutions.mslib.uccollaborationlib.IChannelStateChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IChannelEvents.class, (l)->l.onOnStateChanged(_eventSource,_eventData));
  }
  public final static void onOnActionAvailabilityChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IChannel _eventSource, final com.wilutions.mslib.uccollaborationlib.IChannelActionAvailabilityEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IChannelEvents.class, (l)->l.onOnActionAvailabilityChanged(_eventSource,_eventData));
  }
}
