/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{A4C18A1A-D3C1-9095-34A7-8F3914423A35}")
public class _IClientEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IClientEvents {
  @DeclDISPID(100)  public void onOnStateChanged(com.wilutions.mslib.uccollaborationlib.IClient _eventSource, com.wilutions.mslib.uccollaborationlib.IClientStateChangedEventData _eventData) throws ComException {
    this._dispatchCall(100,"OnStateChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IClientEventsImpl(String progId) throws ComException {
    super(progId, "{64561371-77A2-4BD4-A909-E6DEB1B5C6CF}");
  }
  protected _IClientEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IClientEventsImpl" + super.toString() + "]";
  }
}
