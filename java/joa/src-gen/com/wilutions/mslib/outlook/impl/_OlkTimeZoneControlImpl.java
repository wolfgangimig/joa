/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091EA0C-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _OlkTimeZoneControlImpl extends Dispatch implements com.wilutions.mslib.outlook._OlkTimeZoneControl {
  @DeclDISPID(64559)  public com.wilutions.mslib.outlook.OlAppointmentTimeField getAppointmentTimeField() throws ComException {
    final Object obj = this._dispatchCall(64559,"AppointmentTimeField", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlAppointmentTimeField.valueOf((Integer)obj);
  }
  @DeclDISPID(64559)  public void setAppointmentTimeField(com.wilutions.mslib.outlook.OlAppointmentTimeField value) throws ComException {
    assert(value != null);
    this._dispatchCall(64559,"AppointmentTimeField", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-504)  public com.wilutions.mslib.outlook.OlBorderStyle getBorderStyle() throws ComException {
    final Object obj = this._dispatchCall(-504,"BorderStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlBorderStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(-504)  public void setBorderStyle(com.wilutions.mslib.outlook.OlBorderStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(-504,"BorderStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-514)  public void setEnabled(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(10)  public Boolean getLocked() throws ComException {
    final Object obj = this._dispatchCall(10,"Locked", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(10)  public void setLocked(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(10,"Locked", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException {
    final Object obj = this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  @DeclDISPID(-522)  public void setMouseIcon(com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(-521)  public com.wilutions.mslib.outlook.OlMousePointer getMousePointer() throws ComException {
    final Object obj = this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlMousePointer.valueOf((Integer)obj);
  }
  @DeclDISPID(-521)  public void setMousePointer(com.wilutions.mslib.outlook.OlMousePointer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64560)  public Integer getSelectedTimeZoneIndex() throws ComException {
    final Object obj = this._dispatchCall(64560,"SelectedTimeZoneIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64560)  public void setSelectedTimeZoneIndex(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(64560,"SelectedTimeZoneIndex", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public Object getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public void setValue(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1001)  public void DropDown() throws ComException {
    this._dispatchCall(1001,"DropDown", DISPATCH_METHOD,null);
  }
  public _OlkTimeZoneControlImpl(String progId) throws ComException {
    super(progId, "{00067367-0000-0000-C000-000000000046}");
  }
  protected _OlkTimeZoneControlImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_OlkTimeZoneControlImpl" + super.toString() + "]";
  }
}
