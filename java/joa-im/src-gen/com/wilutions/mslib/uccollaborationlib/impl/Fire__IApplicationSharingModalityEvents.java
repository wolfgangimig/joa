/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IApplicationSharingModalityEvents;

@SuppressWarnings("all")
public class Fire__IApplicationSharingModalityEvents {
  public final static void onOnModalityStateChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IModalityStateChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IApplicationSharingModalityEvents.class, (l)->l.onOnModalityStateChanged(_eventSource,_eventData));
  }
  public final static void onOnActionAvailabilityChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IModalityActionAvailabilityChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IApplicationSharingModalityEvents.class, (l)->l.onOnActionAvailabilityChanged(_eventSource,_eventData));
  }
  public final static void onOnLocalSharedResourcesChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IApplicationSharingModality eventSource, final com.wilutions.mslib.uccollaborationlib.ILocalSharedResourcesChangedEventData eventData) throws ComException {
    assert(__joa__disp != null);
    assert(eventSource != null);
    assert(eventData != null);
    __joa__disp._fireEvent(_IApplicationSharingModalityEvents.class, (l)->l.onOnLocalSharedResourcesChanged(eventSource,eventData));
  }
  public final static void onOnParticipationStateChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IApplicationSharingModality eventSource, final com.wilutions.mslib.uccollaborationlib.IParticipationStateChangedEventData eventData) throws ComException {
    assert(__joa__disp != null);
    assert(eventSource != null);
    assert(eventData != null);
    __joa__disp._fireEvent(_IApplicationSharingModalityEvents.class, (l)->l.onOnParticipationStateChanged(eventSource,eventData));
  }
  public final static void onOnControlRequestReceived(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IApplicationSharingModality eventSource, final com.wilutions.mslib.uccollaborationlib.IControlRequestReceivedEventData eventData) throws ComException {
    assert(__joa__disp != null);
    assert(eventSource != null);
    assert(eventData != null);
    __joa__disp._fireEvent(_IApplicationSharingModalityEvents.class, (l)->l.onOnControlRequestReceived(eventSource,eventData));
  }
  public final static void onOnControllerChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IApplicationSharingModality eventSource, final com.wilutions.mslib.uccollaborationlib.IControllerChangedEventData eventData) throws ComException {
    assert(__joa__disp != null);
    assert(eventSource != null);
    assert(eventData != null);
    __joa__disp._fireEvent(_IApplicationSharingModalityEvents.class, (l)->l.onOnControllerChanged(eventSource,eventData));
  }
  public final static void onOnSharerChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IApplicationSharingModality eventSource, final com.wilutions.mslib.uccollaborationlib.ISharerChangedEventData eventData) throws ComException {
    assert(__joa__disp != null);
    assert(eventSource != null);
    assert(eventData != null);
    __joa__disp._fireEvent(_IApplicationSharingModalityEvents.class, (l)->l.onOnSharerChanged(eventSource,eventData));
  }
  public final static void onOnApplicationSharingModalityPropertyChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IApplicationSharingModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IModalityPropertyChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IApplicationSharingModalityEvents.class, (l)->l.onOnApplicationSharingModalityPropertyChanged(_eventSource,_eventData));
  }
}
