/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ISummarizerStatesChangedEventData.
 * ISummarizerStatesChangedEventData Interface 
 */
@CoInterface(guid="{8057F99D-292C-4371-926B-5312E61A3A40}")
public interface ISummarizerStatesChangedEventData extends IDispatch {
  @DeclDISPID(1610743808)  public IConversation getTriggeringConversation() throws ComException;
  @DeclDISPID(1610743809)  public ConversationSummarizerStates getOldState() throws ComException;
  @DeclDISPID(1610743810)  public ConversationSummarizerStates getNewState() throws ComException;
}
