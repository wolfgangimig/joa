/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{8D3F00B8-5EA4-9402-13E4-70603D784061}")
public class ISelfImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.ISelf {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation PublishContactInformation(com.wilutions.mslib.uccollaborationlib.PublishableContactInformationType[] _publishablePresenceItemTypes, Object[] _publishablePresenceItemValues, Object _selfCallback, Object _state) throws ComException {
    assert(_publishablePresenceItemTypes != null);
    assert(_publishablePresenceItemValues != null);
    assert(_selfCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743808,"PublishContactInformation", DISPATCH_METHOD,null,_publishablePresenceItemTypes,_publishablePresenceItemValues,_selfCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.IContact getContact() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Contact", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IContactImpl.class);
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.IPhone CreatePhone(com.wilutions.mslib.uccollaborationlib.ContactEndpointType _phoneType, String _phoneUri, Boolean _toBePublished) throws ComException {
    assert(_phoneType != null);
    assert(_phoneUri != null);
    assert(_toBePublished != null);
    final Object obj = this._dispatchCall(1610743810,"CreatePhone", DISPATCH_METHOD,null,_phoneType.value,_phoneUri,_toBePublished);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IPhoneImpl.class);
  }
  @DeclDISPID(1610743811)  public Boolean CanSetPhone(com.wilutions.mslib.uccollaborationlib.ContactEndpointType _phoneType) throws ComException {
    assert(_phoneType != null);
    final Object obj = this._dispatchCall(1610743811,"CanSetPhone", DISPATCH_METHOD,null,_phoneType.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.IPhone[] getPhones() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"Phones", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.IPhone[])obj;
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation SetPhones(com.wilutions.mslib.uccollaborationlib.IPhone[] _phones, Object _selfCallback, Object _state) throws ComException {
    assert(_phones != null);
    assert(_selfCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743813,"SetPhones", DISPATCH_METHOD,null,_phones,_selfCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743814)  public com.wilutions.mslib.uccollaborationlib.ICustomAvailabilityState[] GetPublishableCustomAvailabilityStates(Integer _localeId) throws ComException {
    assert(_localeId != null);
    final Object obj = this._dispatchCall(1610743814,"GetPublishableCustomAvailabilityStates", DISPATCH_METHOD,null,_localeId);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.ICustomAvailabilityState[])obj;
  }
  @DeclDISPID(1610743815)  public com.wilutions.mslib.uccollaborationlib.IAccessPermission[] getPermissions() throws ComException {
    final Object obj = this._dispatchCall(1610743815,"Permissions", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.IAccessPermission[])obj;
  }
  @DeclDISPID(1610743816)  public Boolean getPhotoDisplayed() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"PhotoDisplayed", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743817)  public com.wilutions.mslib.uccollaborationlib.IContactEndpoint getTestCallEndpoint() throws ComException {
    final Object obj = this._dispatchCall(1610743817,"TestCallEndpoint", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IContactEndpointImpl.class);
  }
  @DeclDISPID(1610743818)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation SetPhone(com.wilutions.mslib.uccollaborationlib.ContactEndpointType _phoneType, String _phoneUri, Boolean _toBePublished, Object _selfCallback, Object _state) throws ComException {
    assert(_phoneType != null);
    assert(_phoneUri != null);
    assert(_toBePublished != null);
    assert(_selfCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743818,"SetPhone", DISPATCH_METHOD,null,_phoneType.value,_phoneUri,_toBePublished,_selfCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743819)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation RemovePhone(com.wilutions.mslib.uccollaborationlib.ContactEndpointType _phoneType, Object _selfCallback, Object _state) throws ComException {
    assert(_phoneType != null);
    assert(_selfCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743819,"RemovePhone", DISPATCH_METHOD,null,_phoneType.value,_selfCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743820)  public com.wilutions.mslib.uccollaborationlib.IPhone GetPhone(com.wilutions.mslib.uccollaborationlib.ContactEndpointType _phoneType) throws ComException {
    assert(_phoneType != null);
    final Object obj = this._dispatchCall(1610743820,"GetPhone", DISPATCH_METHOD,null,_phoneType.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IPhoneImpl.class);
  }
  @DeclDISPID(1610743821)  public Boolean getIsInResiliencyMode() throws ComException {
    final Object obj = this._dispatchCall(1610743821,"IsInResiliencyMode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743822)  public Object GetSettingInternal(com.wilutions.mslib.uccollaborationlib.SettingItemTypeInternal _settingItem) throws ComException {
    assert(_settingItem != null);
    final Object obj = this._dispatchCall(1610743822,"GetSettingInternal", DISPATCH_METHOD,null,_settingItem.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  public ISelfImpl(String progId) throws ComException {
    super(progId, "{4DA899D3-FAC7-4F43-8E4A-1987988FBC9B}");
  }
  protected ISelfImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ISelfImpl" + super.toString() + "]";
  }
}
