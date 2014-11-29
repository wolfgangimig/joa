/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IContactEvents;

@SuppressWarnings("all")
public class Fire__IContactEvents {
  public final static void onOnContactInformationChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IContact _eventSource, final com.wilutions.mslib.uccollaborationlib.IContactInformationChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IContactEvents.class, (l)->l.onOnContactInformationChanged(_eventSource,_eventData));
  }
  public final static void onOnSettingChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IContact _eventSource, final com.wilutions.mslib.uccollaborationlib.IContactSettingChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IContactEvents.class, (l)->l.onOnSettingChanged(_eventSource,_eventData));
  }
  public final static void onOnUriChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IContact _eventSource, final com.wilutions.mslib.uccollaborationlib.IUriChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IContactEvents.class, (l)->l.onOnUriChanged(_eventSource,_eventData));
  }
}
