/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IModalityEvents.
 * _IModalityEvents Interface 
 */
@CoInterface(guid="{10D66B39-5E4B-4C98-AAC6-D0458FEB1BDB}")
public interface _IModalityEvents extends IDispatch {
  @DeclDISPID(1201)  public void onOnModalityStateChanged(IModality _eventSource, IModalityStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(1204)  public void onOnActionAvailabilityChanged(IModality _eventSource, IModalityActionAvailabilityChangedEventData _eventData) throws ComException;
}
