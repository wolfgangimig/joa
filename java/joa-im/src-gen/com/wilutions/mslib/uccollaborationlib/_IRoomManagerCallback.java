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
  @DeclDISPID(4230)  public void OnQueryRooms(IRoomManager _source, IRoomCollection _rooms, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(4231)  public void OnQueryRoomByUri(IRoomManager _source, IRoom _room, IAsynchronousOperation _asyncOperation) throws ComException;
}
