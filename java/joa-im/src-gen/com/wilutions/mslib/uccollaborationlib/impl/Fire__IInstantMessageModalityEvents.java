/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IInstantMessageModalityEvents;

@SuppressWarnings("all")
public class Fire__IInstantMessageModalityEvents {
  public final static void onOnModalityStateChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IModalityStateChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IInstantMessageModalityEvents.class, (l)->l.onOnModalityStateChanged(_eventSource,_eventData));
  }
  public final static void onOnInstantMessagePropertyChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IInstantMessageModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IModalityPropertyChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IInstantMessageModalityEvents.class, (l)->l.onOnInstantMessagePropertyChanged(_eventSource,_eventData));
  }
  public final static void onOnInstantMessageReceived(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IInstantMessageModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IMessageSentEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IInstantMessageModalityEvents.class, (l)->l.onOnInstantMessageReceived(_eventSource,_eventData));
  }
  public final static void onOnIsTypingChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IInstantMessageModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IIsTypingChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IInstantMessageModalityEvents.class, (l)->l.onOnIsTypingChanged(_eventSource,_eventData));
  }
  public final static void onOnActionAvailabilityChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IModalityActionAvailabilityChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IInstantMessageModalityEvents.class, (l)->l.onOnActionAvailabilityChanged(_eventSource,_eventData));
  }
}
