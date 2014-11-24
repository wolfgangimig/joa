/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _NameSpace.
 * 
 */
@CoInterface(guid="{00063002-0000-0000-C000-000000000046}")
public interface _NameSpace extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(8449)  public Recipient getCurrentUser() throws ComException;
  @DeclDISPID(8451)  public _Folders getFolders() throws ComException;
  @DeclDISPID(8452)  public String getType() throws ComException;
  @DeclDISPID(8461)  public AddressLists getAddressLists() throws ComException;
  @DeclDISPID(8458)  public Recipient CreateRecipient(String RecipientName) throws ComException;
  @DeclDISPID(8459)  public MAPIFolder GetDefaultFolder(OlDefaultFolders FolderType) throws ComException;
  @DeclDISPID(8456)  public MAPIFolder GetFolderFromID(String EntryIDFolder, Object EntryIDStore) throws ComException;
  @DeclDISPID(8457)  public IDispatch GetItemFromID(String EntryIDItem, Object EntryIDStore) throws ComException;
  @DeclDISPID(8455)  public Recipient GetRecipientFromID(String EntryID) throws ComException;
  @DeclDISPID(8460)  public MAPIFolder GetSharedDefaultFolder(Recipient Recipient, OlDefaultFolders FolderType) throws ComException;
  @DeclDISPID(8454)  public void Logoff() throws ComException;
  @DeclDISPID(8453)  public void Logon(Object Profile, Object Password, Object ShowDialog, Object NewSession) throws ComException;
  @DeclDISPID(8462)  public MAPIFolder PickFolder() throws ComException;
  @DeclDISPID(8472)  public SyncObjects getSyncObjects() throws ComException;
  @DeclDISPID(8473)  public void AddStore(Object Store) throws ComException;
  @DeclDISPID(8474)  public void RemoveStore(MAPIFolder Folder) throws ComException;
  @DeclDISPID(64076)  public Boolean getOffline() throws ComException;
  @DeclDISPID(64013)  public void Dial(Object ContactItem) throws ComException;
  @DeclDISPID(64193)  public OlExchangeConnectionMode getExchangeConnectionMode() throws ComException;
  @DeclDISPID(64197)  public void AddStoreEx(Object Store, OlStoreType Type) throws ComException;
  @DeclDISPID(64208)  public Accounts getAccounts() throws ComException;
  @DeclDISPID(64213)  public String getCurrentProfileName() throws ComException;
  @DeclDISPID(64216)  public Stores getStores() throws ComException;
  @DeclDISPID(64225)  public SelectNamesDialog GetSelectNamesDialog() throws ComException;
  @DeclDISPID(64215)  public void SendAndReceive(Boolean showProgressDialog) throws ComException;
  @DeclDISPID(64236)  public Store getDefaultStore() throws ComException;
  @DeclDISPID(64260)  public AddressEntry GetAddressEntryFromID(String ID) throws ComException;
  @DeclDISPID(64261)  public AddressList GetGlobalAddressList() throws ComException;
  @DeclDISPID(64262)  public Store GetStoreFromID(String ID) throws ComException;
  @DeclDISPID(64421)  public Categories getCategories() throws ComException;
  @DeclDISPID(64502)  public MAPIFolder OpenSharedFolder(String Path, Object Name, Object DownloadAttachments, Object UseTTL) throws ComException;
  @DeclDISPID(64503)  public IDispatch OpenSharedItem(String Path) throws ComException;
  @DeclDISPID(64484)  public SharingItem CreateSharingItem(Object Context, Object Provider) throws ComException;
  @DeclDISPID(64517)  public String getExchangeMailboxServerName() throws ComException;
  @DeclDISPID(64516)  public String getExchangeMailboxServerVersion() throws ComException;
  @DeclDISPID(64508)  public Boolean CompareEntryIDs(String FirstEntryID, String SecondEntryID) throws ComException;
  @DeclDISPID(64515)  public String getAutoDiscoverXml() throws ComException;
  @DeclDISPID(64558)  public OlAutoDiscoverConnectionMode getAutoDiscoverConnectionMode() throws ComException;
  @DeclDISPID(64645)  public com.wilutions.mslib.office.ContactCard CreateContactCard(AddressEntry AddressEntry) throws ComException;
}
