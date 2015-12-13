/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{6EADE552-3853-954E-274A-B1D3EB048B10}")
public class _IContentSharingModalityEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IContentSharingModalityEvents {
  @DeclDISPID(1201)  public void onOnModalityStateChanged(final com.wilutions.mslib.uccollaborationlib.IModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IModalityStateChangedEventData _eventData) throws ComException {
    this._dispatchCall(1201,"OnModalityStateChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1204)  public void onOnActionAvailabilityChanged(final com.wilutions.mslib.uccollaborationlib.IModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IModalityActionAvailabilityChangedEventData _eventData) throws ComException {
    this._dispatchCall(1204,"OnActionAvailabilityChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(5080)  public void onOnContentAdded(final com.wilutions.mslib.uccollaborationlib.IContentSharingModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IContentCollectionChangedEventData _eventData) throws ComException {
    this._dispatchCall(5080,"OnContentAdded", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(5081)  public void onOnContentRemoved(final com.wilutions.mslib.uccollaborationlib.IContentSharingModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IContentCollectionChangedEventData _eventData) throws ComException {
    this._dispatchCall(5081,"OnContentRemoved", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(5082)  public void onOnActivePresenterChanged(final com.wilutions.mslib.uccollaborationlib.IContentSharingModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IActivePresenterChangedEventData _eventData) throws ComException {
    this._dispatchCall(5082,"OnActivePresenterChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(5083)  public void onOnActiveContentChanged(final com.wilutions.mslib.uccollaborationlib.IContentSharingModality _eventSource, final com.wilutions.mslib.uccollaborationlib.IActiveContentChangedEventData _eventData) throws ComException {
    this._dispatchCall(5083,"OnActiveContentChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IContentSharingModalityEventsImpl(String progId) throws ComException {
    super(progId, "{AE3A7C39-9C30-4E0F-BAE4-D8344EF377EA}");
  }
  protected _IContentSharingModalityEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IContentSharingModalityEventsImpl" + super.toString() + "]";
  }
}
