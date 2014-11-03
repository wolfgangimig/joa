/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A08-A463-DB41-5DAE-69E7A5F7FCBC}")
public class FileDialogSelectedItemsImpl extends Dispatch implements com.wilutions.mslib.office.FileDialogSelectedItems {
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
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610809346)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610809346,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public String Item(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (String)obj;
  }
  public FileDialogSelectedItemsImpl(String progId) throws ComException {
    super(progId);
  }
  protected FileDialogSelectedItemsImpl(long ndisp) {
    super(ndisp);
  }
  public FileDialogSelectedItemsImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[FileDialogSelectedItemsImpl" + super.toString() + "]";
  }
}
