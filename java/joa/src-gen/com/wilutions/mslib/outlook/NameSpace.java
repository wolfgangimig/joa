/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * NameSpace.
 * 
 */
@CoClass(guid="{0006308B-0000-0000-C000-000000000046}")
public class NameSpace extends Dispatch implements _NameSpace {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(8449)  public Recipient getCurrentUser() throws ComException {
    final Object obj = this._dispatchCall(8449,"CurrentUser", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.RecipientImpl.class);
  }
  @DeclDISPID(8451)  public _Folders getFolders() throws ComException {
    final Object obj = this._dispatchCall(8451,"Folders", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._FoldersImpl.class);
  }
  @DeclDISPID(8452)  public String getType() throws ComException {
    final Object obj = this._dispatchCall(8452,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8461)  public AddressLists getAddressLists() throws ComException {
    final Object obj = this._dispatchCall(8461,"AddressLists", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.AddressListsImpl.class);
  }
  @DeclDISPID(8458)  public Recipient CreateRecipient(String RecipientName) throws ComException {
    assert(RecipientName != null);
    final Object obj = this._dispatchCall(8458,"CreateRecipient", DISPATCH_METHOD,null,RecipientName);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.RecipientImpl.class);
  }
  @DeclDISPID(8459)  public MAPIFolder GetDefaultFolder(OlDefaultFolders FolderType) throws ComException {
    assert(FolderType != null);
    final Object obj = this._dispatchCall(8459,"GetDefaultFolder", DISPATCH_METHOD,null,FolderType.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.MAPIFolderImpl.class);
  }
  @DeclDISPID(8456)  public MAPIFolder GetFolderFromID(String EntryIDFolder, Object EntryIDStore) throws ComException {
    assert(EntryIDFolder != null);
    assert(EntryIDStore != null);
    final Object obj = this._dispatchCall(8456,"GetFolderFromID", DISPATCH_METHOD,null,EntryIDFolder,EntryIDStore);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.MAPIFolderImpl.class);
  }
  @DeclDISPID(8457)  public Dispatch GetItemFromID(String EntryIDItem, Object EntryIDStore) throws ComException {
    assert(EntryIDItem != null);
    assert(EntryIDStore != null);
    final Object obj = this._dispatchCall(8457,"GetItemFromID", DISPATCH_METHOD,null,EntryIDItem,EntryIDStore);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(8455)  public Recipient GetRecipientFromID(String EntryID) throws ComException {
    assert(EntryID != null);
    final Object obj = this._dispatchCall(8455,"GetRecipientFromID", DISPATCH_METHOD,null,EntryID);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.RecipientImpl.class);
  }
  @DeclDISPID(8460)  public MAPIFolder GetSharedDefaultFolder(Recipient Recipient, OlDefaultFolders FolderType) throws ComException {
    assert(FolderType != null);
    final Object obj = this._dispatchCall(8460,"GetSharedDefaultFolder", DISPATCH_METHOD,null,(Recipient!=null?Recipient:Dispatch.NULL),FolderType.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.MAPIFolderImpl.class);
  }
  @DeclDISPID(8454)  public void Logoff() throws ComException {
    this._dispatchCall(8454,"Logoff", DISPATCH_METHOD,null);
  }
  @DeclDISPID(8453)  public void Logon(Object Profile, Object Password, Object ShowDialog, Object NewSession) throws ComException {
    assert(Profile != null);
    assert(Password != null);
    assert(ShowDialog != null);
    assert(NewSession != null);
    this._dispatchCall(8453,"Logon", DISPATCH_METHOD,null,Profile,Password,ShowDialog,NewSession);
  }
  @DeclDISPID(8462)  public MAPIFolder PickFolder() throws ComException {
    final Object obj = this._dispatchCall(8462,"PickFolder", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.MAPIFolderImpl.class);
  }
  @DeclDISPID(8472)  public SyncObjects getSyncObjects() throws ComException {
    final Object obj = this._dispatchCall(8472,"SyncObjects", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.SyncObjectsImpl.class);
  }
  @DeclDISPID(8473)  public void AddStore(Object Store) throws ComException {
    assert(Store != null);
    this._dispatchCall(8473,"AddStore", DISPATCH_METHOD,null,Store);
  }
  @DeclDISPID(8474)  public void RemoveStore(MAPIFolder Folder) throws ComException {
    this._dispatchCall(8474,"RemoveStore", DISPATCH_METHOD,null,(Folder!=null?Folder:Dispatch.NULL));
  }
  @DeclDISPID(64076)  public Boolean getOffline() throws ComException {
    final Object obj = this._dispatchCall(64076,"Offline", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64013)  public void Dial(Object ContactItem) throws ComException {
    assert(ContactItem != null);
    this._dispatchCall(64013,"Dial", DISPATCH_METHOD,null,ContactItem);
  }
  @DeclDISPID(64193)  public OlExchangeConnectionMode getExchangeConnectionMode() throws ComException {
    final Object obj = this._dispatchCall(64193,"ExchangeConnectionMode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlExchangeConnectionMode.valueOf((Integer)obj);
  }
  @DeclDISPID(64197)  public void AddStoreEx(Object Store, OlStoreType Type) throws ComException {
    assert(Store != null);
    assert(Type != null);
    this._dispatchCall(64197,"AddStoreEx", DISPATCH_METHOD,null,Store,Type.value);
  }
  @DeclDISPID(64208)  public Accounts getAccounts() throws ComException {
    final Object obj = this._dispatchCall(64208,"Accounts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(Accounts.class);
  }
  @DeclDISPID(64213)  public String getCurrentProfileName() throws ComException {
    final Object obj = this._dispatchCall(64213,"CurrentProfileName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64216)  public Stores getStores() throws ComException {
    final Object obj = this._dispatchCall(64216,"Stores", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(Stores.class);
  }
  @DeclDISPID(64225)  public SelectNamesDialog GetSelectNamesDialog() throws ComException {
    final Object obj = this._dispatchCall(64225,"GetSelectNamesDialog", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(SelectNamesDialog.class);
  }
  @DeclDISPID(64215)  public void SendAndReceive(Boolean showProgressDialog) throws ComException {
    assert(showProgressDialog != null);
    this._dispatchCall(64215,"SendAndReceive", DISPATCH_METHOD,null,showProgressDialog);
  }
  @DeclDISPID(64236)  public Store getDefaultStore() throws ComException {
    final Object obj = this._dispatchCall(64236,"DefaultStore", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(Store.class);
  }
  @DeclDISPID(64260)  public AddressEntry GetAddressEntryFromID(String ID) throws ComException {
    assert(ID != null);
    final Object obj = this._dispatchCall(64260,"GetAddressEntryFromID", DISPATCH_METHOD,null,ID);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.AddressEntryImpl.class);
  }
  @DeclDISPID(64261)  public AddressList GetGlobalAddressList() throws ComException {
    final Object obj = this._dispatchCall(64261,"GetGlobalAddressList", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.AddressListImpl.class);
  }
  @DeclDISPID(64262)  public Store GetStoreFromID(String ID) throws ComException {
    assert(ID != null);
    final Object obj = this._dispatchCall(64262,"GetStoreFromID", DISPATCH_METHOD,null,ID);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(Store.class);
  }
  @DeclDISPID(64421)  public Categories getCategories() throws ComException {
    final Object obj = this._dispatchCall(64421,"Categories", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(Categories.class);
  }
  @DeclDISPID(64502)  public MAPIFolder OpenSharedFolder(String Path, Object Name, Object DownloadAttachments, Object UseTTL) throws ComException {
    assert(Path != null);
    assert(Name != null);
    assert(DownloadAttachments != null);
    assert(UseTTL != null);
    final Object obj = this._dispatchCall(64502,"OpenSharedFolder", DISPATCH_METHOD,null,Path,Name,DownloadAttachments,UseTTL);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.MAPIFolderImpl.class);
  }
  @DeclDISPID(64503)  public Dispatch OpenSharedItem(String Path) throws ComException {
    assert(Path != null);
    final Object obj = this._dispatchCall(64503,"OpenSharedItem", DISPATCH_METHOD,null,Path);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(64484)  public SharingItem CreateSharingItem(Object Context, Object Provider) throws ComException {
    assert(Context != null);
    assert(Provider != null);
    final Object obj = this._dispatchCall(64484,"CreateSharingItem", DISPATCH_METHOD,null,Context,Provider);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(SharingItem.class);
  }
  @DeclDISPID(64517)  public String getExchangeMailboxServerName() throws ComException {
    final Object obj = this._dispatchCall(64517,"ExchangeMailboxServerName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64516)  public String getExchangeMailboxServerVersion() throws ComException {
    final Object obj = this._dispatchCall(64516,"ExchangeMailboxServerVersion", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64508)  public Boolean CompareEntryIDs(String FirstEntryID, String SecondEntryID) throws ComException {
    assert(FirstEntryID != null);
    assert(SecondEntryID != null);
    final Object obj = this._dispatchCall(64508,"CompareEntryIDs", DISPATCH_METHOD,null,FirstEntryID,SecondEntryID);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64515)  public String getAutoDiscoverXml() throws ComException {
    final Object obj = this._dispatchCall(64515,"AutoDiscoverXml", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64558)  public OlAutoDiscoverConnectionMode getAutoDiscoverConnectionMode() throws ComException {
    final Object obj = this._dispatchCall(64558,"AutoDiscoverConnectionMode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlAutoDiscoverConnectionMode.valueOf((Integer)obj);
  }
  @DeclDISPID(64645)  public com.wilutions.mslib.office.ContactCard CreateContactCard(AddressEntry AddressEntry) throws ComException {
    final Object obj = this._dispatchCall(64645,"CreateContactCard", DISPATCH_METHOD,null,(AddressEntry!=null?AddressEntry:Dispatch.NULL));
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ContactCardImpl.class);
  }
  public NameSpace() throws ComException {
    super("{0006308B-0000-0000-C000-000000000046}", "{00063002-0000-0000-C000-000000000046}");
  }
  protected NameSpace(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[NameSpace" + super.toString() + "]";
  }
}
