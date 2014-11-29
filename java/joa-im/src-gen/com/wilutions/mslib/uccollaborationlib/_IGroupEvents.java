/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IGroupEvents.
 * _IGroupEvents Interface 
 */
@CoInterface(guid="{9918673D-4D74-41CF-8840-D4996395A34C}")
public interface _IGroupEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(500)  public void onOnNameChanged(final IGroup _eventSource, final IGroupNameChangedEventData _eventData) throws ComException;
  @DeclDISPID(501)  public void onOnContactAdded(final IGroup _eventSource, final IGroupMemberChangedEventData _eventData) throws ComException;
  @DeclDISPID(502)  public void onOnContactRemoved(final IGroup _eventSource, final IGroupMemberChangedEventData _eventData) throws ComException;
}
