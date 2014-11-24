/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IAccessPermissionEvents.
 * _IAccessPermissionEvents Interface 
 */
@CoInterface(guid="{DC4BC923-6A52-4F02-9F8A-547B606955E7}")
public interface _IAccessPermissionEvents extends IDispatch {
  @DeclDISPID(1950)  public void onOnAccessEntryAdded(IAccessPermission _eventSource, IAccessEntryCollectionChangedEventData _eventData) throws ComException;
  @DeclDISPID(1951)  public void onOnAccessEntryRemoved(IAccessPermission _eventSource, IAccessEntryCollectionChangedEventData _eventData) throws ComException;
}
