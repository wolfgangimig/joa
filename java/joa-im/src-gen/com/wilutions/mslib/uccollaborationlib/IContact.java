/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IContact.
 * IContact Interface 
 */
@CoInterface(guid="{85109845-6AE2-4B6B-9524-65BA203E5B7D}")
public interface IContact extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public String getUri() throws ComException;
  @DeclDISPID(1610743809)  public Object GetContactInformation(ContactInformationType _contactInformationType) throws ComException;
  @DeclDISPID(1610743810)  public IContactInformationDictionary BatchGetContactInformation(ContactInformationType[] _contactInformationTypes) throws ComException;
  @DeclDISPID(1610743811)  public IContactSettingDictionary getSettings() throws ComException;
  @DeclDISPID(1610743812)  public Boolean CanStart(ModalityTypes _modalityTypes) throws ComException;
  @DeclDISPID(1610743813)  public IAsynchronousOperation ChangeSetting(ContactSetting _contactSettingType, Object _contactSettingValue, Object _contactCallback, Object _state) throws ComException;
  @DeclDISPID(1610743814)  public Boolean CanChangeSetting(ContactSetting _contactSetting) throws ComException;
  @DeclDISPID(1610743815)  public IContactManager getContactManager() throws ComException;
  @DeclDISPID(1610743816)  public IGroupCollection getCustomGroups() throws ComException;
  @DeclDISPID(1610743817)  public IAsynchronousOperation MoveToGroup(IGroup _targetGroup, IGroup _sourceGroup, Object _contactCallback, Object _state) throws ComException;
  @DeclDISPID(1610743818)  public Boolean CanMoveToGroup(IGroup _targetGroup, IGroup _sourceGroup) throws ComException;
  @DeclDISPID(1610743819)  public IContactEndpoint CreateContactEndpoint(String _telephoneUri) throws ComException;
  @DeclDISPID(1610743820)  public UnifiedCommunicationType getUnifiedCommunicationType() throws ComException;
  @DeclDISPID(1610743821)  public IAsynchronousOperation GetOrganizationInformation(OrganizationStructureTypes _orgInfoTypes, Object _contactCallback, Object _state) throws ComException;
  @DeclDISPID(1610743822)  public IContactInformationDictionary GetMultipleContactInformation(ContactInformationType[] _contactInformationTypes) throws ComException;
}
