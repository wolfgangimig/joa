/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{40C060F6-8D4F-9830-0FC5-3AF543EDC6BA}")
public class ISummarizerStatesChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.ISummarizerStatesChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IConversation getTriggeringConversation() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"TriggeringConversation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConversationImpl.class);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.ConversationSummarizerStates getOldState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"OldState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConversationSummarizerStates.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.ConversationSummarizerStates getNewState() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"NewState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConversationSummarizerStates.valueOf((Integer)obj);
  }
  public ISummarizerStatesChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{8057F99D-292C-4371-926B-5312E61A3A40}");
  }
  protected ISummarizerStatesChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ISummarizerStatesChangedEventDataImpl" + super.toString() + "]";
  }
}
