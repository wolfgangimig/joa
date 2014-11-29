/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IRoomEvents;

@SuppressWarnings("all")
public class Fire__IRoomEvents {
  public final static void onOnPropertyChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IRoom _eventSource, final com.wilutions.mslib.uccollaborationlib.IRoomPropertyChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IRoomEvents.class, (l)->l.onOnPropertyChanged(_eventSource,_eventData));
  }
  public final static void onOnUnreadMessageCountChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IRoom _eventSource, final com.wilutions.mslib.uccollaborationlib.IUnreadMessageCountChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IRoomEvents.class, (l)->l.onOnUnreadMessageCountChanged(_eventSource,_eventData));
  }
  public final static void onOnIsSendingMessage(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IRoom _eventSource, final com.wilutions.mslib.uccollaborationlib.IRoomMessageEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IRoomEvents.class, (l)->l.onOnIsSendingMessage(_eventSource,_eventData));
  }
  public final static void onOnMessagesReceived(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IRoom _eventSource, final com.wilutions.mslib.uccollaborationlib.IRoomMessagesEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IRoomEvents.class, (l)->l.onOnMessagesReceived(_eventSource,_eventData));
  }
  public final static void onOnParticipantAdded(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IRoom _eventSource, final com.wilutions.mslib.uccollaborationlib.IRoomParticipantsEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IRoomEvents.class, (l)->l.onOnParticipantAdded(_eventSource,_eventData));
  }
  public final static void onOnParticipantRemoved(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IRoom _eventSource, final com.wilutions.mslib.uccollaborationlib.IRoomParticipantsEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IRoomEvents.class, (l)->l.onOnParticipantRemoved(_eventSource,_eventData));
  }
  public final static void onOnJoinStateChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IRoom _eventSource, final com.wilutions.mslib.uccollaborationlib.IRoomJoinStateChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IRoomEvents.class, (l)->l.onOnJoinStateChanged(_eventSource,_eventData));
  }
}
