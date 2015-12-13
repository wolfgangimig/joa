/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.messengerapi.DMessengerEvents;

@SuppressWarnings("all")
public class Fire_DMessengerEvents {
  public final static void onOnGroupAdded(final IDispatch __joa__disp, final Integer hr, final IDispatch pMGroup) throws ComException {
    assert(__joa__disp != null);
    assert(hr != null);
    assert(pMGroup != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnGroupAdded(hr,pMGroup));
  }
  public final static void onOnGroupRemoved(final IDispatch __joa__disp, final Integer hr, final IDispatch pMGroup) throws ComException {
    assert(__joa__disp != null);
    assert(hr != null);
    assert(pMGroup != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnGroupRemoved(hr,pMGroup));
  }
  public final static void onOnGroupNameChanged(final IDispatch __joa__disp, final Integer hr, final IDispatch pMGroup) throws ComException {
    assert(__joa__disp != null);
    assert(hr != null);
    assert(pMGroup != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnGroupNameChanged(hr,pMGroup));
  }
  public final static void onOnContactAddedToGroup(final IDispatch __joa__disp, final Integer hr, final IDispatch pMGroup, final IDispatch pMContact) throws ComException {
    assert(__joa__disp != null);
    assert(hr != null);
    assert(pMGroup != null);
    assert(pMContact != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnContactAddedToGroup(hr,pMGroup,pMContact));
  }
  public final static void onOnContactRemovedFromGroup(final IDispatch __joa__disp, final Integer hr, final IDispatch pMGroup, final IDispatch pMContact) throws ComException {
    assert(__joa__disp != null);
    assert(hr != null);
    assert(pMGroup != null);
    assert(pMContact != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnContactRemovedFromGroup(hr,pMGroup,pMContact));
  }
  public final static void onOnIMWindowCreated(final IDispatch __joa__disp, final IDispatch pIMWindow) throws ComException {
    assert(__joa__disp != null);
    assert(pIMWindow != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnIMWindowCreated(pIMWindow));
  }
  public final static void onOnIMWindowDestroyed(final IDispatch __joa__disp, final IDispatch pIMWindow) throws ComException {
    assert(__joa__disp != null);
    assert(pIMWindow != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnIMWindowDestroyed(pIMWindow));
  }
  public final static void onOnIMWindowContactAdded(final IDispatch __joa__disp, final IDispatch pContact, final IDispatch pIMWindow) throws ComException {
    assert(__joa__disp != null);
    assert(pContact != null);
    assert(pIMWindow != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnIMWindowContactAdded(pContact,pIMWindow));
  }
  public final static void onOnIMWindowContactRemoved(final IDispatch __joa__disp, final IDispatch pContact, final IDispatch pIMWindow) throws ComException {
    assert(__joa__disp != null);
    assert(pContact != null);
    assert(pIMWindow != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnIMWindowContactRemoved(pContact,pIMWindow));
  }
  public final static void onOnAppShutdown(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnAppShutdown());
  }
  public final static void onOnSignin(final IDispatch __joa__disp, final Integer hr) throws ComException {
    assert(__joa__disp != null);
    assert(hr != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnSignin(hr));
  }
  public final static void onOnSignout(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnSignout());
  }
  public final static void onOnContactListAdd(final IDispatch __joa__disp, final Integer hr, final IDispatch pMContact) throws ComException {
    assert(__joa__disp != null);
    assert(hr != null);
    assert(pMContact != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnContactListAdd(hr,pMContact));
  }
  public final static void onOnContactListRemove(final IDispatch __joa__disp, final Integer hr, final IDispatch pMContact) throws ComException {
    assert(__joa__disp != null);
    assert(hr != null);
    assert(pMContact != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnContactListRemove(hr,pMContact));
  }
  public final static void onOnMyFriendlyNameChange(final IDispatch __joa__disp, final Integer hr, final String bstrPrevFriendlyName) throws ComException {
    assert(__joa__disp != null);
    assert(hr != null);
    assert(bstrPrevFriendlyName != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnMyFriendlyNameChange(hr,bstrPrevFriendlyName));
  }
  public final static void onOnMyStatusChange(final IDispatch __joa__disp, final Integer hr, final com.wilutions.mslib.messengerapi.MISTATUS mMyStatus) throws ComException {
    assert(__joa__disp != null);
    assert(hr != null);
    assert(mMyStatus != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnMyStatusChange(hr,mMyStatus));
  }
  public final static void onOnMyPhoneChange(final IDispatch __joa__disp, final com.wilutions.mslib.messengerapi.MPHONE_TYPE PhoneType, final String bstrNumber) throws ComException {
    assert(__joa__disp != null);
    assert(PhoneType != null);
    assert(bstrNumber != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnMyPhoneChange(PhoneType,bstrNumber));
  }
  public final static void onOnMyPropertyChange(final IDispatch __joa__disp, final Integer hr, final com.wilutions.mslib.messengerapi.MCONTACTPROPERTY ePropType, final Object vPropVal) throws ComException {
    assert(__joa__disp != null);
    assert(hr != null);
    assert(ePropType != null);
    assert(vPropVal != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnMyPropertyChange(hr,ePropType,vPropVal));
  }
  public final static void onOnContactFriendlyNameChange(final IDispatch __joa__disp, final Integer hr, final IDispatch pMContact, final String bstrPrevFriendlyName) throws ComException {
    assert(__joa__disp != null);
    assert(hr != null);
    assert(pMContact != null);
    assert(bstrPrevFriendlyName != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnContactFriendlyNameChange(hr,pMContact,bstrPrevFriendlyName));
  }
  public final static void onOnContactStatusChange(final IDispatch __joa__disp, final IDispatch pMContact, final com.wilutions.mslib.messengerapi.MISTATUS mStatus) throws ComException {
    assert(__joa__disp != null);
    assert(pMContact != null);
    assert(mStatus != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnContactStatusChange(pMContact,mStatus));
  }
  public final static void onOnContactPropertyChange(final IDispatch __joa__disp, final Integer hr, final IDispatch pContact, final com.wilutions.mslib.messengerapi.MCONTACTPROPERTY ePropType, final Object vPropVal) throws ComException {
    assert(__joa__disp != null);
    assert(hr != null);
    assert(pContact != null);
    assert(ePropType != null);
    assert(vPropVal != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnContactPropertyChange(hr,pContact,ePropType,vPropVal));
  }
  public final static void onOnContactBlockChange(final IDispatch __joa__disp, final Integer hr, final IDispatch pContact, final Boolean pBoolBlock) throws ComException {
    assert(__joa__disp != null);
    assert(hr != null);
    assert(pContact != null);
    assert(pBoolBlock != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnContactBlockChange(hr,pContact,pBoolBlock));
  }
  public final static void onOnContactPagerChange(final IDispatch __joa__disp, final Integer hr, final IDispatch pContact, final Boolean pBoolPage) throws ComException {
    assert(__joa__disp != null);
    assert(hr != null);
    assert(pContact != null);
    assert(pBoolPage != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnContactPagerChange(hr,pContact,pBoolPage));
  }
  public final static void onOnContactPhoneChange(final IDispatch __joa__disp, final Integer hr, final IDispatch pContact, final com.wilutions.mslib.messengerapi.MPHONE_TYPE PhoneType, final String bstrNumber) throws ComException {
    assert(__joa__disp != null);
    assert(hr != null);
    assert(pContact != null);
    assert(PhoneType != null);
    assert(bstrNumber != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnContactPhoneChange(hr,pContact,PhoneType,bstrNumber));
  }
  public final static void onOnUnreadEmailChange(final IDispatch __joa__disp, final com.wilutions.mslib.messengerapi.MUAFOLDER mFolder, final Integer cUnreadEmail, final ByRef<Boolean> pBoolfEnableDefault) throws ComException {
    assert(__joa__disp != null);
    assert(mFolder != null);
    assert(cUnreadEmail != null);
    assert(pBoolfEnableDefault != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnUnreadEmailChange(mFolder,cUnreadEmail,pBoolfEnableDefault));
  }
  public final static void onOnEmoticonListChange(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnEmoticonListChange());
  }
  public final static void onOnUTDone(final IDispatch __joa__disp, final Integer hr) throws ComException {
    assert(__joa__disp != null);
    assert(hr != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnUTDone(hr));
  }
  public final static void onOnUTLogStatement(final IDispatch __joa__disp, final Integer hr, final String bstrStatement) throws ComException {
    assert(__joa__disp != null);
    assert(hr != null);
    assert(bstrStatement != null);
    __joa__disp._fireEvent(DMessengerEvents.class, (l)->l.onOnUTLogStatement(hr,bstrStatement));
  }
}
