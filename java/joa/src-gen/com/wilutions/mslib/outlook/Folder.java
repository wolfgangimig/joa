/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Folder.
 * 
 */
@CoClass(guid="{000610F7-0000-0000-C000-000000000046}")
public class Folder extends Dispatch implements MAPIFolder {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(12550)  public OlItemType getDefaultItemType() throws ComException {
    final Object obj = this._dispatchCall(12550,"DefaultItemType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlItemType.valueOf((Integer)obj);
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
  @DeclDISPID(8451)  public _Folders getFolders() throws ComException {
    final Object obj = this._dispatchCall(8451,"Folders", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._FoldersImpl.class);
  }
  @DeclDISPID(12544)  public _Items getItems() throws ComException {
    final Object obj = this._dispatchCall(12544,"Items", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ItemsImpl.class);
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
  @DeclDISPID(61490)  public MAPIFolder CopyTo(MAPIFolder DestinationFolder) throws ComException {
    final Object obj = this._dispatchCall(61490,"CopyTo", DISPATCH_METHOD,null,(DestinationFolder!=null?DestinationFolder:Dispatch.NULL));
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.MAPIFolderImpl.class);
  }
  @DeclDISPID(61509)  public void Delete() throws ComException {
    this._dispatchCall(61509,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(12548)  public void Display() throws ComException {
    this._dispatchCall(12548,"Display", DISPATCH_METHOD,null);
  }
  @DeclDISPID(12545)  public _Explorer GetExplorer(Object DisplayMode) throws ComException {
    assert(DisplayMode != null);
    final Object obj = this._dispatchCall(12545,"GetExplorer", DISPATCH_METHOD,null,DisplayMode);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ExplorerImpl.class);
  }
  @DeclDISPID(61492)  public void MoveTo(MAPIFolder DestinationFolder) throws ComException {
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
  @DeclDISPID(8704)  public View getCurrentView() throws ComException {
    final Object obj = this._dispatchCall(8704,"CurrentView", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ViewImpl.class);
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
  @DeclDISPID(12553)  public _Views getViews() throws ComException {
    final Object obj = this._dispatchCall(12553,"Views", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ViewsImpl.class);
  }
  @DeclDISPID(64182)  public Boolean getIsSharePointFolder() throws ComException {
    final Object obj = this._dispatchCall(64182,"IsSharePointFolder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64194)  public OlShowItemCount getShowItemCount() throws ComException {
    final Object obj = this._dispatchCall(64194,"ShowItemCount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlShowItemCount.valueOf((Integer)obj);
  }
  @DeclDISPID(64194)  public void setShowItemCount(OlShowItemCount value) throws ComException {
    assert(value != null);
    this._dispatchCall(64194,"ShowItemCount", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64217)  public Store getStore() throws ComException {
    final Object obj = this._dispatchCall(64217,"Store", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(Store.class);
  }
  @DeclDISPID(64264)  public _StorageItem GetStorage(String StorageIdentifier, OlStorageIdentifierType StorageIdentifierType) throws ComException {
    assert(StorageIdentifier != null);
    assert(StorageIdentifierType != null);
    final Object obj = this._dispatchCall(64264,"GetStorage", DISPATCH_METHOD,null,StorageIdentifier,StorageIdentifierType.value);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._StorageItemImpl.class);
  }
  @DeclDISPID(64285)  public Table GetTable(Object Filter, Object TableContents) throws ComException {
    assert(Filter != null);
    assert(TableContents != null);
    final Object obj = this._dispatchCall(64285,"GetTable", DISPATCH_METHOD,null,Filter,TableContents);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(Table.class);
  }
  @DeclDISPID(64253)  public PropertyAccessor getPropertyAccessor() throws ComException {
    final Object obj = this._dispatchCall(64253,"PropertyAccessor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(PropertyAccessor.class);
  }
  @DeclDISPID(64418)  public CalendarSharing GetCalendarExporter() throws ComException {
    final Object obj = this._dispatchCall(64418,"GetCalendarExporter", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(CalendarSharing.class);
  }
  @DeclDISPID(63510)  public UserDefinedProperties getUserDefinedProperties() throws ComException {
    final Object obj = this._dispatchCall(63510,"UserDefinedProperties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(UserDefinedProperties.class);
  }
  @DeclDISPID(64572)  public com.wilutions.mslib.stdole.Picture GetCustomIcon() throws ComException {
    final Object obj = this._dispatchCall(64572,"GetCustomIcon", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  @DeclDISPID(64573)  public void SetCustomIcon(com.wilutions.mslib.stdole.Picture Picture) throws ComException {
    this._dispatchCall(64573,"SetCustomIcon", DISPATCH_METHOD,null,(Picture!=null?Picture:Dispatch.NULL));
  }
  public Folder() throws ComException {
    super("{000610F7-0000-0000-C000-000000000046}", "{00063006-0000-0000-C000-000000000046}");
  }
  protected Folder(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Folder" + super.toString() + "]";
  }
}
