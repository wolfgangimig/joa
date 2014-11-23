/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{D2DF92BF-A34C-9C22-2455-28556FA30537}")
public class IContactSettingChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IContactSettingChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ContactSetting getSetting() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Setting", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ContactSetting.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public Object getValue() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public IContactSettingChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{12480BD4-072F-4763-B9FB-41B2CA54F9CD}");
  }
  protected IContactSettingChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IContactSettingChangedEventDataImpl" + super.toString() + "]";
  }
}
