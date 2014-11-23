/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ClientSettings.
 * Client setting class for user to get/set client settings. 
 */
@CoClass(guid="{8EB30566-8E31-4DD9-B1E7-477756160076}")
public class ClientSettings extends Dispatch implements IClientSettings {
  @DeclDISPID(0)  public Object getItem(ClientSettingsType _settingType) throws ComException {
    assert(_settingType != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_settingType.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public void setItem(ClientSettingsType _settingType, Object value2) throws ComException {
    assert(value2 != null);
    assert(_settingType != null);
    this._dispatchCall(0,"Item", DISPATCH_PROPERTYPUT,value2,_settingType.value);
  }
  @DeclDISPID(1610743810)  public Boolean CanSetValue(ClientSettingsType _settingType) throws ComException {
    assert(_settingType != null);
    final Object obj = this._dispatchCall(1610743810,"CanSetValue", DISPATCH_METHOD,null,_settingType.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public ClientSettings() throws ComException {
    super("{8EB30566-8E31-4DD9-B1E7-477756160076}", "{1B04D929-11E4-46C2-9162-EA4F2758C3A7}");
  }
  protected ClientSettings(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ClientSettings" + super.toString() + "]";
  }
}
