/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IPreviousConversationsManagerEvents.
 * _IPreviousConversationsManagerEvents Interface 
 */
@CoInterface(guid="{D992371E-5161-453B-97E6-6E7C67BC075E}")
public interface _IPreviousConversationsManagerEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(2100)  public void onOnConnectionStateChanged(final IPreviousConversationsManager _eventSource, final IPreviousConversationsManagerConnectionStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(2101)  public void onOnNewItemCountSinceLastResetChanged(final IPreviousConversationsManager _eventSource, final IPreviousConversationsManagerNewItemCountChangedEventData _eventData) throws ComException;
  @DeclDISPID(2103)  public void onOnItemsAdded(final IPreviousConversationsManager _eventSource, final IPreviousConversationBatchEventData _eventData) throws ComException;
  @DeclDISPID(2104)  public void onOnItemsRemoved(final IPreviousConversationsManager _eventSource, final IPreviousConversationBatchEventData _eventData) throws ComException;
  @DeclDISPID(2105)  public void onOnItemsModified(final IPreviousConversationsManager _eventSource, final IPreviousConversationBatchEventData _eventData) throws ComException;
}
