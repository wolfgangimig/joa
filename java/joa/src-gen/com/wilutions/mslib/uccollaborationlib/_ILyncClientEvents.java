/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _ILyncClientEvents.
 * _ILyncClientEvents Interface 
 */
@CoInterface(guid="{953AE732-F53A-4116-AC1B-0321B3FB3DBA}")
public interface _ILyncClientEvents extends IDispatch {
  @DeclDISPID(100)  public void onOnStateChanged(IClient _eventSource, IClientStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(101)  public void onOnNotificationReceived(ILyncClient _eventSource, ILyncClientNotificationReceivedEventData _eventData) throws ComException;
  @DeclDISPID(103)  public void onOnCredentialRequested(ILyncClient _eventSource, ICredentialRequestedEventData _eventData) throws ComException;
  @DeclDISPID(102)  public void onOnSignInDelayed(ILyncClient _eventSource, ISignInDelayedEventData _eventData) throws ComException;
  @DeclDISPID(105)  public void onOnCapabilitiesChanged(ILyncClient _eventSource, IPreferredCapabilitiesChangedEventData _eventData) throws ComException;
  @DeclDISPID(106)  public void onOnDelegatorClientAdded(ILyncClient _eventSource, IDelegatorClientCollectionEventData _eventData) throws ComException;
  @DeclDISPID(107)  public void onOnDelegatorClientRemoved(ILyncClient _eventSource, IDelegatorClientCollectionEventData _eventData) throws ComException;
}
