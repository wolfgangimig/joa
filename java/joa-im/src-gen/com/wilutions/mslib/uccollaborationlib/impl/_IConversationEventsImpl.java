/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{06A8C1A0-4B72-9275-3795-448E81B8FB7A}")
public class _IConversationEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IConversationEvents {
  @DeclDISPID(1000)  public void onOnStateChanged(final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationStateChangedEventData _eventData) throws ComException {
    this._dispatchCall(1000,"OnStateChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1001)  public void onOnPropertyChanged(final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationPropertyChangedEventData _eventData) throws ComException {
    this._dispatchCall(1001,"OnPropertyChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1003)  public void onOnParticipantAdded(final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IParticipantCollectionChangedEventData _eventData) throws ComException {
    this._dispatchCall(1003,"OnParticipantAdded", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1004)  public void onOnParticipantRemoved(final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IParticipantCollectionChangedEventData _eventData) throws ComException {
    this._dispatchCall(1004,"OnParticipantRemoved", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1002)  public void onOnActionAvailabilityChanged(final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationActionAvailabilityEventData _eventData) throws ComException {
    this._dispatchCall(1002,"OnActionAvailabilityChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1005)  public void onOnConversationContextAdded(final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationContextCollectionEventData _eventData) throws ComException {
    this._dispatchCall(1005,"OnConversationContextAdded", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1006)  public void onOnConversationContextRemoved(final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationContextCollectionEventData _eventData) throws ComException {
    this._dispatchCall(1006,"OnConversationContextRemoved", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1009)  public void onOnConversationContextLinkClicked(final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IInitialContextEventData _eventData) throws ComException {
    this._dispatchCall(1009,"OnConversationContextLinkClicked", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1007)  public void onOnInitialContextReceived(final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IInitialContextEventData _eventData) throws ComException {
    this._dispatchCall(1007,"OnInitialContextReceived", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1010)  public void onOnInitialContextSent(final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IInitialContextEventData _eventData) throws ComException {
    this._dispatchCall(1010,"OnInitialContextSent", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1008)  public void onOnContextDataReceived(final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IContextEventData _eventData) throws ComException {
    this._dispatchCall(1008,"OnContextDataReceived", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1011)  public void onOnContextDataSent(final com.wilutions.mslib.uccollaborationlib.IConversation _eventSource, final com.wilutions.mslib.uccollaborationlib.IContextEventData _eventData) throws ComException {
    this._dispatchCall(1011,"OnContextDataSent", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IConversationEventsImpl(String progId) throws ComException {
    super(progId, "{C63F58CB-EF11-4934-AA3B-2D69244F0780}");
  }
  protected _IConversationEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IConversationEventsImpl" + super.toString() + "]";
  }
}
