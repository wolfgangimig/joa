/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IShareableContentEvents.
 * _IShareableContentEvents Interface 
 */
@CoInterface(guid="{6B551C9E-DE81-41DF-A0AE-39F0AF11D508}")
public interface _IShareableContentEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(5090)  public void onOnStateChanged(final IShareableContent _eventSource, final IShareableContentStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(5091)  public void onOnPropertyChanged(final IShareableContent _eventSource, final IShareableContentPropertyChangedEventData _eventData) throws ComException;
  @DeclDISPID(5092)  public void onOnActionAvailabilityChanged(final IShareableContent _eventSource, final IShareableContentActionAvailabilityChangedEventData _eventData) throws ComException;
}
