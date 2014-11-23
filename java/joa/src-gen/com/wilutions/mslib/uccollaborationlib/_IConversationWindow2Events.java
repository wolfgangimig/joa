/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IConversationWindow2Events.
 * _IConversationWindowEvents Interface 
 */
@CoInterface(guid="{AF2ABA54-F591-42BA-8004-20944C9FB4D7}")
public interface _IConversationWindow2Events extends IDispatch {
  @DeclDISPID(5050)  public void onOnStateChanged(IConversationWindow _eventSource, IConversationWindowStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(5051)  public void onOnInformationChanged(IConversationWindow _eventSource, IConversationWindowInformationChangedEventData _eventData) throws ComException;
  @DeclDISPID(5052)  public void onOnActionAvailabilityChanged(IConversationWindow _eventSource, IConversationWindowActionAvailabilityChangedEventData _eventData) throws ComException;
}
