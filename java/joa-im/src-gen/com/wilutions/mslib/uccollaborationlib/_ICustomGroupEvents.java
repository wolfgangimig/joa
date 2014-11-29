/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _ICustomGroupEvents.
 * _ICustomGroupEvents Interface 
 */
@CoInterface(guid="{F719ED75-B7BD-45D3-9097-254509226F20}")
public interface _ICustomGroupEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(500)  public void onOnNameChanged(final IGroup _eventSource, final IGroupNameChangedEventData _eventData) throws ComException;
  @DeclDISPID(501)  public void onOnContactAdded(final IGroup _eventSource, final IGroupMemberChangedEventData _eventData) throws ComException;
  @DeclDISPID(502)  public void onOnContactRemoved(final IGroup _eventSource, final IGroupMemberChangedEventData _eventData) throws ComException;
}
