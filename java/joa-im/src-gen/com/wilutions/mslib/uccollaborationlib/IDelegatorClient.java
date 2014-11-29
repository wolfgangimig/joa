/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IDelegatorClient.
 * IDelegatorClient Interface 
 */
@CoInterface(guid="{80EDBF3A-812E-42B5-A67F-6CC6D9A19A6C}")
public interface IDelegatorClient extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ClientType getType() throws ComException;
  @DeclDISPID(1610743809)  public ClientState getState() throws ComException;
  @DeclDISPID(1610743810)  public String getUri() throws ComException;
  @DeclDISPID(1610743811)  public ISelf getSelf() throws ComException;
  @DeclDISPID(1610743812)  public IContactManager getContactManager() throws ComException;
  @DeclDISPID(1610743813)  public IConversationManager getConversationManager() throws ComException;
  @DeclDISPID(1610743814)  public IConferenceScheduler getConferenceScheduler() throws ComException;
  @DeclDISPID(1610809344)  public ILyncClient getLyncClient() throws ComException;
}
