/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IContentSharingModalityEvents;

@SuppressWarnings("all")
public class Fire__IContentSharingModalityEvents {
  public final static void onOnModalityStateChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IModalityStateChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IContentSharingModalityEvents.class, (l)->l.onOnModalityStateChanged(_eventSource,_eventData));
  }
  public final static void onOnActionAvailabilityChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IModalityActionAvailabilityChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IContentSharingModalityEvents.class, (l)->l.onOnActionAvailabilityChanged(_eventSource,_eventData));
  }
  public final static void onOnContentAdded(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IContentSharingModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IContentCollectionChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IContentSharingModalityEvents.class, (l)->l.onOnContentAdded(_eventSource,_eventData));
  }
  public final static void onOnContentRemoved(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IContentSharingModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IContentCollectionChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IContentSharingModalityEvents.class, (l)->l.onOnContentRemoved(_eventSource,_eventData));
  }
  public final static void onOnActivePresenterChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IContentSharingModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IActivePresenterChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IContentSharingModalityEvents.class, (l)->l.onOnActivePresenterChanged(_eventSource,_eventData));
  }
  public final static void onOnActiveContentChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IContentSharingModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IActiveContentChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IContentSharingModalityEvents.class, (l)->l.onOnActiveContentChanged(_eventSource,_eventData));
  }
}
