/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IVoiceMailsManager.
 * IVoiceMailsManager Interface 
 */
@CoInterface(guid="{E24C2484-C70D-44AB-8A4E-F1585A17A3E1}")
public interface IVoiceMailsManager extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public PreviousConversationsConnectionState getConnectionState() throws ComException;
  @DeclDISPID(1610743809)  public void Connect() throws ComException;
  @DeclDISPID(1610743810)  public void Reset() throws ComException;
  @DeclDISPID(1610743811)  public Integer getNewVoiceMailCountSinceLastReset() throws ComException;
  @DeclDISPID(1610743812)  public Integer getMaxItems() throws ComException;
  @DeclDISPID(1610743812)  public void setMaxItems(Integer value) throws ComException;
  @DeclDISPID(1610743814)  public IAsynchronousOperation GetUnreadVoiceMails(Object _voiceMailsManagerCallback, Object _state) throws ComException;
  @DeclDISPID(1610743815)  public IAsynchronousOperation GetAllVoiceMails(Object _voiceMailsManagerCallback, Object _state) throws ComException;
}
