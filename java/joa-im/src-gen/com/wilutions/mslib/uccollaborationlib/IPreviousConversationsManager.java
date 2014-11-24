/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IPreviousConversationsManager.
 * IPreviousConversationsManager Interface 
 */
@CoInterface(guid="{ACABFA1C-0738-4C4D-AF7E-326873CF4ACE}")
public interface IPreviousConversationsManager extends IDispatch {
  @DeclDISPID(1610743808)  public PreviousConversationsType getType() throws ComException;
  @DeclDISPID(1610743809)  public PreviousConversationsConnectionState getConnectionState() throws ComException;
  @DeclDISPID(1610743810)  public void Connect() throws ComException;
  @DeclDISPID(1610743811)  public void Reset() throws ComException;
  @DeclDISPID(1610743812)  public Integer getNewItemCountSinceLastReset() throws ComException;
  @DeclDISPID(1610743813)  public java.util.Date getAccessTime() throws ComException;
  @DeclDISPID(1610743814)  public Integer getMaxItems() throws ComException;
  @DeclDISPID(1610743814)  public void setMaxItems(Integer value) throws ComException;
  @DeclDISPID(1610743816)  public IAsynchronousOperation GetUnreadItems(Object _previousConversationsManagerCallback, Object _state) throws ComException;
  @DeclDISPID(1610743817)  public IAsynchronousOperation GetAllItems(Object _previousConversationsManagerCallback, Object _state) throws ComException;
}
