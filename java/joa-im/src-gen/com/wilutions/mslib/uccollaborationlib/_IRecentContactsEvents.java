/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IRecentContactsEvents.
 * _IRecentContactsEvents Interface 
 */
@CoInterface(guid="{011B320C-9AC1-4DDE-B595-3D0014472E2F}")
public interface _IRecentContactsEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(500)  public void onOnNameChanged(final IGroup _eventSource, final IGroupNameChangedEventData _eventData) throws ComException;
  @DeclDISPID(501)  public void onOnContactAdded(final IGroup _eventSource, final IGroupMemberChangedEventData _eventData) throws ComException;
  @DeclDISPID(502)  public void onOnContactRemoved(final IGroup _eventSource, final IGroupMemberChangedEventData _eventData) throws ComException;
}
