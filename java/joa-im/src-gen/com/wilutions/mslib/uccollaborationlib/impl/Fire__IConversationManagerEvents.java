/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IConversationManagerEvents;

@SuppressWarnings("all")
public class Fire__IConversationManagerEvents {
  public final static void onOnConversationAdded(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversationManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationManagerEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationManagerEvents.class, (l)->l.onOnConversationAdded(_eventSource,_eventData));
  }
  public final static void onOnConversationRemoved(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversationManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationManagerEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationManagerEvents.class, (l)->l.onOnConversationRemoved(_eventSource,_eventData));
  }
  public final static void onOnSummarizerStatesChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversationManager _eventSource, final com.wilutions.mslib.uccollaborationlib.ISummarizerStatesChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationManagerEvents.class, (l)->l.onOnSummarizerStatesChanged(_eventSource,_eventData));
  }
}
