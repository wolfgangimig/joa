/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C18CAB67-3EA2-969F-283B-54E7B1B0D2D5}")
public class _IRecentContactsEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IRecentContactsEvents {
  @DeclDISPID(500)  public void onOnNameChanged(final com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupNameChangedEventData _eventData) throws ComException {
    this._dispatchCall(500,"OnNameChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(501)  public void onOnContactAdded(final com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupMemberChangedEventData _eventData) throws ComException {
    this._dispatchCall(501,"OnContactAdded", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(502)  public void onOnContactRemoved(final com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupMemberChangedEventData _eventData) throws ComException {
    this._dispatchCall(502,"OnContactRemoved", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IRecentContactsEventsImpl(String progId) throws ComException {
    super(progId, "{011B320C-9AC1-4DDE-B595-3D0014472E2F}");
  }
  protected _IRecentContactsEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IRecentContactsEventsImpl" + super.toString() + "]";
  }
}
