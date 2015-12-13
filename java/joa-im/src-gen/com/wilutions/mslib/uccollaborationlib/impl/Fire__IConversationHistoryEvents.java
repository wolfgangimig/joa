/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IConversationHistoryEvents;

@SuppressWarnings("all")
public class Fire__IConversationHistoryEvents {
  public final static void onOnHistoryItemAdded(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversationHistory _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationHistoryItemAddedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationHistoryEvents.class, (l)->l.onOnHistoryItemAdded(_eventSource,_eventData));
  }
  public final static void onOnPreviousHistoryRetrievalStateChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversationHistory _eventSource, final com.wilutions.mslib.uccollaborationlib.IPreviousHistoryRetrievalStateChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationHistoryEvents.class, (l)->l.onOnPreviousHistoryRetrievalStateChanged(_eventSource,_eventData));
  }
  public final static void onOnHistoryActionAvailabilityChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversationHistory _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationHistoryActionAvailabilityEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationHistoryEvents.class, (l)->l.onOnHistoryActionAvailabilityChanged(_eventSource,_eventData));
  }
}
