/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A8D-A463-DB41-5DAE-69E7A5F7FCBC}")
public class PickerDialogImpl extends Dispatch implements com.wilutions.mslib.office.PickerDialog {
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
  @DeclDISPID(1)  public String getDataHandlerId() throws ComException {
    final Object obj = this._dispatchCall(1,"DataHandlerId", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1)  public void setDataHandlerId(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"DataHandlerId", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(2)  public String getTitle() throws ComException {
    final Object obj = this._dispatchCall(2,"Title", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public void setTitle(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"Title", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3)  public com.wilutions.mslib.office.PickerProperties getProperties() throws ComException {
    final Object obj = this._dispatchCall(3,"Properties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.PickerPropertiesImpl.class);
  }
  @DeclDISPID(4)  public com.wilutions.mslib.office.PickerResults CreatePickerResults() throws ComException {
    final Object obj = this._dispatchCall(4,"CreatePickerResults", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.PickerResultsImpl.class);
  }
  @DeclDISPID(5)  public com.wilutions.mslib.office.PickerResults Show(Boolean IsMultiSelect, com.wilutions.mslib.office.PickerResults ExistingResults) throws ComException {
    assert(IsMultiSelect != null);
    final Object obj = this._dispatchCall(5,"Show", DISPATCH_METHOD,null,IsMultiSelect,(ExistingResults!=null?ExistingResults:Dispatch.NULL));
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.PickerResultsImpl.class);
  }
  @DeclDISPID(6)  public com.wilutions.mslib.office.PickerResults Resolve(String TokenText, Integer duplicateDlgMode) throws ComException {
    assert(TokenText != null);
    assert(duplicateDlgMode != null);
    final Object obj = this._dispatchCall(6,"Resolve", DISPATCH_METHOD,null,TokenText,duplicateDlgMode);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.PickerResultsImpl.class);
  }
  public PickerDialogImpl(String progId) throws ComException {
    super(progId);
  }
  protected PickerDialogImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PickerDialogImpl" + super.toString() + "]";
  }
}
