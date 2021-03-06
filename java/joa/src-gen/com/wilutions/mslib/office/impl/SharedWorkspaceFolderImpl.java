/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A16-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SharedWorkspaceFolderImpl extends Dispatch implements com.wilutions.mslib.office.SharedWorkspaceFolder {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public String getFolderName() throws ComException {
    final Object obj = this._dispatchCall(0,"FolderName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1)  public void Delete(final Object DeleteEventIfFolderContainsFiles) throws ComException {
    assert(DeleteEventIfFolderContainsFiles != null);
    this._dispatchCall(1,"Delete", DISPATCH_METHOD,null,Variant.param(DeleteEventIfFolderContainsFiles));
  }
  @DeclDISPID(2)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(2,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  public SharedWorkspaceFolderImpl(String progId) throws ComException {
    super(progId, "{000C037D-0000-0000-C000-000000000046}");
  }
  protected SharedWorkspaceFolderImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SharedWorkspaceFolderImpl" + super.toString() + "]";
  }
}
