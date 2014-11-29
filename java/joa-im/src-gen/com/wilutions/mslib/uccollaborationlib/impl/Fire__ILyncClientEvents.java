/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._ILyncClientEvents;

@SuppressWarnings("all")
public class Fire__ILyncClientEvents {
  public final static void onOnStateChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IClient _eventSource, final com.wilutions.mslib.uccollaborationlib.IClientStateChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_ILyncClientEvents.class, (l)->l.onOnStateChanged(_eventSource,_eventData));
  }
  public final static void onOnNotificationReceived(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.ILyncClient _eventSource, final com.wilutions.mslib.uccollaborationlib.ILyncClientNotificationReceivedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_ILyncClientEvents.class, (l)->l.onOnNotificationReceived(_eventSource,_eventData));
  }
  public final static void onOnCredentialRequested(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.ILyncClient _eventSource, final com.wilutions.mslib.uccollaborationlib.ICredentialRequestedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_ILyncClientEvents.class, (l)->l.onOnCredentialRequested(_eventSource,_eventData));
  }
  public final static void onOnSignInDelayed(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.ILyncClient _eventSource, final com.wilutions.mslib.uccollaborationlib.ISignInDelayedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_ILyncClientEvents.class, (l)->l.onOnSignInDelayed(_eventSource,_eventData));
  }
  public final static void onOnCapabilitiesChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.ILyncClient _eventSource, final com.wilutions.mslib.uccollaborationlib.IPreferredCapabilitiesChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_ILyncClientEvents.class, (l)->l.onOnCapabilitiesChanged(_eventSource,_eventData));
  }
  public final static void onOnDelegatorClientAdded(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.ILyncClient _eventSource, final com.wilutions.mslib.uccollaborationlib.IDelegatorClientCollectionEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_ILyncClientEvents.class, (l)->l.onOnDelegatorClientAdded(_eventSource,_eventData));
  }
  public final static void onOnDelegatorClientRemoved(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.ILyncClient _eventSource, final com.wilutions.mslib.uccollaborationlib.IDelegatorClientCollectionEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_ILyncClientEvents.class, (l)->l.onOnDelegatorClientRemoved(_eventSource,_eventData));
  }
}
