/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IRoomManager.
 * IRoomManager Interface 
 */
@CoInterface(guid="{76DE1CD8-F278-48A1-A391-E5BEB8F428E6}")
public interface IRoomManager extends IDispatch {
  @DeclDISPID(1610743808)  public RoomManagerState getState() throws ComException;
  @DeclDISPID(1610743809)  public IRoom[] getFollowedRooms() throws ComException;
  @DeclDISPID(1610743810)  public IAsynchronousOperation QueryRooms(String _keyword, RoomSearchModeType _searchType, Object _roomManagerCallback, Object _state) throws ComException;
  @DeclDISPID(1610743811)  public IAsynchronousOperation QueryRoomByUri(String _roomUri, Object _roomManagerCallback, Object _state) throws ComException;
  @DeclDISPID(1610743812)  public Boolean TryGetRoomByUri(String _roomUri, ByRef<IRoom> _room) throws ComException;
}
