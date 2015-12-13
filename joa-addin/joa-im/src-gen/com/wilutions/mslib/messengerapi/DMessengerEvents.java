/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * DMessengerEvents.
 * Messenger Events 
 */
@CoInterface(guid="{C9A6A6B6-9BC1-43A5-B06B-E58874EEBC96}")
public interface DMessengerEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1045)  public void onOnGroupAdded(final Integer hr, final IDispatch pMGroup) throws ComException;
  @DeclDISPID(1046)  public void onOnGroupRemoved(final Integer hr, final IDispatch pMGroup) throws ComException;
  @DeclDISPID(1047)  public void onOnGroupNameChanged(final Integer hr, final IDispatch pMGroup) throws ComException;
  @DeclDISPID(1048)  public void onOnContactAddedToGroup(final Integer hr, final IDispatch pMGroup, final IDispatch pMContact) throws ComException;
  @DeclDISPID(1049)  public void onOnContactRemovedFromGroup(final Integer hr, final IDispatch pMGroup, final IDispatch pMContact) throws ComException;
  @DeclDISPID(1041)  public void onOnIMWindowCreated(final IDispatch pIMWindow) throws ComException;
  @DeclDISPID(1042)  public void onOnIMWindowDestroyed(final IDispatch pIMWindow) throws ComException;
  @DeclDISPID(1043)  public void onOnIMWindowContactAdded(final IDispatch pContact, final IDispatch pIMWindow) throws ComException;
  @DeclDISPID(1044)  public void onOnIMWindowContactRemoved(final IDispatch pContact, final IDispatch pIMWindow) throws ComException;
  @DeclDISPID(1032)  public void onOnAppShutdown() throws ComException;
  @DeclDISPID(1024)  public void onOnSignin(final Integer hr) throws ComException;
  @DeclDISPID(1025)  public void onOnSignout() throws ComException;
  @DeclDISPID(1026)  public void onOnContactListAdd(final Integer hr, final IDispatch pMContact) throws ComException;
  @DeclDISPID(1027)  public void onOnContactListRemove(final Integer hr, final IDispatch pMContact) throws ComException;
  @DeclDISPID(1029)  public void onOnMyFriendlyNameChange(final Integer hr, final String bstrPrevFriendlyName) throws ComException;
  @DeclDISPID(1031)  public void onOnMyStatusChange(final Integer hr, final MISTATUS mMyStatus) throws ComException;
  @DeclDISPID(1038)  public void onOnMyPhoneChange(final MPHONE_TYPE PhoneType, final String bstrNumber) throws ComException;
  @DeclDISPID(1033)  public void onOnMyPropertyChange(final Integer hr, final MCONTACTPROPERTY ePropType, final Object vPropVal) throws ComException;
  @DeclDISPID(1028)  public void onOnContactFriendlyNameChange(final Integer hr, final IDispatch pMContact, final String bstrPrevFriendlyName) throws ComException;
  @DeclDISPID(1030)  public void onOnContactStatusChange(final IDispatch pMContact, final MISTATUS mStatus) throws ComException;
  @DeclDISPID(1034)  public void onOnContactPropertyChange(final Integer hr, final IDispatch pContact, final MCONTACTPROPERTY ePropType, final Object vPropVal) throws ComException;
  @DeclDISPID(1035)  public void onOnContactBlockChange(final Integer hr, final IDispatch pContact, final Boolean pBoolBlock) throws ComException;
  @DeclDISPID(1036)  public void onOnContactPagerChange(final Integer hr, final IDispatch pContact, final Boolean pBoolPage) throws ComException;
  @DeclDISPID(1037)  public void onOnContactPhoneChange(final Integer hr, final IDispatch pContact, final MPHONE_TYPE PhoneType, final String bstrNumber) throws ComException;
  @DeclDISPID(1039)  public void onOnUnreadEmailChange(final MUAFOLDER mFolder, final Integer cUnreadEmail, final ByRef<Boolean> pBoolfEnableDefault) throws ComException;
  @DeclDISPID(1050)  public void onOnEmoticonListChange() throws ComException;
  @DeclDISPID(1104)  public void onOnUTDone(final Integer hr) throws ComException;
  @DeclDISPID(1105)  public void onOnUTLogStatement(final Integer hr, final String bstrStatement) throws ComException;
}
