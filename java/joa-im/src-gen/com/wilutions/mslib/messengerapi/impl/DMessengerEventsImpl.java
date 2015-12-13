/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{09313FDD-3FA2-98E4-2DC5-8C6FD119406C}")
public class DMessengerEventsImpl extends Dispatch implements com.wilutions.mslib.messengerapi.DMessengerEvents {
  @DeclDISPID(1045)  public void onOnGroupAdded(final Integer hr, final IDispatch pMGroup) throws ComException {
    assert(hr != null);
    this._dispatchCall(1045,"OnGroupAdded", DISPATCH_METHOD,null,hr,(pMGroup!=null?pMGroup:Dispatch.NULL));
  }
  @DeclDISPID(1046)  public void onOnGroupRemoved(final Integer hr, final IDispatch pMGroup) throws ComException {
    assert(hr != null);
    this._dispatchCall(1046,"OnGroupRemoved", DISPATCH_METHOD,null,hr,(pMGroup!=null?pMGroup:Dispatch.NULL));
  }
  @DeclDISPID(1047)  public void onOnGroupNameChanged(final Integer hr, final IDispatch pMGroup) throws ComException {
    assert(hr != null);
    this._dispatchCall(1047,"OnGroupNameChanged", DISPATCH_METHOD,null,hr,(pMGroup!=null?pMGroup:Dispatch.NULL));
  }
  @DeclDISPID(1048)  public void onOnContactAddedToGroup(final Integer hr, final IDispatch pMGroup, final IDispatch pMContact) throws ComException {
    assert(hr != null);
    this._dispatchCall(1048,"OnContactAddedToGroup", DISPATCH_METHOD,null,hr,(pMGroup!=null?pMGroup:Dispatch.NULL),(pMContact!=null?pMContact:Dispatch.NULL));
  }
  @DeclDISPID(1049)  public void onOnContactRemovedFromGroup(final Integer hr, final IDispatch pMGroup, final IDispatch pMContact) throws ComException {
    assert(hr != null);
    this._dispatchCall(1049,"OnContactRemovedFromGroup", DISPATCH_METHOD,null,hr,(pMGroup!=null?pMGroup:Dispatch.NULL),(pMContact!=null?pMContact:Dispatch.NULL));
  }
  @DeclDISPID(1041)  public void onOnIMWindowCreated(final IDispatch pIMWindow) throws ComException {
    this._dispatchCall(1041,"OnIMWindowCreated", DISPATCH_METHOD,null,(pIMWindow!=null?pIMWindow:Dispatch.NULL));
  }
  @DeclDISPID(1042)  public void onOnIMWindowDestroyed(final IDispatch pIMWindow) throws ComException {
    this._dispatchCall(1042,"OnIMWindowDestroyed", DISPATCH_METHOD,null,(pIMWindow!=null?pIMWindow:Dispatch.NULL));
  }
  @DeclDISPID(1043)  public void onOnIMWindowContactAdded(final IDispatch pContact, final IDispatch pIMWindow) throws ComException {
    this._dispatchCall(1043,"OnIMWindowContactAdded", DISPATCH_METHOD,null,(pContact!=null?pContact:Dispatch.NULL),(pIMWindow!=null?pIMWindow:Dispatch.NULL));
  }
  @DeclDISPID(1044)  public void onOnIMWindowContactRemoved(final IDispatch pContact, final IDispatch pIMWindow) throws ComException {
    this._dispatchCall(1044,"OnIMWindowContactRemoved", DISPATCH_METHOD,null,(pContact!=null?pContact:Dispatch.NULL),(pIMWindow!=null?pIMWindow:Dispatch.NULL));
  }
  @DeclDISPID(1032)  public void onOnAppShutdown() throws ComException {
    this._dispatchCall(1032,"OnAppShutdown", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1024)  public void onOnSignin(final Integer hr) throws ComException {
    assert(hr != null);
    this._dispatchCall(1024,"OnSignin", DISPATCH_METHOD,null,hr);
  }
  @DeclDISPID(1025)  public void onOnSignout() throws ComException {
    this._dispatchCall(1025,"OnSignout", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1026)  public void onOnContactListAdd(final Integer hr, final IDispatch pMContact) throws ComException {
    assert(hr != null);
    this._dispatchCall(1026,"OnContactListAdd", DISPATCH_METHOD,null,hr,(pMContact!=null?pMContact:Dispatch.NULL));
  }
  @DeclDISPID(1027)  public void onOnContactListRemove(final Integer hr, final IDispatch pMContact) throws ComException {
    assert(hr != null);
    this._dispatchCall(1027,"OnContactListRemove", DISPATCH_METHOD,null,hr,(pMContact!=null?pMContact:Dispatch.NULL));
  }
  @DeclDISPID(1029)  public void onOnMyFriendlyNameChange(final Integer hr, final String bstrPrevFriendlyName) throws ComException {
    assert(hr != null);
    assert(bstrPrevFriendlyName != null);
    this._dispatchCall(1029,"OnMyFriendlyNameChange", DISPATCH_METHOD,null,hr,bstrPrevFriendlyName);
  }
  @DeclDISPID(1031)  public void onOnMyStatusChange(final Integer hr, final com.wilutions.mslib.messengerapi.MISTATUS mMyStatus) throws ComException {
    assert(hr != null);
    assert(mMyStatus != null);
    this._dispatchCall(1031,"OnMyStatusChange", DISPATCH_METHOD,null,hr,mMyStatus.value);
  }
  @DeclDISPID(1038)  public void onOnMyPhoneChange(final com.wilutions.mslib.messengerapi.MPHONE_TYPE PhoneType, final String bstrNumber) throws ComException {
    assert(PhoneType != null);
    assert(bstrNumber != null);
    this._dispatchCall(1038,"OnMyPhoneChange", DISPATCH_METHOD,null,PhoneType.value,bstrNumber);
  }
  @DeclDISPID(1033)  public void onOnMyPropertyChange(final Integer hr, final com.wilutions.mslib.messengerapi.MCONTACTPROPERTY ePropType, final Object vPropVal) throws ComException {
    assert(hr != null);
    assert(ePropType != null);
    assert(vPropVal != null);
    this._dispatchCall(1033,"OnMyPropertyChange", DISPATCH_METHOD,null,hr,ePropType.value,vPropVal);
  }
  @DeclDISPID(1028)  public void onOnContactFriendlyNameChange(final Integer hr, final IDispatch pMContact, final String bstrPrevFriendlyName) throws ComException {
    assert(hr != null);
    assert(bstrPrevFriendlyName != null);
    this._dispatchCall(1028,"OnContactFriendlyNameChange", DISPATCH_METHOD,null,hr,(pMContact!=null?pMContact:Dispatch.NULL),bstrPrevFriendlyName);
  }
  @DeclDISPID(1030)  public void onOnContactStatusChange(final IDispatch pMContact, final com.wilutions.mslib.messengerapi.MISTATUS mStatus) throws ComException {
    assert(mStatus != null);
    this._dispatchCall(1030,"OnContactStatusChange", DISPATCH_METHOD,null,(pMContact!=null?pMContact:Dispatch.NULL),mStatus.value);
  }
  @DeclDISPID(1034)  public void onOnContactPropertyChange(final Integer hr, final IDispatch pContact, final com.wilutions.mslib.messengerapi.MCONTACTPROPERTY ePropType, final Object vPropVal) throws ComException {
    assert(hr != null);
    assert(ePropType != null);
    assert(vPropVal != null);
    this._dispatchCall(1034,"OnContactPropertyChange", DISPATCH_METHOD,null,hr,(pContact!=null?pContact:Dispatch.NULL),ePropType.value,vPropVal);
  }
  @DeclDISPID(1035)  public void onOnContactBlockChange(final Integer hr, final IDispatch pContact, final Boolean pBoolBlock) throws ComException {
    assert(hr != null);
    assert(pBoolBlock != null);
    this._dispatchCall(1035,"OnContactBlockChange", DISPATCH_METHOD,null,hr,(pContact!=null?pContact:Dispatch.NULL),pBoolBlock);
  }
  @DeclDISPID(1036)  public void onOnContactPagerChange(final Integer hr, final IDispatch pContact, final Boolean pBoolPage) throws ComException {
    assert(hr != null);
    assert(pBoolPage != null);
    this._dispatchCall(1036,"OnContactPagerChange", DISPATCH_METHOD,null,hr,(pContact!=null?pContact:Dispatch.NULL),pBoolPage);
  }
  @DeclDISPID(1037)  public void onOnContactPhoneChange(final Integer hr, final IDispatch pContact, final com.wilutions.mslib.messengerapi.MPHONE_TYPE PhoneType, final String bstrNumber) throws ComException {
    assert(hr != null);
    assert(PhoneType != null);
    assert(bstrNumber != null);
    this._dispatchCall(1037,"OnContactPhoneChange", DISPATCH_METHOD,null,hr,(pContact!=null?pContact:Dispatch.NULL),PhoneType.value,bstrNumber);
  }
  @DeclDISPID(1039)  public void onOnUnreadEmailChange(final com.wilutions.mslib.messengerapi.MUAFOLDER mFolder, final Integer cUnreadEmail, final ByRef<Boolean> pBoolfEnableDefault) throws ComException {
    assert(mFolder != null);
    assert(cUnreadEmail != null);
    assert(pBoolfEnableDefault != null);
    this._dispatchCall(1039,"OnUnreadEmailChange", DISPATCH_METHOD,null,mFolder.value,cUnreadEmail,pBoolfEnableDefault);
  }
  @DeclDISPID(1050)  public void onOnEmoticonListChange() throws ComException {
    this._dispatchCall(1050,"OnEmoticonListChange", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1104)  public void onOnUTDone(final Integer hr) throws ComException {
    assert(hr != null);
    this._dispatchCall(1104,"OnUTDone", DISPATCH_METHOD,null,hr);
  }
  @DeclDISPID(1105)  public void onOnUTLogStatement(final Integer hr, final String bstrStatement) throws ComException {
    assert(hr != null);
    assert(bstrStatement != null);
    this._dispatchCall(1105,"OnUTLogStatement", DISPATCH_METHOD,null,hr,bstrStatement);
  }
  public DMessengerEventsImpl(String progId) throws ComException {
    super(progId, "{C9A6A6B6-9BC1-43A5-B06B-E58874EEBC96}");
  }
  protected DMessengerEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[DMessengerEventsImpl" + super.toString() + "]";
  }
}
