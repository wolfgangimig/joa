/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IContactManagerEvents;

@SuppressWarnings("all")
public class Fire__IContactManagerEvents {
  public final static void onOnGroupAdded(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IContactManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupCollectionChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IContactManagerEvents.class, (l)->l.onOnGroupAdded(_eventSource,_eventData));
  }
  public final static void onOnGroupRemoved(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IContactManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupCollectionChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IContactManagerEvents.class, (l)->l.onOnGroupRemoved(_eventSource,_eventData));
  }
  public final static void onOnSearchProviderStateChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IContactManager _eventSource, final com.wilutions.mslib.uccollaborationlib.ISearchProviderStateChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IContactManagerEvents.class, (l)->l.onOnSearchProviderStateChanged(_eventSource,_eventData));
  }
}
