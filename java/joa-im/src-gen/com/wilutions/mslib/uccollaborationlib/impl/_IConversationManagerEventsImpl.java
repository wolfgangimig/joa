/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{E595C270-A4E7-9F90-2E2D-F61B3F6E5737}")
public class _IConversationManagerEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IConversationManagerEvents {
  @DeclDISPID(900)  public void onOnConversationAdded(com.wilutions.mslib.uccollaborationlib.IConversationManager _eventSource, com.wilutions.mslib.uccollaborationlib.IConversationManagerEventData _eventData) throws ComException {
    this._dispatchCall(900,"OnConversationAdded", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(901)  public void onOnConversationRemoved(com.wilutions.mslib.uccollaborationlib.IConversationManager _eventSource, com.wilutions.mslib.uccollaborationlib.IConversationManagerEventData _eventData) throws ComException {
    this._dispatchCall(901,"OnConversationRemoved", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(902)  public void onOnSummarizerStatesChanged(com.wilutions.mslib.uccollaborationlib.IConversationManager _eventSource, com.wilutions.mslib.uccollaborationlib.ISummarizerStatesChangedEventData _eventData) throws ComException {
    this._dispatchCall(902,"OnSummarizerStatesChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IConversationManagerEventsImpl(String progId) throws ComException {
    super(progId, "{25025B1B-0084-44D1-B383-9FFC9A99ABCD}");
  }
  protected _IConversationManagerEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IConversationManagerEventsImpl" + super.toString() + "]";
  }
}
