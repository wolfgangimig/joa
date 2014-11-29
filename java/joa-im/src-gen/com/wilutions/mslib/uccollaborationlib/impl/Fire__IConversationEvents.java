/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IConversationEvents;

@SuppressWarnings("all")
public class Fire__IConversationEvents {
  public final static void onOnStateChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationStateChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationEvents.class, (l)->l.onOnStateChanged(_eventSource,_eventData));
  }
  public final static void onOnPropertyChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationPropertyChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationEvents.class, (l)->l.onOnPropertyChanged(_eventSource,_eventData));
  }
  public final static void onOnParticipantAdded(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IParticipantCollectionChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationEvents.class, (l)->l.onOnParticipantAdded(_eventSource,_eventData));
  }
  public final static void onOnParticipantRemoved(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IParticipantCollectionChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationEvents.class, (l)->l.onOnParticipantRemoved(_eventSource,_eventData));
  }
  public final static void onOnActionAvailabilityChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationActionAvailabilityEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationEvents.class, (l)->l.onOnActionAvailabilityChanged(_eventSource,_eventData));
  }
  public final static void onOnConversationContextAdded(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationContextCollectionEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationEvents.class, (l)->l.onOnConversationContextAdded(_eventSource,_eventData));
  }
  public final static void onOnConversationContextRemoved(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationContextCollectionEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationEvents.class, (l)->l.onOnConversationContextRemoved(_eventSource,_eventData));
  }
  public final static void onOnConversationContextLinkClicked(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IInitialContextEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationEvents.class, (l)->l.onOnConversationContextLinkClicked(_eventSource,_eventData));
  }
  public final static void onOnInitialContextReceived(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IInitialContextEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationEvents.class, (l)->l.onOnInitialContextReceived(_eventSource,_eventData));
  }
  public final static void onOnInitialContextSent(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IInitialContextEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationEvents.class, (l)->l.onOnInitialContextSent(_eventSource,_eventData));
  }
  public final static void onOnContextDataReceived(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IContextEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationEvents.class, (l)->l.onOnContextDataReceived(_eventSource,_eventData));
  }
  public final static void onOnContextDataSent(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IContextEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IConversationEvents.class, (l)->l.onOnContextDataSent(_eventSource,_eventData));
  }
}
