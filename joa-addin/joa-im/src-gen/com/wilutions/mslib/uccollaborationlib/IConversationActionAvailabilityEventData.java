/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversationActionAvailabilityEventData.
 * IConversationActionAvailabilityEventData Interface 
 */
@CoInterface(guid="{88C688B0-3908-4C56-A2E8-F90AB705C536}")
public interface IConversationActionAvailabilityEventData extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ConversationAction getAction() throws ComException;
  @DeclDISPID(1610743809)  public Boolean getIsAvailable() throws ComException;
}
