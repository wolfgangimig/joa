/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IRoomManagerEvents.
 * _IRoomManagerEvents Interface 
 */
@CoInterface(guid="{E2C6D6E0-52EF-47A2-BDA9-9D6A7A29A391}")
public interface _IRoomManagerEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(4220)  public void onOnFollowedRoomAdded(final IRoomManager _eventSource, final IFollowedRoomsChangedEventData _eventData) throws ComException;
  @DeclDISPID(4221)  public void onOnFollowedRoomRemoved(final IRoomManager _eventSource, final IFollowedRoomsChangedEventData _eventData) throws ComException;
  @DeclDISPID(4222)  public void onOnRoomManagerStateChanged(final IRoomManager _eventSource, final IRoomManagerStateChangedEventData _eventData) throws ComException;
}
