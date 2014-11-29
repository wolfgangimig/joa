/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{4EE47E8A-34AD-967A-2819-180FDED9775F}")
public class _IRoomUserEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IRoomUserEvents {
  @DeclDISPID(4240)  public void onOnCanSendMessageChanged(com.wilutions.mslib.uccollaborationlib.IRoomUser _eventSource, com.wilutions.mslib.uccollaborationlib.IRoomUserChangedEventData _eventData) throws ComException {
    this._dispatchCall(4240,"OnCanSendMessageChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IRoomUserEventsImpl(String progId) throws ComException {
    super(progId, "{8E73E7E1-90CE-4D3B-B5B7-71E87B2E8BA5}");
  }
  protected _IRoomUserEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IRoomUserEventsImpl" + super.toString() + "]";
  }
}
