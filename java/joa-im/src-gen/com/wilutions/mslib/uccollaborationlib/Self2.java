/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * Self2.
 * Self2 Coclass 
 */
@CoClass(guid="{8B9F0B59-7C29-46E2-B6A6-804043A346DB}")
public class Self2 extends Dispatch implements ISelf2 {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(268435457)  public IAlertLevel GetAlertLevelForNotification(final String _senderIdentity, final NotificationTypes _notificationTypes, final NotificationUrgencyType _notificationUrgency) throws ComException {
    assert(_senderIdentity != null);
    assert(_notificationTypes != null);
    assert(_notificationUrgency != null);
    final Object obj = this._dispatchCall(268435457,"GetAlertLevelForNotification", DISPATCH_METHOD,null,_senderIdentity,_notificationTypes.value,_notificationUrgency.value);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAlertLevelImpl.class);
  }
  public Self2() throws ComException {
    super("{8B9F0B59-7C29-46E2-B6A6-804043A346DB}", "{3C8D7146-35EA-4133-B2F6-C1FC2401A091}");
  }
  protected Self2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Self2" + super.toString() + "]";
  }
}
