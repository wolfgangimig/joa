/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.uccollaborationlib._IDeviceManagerEvents;

@SuppressWarnings("all")
public class Fire__IDeviceManagerEvents {
  public final static void onOnDeviceAdded(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IDeviceManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IDeviceCollectionEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IDeviceManagerEvents.class, (l)->l.onOnDeviceAdded(_eventSource,_eventData));
  }
  public final static void onOnDeviceRemoved(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IDeviceManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IDeviceCollectionEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IDeviceManagerEvents.class, (l)->l.onOnDeviceRemoved(_eventSource,_eventData));
  }
  public final static void onOnActiveAudioDeviceChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IDeviceManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IActiveAudioDeviceChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IDeviceManagerEvents.class, (l)->l.onOnActiveAudioDeviceChanged(_eventSource,_eventData));
  }
  public final static void onOnActiveVideoDeviceChanged(final IDispatch __joa__disp, final com.wilutions.mslib.uccollaborationlib.IDeviceManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IActiveVideoDeviceChangedEventData _eventData) throws ComException {
    assert(__joa__disp != null);
    assert(_eventSource != null);
    assert(_eventData != null);
    __joa__disp._fireEvent(_IDeviceManagerEvents.class, (l)->l.onOnActiveVideoDeviceChanged(_eventSource,_eventData));
  }
}
