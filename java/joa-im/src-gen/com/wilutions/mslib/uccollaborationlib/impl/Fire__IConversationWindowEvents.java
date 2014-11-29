/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IConversationWindowEvents;

@SuppressWarnings("all")
public class Fire__IConversationWindowEvents {
  public final static void onOnNeedsSizeChange(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversationWindow _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationWindowNeedsSizeChangeEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationWindowEvents.class, (l)->l.onOnNeedsSizeChange(_eventSource,_eventData));
  }
  public final static void onOnNeedsAttention(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversationWindow _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationWindowNeedsAttentionEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationWindowEvents.class, (l)->l.onOnNeedsAttention(_eventSource,_eventData));
  }
}
