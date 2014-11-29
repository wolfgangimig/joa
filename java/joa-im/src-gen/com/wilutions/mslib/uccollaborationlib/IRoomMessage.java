/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IRoomMessage.
 * IRoomMessage Interface 
 */
@CoInterface(guid="{A0C3E9BA-C622-45A2-9FED-2C662F3F489A}")
public interface IRoomMessage extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getId() throws ComException;
  @DeclDISPID(1610743809)  public IRoomMessageDictionary getMessageDictionary() throws ComException;
  @DeclDISPID(1610743810)  public java.util.Date getSentTime() throws ComException;
  @DeclDISPID(1610743811)  public String getSenderUri() throws ComException;
  @DeclDISPID(1610743812)  public String getRoomUri() throws ComException;
}
