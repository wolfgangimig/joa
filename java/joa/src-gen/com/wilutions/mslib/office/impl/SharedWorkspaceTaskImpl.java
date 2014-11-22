/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A12-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SharedWorkspaceTaskImpl extends Dispatch implements com.wilutions.mslib.office.SharedWorkspaceTask {
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
  @DeclDISPID(0)  public String getTitle() throws ComException {
    final Object obj = this._dispatchCall(0,"Title", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(0)  public void setTitle(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Title", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1)  public String getAssignedTo() throws ComException {
    final Object obj = this._dispatchCall(1,"AssignedTo", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1)  public void setAssignedTo(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"AssignedTo", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(2)  public com.wilutions.mslib.office.MsoSharedWorkspaceTaskStatus getStatus() throws ComException {
    final Object obj = this._dispatchCall(2,"Status", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoSharedWorkspaceTaskStatus.valueOf((Integer)obj);
  }
  @DeclDISPID(2)  public void setStatus(com.wilutions.mslib.office.MsoSharedWorkspaceTaskStatus value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"Status", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(3)  public com.wilutions.mslib.office.MsoSharedWorkspaceTaskPriority getPriority() throws ComException {
    final Object obj = this._dispatchCall(3,"Priority", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoSharedWorkspaceTaskPriority.valueOf((Integer)obj);
  }
  @DeclDISPID(3)  public void setPriority(com.wilutions.mslib.office.MsoSharedWorkspaceTaskPriority value) throws ComException {
    assert(value != null);
    this._dispatchCall(3,"Priority", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(4)  public String getDescription() throws ComException {
    final Object obj = this._dispatchCall(4,"Description", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4)  public void setDescription(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(4,"Description", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(5)  public Object getDueDate() throws ComException {
    final Object obj = this._dispatchCall(5,"DueDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(5)  public void setDueDate(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(5,"DueDate", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(6)  public String getCreatedBy() throws ComException {
    final Object obj = this._dispatchCall(6,"CreatedBy", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(7)  public Object getCreatedDate() throws ComException {
    final Object obj = this._dispatchCall(7,"CreatedDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(8)  public String getModifiedBy() throws ComException {
    final Object obj = this._dispatchCall(8,"ModifiedBy", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(9)  public Object getModifiedDate() throws ComException {
    final Object obj = this._dispatchCall(9,"ModifiedDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(10)  public void Save() throws ComException {
    this._dispatchCall(10,"Save", DISPATCH_METHOD,null);
  }
  @DeclDISPID(11)  public void Delete() throws ComException {
    this._dispatchCall(11,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(12)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(12,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  public SharedWorkspaceTaskImpl(String progId) throws ComException {
    super(progId, "{000C0379-0000-0000-C000-000000000046}");
  }
  protected SharedWorkspaceTaskImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SharedWorkspaceTaskImpl" + super.toString() + "]";
  }
}
