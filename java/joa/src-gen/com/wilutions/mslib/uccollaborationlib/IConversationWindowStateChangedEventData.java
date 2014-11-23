/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversationWindowStateChangedEventData.
 * IConversationWindowStateChangedEventData Interface 
 */
@CoInterface(guid="{2209E091-5B90-4CAF-8582-CC5979883376}")
public interface IConversationWindowStateChangedEventData extends IDispatch {
  @DeclDISPID(1610743808)  public ConversationWindowState getOldState() throws ComException;
  @DeclDISPID(1610743809)  public ConversationWindowState getNewState() throws ComException;
}
