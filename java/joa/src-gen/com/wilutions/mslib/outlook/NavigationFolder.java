/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * NavigationFolder.
 * 
 */
@CoClass(guid="{000610F2-0000-0000-C000-000000000046}")
public class NavigationFolder extends Dispatch implements _NavigationFolder {
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
  @DeclDISPID(64452)  public MAPIFolder getFolder() throws ComException {
    final Object obj = this._dispatchCall(64452,"Folder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.MAPIFolderImpl.class);
  }
  @DeclDISPID(64453)  public Boolean getIsSelected() throws ComException {
    final Object obj = this._dispatchCall(64453,"IsSelected", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64453)  public void setIsSelected(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64453,"IsSelected", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64454)  public Boolean getIsSideBySide() throws ComException {
    final Object obj = this._dispatchCall(64454,"IsSideBySide", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64454)  public void setIsSideBySide(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64454,"IsSideBySide", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64455)  public Integer getPosition() throws ComException {
    final Object obj = this._dispatchCall(64455,"Position", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64455)  public void setPosition(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(64455,"Position", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64456)  public Boolean getIsRemovable() throws ComException {
    final Object obj = this._dispatchCall(64456,"IsRemovable", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(8450)  public String getDisplayName() throws ComException {
    final Object obj = this._dispatchCall(8450,"DisplayName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public NavigationFolder() throws ComException {
    super("{000610F2-0000-0000-C000-000000000046}", "{000630F2-0000-0000-C000-000000000046}");
  }
  protected NavigationFolder(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[NavigationFolder" + super.toString() + "]";
  }
}
