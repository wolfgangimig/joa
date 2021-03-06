/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlkTimeZoneControl.
 * 
 */
@CoClass(guid="{0006F059-0000-0000-C000-000000000046}")
public class OlkTimeZoneControl extends Dispatch implements _OlkTimeZoneControl {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(64559)  public OlAppointmentTimeField getAppointmentTimeField() throws ComException {
    final Object obj = this._dispatchCall(64559,"AppointmentTimeField", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlAppointmentTimeField.valueOf((Integer)obj);
  }
  @DeclDISPID(64559)  public void setAppointmentTimeField(final OlAppointmentTimeField value) throws ComException {
    assert(value != null);
    this._dispatchCall(64559,"AppointmentTimeField", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-504)  public OlBorderStyle getBorderStyle() throws ComException {
    final Object obj = this._dispatchCall(-504,"BorderStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlBorderStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(-504)  public void setBorderStyle(final OlBorderStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(-504,"BorderStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-514)  public void setEnabled(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(10)  public Boolean getLocked() throws ComException {
    final Object obj = this._dispatchCall(10,"Locked", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(10)  public void setLocked(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(10,"Locked", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException {
    final Object obj = this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  @DeclDISPID(-522)  public void setMouseIcon(final com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYPUT,Dispatch.param(value));
  }
  @DeclDISPID(-521)  public OlMousePointer getMousePointer() throws ComException {
    final Object obj = this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlMousePointer.valueOf((Integer)obj);
  }
  @DeclDISPID(-521)  public void setMousePointer(final OlMousePointer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64560)  public Integer getSelectedTimeZoneIndex() throws ComException {
    final Object obj = this._dispatchCall(64560,"SelectedTimeZoneIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64560)  public void setSelectedTimeZoneIndex(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(64560,"SelectedTimeZoneIndex", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public Object getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public void setValue(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1001)  public void DropDown() throws ComException {
    this._dispatchCall(1001,"DropDown", DISPATCH_METHOD,null);
  }
  public OlkTimeZoneControl() throws ComException {
    super("{0006F059-0000-0000-C000-000000000046}", "{00067367-0000-0000-C000-000000000046}");
  }
  protected OlkTimeZoneControl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OlkTimeZoneControl" + super.toString() + "]";
  }
}
