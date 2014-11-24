/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * Client2.
 * Client Class which contains the contact and group manager, conversations manager and 
 * conference scheduler. 
 */
@CoClass(guid="{66D123BA-11E2-4C2C-8056-5ACA97245CD2}")
public class Client2 extends Dispatch implements IClient2 {
  @DeclDISPID(268435457)  public IContactManager getPrivateContactManager() throws ComException {
    final Object obj = this._dispatchCall(268435457,"PrivateContactManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactManagerImpl.class);
  }
  @DeclDISPID(268435458)  public IRoomManager getRoomManager() throws ComException {
    final Object obj = this._dispatchCall(268435458,"RoomManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IRoomManagerImpl.class);
  }
  @DeclDISPID(268435459)  public IClientSettings getSettings() throws ComException {
    final Object obj = this._dispatchCall(268435459,"Settings", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IClientSettingsImpl.class);
  }
  public Client2() throws ComException {
    super("{66D123BA-11E2-4C2C-8056-5ACA97245CD2}", "{86225E5C-7595-4D1C-985D-8A0458D714C0}");
  }
  protected Client2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Client2" + super.toString() + "]";
  }
}
