/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversationWindowActionAvailabilityChangedEventData.
 * IConversationWindowActionAvailabilityChangedEventData Interface 
 */
@CoInterface(guid="{0678C83E-F580-4D99-902F-930699B28BE8}")
public interface IConversationWindowActionAvailabilityChangedEventData extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ConversationWindowAction getAction() throws ComException;
  @DeclDISPID(1610743809)  public Boolean getIsAvailable() throws ComException;
}
