/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IShareableContentEvents;

@SuppressWarnings("all")
public class Fire__IShareableContentEvents {
  public final static void onOnStateChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IShareableContent _eventSource, final com.wilutions.mslib.uccollaborationlib.IShareableContentStateChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IShareableContentEvents.class, (l)->l.onOnStateChanged(_eventSource,_eventData));
  }
  public final static void onOnPropertyChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IShareableContent _eventSource, final com.wilutions.mslib.uccollaborationlib.IShareableContentPropertyChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IShareableContentEvents.class, (l)->l.onOnPropertyChanged(_eventSource,_eventData));
  }
  public final static void onOnActionAvailabilityChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IShareableContent _eventSource, final com.wilutions.mslib.uccollaborationlib.IShareableContentActionAvailabilityChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IShareableContentEvents.class, (l)->l.onOnActionAvailabilityChanged(_eventSource,_eventData));
  }
}
