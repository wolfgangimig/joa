/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversationHistoryActionAvailabilityEventData.
 * IConversationHistoryActionAvailabilityEventData Interface 
 */
@CoInterface(guid="{9397FF55-EE06-4F02-8F2A-BE3AE249D4BB}")
public interface IConversationHistoryActionAvailabilityEventData extends IDispatch {
  @DeclDISPID(1610743808)  public ConversationHistoryAction getAction() throws ComException;
  @DeclDISPID(1610743809)  public Boolean getIsAvailable() throws ComException;
}
