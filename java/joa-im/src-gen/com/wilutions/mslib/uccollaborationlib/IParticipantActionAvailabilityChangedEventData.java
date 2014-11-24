/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IParticipantActionAvailabilityChangedEventData.
 * IParticipantActionAvailabilityChangedEventData Interface 
 */
@CoInterface(guid="{1124AA59-B6F3-4EB1-B79A-E7F53B388B8D}")
public interface IParticipantActionAvailabilityChangedEventData extends IDispatch {
  @DeclDISPID(1610743808)  public ParticipantAction getAction() throws ComException;
  @DeclDISPID(1610743809)  public Boolean getIsAvailable() throws ComException;
}
