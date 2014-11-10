/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A15-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SharedWorkspaceFoldersImpl extends Dispatch implements com.wilutions.mslib.office.SharedWorkspaceFolders {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.SharedWorkspaceFolder getItem(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.SharedWorkspaceFolderImpl.class);
  }
  @DeclDISPID(1)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2)  public com.wilutions.mslib.office.SharedWorkspaceFolder Add(String FolderName, Object ParentFolder) throws ComException {
    assert(FolderName != null);
    assert(ParentFolder != null);
    final Object obj = this._dispatchCall(2,"Add", DISPATCH_METHOD,null,FolderName,ParentFolder);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.SharedWorkspaceFolderImpl.class);
  }
  @DeclDISPID(3)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(3,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(4)  public Boolean getItemCountExceeded() throws ComException {
    final Object obj = this._dispatchCall(4,"ItemCountExceeded", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public SharedWorkspaceFoldersImpl(String progId) throws ComException {
    super(progId);
  }
  protected SharedWorkspaceFoldersImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SharedWorkspaceFoldersImpl" + super.toString() + "]";
  }
}
