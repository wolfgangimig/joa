/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{FC1AE82D-9189-9A72-2F58-A81B81F65C6B}")
public class ISelf2Impl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.ISelf2 {
  @DeclDISPID(268435457)  public com.wilutions.mslib.uccollaborationlib.IAlertLevel GetAlertLevelForNotification(String _senderIdentity, com.wilutions.mslib.uccollaborationlib.NotificationTypes _notificationTypes, com.wilutions.mslib.uccollaborationlib.NotificationUrgencyType _notificationUrgency) throws ComException {
    assert(_senderIdentity != null);
    assert(_notificationTypes != null);
    assert(_notificationUrgency != null);
    final Object obj = this._dispatchCall(268435457,"GetAlertLevelForNotification", DISPATCH_METHOD,null,_senderIdentity,_notificationTypes.value,_notificationUrgency.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAlertLevelImpl.class);
  }
  public ISelf2Impl(String progId) throws ComException {
    super(progId, "{3C8D7146-35EA-4133-B2F6-C1FC2401A091}");
  }
  protected ISelf2Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ISelf2Impl" + super.toString() + "]";
  }
}
