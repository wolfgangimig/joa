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
  @DeclDISPID(1000)  public void onOnStateChanged(final IConversation _eventSource, final IConversationStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(1001)  public void onOnPropertyChanged(final IConversation _eventSource, final IConversationPropertyChangedEventData _eventData) throws ComException;
  @DeclDISPID(1003)  public void onOnParticipantAdded(final IConversation _eventSource, final IParticipantCollectionChangedEventData _eventData) throws ComException;
  @DeclDISPID(1004)  public void onOnParticipantRemoved(final IConversation _eventSource, final IParticipantCollectionChangedEventData _eventData) throws ComException;
  @DeclDISPID(1002)  public void onOnActionAvailabilityChanged(final IConversation _eventSource, final IConversationActionAvailabilityEventData _eventData) throws ComException;
  @DeclDISPID(1005)  public void onOnConversationContextAdded(final IConversation _eventSource, final IConversationContextCollectionEventData _eventData) throws ComException;
  @DeclDISPID(1006)  public void onOnConversationContextRemoved(final IConversation _eventSource, final IConversationContextCollectionEventData _eventData) throws ComException;
  @DeclDISPID(1009)  public void onOnConversationContextLinkClicked(final IConversation _eventSource, final IInitialContextEventData _eventData) throws ComException;
  @DeclDISPID(1007)  public void onOnInitialContextReceived(final IConversation _eventSource, final IInitialContextEventData _eventData) throws ComException;
  @DeclDISPID(1010)  public void onOnInitialContextSent(final IConversation _eventSource, final IInitialContextEventData _eventData) throws ComException;
  @DeclDISPID(1008)  public void onOnContextDataReceived(final IConversation _eventSource, final IContextEventData _eventData) throws ComException;
  @DeclDISPID(1011)  public void onOnContextDataSent(final IConversation _eventSource, final IContextEventData _eventData) throws ComException;
}
