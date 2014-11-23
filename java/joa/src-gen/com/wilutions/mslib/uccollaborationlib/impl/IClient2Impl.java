/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{46B5C737-D1F6-965D-05F3-E3E3FD20E83A}")
public class IClient2Impl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IClient2 {
  @DeclDISPID(268435457)  public com.wilutions.mslib.uccollaborationlib.IContactManager getPrivateContactManager() throws ComException {
    final Object obj = this._dispatchCall(268435457,"PrivateContactManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IContactManagerImpl.class);
  }
  @DeclDISPID(268435458)  public com.wilutions.mslib.uccollaborationlib.IRoomManager getRoomManager() throws ComException {
    final Object obj = this._dispatchCall(268435458,"RoomManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IRoomManagerImpl.class);
  }
  @DeclDISPID(268435459)  public com.wilutions.mslib.uccollaborationlib.IClientSettings getSettings() throws ComException {
    final Object obj = this._dispatchCall(268435459,"Settings", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IClientSettingsImpl.class);
  }
  public IClient2Impl(String progId) throws ComException {
    super(progId, "{86225E5C-7595-4D1C-985D-8A0458D714C0}");
  }
  protected IClient2Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IClient2Impl" + super.toString() + "]";
  }
}
