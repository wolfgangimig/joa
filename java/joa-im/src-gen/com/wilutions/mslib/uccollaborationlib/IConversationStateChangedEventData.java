/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversationStateChangedEventData.
 * IConversationStateChangedEventData Interface 
 */
@CoInterface(guid="{2A9385AA-CF61-4E47-B64C-214DE4A4AD11}")
public interface IConversationStateChangedEventData extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ConversationState getOldState() throws ComException;
  @DeclDISPID(1610743809)  public ConversationState getNewState() throws ComException;
  @DeclDISPID(1610743810)  public Integer getStatusCode() throws ComException;
  @DeclDISPID(1610743811)  public IConversationStateChangePropertyDictionary getProperties() throws ComException;
}
