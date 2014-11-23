/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{ECCE31ED-08B0-9DFA-1602-15FBFC0CD2F7}")
public class IPreviousConversationsManagerNewItemCountChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManagerNewItemCountChangedEventData {
  @DeclDISPID(1610743808)  public Integer getNewItemCountSinceLastReset() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"NewItemCountSinceLastReset", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IPreviousConversationsManagerNewItemCountChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{2C59A886-ACD3-46BB-8BAC-7C1C59FB2E0D}");
  }
  protected IPreviousConversationsManagerNewItemCountChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IPreviousConversationsManagerNewItemCountChangedEventDataImpl" + super.toString() + "]";
  }
}
