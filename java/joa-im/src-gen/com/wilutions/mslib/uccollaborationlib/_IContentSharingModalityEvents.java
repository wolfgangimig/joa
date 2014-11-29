/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IContentSharingModalityEvents.
 * _IContentSharingModelityEvents Interface 
 */
@CoInterface(guid="{AE3A7C39-9C30-4E0F-BAE4-D8344EF377EA}")
public interface _IContentSharingModalityEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1201)  public void onOnModalityStateChanged(final IModality _eventSource, final IModalityStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(1204)  public void onOnActionAvailabilityChanged(final IModality _eventSource, final IModalityActionAvailabilityChangedEventData _eventData) throws ComException;
  @DeclDISPID(5080)  public void onOnContentAdded(final IContentSharingModality _eventSource, final IContentCollectionChangedEventData _eventData) throws ComException;
  @DeclDISPID(5081)  public void onOnContentRemoved(final IContentSharingModality _eventSource, final IContentCollectionChangedEventData _eventData) throws ComException;
  @DeclDISPID(5082)  public void onOnActivePresenterChanged(final IContentSharingModality _eventSource, final IActivePresenterChangedEventData _eventData) throws ComException;
  @DeclDISPID(5083)  public void onOnActiveContentChanged(final IContentSharingModality _eventSource, final IActiveContentChangedEventData _eventData) throws ComException;
}
