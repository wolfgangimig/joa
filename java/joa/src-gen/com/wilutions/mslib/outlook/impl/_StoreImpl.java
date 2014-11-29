/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9AC-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _StoreImpl extends Dispatch implements com.wilutions.mslib.outlook._Store {
  @DeclDISPID(61440)  public com.wilutions.mslib.outlook._Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public com.wilutions.mslib.outlook.OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public com.wilutions.mslib.outlook._NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(12289)  public String getDisplayName() throws ComException {
    final Object obj = this._dispatchCall(12289,"DisplayName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12552)  public String getStoreID() throws ComException {
    final Object obj = this._dispatchCall(12552,"StoreID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64218)  public com.wilutions.mslib.outlook.OlExchangeStoreType getExchangeStoreType() throws ComException {
    final Object obj = this._dispatchCall(64218,"ExchangeStoreType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlExchangeStoreType.valueOf((Integer)obj);
  }
  @DeclDISPID(64221)  public String getFilePath() throws ComException {
    final Object obj = this._dispatchCall(64221,"FilePath", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64222)  public Boolean getIsCachedExchange() throws ComException {
    final Object obj = this._dispatchCall(64222,"IsCachedExchange", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64223)  public Boolean getIsDataFileStore() throws ComException {
    final Object obj = this._dispatchCall(64223,"IsDataFileStore", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64219)  public com.wilutions.mslib.outlook.MAPIFolder GetRootFolder() throws ComException {
    final Object obj = this._dispatchCall(64219,"GetRootFolder", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.MAPIFolderImpl.class);
  }
  @DeclDISPID(64220)  public com.wilutions.mslib.outlook._Folders GetSearchFolders() throws ComException {
    final Object obj = this._dispatchCall(64220,"GetSearchFolders", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._FoldersImpl.class);
  }
  @DeclDISPID(64224)  public Boolean getIsOpen() throws ComException {
    final Object obj = this._dispatchCall(64224,"IsOpen", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64265)  public com.wilutions.mslib.outlook.Rules GetRules() throws ComException {
    final Object obj = this._dispatchCall(64265,"GetRules", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.Rules.class);
  }
  @DeclDISPID(64253)  public com.wilutions.mslib.outlook.PropertyAccessor getPropertyAccessor() throws ComException {
    final Object obj = this._dispatchCall(64253,"PropertyAccessor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.PropertyAccessor.class);
  }
  @DeclDISPID(8456)  public com.wilutions.mslib.outlook.MAPIFolder GetSpecialFolder(final com.wilutions.mslib.outlook.OlSpecialFolders FolderType) throws ComException {
    assert(FolderType != null);
    final Object obj = this._dispatchCall(8456,"GetSpecialFolder", DISPATCH_METHOD,null,FolderType.value);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.MAPIFolderImpl.class);
  }
  @DeclDISPID(64532)  public Boolean getIsInstantSearchEnabled() throws ComException {
    final Object obj = this._dispatchCall(64532,"IsInstantSearchEnabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64590)  public void RefreshQuotaDisplay() throws ComException {
    this._dispatchCall(64590,"RefreshQuotaDisplay", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64621)  public com.wilutions.mslib.outlook.MAPIFolder GetDefaultFolder(final com.wilutions.mslib.outlook.OlDefaultFolders FolderType) throws ComException {
    assert(FolderType != null);
    final Object obj = this._dispatchCall(64621,"GetDefaultFolder", DISPATCH_METHOD,null,FolderType.value);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.MAPIFolderImpl.class);
  }
  @DeclDISPID(64630)  public Boolean getIsConversationEnabled() throws ComException {
    final Object obj = this._dispatchCall(64630,"IsConversationEnabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64421)  public com.wilutions.mslib.outlook.Categories getCategories() throws ComException {
    final Object obj = this._dispatchCall(64421,"Categories", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.Categories.class);
  }
  public _StoreImpl(String progId) throws ComException {
    super(progId, "{000630C7-0000-0000-C000-000000000046}");
  }
  protected _StoreImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_StoreImpl" + super.toString() + "]";
  }
}
