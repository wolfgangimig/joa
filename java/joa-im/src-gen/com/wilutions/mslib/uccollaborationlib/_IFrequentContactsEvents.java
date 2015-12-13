/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IFrequentContactsEvents.
 * _IFrequentContactsEvents Interface 
 */
@CoInterface(guid="{AA186C92-181E-417F-B150-FCA0F367E0FC}")
public interface _IFrequentContactsEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(500)  public void onOnNameChanged(final IGroup _eventSource, final IGroupNameChangedEventData _eventData) throws ComException;
  @DeclDISPID(501)  public void onOnContactAdded(final IGroup _eventSource, final IGroupMemberChangedEventData _eventData) throws ComException;
  @DeclDISPID(502)  public void onOnContactRemoved(final IGroup _eventSource, final IGroupMemberChangedEventData _eventData) throws ComException;
  @DeclDISPID(504)  public void onOnContactPositionChanged(final IFrequentContacts _eventSource, final IContactPositionChangedEventData _eventData) throws ComException;
}
