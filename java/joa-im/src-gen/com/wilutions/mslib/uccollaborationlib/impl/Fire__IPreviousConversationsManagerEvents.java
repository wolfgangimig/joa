/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IPreviousConversationsManagerEvents;

@SuppressWarnings("all")
public class Fire__IPreviousConversationsManagerEvents {
  public final static void onOnConnectionStateChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManagerConnectionStateChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IPreviousConversationsManagerEvents.class, (l)->l.onOnConnectionStateChanged(_eventSource,_eventData));
  }
  public final static void onOnNewItemCountSinceLastResetChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManagerNewItemCountChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IPreviousConversationsManagerEvents.class, (l)->l.onOnNewItemCountSinceLastResetChanged(_eventSource,_eventData));
  }
  public final static void onOnItemsAdded(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IPreviousConversationBatchEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IPreviousConversationsManagerEvents.class, (l)->l.onOnItemsAdded(_eventSource,_eventData));
  }
  public final static void onOnItemsRemoved(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IPreviousConversationBatchEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IPreviousConversationsManagerEvents.class, (l)->l.onOnItemsRemoved(_eventSource,_eventData));
  }
  public final static void onOnItemsModified(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IPreviousConversationBatchEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IPreviousConversationsManagerEvents.class, (l)->l.onOnItemsModified(_eventSource,_eventData));
  }
}
