/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{6FBD233F-51F2-99FB-1DAA-4973E968482D}")
public class _IConversationWindow2EventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IConversationWindow2Events {
  @DeclDISPID(5050)  public void onOnStateChanged(final com.wilutions.mslib.uccollaborationlib.IConversationWindow _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationWindowStateChangedEventData _eventData) throws ComException {
    this._dispatchCall(5050,"OnStateChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(5051)  public void onOnInformationChanged(final com.wilutions.mslib.uccollaborationlib.IConversationWindow _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationWindowInformationChangedEventData _eventData) throws ComException {
    this._dispatchCall(5051,"OnInformationChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(5052)  public void onOnActionAvailabilityChanged(final com.wilutions.mslib.uccollaborationlib.IConversationWindow _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationWindowActionAvailabilityChangedEventData _eventData) throws ComException {
    this._dispatchCall(5052,"OnActionAvailabilityChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IConversationWindow2EventsImpl(String progId) throws ComException {
    super(progId, "{AF2ABA54-F591-42BA-8004-20944C9FB4D7}");
  }
  protected _IConversationWindow2EventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IConversationWindow2EventsImpl" + super.toString() + "]";
  }
}
