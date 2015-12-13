/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{3AEEE884-BA22-99DE-11D7-B3225D7AB8B1}")
public class _IConversationHistoryEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IConversationHistoryEvents {
  @DeclDISPID(2000)  public void onOnHistoryItemAdded(final com.wilutions.mslib.uccollaborationlib.IConversationHistory _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationHistoryItemAddedEventData _eventData) throws ComException {
    this._dispatchCall(2000,"OnHistoryItemAdded", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(2001)  public void onOnPreviousHistoryRetrievalStateChanged(final com.wilutions.mslib.uccollaborationlib.IConversationHistory _eventSource, final com.wilutions.mslib.uccollaborationlib.IPreviousHistoryRetrievalStateChangedEventData _eventData) throws ComException {
    this._dispatchCall(2001,"OnPreviousHistoryRetrievalStateChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(2002)  public void onOnHistoryActionAvailabilityChanged(final com.wilutions.mslib.uccollaborationlib.IConversationHistory _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationHistoryActionAvailabilityEventData _eventData) throws ComException {
    this._dispatchCall(2002,"OnHistoryActionAvailabilityChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IConversationHistoryEventsImpl(String progId) throws ComException {
    super(progId, "{FA7971EF-1E41-429F-8C79-DAC5F88D444B}");
  }
  protected _IConversationHistoryEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IConversationHistoryEventsImpl" + super.toString() + "]";
  }
}
