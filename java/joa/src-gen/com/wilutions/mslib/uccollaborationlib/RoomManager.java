/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomManager.
 * RoomManager class defines a manager for rooms. 
 */
@CoClass(guid="{0909F1E4-5F02-4E09-857D-BD951E956FC1}")
public class RoomManager extends Dispatch implements IRoomManager {
  @DeclDISPID(1610743808)  public RoomManagerState getState() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"State", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return RoomManagerState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public IRoom[] getFollowedRooms() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"FollowedRooms", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IRoom[])obj;
  }
  @DeclDISPID(1610743810)  public IAsynchronousOperation QueryRooms(String _keyword, RoomSearchModeType _searchType, Object _roomManagerCallback, Object _state) throws ComException {
    assert(_keyword != null);
    assert(_searchType != null);
    assert(_roomManagerCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743810,"QueryRooms", DISPATCH_METHOD,null,_keyword,_searchType.value,_roomManagerCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743811)  public IAsynchronousOperation QueryRoomByUri(String _roomUri, Object _roomManagerCallback, Object _state) throws ComException {
    assert(_roomUri != null);
    assert(_roomManagerCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743811,"QueryRoomByUri", DISPATCH_METHOD,null,_roomUri,_roomManagerCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743812)  public Boolean TryGetRoomByUri(String _roomUri, ByRef<IRoom> _room) throws ComException {
    assert(_roomUri != null);
    assert(_room != null);
    final Object obj = this._dispatchCall(1610743812,"TryGetRoomByUri", DISPATCH_METHOD,null,_roomUri,_room);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public RoomManager() throws ComException {
    super("{0909F1E4-5F02-4E09-857D-BD951E956FC1}", "{76DE1CD8-F278-48A1-A391-E5BEB8F428E6}");
  }
  protected RoomManager(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[RoomManager" + super.toString() + "]";
  }
}
