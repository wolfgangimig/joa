/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IRoomManagerCallback.
 * _IRoomManagerCallback Interface 
 */
@CoInterface(guid="{0FDB5B86-DD44-41BF-A443-317FD19BBF3D}")
public interface _IRoomManagerCallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(4230)  public void OnQueryRooms(final IRoomManager _source, final IRoomCollection _rooms, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(4231)  public void OnQueryRoomByUri(final IRoomManager _source, final IRoom _room, final IAsynchronousOperation _asyncOperation) throws ComException;
}
