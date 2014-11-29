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
  @DeclDISPID(4212)  public void OnSetProperty(final IRoom _source, final RoomProperty _propertyType, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(4210)  public void OnSendMessage(final IRoom _source, final IRoomMessage _roomMessage, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(4211)  public void OnRetrieveAdditionalMessages(final IRoom _source, final IRoomMessageCollection _roomMessages, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(4213)  public void OnJoin(final IRoom _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(4214)  public void OnLeave(final IRoom _source, final IAsynchronousOperation _asyncOperation) throws ComException;
}
