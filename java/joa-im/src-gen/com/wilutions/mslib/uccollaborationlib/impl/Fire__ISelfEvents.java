/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._ISelfEvents;

@SuppressWarnings("all")
public class Fire__ISelfEvents {
  public final static void onOnPhonesChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.ISelf _eventSource, final com.wilutions.mslib.uccollaborationlib.IPhonesChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_ISelfEvents.class, (l)->l.onOnPhonesChanged(_eventSource,_eventData));
  }
  public final static void onOnResiliencyModeChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.ISelf _eventSource, final com.wilutions.mslib.uccollaborationlib.IResiliencyModeChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_ISelfEvents.class, (l)->l.onOnResiliencyModeChanged(_eventSource,_eventData));
  }
}
