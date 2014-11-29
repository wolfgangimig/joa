/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Store.
 * 
 */
@CoClass(guid="{000610C7-0000-0000-C000-000000000046}")
public class Store extends Dispatch implements _Store {
  static boolean __typelib__loaded = __TypeLib.load();
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
  @DeclDISPID(64218)  public OlExchangeStoreType getExchangeStoreType() throws ComException {
    final Object obj = this._dispatchCall(64218,"ExchangeStoreType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlExchangeStoreType.valueOf((Integer)obj);
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
  @DeclDISPID(64219)  public MAPIFolder GetRootFolder() throws ComException {
    final Object obj = this._dispatchCall(64219,"GetRootFolder", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.MAPIFolderImpl.class);
  }
  @DeclDISPID(64220)  public _Folders GetSearchFolders() throws ComException {
    final Object obj = this._dispatchCall(64220,"GetSearchFolders", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._FoldersImpl.class);
  }
  @DeclDISPID(64224)  public Boolean getIsOpen() throws ComException {
    final Object obj = this._dispatchCall(64224,"IsOpen", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64265)  public Rules GetRules() throws ComException {
    final Object obj = this._dispatchCall(64265,"GetRules", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(Rules.class);
  }
  @DeclDISPID(64253)  public PropertyAccessor getPropertyAccessor() throws ComException {
    final Object obj = this._dispatchCall(64253,"PropertyAccessor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(PropertyAccessor.class);
  }
  @DeclDISPID(8456)  public MAPIFolder GetSpecialFolder(OlSpecialFolders FolderType) throws ComException {
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
  @DeclDISPID(64621)  public MAPIFolder GetDefaultFolder(OlDefaultFolders FolderType) throws ComException {
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
  @DeclDISPID(64421)  public Categories getCategories() throws ComException {
    final Object obj = this._dispatchCall(64421,"Categories", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(Categories.class);
  }
  public Store() throws ComException {
    super("{000610C7-0000-0000-C000-000000000046}", "{000630C7-0000-0000-C000-000000000046}");
  }
  protected Store(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Store" + super.toString() + "]";
  }
}
