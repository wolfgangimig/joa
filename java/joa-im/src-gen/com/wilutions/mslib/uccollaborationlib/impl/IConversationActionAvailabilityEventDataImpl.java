/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{485111DB-9D6B-9717-3F46-90ED12F239CC}")
public class IConversationActionAvailabilityEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConversationActionAvailabilityEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ConversationAction getAction() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Action", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConversationAction.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public Boolean getIsAvailable() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"IsAvailable", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IConversationActionAvailabilityEventDataImpl(String progId) throws ComException {
    super(progId, "{88C688B0-3908-4C56-A2E8-F90AB705C536}");
  }
  protected IConversationActionAvailabilityEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConversationActionAvailabilityEventDataImpl" + super.toString() + "]";
  }
}
