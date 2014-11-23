/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{CF4CC2ED-7927-9AFE-39ED-5898746C43C7}")
public class _IRoomManagerCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IRoomManagerCallback {
  @DeclDISPID(4230)  public void OnQueryRooms(com.wilutions.mslib.uccollaborationlib.IRoomManager _source, com.wilutions.mslib.uccollaborationlib.IRoomCollection _rooms, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(4230,"OnQueryRooms", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_rooms!=null?_rooms:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(4231)  public void OnQueryRoomByUri(com.wilutions.mslib.uccollaborationlib.IRoomManager _source, com.wilutions.mslib.uccollaborationlib.IRoom _room, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(4231,"OnQueryRoomByUri", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_room!=null?_room:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IRoomManagerCallbackImpl(String progId) throws ComException {
    super(progId, "{0FDB5B86-DD44-41BF-A443-317FD19BBF3D}");
  }
  protected _IRoomManagerCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IRoomManagerCallbackImpl" + super.toString() + "]";
  }
}
