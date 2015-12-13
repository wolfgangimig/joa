/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IModalityEvents.
 * _IModalityEvents Interface 
 */
@CoInterface(guid="{10D66B39-5E4B-4C98-AAC6-D0458FEB1BDB}")
public interface _IModalityEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1201)  public void onOnModalityStateChanged(final IModality _eventSource, final IModalityStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(1204)  public void onOnActionAvailabilityChanged(final IModality _eventSource, final IModalityActionAvailabilityChangedEventData _eventData) throws ComException;
}
