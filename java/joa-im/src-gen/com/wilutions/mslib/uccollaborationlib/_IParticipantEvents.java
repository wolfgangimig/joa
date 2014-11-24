/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IParticipantEvents.
 * _IParticipantEvents Interface 
 */
@CoInterface(guid="{6A986B5D-E5EC-4395-AD2D-0E62B72DA776}")
public interface _IParticipantEvents extends IDispatch {
  @DeclDISPID(1100)  public void onOnPropertyChanged(IParticipant _eventSource, IParticipantPropertyChangedEventData _eventData) throws ComException;
  @DeclDISPID(1101)  public void onOnIsMutedChanged(IParticipant _eventSource, IMutedChangedEventData _eventData) throws ComException;
  @DeclDISPID(1102)  public void onOnActionAvailabilityChanged(IParticipant _eventSource, IParticipantActionAvailabilityChangedEventData _eventData) throws ComException;
}
