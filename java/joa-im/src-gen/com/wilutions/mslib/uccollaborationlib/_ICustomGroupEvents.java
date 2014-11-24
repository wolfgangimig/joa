/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _ICustomGroupEvents.
 * _ICustomGroupEvents Interface 
 */
@CoInterface(guid="{F719ED75-B7BD-45D3-9097-254509226F20}")
public interface _ICustomGroupEvents extends IDispatch {
  @DeclDISPID(500)  public void onOnNameChanged(IGroup _eventSource, IGroupNameChangedEventData _eventData) throws ComException;
  @DeclDISPID(501)  public void onOnContactAdded(IGroup _eventSource, IGroupMemberChangedEventData _eventData) throws ComException;
  @DeclDISPID(502)  public void onOnContactRemoved(IGroup _eventSource, IGroupMemberChangedEventData _eventData) throws ComException;
}
