/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * AlertLevel.
 * AlertLevel Coclass 
 */
@CoClass(guid="{3BC642EF-64BE-45AE-982D-BABDAABB355A}")
public class AlertLevel extends Dispatch implements IAlertLevel {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Boolean getNotificationEnabled() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"NotificationEnabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743809)  public AlertPrivacyType getLevelOfPrivacy() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"LevelOfPrivacy", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return AlertPrivacyType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public AlertModeTypes getAlertModes() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"AlertModes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return AlertModeTypes.valueOf((Integer)obj);
  }
  public AlertLevel() throws ComException {
    super("{3BC642EF-64BE-45AE-982D-BABDAABB355A}", "{FB67275C-4D9E-4C32-9793-A96749884FC1}");
  }
  protected AlertLevel(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AlertLevel" + super.toString() + "]";
  }
}
