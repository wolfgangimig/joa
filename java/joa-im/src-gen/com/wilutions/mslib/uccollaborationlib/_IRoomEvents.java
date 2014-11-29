/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IRoomEvents.
 * _IRoomEvents Interface 
 */
@CoInterface(guid="{300E56A3-CE08-4EB3-9F48-505AA162C9DA}")
public interface _IRoomEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(4200)  public void onOnPropertyChanged(final IRoom _eventSource, final IRoomPropertyChangedEventData _eventData) throws ComException;
  @DeclDISPID(4201)  public void onOnUnreadMessageCountChanged(final IRoom _eventSource, final IUnreadMessageCountChangedEventData _eventData) throws ComException;
  @DeclDISPID(4202)  public void onOnIsSendingMessage(final IRoom _eventSource, final IRoomMessageEventData _eventData) throws ComException;
  @DeclDISPID(4203)  public void onOnMessagesReceived(final IRoom _eventSource, final IRoomMessagesEventData _eventData) throws ComException;
  @DeclDISPID(4204)  public void onOnParticipantAdded(final IRoom _eventSource, final IRoomParticipantsEventData _eventData) throws ComException;
  @DeclDISPID(4205)  public void onOnParticipantRemoved(final IRoom _eventSource, final IRoomParticipantsEventData _eventData) throws ComException;
  @DeclDISPID(4206)  public void onOnJoinStateChanged(final IRoom _eventSource, final IRoomJoinStateChangedEventData _eventData) throws ComException;
}
