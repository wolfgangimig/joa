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
  @DeclDISPID(500)  public void onOnNameChanged(IGroup _eventSource, IGroupNameChangedEventData _eventData) throws ComException;
  @DeclDISPID(501)  public void onOnContactAdded(IGroup _eventSource, IGroupMemberChangedEventData _eventData) throws ComException;
  @DeclDISPID(502)  public void onOnContactRemoved(IGroup _eventSource, IGroupMemberChangedEventData _eventData) throws ComException;
  @DeclDISPID(503)  public void onOnExpansionStateChanged(IDistributionGroup _eventSource, IDistributionGroupExpansionStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(505)  public void onOnNestedGroupAdded(IDistributionGroup _eventSource, IGroupCollectionChangedEventData _eventData) throws ComException;
  @DeclDISPID(506)  public void onOnNestedGroupRemoved(IDistributionGroup _eventSource, IGroupCollectionChangedEventData _eventData) throws ComException;
  @DeclDISPID(507)  public void onOnDescriptionChanged(IDistributionGroup _eventSource, IDescriptionChangedEventData _eventData) throws ComException;
}
