/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A0F-A463-DB41-5DAE-69E7A5F7FCBC}")
public class FileDialogFilterImpl extends Dispatch implements com.wilutions.mslib.office.FileDialogFilter {
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
  @DeclDISPID(1610809344)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610809345)  public String getExtensions() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Extensions", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809346)  public String getDescription() throws ComException {
    final Object obj = this._dispatchCall(1610809346,"Description", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public FileDialogFilterImpl(String progId) throws ComException {
    super(progId, "{000C0364-0000-0000-C000-000000000046}");
  }
  protected FileDialogFilterImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[FileDialogFilterImpl" + super.toString() + "]";
  }
}
