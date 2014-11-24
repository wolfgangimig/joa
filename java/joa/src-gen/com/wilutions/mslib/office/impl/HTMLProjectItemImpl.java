/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A33-A463-DB41-5DAE-69E7A5F7FCBC}")
public class HTMLProjectItemImpl extends Dispatch implements com.wilutions.mslib.office.HTMLProjectItem {
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
  @DeclDISPID(0)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(0,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4)  public Boolean getIsOpen() throws ComException {
    final Object obj = this._dispatchCall(4,"IsOpen", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(5)  public void LoadFromFile(String FileName) throws ComException {
    assert(FileName != null);
    this._dispatchCall(5,"LoadFromFile", DISPATCH_METHOD,null,FileName);
  }
  @DeclDISPID(6)  public void Open(com.wilutions.mslib.office.MsoHTMLProjectOpen OpenKind) throws ComException {
    assert(OpenKind != null);
    this._dispatchCall(6,"Open", DISPATCH_METHOD,null,OpenKind.value);
  }
  @DeclDISPID(7)  public void SaveCopyAs(String FileName) throws ComException {
    assert(FileName != null);
    this._dispatchCall(7,"SaveCopyAs", DISPATCH_METHOD,null,FileName);
  }
  @DeclDISPID(8)  public String getText() throws ComException {
    final Object obj = this._dispatchCall(8,"Text", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8)  public void setText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(8,"Text", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(10)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(10,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  public HTMLProjectItemImpl(String progId) throws ComException {
    super(progId, "{000C0358-0000-0000-C000-000000000046}");
  }
  protected HTMLProjectItemImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[HTMLProjectItemImpl" + super.toString() + "]";
  }
}
