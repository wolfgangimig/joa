/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IRoomCallback.
 * _IRoomCallback Interface 
 */
@CoInterface(guid="{628D7BDD-45AB-404D-8505-B3ADC15F454D}")
public interface _IRoomCallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(4212)  public void OnSetProperty(IRoom _source, RoomProperty _propertyType, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(4210)  public void OnSendMessage(IRoom _source, IRoomMessage _roomMessage, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(4211)  public void OnRetrieveAdditionalMessages(IRoom _source, IRoomMessageCollection _roomMessages, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(4213)  public void OnJoin(IRoom _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(4214)  public void OnLeave(IRoom _source, IAsynchronousOperation _asyncOperation) throws ComException;
}
