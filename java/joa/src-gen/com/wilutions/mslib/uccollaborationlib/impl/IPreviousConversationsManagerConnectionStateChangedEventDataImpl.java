/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{38ED64F1-3F9B-9185-0890-5A2377F4A1C9}")
public class IPreviousConversationsManagerConnectionStateChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManagerConnectionStateChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.PreviousConversationsConnectionState getConnectionState() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"ConnectionState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.PreviousConversationsConnectionState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.PreviousConversationsErrorType[] getErrors() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Errors", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.PreviousConversationsErrorType[])obj;
  }
  public IPreviousConversationsManagerConnectionStateChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{F87AFD9A-9BF8-4AC4-953E-33C4D2035D33}");
  }
  protected IPreviousConversationsManagerConnectionStateChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IPreviousConversationsManagerConnectionStateChangedEventDataImpl" + super.toString() + "]";
  }
}
