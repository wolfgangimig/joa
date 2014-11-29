/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{7E95F5B9-DAE1-943D-1ACC-9F578ABE9D8E}")
public class _IApplicationSharingModalityEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IApplicationSharingModalityEvents {
  @DeclDISPID(1201)  public void onOnModalityStateChanged(com.wilutions.mslib.uccollaborationlib.IModality _eventSource, com.wilutions.mslib.uccollaborationlib.IModalityStateChangedEventData _eventData) throws ComException {
    this._dispatchCall(1201,"OnModalityStateChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1204)  public void onOnActionAvailabilityChanged(com.wilutions.mslib.uccollaborationlib.IModality _eventSource, com.wilutions.mslib.uccollaborationlib.IModalityActionAvailabilityChangedEventData _eventData) throws ComException {
    this._dispatchCall(1204,"OnActionAvailabilityChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1432)  public void onOnLocalSharedResourcesChanged(com.wilutions.mslib.uccollaborationlib.IApplicationSharingModality eventSource, com.wilutions.mslib.uccollaborationlib.ILocalSharedResourcesChangedEventData eventData) throws ComException {
    this._dispatchCall(1432,"OnLocalSharedResourcesChanged", DISPATCH_METHOD,null,(eventSource!=null?eventSource:Dispatch.NULL),(eventData!=null?eventData:Dispatch.NULL));
  }
  @DeclDISPID(1430)  public void onOnParticipationStateChanged(com.wilutions.mslib.uccollaborationlib.IApplicationSharingModality eventSource, com.wilutions.mslib.uccollaborationlib.IParticipationStateChangedEventData eventData) throws ComException {
    this._dispatchCall(1430,"OnParticipationStateChanged", DISPATCH_METHOD,null,(eventSource!=null?eventSource:Dispatch.NULL),(eventData!=null?eventData:Dispatch.NULL));
  }
  @DeclDISPID(1431)  public void onOnControlRequestReceived(com.wilutions.mslib.uccollaborationlib.IApplicationSharingModality eventSource, com.wilutions.mslib.uccollaborationlib.IControlRequestReceivedEventData eventData) throws ComException {
    this._dispatchCall(1431,"OnControlRequestReceived", DISPATCH_METHOD,null,(eventSource!=null?eventSource:Dispatch.NULL),(eventData!=null?eventData:Dispatch.NULL));
  }
  @DeclDISPID(1433)  public void onOnControllerChanged(com.wilutions.mslib.uccollaborationlib.IApplicationSharingModality eventSource, com.wilutions.mslib.uccollaborationlib.IControllerChangedEventData eventData) throws ComException {
    this._dispatchCall(1433,"OnControllerChanged", DISPATCH_METHOD,null,(eventSource!=null?eventSource:Dispatch.NULL),(eventData!=null?eventData:Dispatch.NULL));
  }
  @DeclDISPID(1434)  public void onOnSharerChanged(com.wilutions.mslib.uccollaborationlib.IApplicationSharingModality eventSource, com.wilutions.mslib.uccollaborationlib.ISharerChangedEventData eventData) throws ComException {
    this._dispatchCall(1434,"OnSharerChanged", DISPATCH_METHOD,null,(eventSource!=null?eventSource:Dispatch.NULL),(eventData!=null?eventData:Dispatch.NULL));
  }
  @DeclDISPID(1200)  public void onOnApplicationSharingModalityPropertyChanged(com.wilutions.mslib.uccollaborationlib.IApplicationSharingModality _eventSource, com.wilutions.mslib.uccollaborationlib.IModalityPropertyChangedEventData _eventData) throws ComException {
    this._dispatchCall(1200,"OnApplicationSharingModalityPropertyChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IApplicationSharingModalityEventsImpl(String progId) throws ComException {
    super(progId, "{BE026CD2-7E82-4F7C-8762-F6B02F496174}");
  }
  protected _IApplicationSharingModalityEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IApplicationSharingModalityEventsImpl" + super.toString() + "]";
  }
}
