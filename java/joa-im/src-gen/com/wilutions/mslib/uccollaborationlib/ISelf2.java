/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ISelf2.
 * ISelf2 Interface 
 */
@CoInterface(guid="{3C8D7146-35EA-4133-B2F6-C1FC2401A091}")
public interface ISelf2 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(268435457)  public IAlertLevel GetAlertLevelForNotification(String _senderIdentity, NotificationTypes _notificationTypes, NotificationUrgencyType _notificationUrgency) throws ComException;
}
