/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{598FFE56-E917-9A8E-15EE-BD7EC6625FB6}")
public class _IGroupEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IGroupEvents {
  @DeclDISPID(500)  public void onOnNameChanged(com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, com.wilutions.mslib.uccollaborationlib.IGroupNameChangedEventData _eventData) throws ComException {
    this._dispatchCall(500,"OnNameChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(501)  public void onOnContactAdded(com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, com.wilutions.mslib.uccollaborationlib.IGroupMemberChangedEventData _eventData) throws ComException {
    this._dispatchCall(501,"OnContactAdded", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(502)  public void onOnContactRemoved(com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, com.wilutions.mslib.uccollaborationlib.IGroupMemberChangedEventData _eventData) throws ComException {
    this._dispatchCall(502,"OnContactRemoved", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IGroupEventsImpl(String progId) throws ComException {
    super(progId, "{9918673D-4D74-41CF-8840-D4996395A34C}");
  }
  protected _IGroupEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IGroupEventsImpl" + super.toString() + "]";
  }
}
