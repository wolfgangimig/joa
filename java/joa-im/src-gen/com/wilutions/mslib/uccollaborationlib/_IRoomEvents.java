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
  @DeclDISPID(4200)  public void onOnPropertyChanged(IRoom _eventSource, IRoomPropertyChangedEventData _eventData) throws ComException;
  @DeclDISPID(4201)  public void onOnUnreadMessageCountChanged(IRoom _eventSource, IUnreadMessageCountChangedEventData _eventData) throws ComException;
  @DeclDISPID(4202)  public void onOnIsSendingMessage(IRoom _eventSource, IRoomMessageEventData _eventData) throws ComException;
  @DeclDISPID(4203)  public void onOnMessagesReceived(IRoom _eventSource, IRoomMessagesEventData _eventData) throws ComException;
  @DeclDISPID(4204)  public void onOnParticipantAdded(IRoom _eventSource, IRoomParticipantsEventData _eventData) throws ComException;
  @DeclDISPID(4205)  public void onOnParticipantRemoved(IRoom _eventSource, IRoomParticipantsEventData _eventData) throws ComException;
  @DeclDISPID(4206)  public void onOnJoinStateChanged(IRoom _eventSource, IRoomJoinStateChangedEventData _eventData) throws ComException;
}
