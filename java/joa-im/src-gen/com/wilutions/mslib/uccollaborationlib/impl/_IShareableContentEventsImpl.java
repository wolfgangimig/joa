/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{ABC285F5-7AE2-9A9E-3D00-50170AE629F2}")
public class _IShareableContentEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IShareableContentEvents {
  @DeclDISPID(5090)  public void onOnStateChanged(com.wilutions.mslib.uccollaborationlib.IShareableContent _eventSource, com.wilutions.mslib.uccollaborationlib.IShareableContentStateChangedEventData _eventData) throws ComException {
    this._dispatchCall(5090,"OnStateChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(5091)  public void onOnPropertyChanged(com.wilutions.mslib.uccollaborationlib.IShareableContent _eventSource, com.wilutions.mslib.uccollaborationlib.IShareableContentPropertyChangedEventData _eventData) throws ComException {
    this._dispatchCall(5091,"OnPropertyChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(5092)  public void onOnActionAvailabilityChanged(com.wilutions.mslib.uccollaborationlib.IShareableContent _eventSource, com.wilutions.mslib.uccollaborationlib.IShareableContentActionAvailabilityChangedEventData _eventData) throws ComException {
    this._dispatchCall(5092,"OnActionAvailabilityChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IShareableContentEventsImpl(String progId) throws ComException {
    super(progId, "{6B551C9E-DE81-41DF-A0AE-39F0AF11D508}");
  }
  protected _IShareableContentEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IShareableContentEventsImpl" + super.toString() + "]";
  }
}
