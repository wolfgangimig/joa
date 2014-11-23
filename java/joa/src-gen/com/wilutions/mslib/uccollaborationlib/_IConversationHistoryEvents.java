/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IConversationHistoryEvents.
 * _IConversationHistoryEvents Interface 
 */
@CoInterface(guid="{FA7971EF-1E41-429F-8C79-DAC5F88D444B}")
public interface _IConversationHistoryEvents extends IDispatch {
  @DeclDISPID(2000)  public void onOnHistoryItemAdded(IConversationHistory _eventSource, IConversationHistoryItemAddedEventData _eventData) throws ComException;
  @DeclDISPID(2001)  public void onOnPreviousHistoryRetrievalStateChanged(IConversationHistory _eventSource, IPreviousHistoryRetrievalStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(2002)  public void onOnHistoryActionAvailabilityChanged(IConversationHistory _eventSource, IConversationHistoryActionAvailabilityEventData _eventData) throws ComException;
}
