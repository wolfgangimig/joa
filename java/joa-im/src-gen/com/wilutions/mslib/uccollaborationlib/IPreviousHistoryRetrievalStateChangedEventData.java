/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IPreviousHistoryRetrievalStateChangedEventData.
 * IPreviousHistoryRetrievalStateChangedEventData Interface 
 */
@CoInterface(guid="{464D5228-9F68-4B1F-B430-156A104E2B85}")
public interface IPreviousHistoryRetrievalStateChangedEventData extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public PreviousConversationHistoryRetrievalState getOldState() throws ComException;
  @DeclDISPID(1610743809)  public PreviousConversationHistoryRetrievalState getNewState() throws ComException;
  @DeclDISPID(1610743810)  public Integer getStatusCode() throws ComException;
}
