/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AEC-A463-DB41-5DAE-69E7A5F7FCBC}")
public class DocumentLibraryVersionImpl extends Dispatch implements com.wilutions.mslib.office.DocumentLibraryVersion {
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
  @DeclDISPID(0)  public Object getModified() throws ComException {
    final Object obj = this._dispatchCall(0,"Modified", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1)  public Integer getIndex() throws ComException {
    final Object obj = this._dispatchCall(1,"Index", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(2,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(3)  public String getModifiedBy() throws ComException {
    final Object obj = this._dispatchCall(3,"ModifiedBy", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4)  public String getComments() throws ComException {
    final Object obj = this._dispatchCall(4,"Comments", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(5)  public void Delete() throws ComException {
    this._dispatchCall(5,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(6)  public Dispatch Open() throws ComException {
    final Object obj = this._dispatchCall(6,"Open", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(7)  public Dispatch Restore() throws ComException {
    final Object obj = this._dispatchCall(7,"Restore", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  public DocumentLibraryVersionImpl(String progId) throws ComException {
    super(progId);
  }
  protected DocumentLibraryVersionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[DocumentLibraryVersionImpl" + super.toString() + "]";
  }
}
