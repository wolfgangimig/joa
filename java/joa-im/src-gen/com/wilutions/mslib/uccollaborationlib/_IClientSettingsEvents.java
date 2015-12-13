/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IClientSettingsEvents.
 * _IClientSettingsEvents Interface 
 */
@CoInterface(guid="{569E04F2-D286-4903-9642-44D850310956}")
public interface _IClientSettingsEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(5150)  public void onOnSettingChanged(final IClientSettings _eventSource, final IClientSettingsChangedEventData _eventData) throws ComException;
}
