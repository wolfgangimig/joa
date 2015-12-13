/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IConversationWindow2Events;

@SuppressWarnings("all")
public class Fire__IConversationWindow2Events {
  public final static void onOnStateChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversationWindow _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationWindowStateChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationWindow2Events.class, (l)->l.onOnStateChanged(_eventSource,_eventData));
  }
  public final static void onOnInformationChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversationWindow _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationWindowInformationChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationWindow2Events.class, (l)->l.onOnInformationChanged(_eventSource,_eventData));
  }
  public final static void onOnActionAvailabilityChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversationWindow _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationWindowActionAvailabilityChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationWindow2Events.class, (l)->l.onOnActionAvailabilityChanged(_eventSource,_eventData));
  }
}
