/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * AddressList.
 * 
 */
@CoInterface(guid="{00063049-0000-0000-C000-000000000046}")
public interface AddressList extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException;
  @DeclDISPID(256)  public AddressEntries getAddressEntries() throws ComException;
  @DeclDISPID(61470)  public String getID() throws ComException;
  @DeclDISPID(91)  public Integer getIndex() throws ComException;
  @DeclDISPID(61463)  public Boolean getIsReadOnly() throws ComException;
  @DeclDISPID(12289)  public String getName() throws ComException;
  @DeclDISPID(64250)  public MAPIFolder GetContactsFolder() throws ComException;
  @DeclDISPID(64237)  public OlAddressListType getAddressListType() throws ComException;
  @DeclDISPID(64238)  public Integer getResolutionOrder() throws ComException;
  @DeclDISPID(64248)  public Boolean getIsInitialAddressList() throws ComException;
  @DeclDISPID(64253)  public PropertyAccessor getPropertyAccessor() throws ComException;
}
