/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{904FF789-8CEC-9FB4-1CEA-00114645B76A}")
public class _IContactManagerEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IContactManagerEvents {
  @DeclDISPID(200)  public void onOnGroupAdded(final com.wilutions.mslib.uccollaborationlib.IContactManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupCollectionChangedEventData _eventData) throws ComException {
    this._dispatchCall(200,"OnGroupAdded", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(201)  public void onOnGroupRemoved(final com.wilutions.mslib.uccollaborationlib.IContactManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupCollectionChangedEventData _eventData) throws ComException {
    this._dispatchCall(201,"OnGroupRemoved", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(202)  public void onOnSearchProviderStateChanged(final com.wilutions.mslib.uccollaborationlib.IContactManager _eventSource, final com.wilutions.mslib.uccollaborationlib.ISearchProviderStateChangedEventData _eventData) throws ComException {
    this._dispatchCall(202,"OnSearchProviderStateChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IContactManagerEventsImpl(String progId) throws ComException {
    super(progId, "{50D86EE2-288F-44F5-8144-69F6E3B24B90}");
  }
  protected _IContactManagerEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IContactManagerEventsImpl" + super.toString() + "]";
  }
}
