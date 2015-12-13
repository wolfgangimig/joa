/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IDistributionGroupEvents.
 * _IDistributionGroupEvents Interface 
 */
@CoInterface(guid="{082EE280-726E-417F-99CB-81A0CCBFF883}")
public interface _IDistributionGroupEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(500)  public void onOnNameChanged(final IGroup _eventSource, final IGroupNameChangedEventData _eventData) throws ComException;
  @DeclDISPID(501)  public void onOnContactAdded(final IGroup _eventSource, final IGroupMemberChangedEventData _eventData) throws ComException;
  @DeclDISPID(502)  public void onOnContactRemoved(final IGroup _eventSource, final IGroupMemberChangedEventData _eventData) throws ComException;
  @DeclDISPID(503)  public void onOnExpansionStateChanged(final IDistributionGroup _eventSource, final IDistributionGroupExpansionStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(505)  public void onOnNestedGroupAdded(final IDistributionGroup _eventSource, final IGroupCollectionChangedEventData _eventData) throws ComException;
  @DeclDISPID(506)  public void onOnNestedGroupRemoved(final IDistributionGroup _eventSource, final IGroupCollectionChangedEventData _eventData) throws ComException;
  @DeclDISPID(507)  public void onOnDescriptionChanged(final IDistributionGroup _eventSource, final IDescriptionChangedEventData _eventData) throws ComException;
}
