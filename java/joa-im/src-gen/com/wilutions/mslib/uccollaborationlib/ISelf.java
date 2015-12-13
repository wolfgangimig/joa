/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ISelf.
 * ISelf Interface 
 */
@CoInterface(guid="{4DA899D3-FAC7-4F43-8E4A-1987988FBC9B}")
public interface ISelf extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IAsynchronousOperation PublishContactInformation(final PublishableContactInformationType[] _publishablePresenceItemTypes, final Object[] _publishablePresenceItemValues, final Object _selfCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743809)  public IContact getContact() throws ComException;
  @DeclDISPID(1610743810)  public IPhone CreatePhone(final ContactEndpointType _phoneType, final String _phoneUri, final Boolean _toBePublished) throws ComException;
  @DeclDISPID(1610743811)  public Boolean CanSetPhone(final ContactEndpointType _phoneType) throws ComException;
  @DeclDISPID(1610743812)  public IPhone[] getPhones() throws ComException;
  @DeclDISPID(1610743813)  public IAsynchronousOperation SetPhones(final IPhone[] _phones, final Object _selfCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743814)  public ICustomAvailabilityState[] GetPublishableCustomAvailabilityStates(final Integer _localeId) throws ComException;
  @DeclDISPID(1610743815)  public IAccessPermission[] getPermissions() throws ComException;
  @DeclDISPID(1610743816)  public Boolean getPhotoDisplayed() throws ComException;
  @DeclDISPID(1610743817)  public IContactEndpoint getTestCallEndpoint() throws ComException;
  @DeclDISPID(1610743818)  public IAsynchronousOperation SetPhone(final ContactEndpointType _phoneType, final String _phoneUri, final Boolean _toBePublished, final Object _selfCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743819)  public IAsynchronousOperation RemovePhone(final ContactEndpointType _phoneType, final Object _selfCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743820)  public IPhone GetPhone(final ContactEndpointType _phoneType) throws ComException;
  @DeclDISPID(1610743821)  public Boolean getIsInResiliencyMode() throws ComException;
  @DeclDISPID(1610743822)  public Object GetSettingInternal(final SettingItemTypeInternal _settingItem) throws ComException;
}
