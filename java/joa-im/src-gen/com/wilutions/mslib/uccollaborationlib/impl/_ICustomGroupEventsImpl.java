/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{378E741E-13DE-9E92-0D39-4CA2ACD593DA}")
public class _ICustomGroupEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._ICustomGroupEvents {
  @DeclDISPID(500)  public void onOnNameChanged(final com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupNameChangedEventData _eventData) throws ComException {
    this._dispatchCall(500,"OnNameChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(501)  public void onOnContactAdded(final com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupMemberChangedEventData _eventData) throws ComException {
    this._dispatchCall(501,"OnContactAdded", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(502)  public void onOnContactRemoved(final com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupMemberChangedEventData _eventData) throws ComException {
    this._dispatchCall(502,"OnContactRemoved", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _ICustomGroupEventsImpl(String progId) throws ComException {
    super(progId, "{F719ED75-B7BD-45D3-9097-254509226F20}");
  }
  protected _ICustomGroupEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_ICustomGroupEventsImpl" + super.toString() + "]";
  }
}
