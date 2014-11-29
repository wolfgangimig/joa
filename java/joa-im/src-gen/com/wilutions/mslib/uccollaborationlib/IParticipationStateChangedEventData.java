/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IParticipationStateChangedEventData.
 * IParticipationStateChangedEventData Interface 
 */
@CoInterface(guid="{8FE9A23D-72BC-4EA3-A5AF-E37F75EAD8A2}")
public interface IParticipationStateChangedEventData extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ParticipationState getOldState() throws ComException;
  @DeclDISPID(1610743809)  public ParticipationState getNewState() throws ComException;
}
