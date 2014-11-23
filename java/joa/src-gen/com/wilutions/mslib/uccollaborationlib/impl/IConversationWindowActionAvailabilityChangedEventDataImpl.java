/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C6EF5155-51E3-96D8-0D81-FAE13C457712}")
public class IConversationWindowActionAvailabilityChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConversationWindowActionAvailabilityChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ConversationWindowAction getAction() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Action", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConversationWindowAction.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public Boolean getIsAvailable() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"IsAvailable", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IConversationWindowActionAvailabilityChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{0678C83E-F580-4D99-902F-930699B28BE8}");
  }
  protected IConversationWindowActionAvailabilityChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConversationWindowActionAvailabilityChangedEventDataImpl" + super.toString() + "]";
  }
}
