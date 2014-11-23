/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{B64985B3-561B-93E0-3E3F-8C591D03D41C}")
public class IRoomManagerImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IRoomManager {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.RoomManagerState getState() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"State", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.RoomManagerState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.IRoom[] getFollowedRooms() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"FollowedRooms", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.IRoom[])obj;
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation QueryRooms(String _keyword, com.wilutions.mslib.uccollaborationlib.RoomSearchModeType _searchType, Object _roomManagerCallback, Object _state) throws ComException {
    assert(_keyword != null);
    assert(_searchType != null);
    assert(_roomManagerCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743810,"QueryRooms", DISPATCH_METHOD,null,_keyword,_searchType.value,_roomManagerCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation QueryRoomByUri(String _roomUri, Object _roomManagerCallback, Object _state) throws ComException {
    assert(_roomUri != null);
    assert(_roomManagerCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743811,"QueryRoomByUri", DISPATCH_METHOD,null,_roomUri,_roomManagerCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743812)  public Boolean TryGetRoomByUri(String _roomUri, ByRef<com.wilutions.mslib.uccollaborationlib.IRoom> _room) throws ComException {
    assert(_roomUri != null);
    assert(_room != null);
    final Object obj = this._dispatchCall(1610743812,"TryGetRoomByUri", DISPATCH_METHOD,null,_roomUri,_room);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IRoomManagerImpl(String progId) throws ComException {
    super(progId, "{76DE1CD8-F278-48A1-A391-E5BEB8F428E6}");
  }
  protected IRoomManagerImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IRoomManagerImpl" + super.toString() + "]";
  }
}
