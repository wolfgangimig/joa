/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IRecentContactsEvents.
 * _IRecentContactsEvents Interface 
 */
@CoInterface(guid="{011B320C-9AC1-4DDE-B595-3D0014472E2F}")
public interface _IRecentContactsEvents extends IDispatch {
  @DeclDISPID(500)  public void onOnNameChanged(IGroup _eventSource, IGroupNameChangedEventData _eventData) throws ComException;
  @DeclDISPID(501)  public void onOnContactAdded(IGroup _eventSource, IGroupMemberChangedEventData _eventData) throws ComException;
  @DeclDISPID(502)  public void onOnContactRemoved(IGroup _eventSource, IGroupMemberChangedEventData _eventData) throws ComException;
}
