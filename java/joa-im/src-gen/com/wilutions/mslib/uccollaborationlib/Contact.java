/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * Contact.
 * Represents a contact. 
 */
@CoClass(guid="{D3EF7C83-13F3-4BF2-8216-540FB95BBD00}")
public class Contact extends Dispatch implements IContact {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public String getUri() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Uri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public Object GetContactInformation(final ContactInformationType _contactInformationType) throws ComException {
    assert(_contactInformationType != null);
    final Object obj = this._dispatchCall(1610743809,"GetContactInformation", DISPATCH_METHOD,null,_contactInformationType.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743810)  public IContactInformationDictionary BatchGetContactInformation(final ContactInformationType[] _contactInformationTypes) throws ComException {
    assert(_contactInformationTypes != null);
    final Object obj = this._dispatchCall(1610743810,"BatchGetContactInformation", DISPATCH_METHOD,null,_contactInformationTypes);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactInformationDictionaryImpl.class);
  }
  @DeclDISPID(1610743811)  public IContactSettingDictionary getSettings() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Settings", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactSettingDictionaryImpl.class);
  }
  @DeclDISPID(1610743812)  public Boolean CanStart(final ModalityTypes _modalityTypes) throws ComException {
    assert(_modalityTypes != null);
    final Object obj = this._dispatchCall(1610743812,"CanStart", DISPATCH_METHOD,null,_modalityTypes.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743813)  public IAsynchronousOperation ChangeSetting(final ContactSetting _contactSettingType, final Object _contactSettingValue, final Object _contactCallback, final Object _state) throws ComException {
    assert(_contactSettingType != null);
    assert(_contactSettingValue != null);
    assert(_contactCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743813,"ChangeSetting", DISPATCH_METHOD,null,_contactSettingType.value,_contactSettingValue,_contactCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743814)  public Boolean CanChangeSetting(final ContactSetting _contactSetting) throws ComException {
    assert(_contactSetting != null);
    final Object obj = this._dispatchCall(1610743814,"CanChangeSetting", DISPATCH_METHOD,null,_contactSetting.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743815)  public IContactManager getContactManager() throws ComException {
    final Object obj = this._dispatchCall(1610743815,"ContactManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactManagerImpl.class);
  }
  @DeclDISPID(1610743816)  public IGroupCollection getCustomGroups() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"CustomGroups", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IGroupCollectionImpl.class);
  }
  @DeclDISPID(1610743817)  public IAsynchronousOperation MoveToGroup(final IGroup _targetGroup, final IGroup _sourceGroup, final Object _contactCallback, final Object _state) throws ComException {
    assert(_contactCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743817,"MoveToGroup", DISPATCH_METHOD,null,(_targetGroup!=null?_targetGroup:Dispatch.NULL),(_sourceGroup!=null?_sourceGroup:Dispatch.NULL),_contactCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743818)  public Boolean CanMoveToGroup(final IGroup _targetGroup, final IGroup _sourceGroup) throws ComException {
    final Object obj = this._dispatchCall(1610743818,"CanMoveToGroup", DISPATCH_METHOD,null,(_targetGroup!=null?_targetGroup:Dispatch.NULL),(_sourceGroup!=null?_sourceGroup:Dispatch.NULL));
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743819)  public IContactEndpoint CreateContactEndpoint(final String _telephoneUri) throws ComException {
    assert(_telephoneUri != null);
    final Object obj = this._dispatchCall(1610743819,"CreateContactEndpoint", DISPATCH_METHOD,null,_telephoneUri);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactEndpointImpl.class);
  }
  @DeclDISPID(1610743820)  public UnifiedCommunicationType getUnifiedCommunicationType() throws ComException {
    final Object obj = this._dispatchCall(1610743820,"UnifiedCommunicationType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return UnifiedCommunicationType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743821)  public IAsynchronousOperation GetOrganizationInformation(final OrganizationStructureTypes _orgInfoTypes, final Object _contactCallback, final Object _state) throws ComException {
    assert(_orgInfoTypes != null);
    assert(_contactCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743821,"GetOrganizationInformation", DISPATCH_METHOD,null,_orgInfoTypes.value,_contactCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743822)  public IContactInformationDictionary GetMultipleContactInformation(final ContactInformationType[] _contactInformationTypes) throws ComException {
    assert(_contactInformationTypes != null);
    final Object obj = this._dispatchCall(1610743822,"GetMultipleContactInformation", DISPATCH_METHOD,null,_contactInformationTypes);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactInformationDictionaryImpl.class);
  }
  public Contact() throws ComException {
    super("{D3EF7C83-13F3-4BF2-8216-540FB95BBD00}", "{85109845-6AE2-4B6B-9524-65BA203E5B7D}");
  }
  protected Contact(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Contact" + super.toString() + "]";
  }
}
