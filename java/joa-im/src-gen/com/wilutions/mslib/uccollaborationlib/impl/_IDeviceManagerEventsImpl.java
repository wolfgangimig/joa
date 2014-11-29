/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{8A3EA3C3-2DEF-9EAF-13F2-7361D66CC36C}")
public class _IDeviceManagerEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IDeviceManagerEvents {
  @DeclDISPID(650)  public void onOnDeviceAdded(com.wilutions.mslib.uccollaborationlib.IDeviceManager _eventSource, com.wilutions.mslib.uccollaborationlib.IDeviceCollectionEventData _eventData) throws ComException {
    this._dispatchCall(650,"OnDeviceAdded", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(651)  public void onOnDeviceRemoved(com.wilutions.mslib.uccollaborationlib.IDeviceManager _eventSource, com.wilutions.mslib.uccollaborationlib.IDeviceCollectionEventData _eventData) throws ComException {
    this._dispatchCall(651,"OnDeviceRemoved", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(652)  public void onOnActiveAudioDeviceChanged(com.wilutions.mslib.uccollaborationlib.IDeviceManager _eventSource, com.wilutions.mslib.uccollaborationlib.IActiveAudioDeviceChangedEventData _eventData) throws ComException {
    this._dispatchCall(652,"OnActiveAudioDeviceChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(653)  public void onOnActiveVideoDeviceChanged(com.wilutions.mslib.uccollaborationlib.IDeviceManager _eventSource, com.wilutions.mslib.uccollaborationlib.IActiveVideoDeviceChangedEventData _eventData) throws ComException {
    this._dispatchCall(653,"OnActiveVideoDeviceChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IDeviceManagerEventsImpl(String progId) throws ComException {
    super(progId, "{4AA93AA8-898C-45EE-8E5C-1A86739B3F96}");
  }
  protected _IDeviceManagerEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IDeviceManagerEventsImpl" + super.toString() + "]";
  }
}
