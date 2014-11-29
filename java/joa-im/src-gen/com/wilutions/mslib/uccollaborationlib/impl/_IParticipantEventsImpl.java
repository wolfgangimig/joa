/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{AA0FF236-418F-98D4-3083-678512DA5B8C}")
public class _IParticipantEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IParticipantEvents {
  @DeclDISPID(1100)  public void onOnPropertyChanged(com.wilutions.mslib.uccollaborationlib.IParticipant _eventSource, com.wilutions.mslib.uccollaborationlib.IParticipantPropertyChangedEventData _eventData) throws ComException {
    this._dispatchCall(1100,"OnPropertyChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1101)  public void onOnIsMutedChanged(com.wilutions.mslib.uccollaborationlib.IParticipant _eventSource, com.wilutions.mslib.uccollaborationlib.IMutedChangedEventData _eventData) throws ComException {
    this._dispatchCall(1101,"OnIsMutedChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1102)  public void onOnActionAvailabilityChanged(com.wilutions.mslib.uccollaborationlib.IParticipant _eventSource, com.wilutions.mslib.uccollaborationlib.IParticipantActionAvailabilityChangedEventData _eventData) throws ComException {
    this._dispatchCall(1102,"OnActionAvailabilityChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IParticipantEventsImpl(String progId) throws ComException {
    super(progId, "{6A986B5D-E5EC-4395-AD2D-0E62B72DA776}");
  }
  protected _IParticipantEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IParticipantEventsImpl" + super.toString() + "]";
  }
}
