/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{5023030B-D6CC-9821-0235-F88A12A7B6C6}")
public class IAlertLevelChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IAlertLevelChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.NotificationTypes getChangedNotificationTypes() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"ChangedNotificationTypes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.NotificationTypes.valueOf((Integer)obj);
  }
  public IAlertLevelChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{90B49A60-72AF-4360-9F9B-916DB7504A3C}");
  }
  protected IAlertLevelChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IAlertLevelChangedEventDataImpl" + super.toString() + "]";
  }
}
