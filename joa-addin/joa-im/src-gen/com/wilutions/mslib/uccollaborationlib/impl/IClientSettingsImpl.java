/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{DB934042-B587-9D83-0CCC-83A882AF3F5D}")
public class IClientSettingsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IClientSettings {
  @DeclDISPID(0)  public Object getItem(final com.wilutions.mslib.uccollaborationlib.ClientSettingsType _settingType) throws ComException {
    assert(_settingType != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_settingType.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public void setItem(final com.wilutions.mslib.uccollaborationlib.ClientSettingsType _settingType, final Object value2) throws ComException {
    assert(value2 != null);
    assert(_settingType != null);
    this._dispatchCall(0,"Item", DISPATCH_PROPERTYPUT,value2,_settingType.value);
  }
  @DeclDISPID(1610743810)  public Boolean CanSetValue(final com.wilutions.mslib.uccollaborationlib.ClientSettingsType _settingType) throws ComException {
    assert(_settingType != null);
    final Object obj = this._dispatchCall(1610743810,"CanSetValue", DISPATCH_METHOD,null,_settingType.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IClientSettingsImpl(String progId) throws ComException {
    super(progId, "{1B04D929-11E4-46C2-9162-EA4F2758C3A7}");
  }
  protected IClientSettingsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IClientSettingsImpl" + super.toString() + "]";
  }
}
