/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B406B-A463-DB41-5DAE-69E7A5F7FCBC}")
public class WorkflowTaskImpl extends Dispatch implements com.wilutions.mslib.office.WorkflowTask {
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
  @DeclDISPID(1)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(1,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public String getListID() throws ComException {
    final Object obj = this._dispatchCall(2,"ListID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3)  public String getWorkflowID() throws ComException {
    final Object obj = this._dispatchCall(3,"WorkflowID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(4,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(5)  public String getDescription() throws ComException {
    final Object obj = this._dispatchCall(5,"Description", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(6)  public String getAssignedTo() throws ComException {
    final Object obj = this._dispatchCall(6,"AssignedTo", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(7)  public String getCreatedBy() throws ComException {
    final Object obj = this._dispatchCall(7,"CreatedBy", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8)  public java.util.Date getDueDate() throws ComException {
    final Object obj = this._dispatchCall(8,"DueDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(9)  public java.util.Date getCreatedDate() throws ComException {
    final Object obj = this._dispatchCall(9,"CreatedDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(10)  public Integer Show() throws ComException {
    final Object obj = this._dispatchCall(10,"Show", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public WorkflowTaskImpl(String progId) throws ComException {
    super(progId);
  }
  protected WorkflowTaskImpl(long ndisp) {
    super(ndisp);
  }
  public WorkflowTaskImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[WorkflowTaskImpl" + super.toString() + "]";
  }
}
