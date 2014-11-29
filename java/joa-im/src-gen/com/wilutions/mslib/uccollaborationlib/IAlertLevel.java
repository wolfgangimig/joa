/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IAlertLevel.
 * IAlertLevel Interface 
 */
@CoInterface(guid="{FB67275C-4D9E-4C32-9793-A96749884FC1}")
public interface IAlertLevel extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Boolean getNotificationEnabled() throws ComException;
  @DeclDISPID(1610743809)  public AlertPrivacyType getLevelOfPrivacy() throws ComException;
  @DeclDISPID(1610743810)  public AlertModeTypes getAlertModes() throws ComException;
}
