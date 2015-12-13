/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IParticipantEvents.
 * _IParticipantEvents Interface 
 */
@CoInterface(guid="{6A986B5D-E5EC-4395-AD2D-0E62B72DA776}")
public interface _IParticipantEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1100)  public void onOnPropertyChanged(final IParticipant _eventSource, final IParticipantPropertyChangedEventData _eventData) throws ComException;
  @DeclDISPID(1101)  public void onOnIsMutedChanged(final IParticipant _eventSource, final IMutedChangedEventData _eventData) throws ComException;
  @DeclDISPID(1102)  public void onOnActionAvailabilityChanged(final IParticipant _eventSource, final IParticipantActionAvailabilityChangedEventData _eventData) throws ComException;
}
