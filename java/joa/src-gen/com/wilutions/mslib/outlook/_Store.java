/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Store.
 * 
 */
@CoInterface(guid="{000630C7-0000-0000-C000-000000000046}")
public interface _Store extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(12289)  public String getDisplayName() throws ComException;
  @DeclDISPID(12552)  public String getStoreID() throws ComException;
  @DeclDISPID(64218)  public OlExchangeStoreType getExchangeStoreType() throws ComException;
  @DeclDISPID(64221)  public String getFilePath() throws ComException;
  @DeclDISPID(64222)  public Boolean getIsCachedExchange() throws ComException;
  @DeclDISPID(64223)  public Boolean getIsDataFileStore() throws ComException;
  @DeclDISPID(64219)  public MAPIFolder GetRootFolder() throws ComException;
  @DeclDISPID(64220)  public _Folders GetSearchFolders() throws ComException;
  @DeclDISPID(64224)  public Boolean getIsOpen() throws ComException;
  @DeclDISPID(64265)  public Rules GetRules() throws ComException;
  @DeclDISPID(64253)  public PropertyAccessor getPropertyAccessor() throws ComException;
  @DeclDISPID(8456)  public MAPIFolder GetSpecialFolder(OlSpecialFolders FolderType) throws ComException;
  @DeclDISPID(64532)  public Boolean getIsInstantSearchEnabled() throws ComException;
  @DeclDISPID(64590)  public void RefreshQuotaDisplay() throws ComException;
  @DeclDISPID(64621)  public MAPIFolder GetDefaultFolder(OlDefaultFolders FolderType) throws ComException;
  @DeclDISPID(64630)  public Boolean getIsConversationEnabled() throws ComException;
  @DeclDISPID(64421)  public Categories getCategories() throws ComException;
}
