/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IConversationManagerEvents.
 * _IConversationManagerEvents Interface 
 */
@CoInterface(guid="{25025B1B-0084-44D1-B383-9FFC9A99ABCD}")
public interface _IConversationManagerEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(900)  public void onOnConversationAdded(final IConversationManager _eventSource, final IConversationManagerEventData _eventData) throws ComException;
  @DeclDISPID(901)  public void onOnConversationRemoved(final IConversationManager _eventSource, final IConversationManagerEventData _eventData) throws ComException;
  @DeclDISPID(902)  public void onOnSummarizerStatesChanged(final IConversationManager _eventSource, final ISummarizerStatesChangedEventData _eventData) throws ComException;
}
