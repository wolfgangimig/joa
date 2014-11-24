/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{86DACB43-3B0B-905E-299E-7C8DB5B9D77F}")
public class IPreviousHistoryRetrievalStateChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IPreviousHistoryRetrievalStateChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.PreviousConversationHistoryRetrievalState getOldState() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"OldState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.PreviousConversationHistoryRetrievalState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.PreviousConversationHistoryRetrievalState getNewState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"NewState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.PreviousConversationHistoryRetrievalState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public Integer getStatusCode() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"StatusCode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IPreviousHistoryRetrievalStateChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{464D5228-9F68-4B1F-B430-156A104E2B85}");
  }
  protected IPreviousHistoryRetrievalStateChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IPreviousHistoryRetrievalStateChangedEventDataImpl" + super.toString() + "]";
  }
}
