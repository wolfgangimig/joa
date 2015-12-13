/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{3BF0BE37-E9FD-9773-0A3D-C080EC7FB33B}")
public class IAlertLevelImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IAlertLevel {
  @DeclDISPID(1610743808)  public Boolean getNotificationEnabled() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"NotificationEnabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.AlertPrivacyType getLevelOfPrivacy() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"LevelOfPrivacy", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.AlertPrivacyType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.AlertModeTypes getAlertModes() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"AlertModes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.AlertModeTypes.valueOf((Integer)obj);
  }
  public IAlertLevelImpl(String progId) throws ComException {
    super(progId, "{FB67275C-4D9E-4C32-9793-A96749884FC1}");
  }
  protected IAlertLevelImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IAlertLevelImpl" + super.toString() + "]";
  }
}
