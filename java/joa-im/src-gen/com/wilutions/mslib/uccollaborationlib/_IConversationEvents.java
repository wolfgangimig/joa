/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IConversationEvents.
 * _IConversationEvents Interface 
 */
@CoInterface(guid="{C63F58CB-EF11-4934-AA3B-2D69244F0780}")
public interface _IConversationEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1000)  public void onOnStateChanged(IConversation _eventSource, IConversationStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(1001)  public void onOnPropertyChanged(IConversation _eventSource, IConversationPropertyChangedEventData _eventData) throws ComException;
  @DeclDISPID(1003)  public void onOnParticipantAdded(IConversation _eventSource, IParticipantCollectionChangedEventData _eventData) throws ComException;
  @DeclDISPID(1004)  public void onOnParticipantRemoved(IConversation _eventSource, IParticipantCollectionChangedEventData _eventData) throws ComException;
  @DeclDISPID(1002)  public void onOnActionAvailabilityChanged(IConversation _eventSource, IConversationActionAvailabilityEventData _eventData) throws ComException;
  @DeclDISPID(1005)  public void onOnConversationContextAdded(IConversation _eventSource, IConversationContextCollectionEventData _eventData) throws ComException;
  @DeclDISPID(1006)  public void onOnConversationContextRemoved(IConversation _eventSource, IConversationContextCollectionEventData _eventData) throws ComException;
  @DeclDISPID(1009)  public void onOnConversationContextLinkClicked(IConversation _eventSource, IInitialContextEventData _eventData) throws ComException;
  @DeclDISPID(1007)  public void onOnInitialContextReceived(IConversation _eventSource, IInitialContextEventData _eventData) throws ComException;
  @DeclDISPID(1010)  public void onOnInitialContextSent(IConversation _eventSource, IInitialContextEventData _eventData) throws ComException;
  @DeclDISPID(1008)  public void onOnContextDataReceived(IConversation _eventSource, IContextEventData _eventData) throws ComException;
  @DeclDISPID(1011)  public void onOnContextDataSent(IConversation _eventSource, IContextEventData _eventData) throws ComException;
}
