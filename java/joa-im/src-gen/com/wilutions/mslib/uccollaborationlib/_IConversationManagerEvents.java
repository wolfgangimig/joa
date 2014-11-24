/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IConversationManagerEvents.
 * _IConversationManagerEvents Interface 
 */
@CoInterface(guid="{25025B1B-0084-44D1-B383-9FFC9A99ABCD}")
public interface _IConversationManagerEvents extends IDispatch {
  @DeclDISPID(900)  public void onOnConversationAdded(IConversationManager _eventSource, IConversationManagerEventData _eventData) throws ComException;
  @DeclDISPID(901)  public void onOnConversationRemoved(IConversationManager _eventSource, IConversationManagerEventData _eventData) throws ComException;
  @DeclDISPID(902)  public void onOnSummarizerStatesChanged(IConversationManager _eventSource, ISummarizerStatesChangedEventData _eventData) throws ComException;
}
