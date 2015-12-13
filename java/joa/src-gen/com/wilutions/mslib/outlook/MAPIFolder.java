/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * MAPIFolder.
 * 
 */
@CoInterface(guid="{00063006-0000-0000-C000-000000000046}")
public interface MAPIFolder extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(12550)  public OlItemType getDefaultItemType() throws ComException;
  @DeclDISPID(12551)  public String getDefaultMessageClass() throws ComException;
  @DeclDISPID(12292)  public String getDescription() throws ComException;
  @DeclDISPID(12292)  public void setDescription(final String value) throws ComException;
  @DeclDISPID(61470)  public String getEntryID() throws ComException;
  @DeclDISPID(8451)  public _Folders getFolders() throws ComException;
  @DeclDISPID(12544)  public _Items getItems() throws ComException;
  @DeclDISPID(12289)  public String getName() throws ComException;
  @DeclDISPID(12289)  public void setName(final String value) throws ComException;
  @DeclDISPID(12552)  public String getStoreID() throws ComException;
  @DeclDISPID(13827)  public Integer getUnReadItemCount() throws ComException;
  @DeclDISPID(61490)  public MAPIFolder CopyTo(final MAPIFolder DestinationFolder) throws ComException;
  @DeclDISPID(61509)  public void Delete() throws ComException;
  @DeclDISPID(12548)  public void Display() throws ComException;
  @DeclDISPID(12545)  public _Explorer GetExplorer(final Object DisplayMode) throws ComException;
  @DeclDISPID(61492)  public void MoveTo(final MAPIFolder DestinationFolder) throws ComException;
  @DeclDISPID(12562)  public Boolean getWebViewOn() throws ComException;
  @DeclDISPID(12562)  public void setWebViewOn(final Boolean value) throws ComException;
  @DeclDISPID(12563)  public String getWebViewURL() throws ComException;
  @DeclDISPID(12563)  public void setWebViewURL(final String value) throws ComException;
  @DeclDISPID(12565)  public void AddToPFFavorites() throws ComException;
  @DeclDISPID(64110)  public String getAddressBookName() throws ComException;
  @DeclDISPID(64110)  public void setAddressBookName(final String value) throws ComException;
  @DeclDISPID(64111)  public Boolean getShowAsOutlookAB() throws ComException;
  @DeclDISPID(64111)  public void setShowAsOutlookAB(final Boolean value) throws ComException;
  @DeclDISPID(64120)  public String getFolderPath() throws ComException;
  @DeclDISPID(64075)  public Boolean getInAppFolderSyncObject() throws ComException;
  @DeclDISPID(64075)  public void setInAppFolderSyncObject(final Boolean value) throws ComException;
  @DeclDISPID(8704)  public View getCurrentView() throws ComException;
  @DeclDISPID(64070)  public Boolean getCustomViewsOnly() throws ComException;
  @DeclDISPID(64070)  public void setCustomViewsOnly(final Boolean value) throws ComException;
  @DeclDISPID(12553)  public _Views getViews() throws ComException;
  @DeclDISPID(64182)  public Boolean getIsSharePointFolder() throws ComException;
  @DeclDISPID(64194)  public OlShowItemCount getShowItemCount() throws ComException;
  @DeclDISPID(64194)  public void setShowItemCount(final OlShowItemCount value) throws ComException;
  @DeclDISPID(64217)  public Store getStore() throws ComException;
  @DeclDISPID(64264)  public _StorageItem GetStorage(final String StorageIdentifier, final OlStorageIdentifierType StorageIdentifierType) throws ComException;
  @DeclDISPID(64285)  public Table GetTable(final Object Filter, final Object TableContents) throws ComException;
  @DeclDISPID(64253)  public PropertyAccessor getPropertyAccessor() throws ComException;
  @DeclDISPID(64418)  public CalendarSharing GetCalendarExporter() throws ComException;
  @DeclDISPID(63510)  public UserDefinedProperties getUserDefinedProperties() throws ComException;
  @DeclDISPID(64572)  public com.wilutions.mslib.stdole.Picture GetCustomIcon() throws ComException;
  @DeclDISPID(64573)  public void SetCustomIcon(final com.wilutions.mslib.stdole.Picture Picture) throws ComException;
}
