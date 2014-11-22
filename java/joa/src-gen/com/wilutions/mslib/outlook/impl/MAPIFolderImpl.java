/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A96D-A463-DB41-5DAE-69E7A5F7FCBC}")
public class MAPIFolderImpl extends Dispatch implements com.wilutions.mslib.outlook.MAPIFolder {
  @DeclDISPID(61440)  public com.wilutions.mslib.outlook._Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public com.wilutions.mslib.outlook.OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public com.wilutions.mslib.outlook._NameSpace getSession() throws ComException {
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
  @DeclDISPID(12550)  public com.wilutions.mslib.outlook.OlItemType getDefaultItemType() throws ComException {
    final Object obj = this._dispatchCall(12550,"DefaultItemType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlItemType.valueOf((Integer)obj);
  }
  @DeclDISPID(12551)  public String getDefaultMessageClass() throws ComException {
    final Object obj = this._dispatchCall(12551,"DefaultMessageClass", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12292)  public String getDescription() throws ComException {
    final Object obj = this._dispatchCall(12292,"Description", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12292)  public void setDescription(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(12292,"Description", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(61470)  public String getEntryID() throws ComException {
    final Object obj = this._dispatchCall(61470,"EntryID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8451)  public com.wilutions.mslib.outlook._Folders getFolders() throws ComException {
    final Object obj = this._dispatchCall(8451,"Folders", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._FoldersImpl.class);
  }
  @DeclDISPID(12544)  public com.wilutions.mslib.outlook._Items getItems() throws ComException {
    final Object obj = this._dispatchCall(12544,"Items", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ItemsImpl.class);
  }
  @DeclDISPID(12289)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(12289,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12289)  public void setName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(12289,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(12552)  public String getStoreID() throws ComException {
    final Object obj = this._dispatchCall(12552,"StoreID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(13827)  public Integer getUnReadItemCount() throws ComException {
    final Object obj = this._dispatchCall(13827,"UnReadItemCount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(61490)  public com.wilutions.mslib.outlook.MAPIFolder CopyTo(com.wilutions.mslib.outlook.MAPIFolder DestinationFolder) throws ComException {
    final Object obj = this._dispatchCall(61490,"CopyTo", DISPATCH_METHOD,null,(DestinationFolder!=null?DestinationFolder:Dispatch.NULL));
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.MAPIFolderImpl.class);
  }
  @DeclDISPID(61509)  public void Delete() throws ComException {
    this._dispatchCall(61509,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(12548)  public void Display() throws ComException {
    this._dispatchCall(12548,"Display", DISPATCH_METHOD,null);
  }
  @DeclDISPID(12545)  public com.wilutions.mslib.outlook._Explorer GetExplorer(Object DisplayMode) throws ComException {
    assert(DisplayMode != null);
    final Object obj = this._dispatchCall(12545,"GetExplorer", DISPATCH_METHOD,null,DisplayMode);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ExplorerImpl.class);
  }
  @DeclDISPID(61492)  public void MoveTo(com.wilutions.mslib.outlook.MAPIFolder DestinationFolder) throws ComException {
    this._dispatchCall(61492,"MoveTo", DISPATCH_METHOD,null,(DestinationFolder!=null?DestinationFolder:Dispatch.NULL));
  }
  @DeclDISPID(12562)  public Boolean getWebViewOn() throws ComException {
    final Object obj = this._dispatchCall(12562,"WebViewOn", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(12562)  public void setWebViewOn(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(12562,"WebViewOn", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(12563)  public String getWebViewURL() throws ComException {
    final Object obj = this._dispatchCall(12563,"WebViewURL", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12563)  public void setWebViewURL(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(12563,"WebViewURL", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(12565)  public void AddToPFFavorites() throws ComException {
    this._dispatchCall(12565,"AddToPFFavorites", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64110)  public String getAddressBookName() throws ComException {
    final Object obj = this._dispatchCall(64110,"AddressBookName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64110)  public void setAddressBookName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64110,"AddressBookName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64111)  public Boolean getShowAsOutlookAB() throws ComException {
    final Object obj = this._dispatchCall(64111,"ShowAsOutlookAB", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64111)  public void setShowAsOutlookAB(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64111,"ShowAsOutlookAB", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64120)  public String getFolderPath() throws ComException {
    final Object obj = this._dispatchCall(64120,"FolderPath", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64075)  public Boolean getInAppFolderSyncObject() throws ComException {
    final Object obj = this._dispatchCall(64075,"InAppFolderSyncObject", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64075)  public void setInAppFolderSyncObject(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64075,"InAppFolderSyncObject", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8704)  public com.wilutions.mslib.outlook.View getCurrentView() throws ComException {
    final Object obj = this._dispatchCall(8704,"CurrentView", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.ViewImpl.class);
  }
  @DeclDISPID(64070)  public Boolean getCustomViewsOnly() throws ComException {
    final Object obj = this._dispatchCall(64070,"CustomViewsOnly", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64070)  public void setCustomViewsOnly(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64070,"CustomViewsOnly", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(12553)  public com.wilutions.mslib.outlook._Views getViews() throws ComException {
    final Object obj = this._dispatchCall(12553,"Views", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ViewsImpl.class);
  }
  @DeclDISPID(64182)  public Boolean getIsSharePointFolder() throws ComException {
    final Object obj = this._dispatchCall(64182,"IsSharePointFolder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64194)  public com.wilutions.mslib.outlook.OlShowItemCount getShowItemCount() throws ComException {
    final Object obj = this._dispatchCall(64194,"ShowItemCount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlShowItemCount.valueOf((Integer)obj);
  }
  @DeclDISPID(64194)  public void setShowItemCount(com.wilutions.mslib.outlook.OlShowItemCount value) throws ComException {
    assert(value != null);
    this._dispatchCall(64194,"ShowItemCount", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64217)  public com.wilutions.mslib.outlook.Store getStore() throws ComException {
    final Object obj = this._dispatchCall(64217,"Store", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.Store.class);
  }
  @DeclDISPID(64264)  public com.wilutions.mslib.outlook._StorageItem GetStorage(String StorageIdentifier, com.wilutions.mslib.outlook.OlStorageIdentifierType StorageIdentifierType) throws ComException {
    assert(StorageIdentifier != null);
    assert(StorageIdentifierType != null);
    final Object obj = this._dispatchCall(64264,"GetStorage", DISPATCH_METHOD,null,StorageIdentifier,StorageIdentifierType.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._StorageItemImpl.class);
  }
  @DeclDISPID(64285)  public com.wilutions.mslib.outlook.Table GetTable(Object Filter, Object TableContents) throws ComException {
    assert(Filter != null);
    assert(TableContents != null);
    final Object obj = this._dispatchCall(64285,"GetTable", DISPATCH_METHOD,null,Filter,TableContents);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.Table.class);
  }
  @DeclDISPID(64253)  public com.wilutions.mslib.outlook.PropertyAccessor getPropertyAccessor() throws ComException {
    final Object obj = this._dispatchCall(64253,"PropertyAccessor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.PropertyAccessor.class);
  }
  @DeclDISPID(64418)  public com.wilutions.mslib.outlook.CalendarSharing GetCalendarExporter() throws ComException {
    final Object obj = this._dispatchCall(64418,"GetCalendarExporter", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.CalendarSharing.class);
  }
  @DeclDISPID(63510)  public com.wilutions.mslib.outlook.UserDefinedProperties getUserDefinedProperties() throws ComException {
    final Object obj = this._dispatchCall(63510,"UserDefinedProperties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.UserDefinedProperties.class);
  }
  @DeclDISPID(64572)  public com.wilutions.mslib.stdole.Picture GetCustomIcon() throws ComException {
    final Object obj = this._dispatchCall(64572,"GetCustomIcon", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  @DeclDISPID(64573)  public void SetCustomIcon(com.wilutions.mslib.stdole.Picture Picture) throws ComException {
    this._dispatchCall(64573,"SetCustomIcon", DISPATCH_METHOD,null,(Picture!=null?Picture:Dispatch.NULL));
  }
  public MAPIFolderImpl(String progId) throws ComException {
    super(progId, "{00063006-0000-0000-C000-000000000046}");
  }
  protected MAPIFolderImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[MAPIFolderImpl" + super.toString() + "]";
  }
}
