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
  @DeclDISPID(2100)  public void onOnConnectionStateChanged(IPreviousConversationsManager _eventSource, IPreviousConversationsManagerConnectionStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(2101)  public void onOnNewItemCountSinceLastResetChanged(IPreviousConversationsManager _eventSource, IPreviousConversationsManagerNewItemCountChangedEventData _eventData) throws ComException;
  @DeclDISPID(2103)  public void onOnItemsAdded(IPreviousConversationsManager _eventSource, IPreviousConversationBatchEventData _eventData) throws ComException;
  @DeclDISPID(2104)  public void onOnItemsRemoved(IPreviousConversationsManager _eventSource, IPreviousConversationBatchEventData _eventData) throws ComException;
  @DeclDISPID(2105)  public void onOnItemsModified(IPreviousConversationsManager _eventSource, IPreviousConversationBatchEventData _eventData) throws ComException;
}
