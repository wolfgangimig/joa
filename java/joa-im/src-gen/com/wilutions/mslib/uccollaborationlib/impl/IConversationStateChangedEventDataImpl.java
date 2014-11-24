/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{EA041CC1-6B02-9506-2BE2-48AA415351EB}")
public class IConversationStateChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConversationStateChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ConversationState getOldState() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"OldState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConversationState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.ConversationState getNewState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"NewState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConversationState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public Integer getStatusCode() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"StatusCode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.IConversationStateChangePropertyDictionary getProperties() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Properties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationStateChangePropertyDictionaryImpl.class);
  }
  public IConversationStateChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{2A9385AA-CF61-4E47-B64C-214DE4A4AD11}");
  }
  protected IConversationStateChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConversationStateChangedEventDataImpl" + super.toString() + "]";
  }
}
