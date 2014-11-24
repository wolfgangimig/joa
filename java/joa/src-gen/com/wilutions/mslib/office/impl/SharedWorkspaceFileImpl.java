/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A10-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SharedWorkspaceFileImpl extends Dispatch implements com.wilutions.mslib.office.SharedWorkspaceFile {
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
  @DeclDISPID(0)  public String getURL() throws ComException {
    final Object obj = this._dispatchCall(0,"URL", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1)  public String getCreatedBy() throws ComException {
    final Object obj = this._dispatchCall(1,"CreatedBy", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public Object getCreatedDate() throws ComException {
    final Object obj = this._dispatchCall(2,"CreatedDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(3)  public String getModifiedBy() throws ComException {
    final Object obj = this._dispatchCall(3,"ModifiedBy", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4)  public Object getModifiedDate() throws ComException {
    final Object obj = this._dispatchCall(4,"ModifiedDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(5)  public void Delete() throws ComException {
    this._dispatchCall(5,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(6)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(6,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  public SharedWorkspaceFileImpl(String progId) throws ComException {
    super(progId, "{000C037B-0000-0000-C000-000000000046}");
  }
  protected SharedWorkspaceFileImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SharedWorkspaceFileImpl" + super.toString() + "]";
  }
}
