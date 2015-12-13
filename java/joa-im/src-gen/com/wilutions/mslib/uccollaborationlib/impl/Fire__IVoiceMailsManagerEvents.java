/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IVoiceMailsManagerEvents;

@SuppressWarnings("all")
public class Fire__IVoiceMailsManagerEvents {
  public final static void onOnConnectionStateChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IVoiceMailsManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManagerConnectionStateChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IVoiceMailsManagerEvents.class, (l)->l.onOnConnectionStateChanged(_eventSource,_eventData));
  }
  public final static void onOnNewVoiceMailCountSinceLastResetChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IVoiceMailsManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManagerNewItemCountChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IVoiceMailsManagerEvents.class, (l)->l.onOnNewVoiceMailCountSinceLastResetChanged(_eventSource,_eventData));
  }
  public final static void onOnVoiceMailsAdded(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IVoiceMailsManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IVoiceMailBatchEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IVoiceMailsManagerEvents.class, (l)->l.onOnVoiceMailsAdded(_eventSource,_eventData));
  }
  public final static void onOnVoiceMailsRemoved(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IVoiceMailsManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IVoiceMailBatchEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IVoiceMailsManagerEvents.class, (l)->l.onOnVoiceMailsRemoved(_eventSource,_eventData));
  }
  public final static void onOnVoiceMailsModified(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IVoiceMailsManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IVoiceMailBatchEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IVoiceMailsManagerEvents.class, (l)->l.onOnVoiceMailsModified(_eventSource,_eventData));
  }
}
