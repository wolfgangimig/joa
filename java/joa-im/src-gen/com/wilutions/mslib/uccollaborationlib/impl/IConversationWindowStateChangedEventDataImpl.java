/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{E29E79FA-FFF3-97EE-182C-A5BEDC7FCF8C}")
public class IConversationWindowStateChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConversationWindowStateChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ConversationWindowState getOldState() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"OldState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConversationWindowState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.ConversationWindowState getNewState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"NewState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConversationWindowState.valueOf((Integer)obj);
  }
  public IConversationWindowStateChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{2209E091-5B90-4CAF-8582-CC5979883376}");
  }
  protected IConversationWindowStateChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConversationWindowStateChangedEventDataImpl" + super.toString() + "]";
  }
}
