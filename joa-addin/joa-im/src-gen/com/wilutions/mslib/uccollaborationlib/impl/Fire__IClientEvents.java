/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IClientEvents;

@SuppressWarnings("all")
public class Fire__IClientEvents {
  public final static void onOnStateChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IClient _eventSource, final com.wilutions.mslib.uccollaborationlib.IClientStateChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IClientEvents.class, (l)->l.onOnStateChanged(_eventSource,_eventData));
  }
}
