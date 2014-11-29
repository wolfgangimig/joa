/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IConversationHistoryEvents.
 * _IConversationHistoryEvents Interface 
 */
@CoInterface(guid="{FA7971EF-1E41-429F-8C79-DAC5F88D444B}")
public interface _IConversationHistoryEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(2000)  public void onOnHistoryItemAdded(final IConversationHistory _eventSource, final IConversationHistoryItemAddedEventData _eventData) throws ComException;
  @DeclDISPID(2001)  public void onOnPreviousHistoryRetrievalStateChanged(final IConversationHistory _eventSource, final IPreviousHistoryRetrievalStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(2002)  public void onOnHistoryActionAvailabilityChanged(final IConversationHistory _eventSource, final IConversationHistoryActionAvailabilityEventData _eventData) throws ComException;
}
