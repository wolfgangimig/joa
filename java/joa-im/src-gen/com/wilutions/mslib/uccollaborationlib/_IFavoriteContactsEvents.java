/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IFavoriteContactsEvents.
 * _IFavoriteContactsEvents Interface 
 */
@CoInterface(guid="{DAB42E13-500A-409A-AC34-C1BF4719EE2E}")
public interface _IFavoriteContactsEvents extends IDispatch {
  @DeclDISPID(500)  public void onOnNameChanged(IGroup _eventSource, IGroupNameChangedEventData _eventData) throws ComException;
  @DeclDISPID(501)  public void onOnContactAdded(IGroup _eventSource, IGroupMemberChangedEventData _eventData) throws ComException;
  @DeclDISPID(502)  public void onOnContactRemoved(IGroup _eventSource, IGroupMemberChangedEventData _eventData) throws ComException;
}
