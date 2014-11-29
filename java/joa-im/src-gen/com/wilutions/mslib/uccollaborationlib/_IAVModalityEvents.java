/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IAVModalityEvents.
 * _IAVModalityEvents Interface 
 */
@CoInterface(guid="{ACD2FDB9-98ED-4283-AAE8-3CD989EBD9AE}")
public interface _IAVModalityEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1201)  public void onOnModalityStateChanged(IModality _eventSource, IModalityStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(1200)  public void onOnAVModalityPropertyChanged(IAVModality _eventSource, IModalityPropertyChangedEventData _eventData) throws ComException;
  @DeclDISPID(1250)  public void onOnIsContributingChanged(IAVModality _eventSource, IIsContributingChangedEventData _eventData) throws ComException;
  @DeclDISPID(1251)  public void onOnStreamStateChanged(IAVModality _eventSource, IStreamStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(1204)  public void onOnActionAvailabilityChanged(IModality _eventSource, IModalityActionAvailabilityChangedEventData _eventData) throws ComException;
}
