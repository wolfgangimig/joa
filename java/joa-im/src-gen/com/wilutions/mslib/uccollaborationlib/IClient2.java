/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IClient2.
 * IClient2 Interface 
 */
@CoInterface(guid="{86225E5C-7595-4D1C-985D-8A0458D714C0}")
public interface IClient2 extends IDispatch {
  @DeclDISPID(268435457)  public IContactManager getPrivateContactManager() throws ComException;
  @DeclDISPID(268435458)  public IRoomManager getRoomManager() throws ComException;
  @DeclDISPID(268435459)  public IClientSettings getSettings() throws ComException;
}
