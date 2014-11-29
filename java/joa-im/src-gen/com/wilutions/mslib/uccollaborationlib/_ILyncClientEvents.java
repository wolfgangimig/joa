/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _ILyncClientEvents.
 * _ILyncClientEvents Interface 
 */
@CoInterface(guid="{953AE732-F53A-4116-AC1B-0321B3FB3DBA}")
public interface _ILyncClientEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(100)  public void onOnStateChanged(final IClient _eventSource, final IClientStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(101)  public void onOnNotificationReceived(final ILyncClient _eventSource, final ILyncClientNotificationReceivedEventData _eventData) throws ComException;
  @DeclDISPID(103)  public void onOnCredentialRequested(final ILyncClient _eventSource, final ICredentialRequestedEventData _eventData) throws ComException;
  @DeclDISPID(102)  public void onOnSignInDelayed(final ILyncClient _eventSource, final ISignInDelayedEventData _eventData) throws ComException;
  @DeclDISPID(105)  public void onOnCapabilitiesChanged(final ILyncClient _eventSource, final IPreferredCapabilitiesChangedEventData _eventData) throws ComException;
  @DeclDISPID(106)  public void onOnDelegatorClientAdded(final ILyncClient _eventSource, final IDelegatorClientCollectionEventData _eventData) throws ComException;
  @DeclDISPID(107)  public void onOnDelegatorClientRemoved(final ILyncClient _eventSource, final IDelegatorClientCollectionEventData _eventData) throws ComException;
}
