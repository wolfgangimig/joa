/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IClient.
 * IClient Interface 
 */
@CoInterface(guid="{EE9F3E74-AC61-469E-80D6-E22BF4EEFF5C}")
public interface IClient extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ClientType getType() throws ComException;
  @DeclDISPID(1610743809)  public ClientState getState() throws ComException;
  @DeclDISPID(1610743810)  public String getUri() throws ComException;
  @DeclDISPID(1610743811)  public ISelf getSelf() throws ComException;
  @DeclDISPID(1610743812)  public IContactManager getContactManager() throws ComException;
  @DeclDISPID(1610743813)  public IConversationManager getConversationManager() throws ComException;
  @DeclDISPID(1610743814)  public IConferenceScheduler getConferenceScheduler() throws ComException;
}
