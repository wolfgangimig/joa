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
  @DeclDISPID(1610743809)  public Object GetContactInformation(final ContactInformationType _contactInformationType) throws ComException;
  @DeclDISPID(1610743810)  public IContactInformationDictionary BatchGetContactInformation(final ContactInformationType[] _contactInformationTypes) throws ComException;
  @DeclDISPID(1610743811)  public IContactSettingDictionary getSettings() throws ComException;
  @DeclDISPID(1610743812)  public Boolean CanStart(final ModalityTypes _modalityTypes) throws ComException;
  @DeclDISPID(1610743813)  public IAsynchronousOperation ChangeSetting(final ContactSetting _contactSettingType, final Object _contactSettingValue, final Object _contactCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743814)  public Boolean CanChangeSetting(final ContactSetting _contactSetting) throws ComException;
  @DeclDISPID(1610743815)  public IContactManager getContactManager() throws ComException;
  @DeclDISPID(1610743816)  public IGroupCollection getCustomGroups() throws ComException;
  @DeclDISPID(1610743817)  public IAsynchronousOperation MoveToGroup(final IGroup _targetGroup, final IGroup _sourceGroup, final Object _contactCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743818)  public Boolean CanMoveToGroup(final IGroup _targetGroup, final IGroup _sourceGroup) throws ComException;
  @DeclDISPID(1610743819)  public IContactEndpoint CreateContactEndpoint(final String _telephoneUri) throws ComException;
  @DeclDISPID(1610743820)  public UnifiedCommunicationType getUnifiedCommunicationType() throws ComException;
  @DeclDISPID(1610743821)  public IAsynchronousOperation GetOrganizationInformation(final OrganizationStructureTypes _orgInfoTypes, final Object _contactCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743822)  public IContactInformationDictionary GetMultipleContactInformation(final ContactInformationType[] _contactInformationTypes) throws ComException;
}
