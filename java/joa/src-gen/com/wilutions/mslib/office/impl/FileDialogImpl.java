/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A09-A463-DB41-5DAE-69E7A5F7FCBC}")
public class FileDialogImpl extends Dispatch implements com.wilutions.mslib.office.FileDialog {
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
  @DeclDISPID(1610809345)  public com.wilutions.mslib.office.FileDialogFilters getFilters() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Filters", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.FileDialogFiltersImpl.class);
  }
  @DeclDISPID(1610809346)  public Integer getFilterIndex() throws ComException {
    final Object obj = this._dispatchCall(1610809346,"FilterIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809346)  public void setFilterIndex(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809346,"FilterIndex", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809348)  public String getTitle() throws ComException {
    final Object obj = this._dispatchCall(1610809348,"Title", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809348)  public void setTitle(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809348,"Title", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809350)  public String getButtonName() throws ComException {
    final Object obj = this._dispatchCall(1610809350,"ButtonName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809350)  public void setButtonName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809350,"ButtonName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809352)  public Boolean getAllowMultiSelect() throws ComException {
    final Object obj = this._dispatchCall(1610809352,"AllowMultiSelect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809352)  public void setAllowMultiSelect(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809352,"AllowMultiSelect", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809354)  public com.wilutions.mslib.office.MsoFileDialogView getInitialView() throws ComException {
    final Object obj = this._dispatchCall(1610809354,"InitialView", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoFileDialogView.valueOf((Integer)obj);
  }
  @DeclDISPID(1610809354)  public void setInitialView(com.wilutions.mslib.office.MsoFileDialogView value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809354,"InitialView", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610809356)  public String getInitialFileName() throws ComException {
    final Object obj = this._dispatchCall(1610809356,"InitialFileName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809356)  public void setInitialFileName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809356,"InitialFileName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809358)  public com.wilutions.mslib.office.FileDialogSelectedItems getSelectedItems() throws ComException {
    final Object obj = this._dispatchCall(1610809358,"SelectedItems", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.FileDialogSelectedItemsImpl.class);
  }
  @DeclDISPID(1610809359)  public com.wilutions.mslib.office.MsoFileDialogType getDialogType() throws ComException {
    final Object obj = this._dispatchCall(1610809359,"DialogType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoFileDialogType.valueOf((Integer)obj);
  }
  @DeclDISPID(0)  public String getItem() throws ComException {
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809361)  public Integer Show() throws ComException {
    final Object obj = this._dispatchCall(1610809361,"Show", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809362)  public void Execute() throws ComException {
    this._dispatchCall(1610809362,"Execute", DISPATCH_METHOD,null);
  }
  public FileDialogImpl(String progId) throws ComException {
    super(progId, "{000C0362-0000-0000-C000-000000000046}");
  }
  protected FileDialogImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[FileDialogImpl" + super.toString() + "]";
  }
}
