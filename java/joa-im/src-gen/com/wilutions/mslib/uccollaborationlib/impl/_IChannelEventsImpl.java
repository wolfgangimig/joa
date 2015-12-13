/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{CC3E2383-794B-9268-358F-24E754E5FF36}")
public class _IChannelEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IChannelEvents {
  @DeclDISPID(1300)  public void onOnStateChanged(final com.wilutions.mslib.uccollaborationlib.IChannel _eventSource, final com.wilutions.mslib.uccollaborationlib.IChannelStateChangedEventData _eventData) throws ComException {
    this._dispatchCall(1300,"OnStateChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1301)  public void onOnActionAvailabilityChanged(final com.wilutions.mslib.uccollaborationlib.IChannel _eventSource, final com.wilutions.mslib.uccollaborationlib.IChannelActionAvailabilityEventData _eventData) throws ComException {
    this._dispatchCall(1301,"OnActionAvailabilityChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IChannelEventsImpl(String progId) throws ComException {
    super(progId, "{0CA9BAE8-DD28-4929-A821-4D00F11203CC}");
  }
  protected _IChannelEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IChannelEventsImpl" + super.toString() + "]";
  }
}
