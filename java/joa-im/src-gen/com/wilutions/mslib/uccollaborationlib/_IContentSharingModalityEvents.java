/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IContentSharingModalityEvents.
 * _IContentSharingModelityEvents Interface 
 */
@CoInterface(guid="{AE3A7C39-9C30-4E0F-BAE4-D8344EF377EA}")
public interface _IContentSharingModalityEvents extends IDispatch {
  @DeclDISPID(1201)  public void onOnModalityStateChanged(IModality _eventSource, IModalityStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(1204)  public void onOnActionAvailabilityChanged(IModality _eventSource, IModalityActionAvailabilityChangedEventData _eventData) throws ComException;
  @DeclDISPID(5080)  public void onOnContentAdded(IContentSharingModality _eventSource, IContentCollectionChangedEventData _eventData) throws ComException;
  @DeclDISPID(5081)  public void onOnContentRemoved(IContentSharingModality _eventSource, IContentCollectionChangedEventData _eventData) throws ComException;
  @DeclDISPID(5082)  public void onOnActivePresenterChanged(IContentSharingModality _eventSource, IActivePresenterChangedEventData _eventData) throws ComException;
  @DeclDISPID(5083)  public void onOnActiveContentChanged(IContentSharingModality _eventSource, IActiveContentChangedEventData _eventData) throws ComException;
}
