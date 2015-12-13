/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{6C4564D2-3C8E-99C2-3746-553E2C1C2554}")
public class _IAVModalityEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IAVModalityEvents {
  @DeclDISPID(1201)  public void onOnModalityStateChanged(final com.wilutions.mslib.uccollaborationlib.IModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IModalityStateChangedEventData _eventData) throws ComException {
    this._dispatchCall(1201,"OnModalityStateChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1200)  public void onOnAVModalityPropertyChanged(final com.wilutions.mslib.uccollaborationlib.IAVModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IModalityPropertyChangedEventData _eventData) throws ComException {
    this._dispatchCall(1200,"OnAVModalityPropertyChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1250)  public void onOnIsContributingChanged(final com.wilutions.mslib.uccollaborationlib.IAVModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IIsContributingChangedEventData _eventData) throws ComException {
    this._dispatchCall(1250,"OnIsContributingChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1251)  public void onOnStreamStateChanged(final com.wilutions.mslib.uccollaborationlib.IAVModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IStreamStateChangedEventData _eventData) throws ComException {
    this._dispatchCall(1251,"OnStreamStateChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1204)  public void onOnActionAvailabilityChanged(final com.wilutions.mslib.uccollaborationlib.IModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IModalityActionAvailabilityChangedEventData _eventData) throws ComException {
    this._dispatchCall(1204,"OnActionAvailabilityChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IAVModalityEventsImpl(String progId) throws ComException {
    super(progId, "{ACD2FDB9-98ED-4283-AAE8-3CD989EBD9AE}");
  }
  protected _IAVModalityEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IAVModalityEventsImpl" + super.toString() + "]";
  }
}
