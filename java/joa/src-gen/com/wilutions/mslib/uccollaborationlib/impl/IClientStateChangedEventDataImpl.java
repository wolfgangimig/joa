/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{5BADE946-FF82-948F-301D-825A86178439}")
public class IClientStateChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IClientStateChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ClientState getNewState() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"NewState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ClientState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.ClientState getOldState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"OldState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ClientState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public Integer getStatusCode() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"StatusCode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IClientStateChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{9B3A702D-5BE1-4FCE-ADB3-EBBD23E078C3}");
  }
  protected IClientStateChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IClientStateChangedEventDataImpl" + super.toString() + "]";
  }
}
