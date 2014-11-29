/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{8F73D922-EA27-9A48-2F9A-27A959E4A67C}")
public class _IInstantMessageModalityEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IInstantMessageModalityEvents {
  @DeclDISPID(1201)  public void onOnModalityStateChanged(com.wilutions.mslib.uccollaborationlib.IModality _eventSource, com.wilutions.mslib.uccollaborationlib.IModalityStateChangedEventData _eventData) throws ComException {
    this._dispatchCall(1201,"OnModalityStateChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1200)  public void onOnInstantMessagePropertyChanged(com.wilutions.mslib.uccollaborationlib.IInstantMessageModality _eventSource, com.wilutions.mslib.uccollaborationlib.IModalityPropertyChangedEventData _eventData) throws ComException {
    this._dispatchCall(1200,"OnInstantMessagePropertyChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1202)  public void onOnInstantMessageReceived(com.wilutions.mslib.uccollaborationlib.IInstantMessageModality _eventSource, com.wilutions.mslib.uccollaborationlib.IMessageSentEventData _eventData) throws ComException {
    this._dispatchCall(1202,"OnInstantMessageReceived", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1203)  public void onOnIsTypingChanged(com.wilutions.mslib.uccollaborationlib.IInstantMessageModality _eventSource, com.wilutions.mslib.uccollaborationlib.IIsTypingChangedEventData _eventData) throws ComException {
    this._dispatchCall(1203,"OnIsTypingChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1204)  public void onOnActionAvailabilityChanged(com.wilutions.mslib.uccollaborationlib.IModality _eventSource, com.wilutions.mslib.uccollaborationlib.IModalityActionAvailabilityChangedEventData _eventData) throws ComException {
    this._dispatchCall(1204,"OnActionAvailabilityChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IInstantMessageModalityEventsImpl(String progId) throws ComException {
    super(progId, "{4FE44049-4E44-4109-B234-4E4EFC135A86}");
  }
  protected _IInstantMessageModalityEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IInstantMessageModalityEventsImpl" + super.toString() + "]";
  }
}
