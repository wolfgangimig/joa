/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A14-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SharedWorkspaceLinkImpl extends Dispatch implements com.wilutions.mslib.office.SharedWorkspaceLink {
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
  @DeclDISPID(0)  public String getURL() throws ComException {
    final Object obj = this._dispatchCall(0,"URL", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(0)  public void setURL(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"URL", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1)  public String getDescription() throws ComException {
    final Object obj = this._dispatchCall(1,"Description", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1)  public void setDescription(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"Description", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(2)  public String getNotes() throws ComException {
    final Object obj = this._dispatchCall(2,"Notes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public void setNotes(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"Notes", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3)  public String getCreatedBy() throws ComException {
    final Object obj = this._dispatchCall(3,"CreatedBy", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4)  public Object getCreatedDate() throws ComException {
    final Object obj = this._dispatchCall(4,"CreatedDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(5)  public String getModifiedBy() throws ComException {
    final Object obj = this._dispatchCall(5,"ModifiedBy", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(6)  public Object getModifiedDate() throws ComException {
    final Object obj = this._dispatchCall(6,"ModifiedDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(7)  public void Save() throws ComException {
    this._dispatchCall(7,"Save", DISPATCH_METHOD,null);
  }
  @DeclDISPID(8)  public void Delete() throws ComException {
    this._dispatchCall(8,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(9)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(9,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  public SharedWorkspaceLinkImpl(String progId) throws ComException {
    super(progId);
  }
  protected SharedWorkspaceLinkImpl(long ndisp) {
    super(ndisp);
  }
  public SharedWorkspaceLinkImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SharedWorkspaceLinkImpl" + super.toString() + "]";
  }
}
