/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{5A259A7F-163B-93B9-2BF7-C4C2A80DDC0F}")
public class ILyncClientNotificationReceivedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.ILyncClientNotificationReceivedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.LyncClientNotification getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.LyncClientNotification.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.MapiStatus getMapiStatus() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"MapiStatus", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.MapiStatus.valueOf((Integer)obj);
  }
  public ILyncClientNotificationReceivedEventDataImpl(String progId) throws ComException {
    super(progId, "{9AB20314-B258-48F8-B659-AD250DFA20F5}");
  }
  protected ILyncClientNotificationReceivedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ILyncClientNotificationReceivedEventDataImpl" + super.toString() + "]";
  }
}
