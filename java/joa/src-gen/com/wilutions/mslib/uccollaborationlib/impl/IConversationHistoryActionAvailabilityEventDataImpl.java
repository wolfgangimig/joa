/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{5300663E-4A65-9443-1284-D7DD47BE2841}")
public class IConversationHistoryActionAvailabilityEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConversationHistoryActionAvailabilityEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ConversationHistoryAction getAction() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Action", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConversationHistoryAction.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public Boolean getIsAvailable() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"IsAvailable", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IConversationHistoryActionAvailabilityEventDataImpl(String progId) throws ComException {
    super(progId, "{9397FF55-EE06-4F02-8F2A-BE3AE249D4BB}");
  }
  protected IConversationHistoryActionAvailabilityEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConversationHistoryActionAvailabilityEventDataImpl" + super.toString() + "]";
  }
}
