/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C6D4E3D0-607A-9050-39DA-73CCA70C2ABC}")
public class _ISelfEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._ISelfEvents {
  @DeclDISPID(1700)  public void onOnPhonesChanged(final com.wilutions.mslib.uccollaborationlib.ISelf _eventSource, final com.wilutions.mslib.uccollaborationlib.IPhonesChangedEventData _eventData) throws ComException {
    this._dispatchCall(1700,"OnPhonesChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1701)  public void onOnResiliencyModeChanged(final com.wilutions.mslib.uccollaborationlib.ISelf _eventSource, final com.wilutions.mslib.uccollaborationlib.IResiliencyModeChangedEventData _eventData) throws ComException {
    this._dispatchCall(1701,"OnResiliencyModeChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _ISelfEventsImpl(String progId) throws ComException {
    super(progId, "{06437ABB-C419-4B11-A474-1A2B02FBD646}");
  }
  protected _ISelfEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_ISelfEventsImpl" + super.toString() + "]";
  }
}
