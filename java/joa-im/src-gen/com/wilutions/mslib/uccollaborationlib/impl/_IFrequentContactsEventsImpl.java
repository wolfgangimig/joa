/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{6A8FF5F9-BC7D-9A3E-2CFE-954756901C06}")
public class _IFrequentContactsEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IFrequentContactsEvents {
  @DeclDISPID(500)  public void onOnNameChanged(com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, com.wilutions.mslib.uccollaborationlib.IGroupNameChangedEventData _eventData) throws ComException {
    this._dispatchCall(500,"OnNameChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(501)  public void onOnContactAdded(com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, com.wilutions.mslib.uccollaborationlib.IGroupMemberChangedEventData _eventData) throws ComException {
    this._dispatchCall(501,"OnContactAdded", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(502)  public void onOnContactRemoved(com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, com.wilutions.mslib.uccollaborationlib.IGroupMemberChangedEventData _eventData) throws ComException {
    this._dispatchCall(502,"OnContactRemoved", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(504)  public void onOnContactPositionChanged(com.wilutions.mslib.uccollaborationlib.IFrequentContacts _eventSource, com.wilutions.mslib.uccollaborationlib.IContactPositionChangedEventData _eventData) throws ComException {
    this._dispatchCall(504,"OnContactPositionChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IFrequentContactsEventsImpl(String progId) throws ComException {
    super(progId, "{AA186C92-181E-417F-B150-FCA0F367E0FC}");
  }
  protected _IFrequentContactsEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IFrequentContactsEventsImpl" + super.toString() + "]";
  }
}
