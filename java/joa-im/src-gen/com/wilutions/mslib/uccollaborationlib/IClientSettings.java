/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IClientSettings.
 * IClientSettings Interface 
 */
@CoInterface(guid="{1B04D929-11E4-46C2-9162-EA4F2758C3A7}")
public interface IClientSettings extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(0)  public Object getItem(ClientSettingsType _settingType) throws ComException;
  @DeclDISPID(0)  public void setItem(ClientSettingsType _settingType, Object value2) throws ComException;
  @DeclDISPID(1610743810)  public Boolean CanSetValue(ClientSettingsType _settingType) throws ComException;
}
