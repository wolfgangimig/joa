/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IAccessPermissionEvents;

@SuppressWarnings("all")
public class Fire__IAccessPermissionEvents {
  public final static void onOnAccessEntryAdded(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IAccessPermission _eventSource, final com.wilutions.mslib.uccollaborationlib.IAccessEntryCollectionChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IAccessPermissionEvents.class, (l)->l.onOnAccessEntryAdded(_eventSource,_eventData));
  }
  public final static void onOnAccessEntryRemoved(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IAccessPermission _eventSource, final com.wilutions.mslib.uccollaborationlib.IAccessEntryCollectionChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IAccessPermissionEvents.class, (l)->l.onOnAccessEntryRemoved(_eventSource,_eventData));
  }
}
