/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B4069-A463-DB41-5DAE-69E7A5F7FCBC}")
public class WorkflowTemplateImpl extends Dispatch implements com.wilutions.mslib.office.WorkflowTemplate {
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
  @DeclDISPID(2)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(2,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3)  public String getDescription() throws ComException {
    final Object obj = this._dispatchCall(3,"Description", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4)  public String getDocumentLibraryName() throws ComException {
    final Object obj = this._dispatchCall(4,"DocumentLibraryName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(5)  public String getDocumentLibraryURL() throws ComException {
    final Object obj = this._dispatchCall(5,"DocumentLibraryURL", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(6)  public Integer Show() throws ComException {
    final Object obj = this._dispatchCall(6,"Show", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public WorkflowTemplateImpl(String progId) throws ComException {
    super(progId, "{000CD902-0000-0000-C000-000000000046}");
  }
  protected WorkflowTemplateImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[WorkflowTemplateImpl" + super.toString() + "]";
  }
}
