/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IClientSettingsEvents;

@SuppressWarnings("all")
public class Fire__IClientSettingsEvents {
  public final static void onOnSettingChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IClientSettings _eventSource, final com.wilutions.mslib.uccollaborationlib.IClientSettingsChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IClientSettingsEvents.class, (l)->l.onOnSettingChanged(_eventSource,_eventData));
  }
}
