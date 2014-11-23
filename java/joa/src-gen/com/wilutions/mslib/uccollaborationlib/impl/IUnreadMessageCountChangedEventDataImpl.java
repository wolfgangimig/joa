/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{786AD338-4385-92D4-381B-7AE162AFB59E}")
public class IUnreadMessageCountChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IUnreadMessageCountChangedEventData {
  @DeclDISPID(1610743808)  public Integer getNewUnreadMessageCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"NewUnreadMessageCount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IUnreadMessageCountChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{B8FD4A53-E7E6-4995-A5B5-1306C7584964}");
  }
  protected IUnreadMessageCountChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IUnreadMessageCountChangedEventDataImpl" + super.toString() + "]";
  }
}
