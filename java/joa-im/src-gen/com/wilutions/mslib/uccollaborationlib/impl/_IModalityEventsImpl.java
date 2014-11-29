/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{D041F252-FA28-97D9-3768-B9A22A1CE721}")
public class _IModalityEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IModalityEvents {
  @DeclDISPID(1201)  public void onOnModalityStateChanged(com.wilutions.mslib.uccollaborationlib.IModality _eventSource, com.wilutions.mslib.uccollaborationlib.IModalityStateChangedEventData _eventData) throws ComException {
    this._dispatchCall(1201,"OnModalityStateChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1204)  public void onOnActionAvailabilityChanged(com.wilutions.mslib.uccollaborationlib.IModality _eventSource, com.wilutions.mslib.uccollaborationlib.IModalityActionAvailabilityChangedEventData _eventData) throws ComException {
    this._dispatchCall(1204,"OnActionAvailabilityChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IModalityEventsImpl(String progId) throws ComException {
    super(progId, "{10D66B39-5E4B-4C98-AAC6-D0458FEB1BDB}");
  }
  protected _IModalityEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IModalityEventsImpl" + super.toString() + "]";
  }
}
