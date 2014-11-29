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
  @DeclDISPID(1201)  public void onOnModalityStateChanged(IModality _eventSource, IModalityStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(1204)  public void onOnActionAvailabilityChanged(IModality _eventSource, IModalityActionAvailabilityChangedEventData _eventData) throws ComException;
  @DeclDISPID(1432)  public void onOnLocalSharedResourcesChanged(IApplicationSharingModality eventSource, ILocalSharedResourcesChangedEventData eventData) throws ComException;
  @DeclDISPID(1430)  public void onOnParticipationStateChanged(IApplicationSharingModality eventSource, IParticipationStateChangedEventData eventData) throws ComException;
  @DeclDISPID(1431)  public void onOnControlRequestReceived(IApplicationSharingModality eventSource, IControlRequestReceivedEventData eventData) throws ComException;
  @DeclDISPID(1433)  public void onOnControllerChanged(IApplicationSharingModality eventSource, IControllerChangedEventData eventData) throws ComException;
  @DeclDISPID(1434)  public void onOnSharerChanged(IApplicationSharingModality eventSource, ISharerChangedEventData eventData) throws ComException;
  @DeclDISPID(1200)  public void onOnApplicationSharingModalityPropertyChanged(IApplicationSharingModality _eventSource, IModalityPropertyChangedEventData _eventData) throws ComException;
}
