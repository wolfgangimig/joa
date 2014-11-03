/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A03-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ScopeFolderImpl extends Dispatch implements com.wilutions.mslib.office.ScopeFolder {
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
  @DeclDISPID(0)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(0,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public String getPath() throws ComException {
    final Object obj = this._dispatchCall(2,"Path", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3)  public com.wilutions.mslib.office.ScopeFolders getScopeFolders() throws ComException {
    final Object obj = this._dispatchCall(3,"ScopeFolders", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ScopeFoldersImpl.class);
  }
  @DeclDISPID(4)  public void AddToSearchFolders() throws ComException {
    this._dispatchCall(4,"AddToSearchFolders", DISPATCH_METHOD,null);
  }
  public ScopeFolderImpl(String progId) throws ComException {
    super(progId);
  }
  protected ScopeFolderImpl(long ndisp) {
    super(ndisp);
  }
  public ScopeFolderImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ScopeFolderImpl" + super.toString() + "]";
  }
}
