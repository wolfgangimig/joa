/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{159BAAED-A6EA-93B9-2FAA-5FE3C76A12EA}")
public class IMessengerDebugImpl extends Dispatch implements com.wilutions.mslib.messengerapi.IMessengerDebug {
  @DeclDISPID(1610678272)  public Object GetTransportService() throws ComException {
    final Object obj = this._dispatchCall(1610678272,"GetTransportService", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610678273)  public Object GetPresenceService() throws ComException {
    final Object obj = this._dispatchCall(1610678273,"GetPresenceService", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610678274)  public Object getConversationMgr() throws ComException {
    final Object obj = this._dispatchCall(1610678274,"ConversationMgr", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public IMessengerDebugImpl(String progId) throws ComException {
    super(progId, "{D50C3386-0289-48F8-B204-3604629DEE10}");
  }
  protected IMessengerDebugImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMessengerDebugImpl" + super.toString() + "]";
  }
}
