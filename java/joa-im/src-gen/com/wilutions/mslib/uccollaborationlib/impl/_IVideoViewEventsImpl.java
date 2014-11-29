/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{F06EED90-BB18-9292-100A-688EEE538828}")
public class _IVideoViewEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IVideoViewEvents {
  @DeclDISPID(5120)  public void onOnInformationChanged(final com.wilutions.mslib.uccollaborationlib.IVideoView _eventSource, final com.wilutions.mslib.uccollaborationlib.IVideoViewInformationChangedEventData _eventData) throws ComException {
    this._dispatchCall(5120,"OnInformationChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IVideoViewEventsImpl(String progId) throws ComException {
    super(progId, "{30F974FB-1F7B-49D3-8DA4-01694BA474D2}");
  }
  protected _IVideoViewEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IVideoViewEventsImpl" + super.toString() + "]";
  }
}
