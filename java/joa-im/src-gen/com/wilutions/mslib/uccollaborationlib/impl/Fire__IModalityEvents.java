/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IModalityEvents;

@SuppressWarnings("all")
public class Fire__IModalityEvents {
  public final static void onOnModalityStateChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IModalityStateChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IModalityEvents.class, (l)->l.onOnModalityStateChanged(_eventSource,_eventData));
  }
  public final static void onOnActionAvailabilityChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IModalityActionAvailabilityChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IModalityEvents.class, (l)->l.onOnActionAvailabilityChanged(_eventSource,_eventData));
  }
}
