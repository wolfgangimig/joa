/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{1905AE75-F502-9E7A-0A48-079BC24BFBA4}")
public class _IPreviousConversationsManagerEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IPreviousConversationsManagerEvents {
  @DeclDISPID(2100)  public void onOnConnectionStateChanged(com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManager _eventSource, com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManagerConnectionStateChangedEventData _eventData) throws ComException {
    this._dispatchCall(2100,"OnConnectionStateChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(2101)  public void onOnNewItemCountSinceLastResetChanged(com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManager _eventSource, com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManagerNewItemCountChangedEventData _eventData) throws ComException {
    this._dispatchCall(2101,"OnNewItemCountSinceLastResetChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(2103)  public void onOnItemsAdded(com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManager _eventSource, com.wilutions.mslib.uccollaborationlib.IPreviousConversationBatchEventData _eventData) throws ComException {
    this._dispatchCall(2103,"OnItemsAdded", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(2104)  public void onOnItemsRemoved(com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManager _eventSource, com.wilutions.mslib.uccollaborationlib.IPreviousConversationBatchEventData _eventData) throws ComException {
    this._dispatchCall(2104,"OnItemsRemoved", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(2105)  public void onOnItemsModified(com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManager _eventSource, com.wilutions.mslib.uccollaborationlib.IPreviousConversationBatchEventData _eventData) throws ComException {
    this._dispatchCall(2105,"OnItemsModified", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IPreviousConversationsManagerEventsImpl(String progId) throws ComException {
    super(progId, "{D992371E-5161-453B-97E6-6E7C67BC075E}");
  }
  protected _IPreviousConversationsManagerEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IPreviousConversationsManagerEventsImpl" + super.toString() + "]";
  }
}
