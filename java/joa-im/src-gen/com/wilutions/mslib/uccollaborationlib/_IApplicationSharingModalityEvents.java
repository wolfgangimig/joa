/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IApplicationSharingModalityEvents.
 * _IApplicationSharingModalityEvents Interface 
 */
@CoInterface(guid="{BE026CD2-7E82-4F7C-8762-F6B02F496174}")
public interface _IApplicationSharingModalityEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1201)  public void onOnModalityStateChanged(final IModality _eventSource, final IModalityStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(1204)  public void onOnActionAvailabilityChanged(final IModality _eventSource, final IModalityActionAvailabilityChangedEventData _eventData) throws ComException;
  @DeclDISPID(1432)  public void onOnLocalSharedResourcesChanged(final IApplicationSharingModality eventSource, final ILocalSharedResourcesChangedEventData eventData) throws ComException;
  @DeclDISPID(1430)  public void onOnParticipationStateChanged(final IApplicationSharingModality eventSource, final IParticipationStateChangedEventData eventData) throws ComException;
  @DeclDISPID(1431)  public void onOnControlRequestReceived(final IApplicationSharingModality eventSource, final IControlRequestReceivedEventData eventData) throws ComException;
  @DeclDISPID(1433)  public void onOnControllerChanged(final IApplicationSharingModality eventSource, final IControllerChangedEventData eventData) throws ComException;
  @DeclDISPID(1434)  public void onOnSharerChanged(final IApplicationSharingModality eventSource, final ISharerChangedEventData eventData) throws ComException;
  @DeclDISPID(1200)  public void onOnApplicationSharingModalityPropertyChanged(final IApplicationSharingModality _eventSource, final IModalityPropertyChangedEventData _eventData) throws ComException;
}
