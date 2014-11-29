/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IClientEvents.
 * _IClientEvents Interface 
 */
@CoInterface(guid="{64561371-77A2-4BD4-A909-E6DEB1B5C6CF}")
public interface _IClientEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(100)  public void onOnStateChanged(final IClient _eventSource, final IClientStateChangedEventData _eventData) throws ComException;
}
