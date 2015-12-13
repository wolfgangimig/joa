/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IPreviousConversationsManagerConnectionStateChangedEventData.
 * IPreviousConversationsManagerConnectionStateChangedEventData Interface 
 */
@CoInterface(guid="{F87AFD9A-9BF8-4AC4-953E-33C4D2035D33}")
public interface IPreviousConversationsManagerConnectionStateChangedEventData extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public PreviousConversationsConnectionState getConnectionState() throws ComException;
  @DeclDISPID(1610743809)  public PreviousConversationsErrorType[] getErrors() throws ComException;
}
