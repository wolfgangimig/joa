/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._ISelf2Events;

@SuppressWarnings("all")
public class Fire__ISelf2Events {
  public final static void onOnAlertLevelChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.ISelf _eventSource, final com.wilutions.mslib.uccollaborationlib.IAlertLevelChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_ISelf2Events.class, (l)->l.onOnAlertLevelChanged(_eventSource,_eventData));
  }
}
