/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IDistributionGroupEvents;

@SuppressWarnings("all")
public class Fire__IDistributionGroupEvents {
  public final static void onOnNameChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupNameChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IDistributionGroupEvents.class, (l)->l.onOnNameChanged(_eventSource,_eventData));
  }
  public final static void onOnContactAdded(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupMemberChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IDistributionGroupEvents.class, (l)->l.onOnContactAdded(_eventSource,_eventData));
  }
  public final static void onOnContactRemoved(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupMemberChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IDistributionGroupEvents.class, (l)->l.onOnContactRemoved(_eventSource,_eventData));
  }
  public final static void onOnExpansionStateChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IDistributionGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IDistributionGroupExpansionStateChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IDistributionGroupEvents.class, (l)->l.onOnExpansionStateChanged(_eventSource,_eventData));
  }
  public final static void onOnNestedGroupAdded(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IDistributionGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupCollectionChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IDistributionGroupEvents.class, (l)->l.onOnNestedGroupAdded(_eventSource,_eventData));
  }
  public final static void onOnNestedGroupRemoved(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IDistributionGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupCollectionChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IDistributionGroupEvents.class, (l)->l.onOnNestedGroupRemoved(_eventSource,_eventData));
  }
  public final static void onOnDescriptionChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IDistributionGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IDescriptionChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IDistributionGroupEvents.class, (l)->l.onOnDescriptionChanged(_eventSource,_eventData));
  }
}
