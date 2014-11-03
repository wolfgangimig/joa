/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AEE-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SharedWorkspaceImpl extends Dispatch implements com.wilutions.mslib.office.SharedWorkspace {
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
  @DeclDISPID(0)  public void setName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1)  public com.wilutions.mslib.office.SharedWorkspaceMembers getMembers() throws ComException {
    final Object obj = this._dispatchCall(1,"Members", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.SharedWorkspaceMembersImpl.class);
  }
  @DeclDISPID(2)  public com.wilutions.mslib.office.SharedWorkspaceTasks getTasks() throws ComException {
    final Object obj = this._dispatchCall(2,"Tasks", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.SharedWorkspaceTasksImpl.class);
  }
  @DeclDISPID(3)  public com.wilutions.mslib.office.SharedWorkspaceFiles getFiles() throws ComException {
    final Object obj = this._dispatchCall(3,"Files", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.SharedWorkspaceFilesImpl.class);
  }
  @DeclDISPID(4)  public com.wilutions.mslib.office.SharedWorkspaceFolders getFolders() throws ComException {
    final Object obj = this._dispatchCall(4,"Folders", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.SharedWorkspaceFoldersImpl.class);
  }
  @DeclDISPID(5)  public com.wilutions.mslib.office.SharedWorkspaceLinks getLinks() throws ComException {
    final Object obj = this._dispatchCall(5,"Links", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.SharedWorkspaceLinksImpl.class);
  }
  @DeclDISPID(6)  public void Refresh() throws ComException {
    this._dispatchCall(6,"Refresh", DISPATCH_METHOD,null);
  }
  @DeclDISPID(7)  public void CreateNew(Object URL, Object Name) throws ComException {
    assert(URL != null);
    assert(Name != null);
    this._dispatchCall(7,"CreateNew", DISPATCH_METHOD,null,URL,Name);
  }
  @DeclDISPID(8)  public void Delete() throws ComException {
    this._dispatchCall(8,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(9)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(9,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(10)  public String getURL() throws ComException {
    final Object obj = this._dispatchCall(10,"URL", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(11)  public Boolean getConnected() throws ComException {
    final Object obj = this._dispatchCall(11,"Connected", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(12)  public Object getLastRefreshed() throws ComException {
    final Object obj = this._dispatchCall(12,"LastRefreshed", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(13)  public String getSourceURL() throws ComException {
    final Object obj = this._dispatchCall(13,"SourceURL", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(13)  public void setSourceURL(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(13,"SourceURL", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14)  public void RemoveDocument() throws ComException {
    this._dispatchCall(14,"RemoveDocument", DISPATCH_METHOD,null);
  }
  @DeclDISPID(15)  public void Disconnect() throws ComException {
    this._dispatchCall(15,"Disconnect", DISPATCH_METHOD,null);
  }
  public SharedWorkspaceImpl(String progId) throws ComException {
    super(progId);
  }
  protected SharedWorkspaceImpl(long ndisp) {
    super(ndisp);
  }
  public SharedWorkspaceImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SharedWorkspaceImpl" + super.toString() + "]";
  }
}
