/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A8B-A463-DB41-5DAE-69E7A5F7FCBC}")
public class PickerFieldImpl extends Dispatch implements com.wilutions.mslib.office.PickerField {
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
  @DeclDISPID(1)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public com.wilutions.mslib.office.MsoPickerField getType() throws ComException {
    final Object obj = this._dispatchCall(2,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoPickerField.valueOf((Integer)obj);
  }
  @DeclDISPID(3)  public Boolean getIsHidden() throws ComException {
    final Object obj = this._dispatchCall(3,"IsHidden", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public PickerFieldImpl(String progId) throws ComException {
    super(progId, "{000C03E0-0000-0000-C000-000000000046}");
  }
  protected PickerFieldImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PickerFieldImpl" + super.toString() + "]";
  }
}
