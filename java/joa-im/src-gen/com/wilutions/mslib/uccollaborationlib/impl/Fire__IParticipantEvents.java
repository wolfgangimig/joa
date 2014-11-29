/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IParticipantEvents;

@SuppressWarnings("all")
public class Fire__IParticipantEvents {
  public final static void onOnPropertyChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IParticipant _eventSource, final com.wilutions.mslib.uccollaborationlib.IParticipantPropertyChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IParticipantEvents.class, (l)->l.onOnPropertyChanged(_eventSource,_eventData));
  }
  public final static void onOnIsMutedChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IParticipant _eventSource, final com.wilutions.mslib.uccollaborationlib.IMutedChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IParticipantEvents.class, (l)->l.onOnIsMutedChanged(_eventSource,_eventData));
  }
  public final static void onOnActionAvailabilityChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IParticipant _eventSource, final com.wilutions.mslib.uccollaborationlib.IParticipantActionAvailabilityChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IParticipantEvents.class, (l)->l.onOnActionAvailabilityChanged(_eventSource,_eventData));
  }
}
