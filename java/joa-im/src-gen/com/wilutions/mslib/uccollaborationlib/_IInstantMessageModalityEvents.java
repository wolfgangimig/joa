/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IInstantMessageModalityEvents.
 * _IInstantMessageModalityEvents Interface 
 */
@CoInterface(guid="{4FE44049-4E44-4109-B234-4E4EFC135A86}")
public interface _IInstantMessageModalityEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1201)  public void onOnModalityStateChanged(final IModality _eventSource, final IModalityStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(1200)  public void onOnInstantMessagePropertyChanged(final IInstantMessageModality _eventSource, final IModalityPropertyChangedEventData _eventData) throws ComException;
  @DeclDISPID(1202)  public void onOnInstantMessageReceived(final IInstantMessageModality _eventSource, final IMessageSentEventData _eventData) throws ComException;
  @DeclDISPID(1203)  public void onOnIsTypingChanged(final IInstantMessageModality _eventSource, final IIsTypingChangedEventData _eventData) throws ComException;
  @DeclDISPID(1204)  public void onOnActionAvailabilityChanged(final IModality _eventSource, final IModalityActionAvailabilityChangedEventData _eventData) throws ComException;
}
