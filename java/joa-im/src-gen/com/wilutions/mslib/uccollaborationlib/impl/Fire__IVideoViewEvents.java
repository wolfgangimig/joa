/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IVideoViewEvents;

@SuppressWarnings("all")
public class Fire__IVideoViewEvents {
  public final static void onOnInformationChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IVideoView _eventSource, final com.wilutions.mslib.uccollaborationlib.IVideoViewInformationChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IVideoViewEvents.class, (l)->l.onOnInformationChanged(_eventSource,_eventData));
  }
}
