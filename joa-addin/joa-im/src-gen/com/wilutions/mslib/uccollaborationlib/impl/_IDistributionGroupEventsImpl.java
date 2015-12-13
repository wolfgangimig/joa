/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C8B97BEB-D60D-9A3E-0465-E84769480479}")
public class _IDistributionGroupEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IDistributionGroupEvents {
  @DeclDISPID(500)  public void onOnNameChanged(final com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupNameChangedEventData _eventData) throws ComException {
    this._dispatchCall(500,"OnNameChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(501)  public void onOnContactAdded(final com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupMemberChangedEventData _eventData) throws ComException {
    this._dispatchCall(501,"OnContactAdded", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(502)  public void onOnContactRemoved(final com.wilutions.mslib.uccollaborationlib.IGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupMemberChangedEventData _eventData) throws ComException {
    this._dispatchCall(502,"OnContactRemoved", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(503)  public void onOnExpansionStateChanged(final com.wilutions.mslib.uccollaborationlib.IDistributionGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IDistributionGroupExpansionStateChangedEventData _eventData) throws ComException {
    this._dispatchCall(503,"OnExpansionStateChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(505)  public void onOnNestedGroupAdded(final com.wilutions.mslib.uccollaborationlib.IDistributionGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupCollectionChangedEventData _eventData) throws ComException {
    this._dispatchCall(505,"OnNestedGroupAdded", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(506)  public void onOnNestedGroupRemoved(final com.wilutions.mslib.uccollaborationlib.IDistributionGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IGroupCollectionChangedEventData _eventData) throws ComException {
    this._dispatchCall(506,"OnNestedGroupRemoved", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(507)  public void onOnDescriptionChanged(final com.wilutions.mslib.uccollaborationlib.IDistributionGroup _eventSource, final com.wilutions.mslib.uccollaborationlib.IDescriptionChangedEventData _eventData) throws ComException {
    this._dispatchCall(507,"OnDescriptionChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IDistributionGroupEventsImpl(String progId) throws ComException {
    super(progId, "{082EE280-726E-417F-99CB-81A0CCBFF883}");
  }
  protected _IDistributionGroupEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IDistributionGroupEventsImpl" + super.toString() + "]";
  }
}
