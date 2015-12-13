/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IRoomParticipantsEventData.
 * IRoomParticipantsEventData Interface 
 */
@CoInterface(guid="{7452BD0F-65CB-4A5E-AC37-E2BEA1F43DD9}")
public interface IRoomParticipantsEventData extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IRoomUser[] getParticipants() throws ComException;
}
