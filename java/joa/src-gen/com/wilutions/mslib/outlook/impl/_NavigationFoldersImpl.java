/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A99A-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _NavigationFoldersImpl extends Dispatch implements com.wilutions.mslib.outlook._NavigationFolders {
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
  @DeclDISPID(80)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(80,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(81)  public com.wilutions.mslib.outlook._NavigationFolder Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._NavigationFolderImpl.class);
  }
  @DeclDISPID(64450)  public com.wilutions.mslib.outlook.NavigationFolder Add(com.wilutions.mslib.outlook.MAPIFolder Folder) throws ComException {
    final Object obj = this._dispatchCall(64450,"Add", DISPATCH_METHOD,null,(Folder!=null?Folder:Dispatch.NULL));
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.NavigationFolder.class);
  }
  @DeclDISPID(64451)  public void Remove(com.wilutions.mslib.outlook.NavigationFolder RemovableFolder) throws ComException {
    this._dispatchCall(64451,"Remove", DISPATCH_METHOD,null,(RemovableFolder!=null?RemovableFolder:Dispatch.NULL));
  }
  public _NavigationFoldersImpl(String progId) throws ComException {
    super(progId);
  }
  protected _NavigationFoldersImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_NavigationFoldersImpl" + super.toString() + "]";
  }
}
