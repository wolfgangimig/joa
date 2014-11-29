/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _ISelfEvents.
 * _ISelfEvents Interface 
 */
@CoInterface(guid="{06437ABB-C419-4B11-A474-1A2B02FBD646}")
public interface _ISelfEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1700)  public void onOnPhonesChanged(ISelf _eventSource, IPhonesChangedEventData _eventData) throws ComException;
  @DeclDISPID(1701)  public void onOnResiliencyModeChanged(ISelf _eventSource, IResiliencyModeChangedEventData _eventData) throws ComException;
}
