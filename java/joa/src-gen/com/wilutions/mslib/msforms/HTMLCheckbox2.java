/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * HTMLCheckbox2.
 * 
 */
@CoClass(guid="{5CBA34AE-E344-40CF-B61D-FBA4D0D1FF54}")
public class HTMLCheckbox2 extends Dispatch implements IWHTMLCheckbox {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-541)  public void setHTMLName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-541)  public String getHTMLName() throws ComException {
    final Object obj = this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(607)  public void setValue(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(607,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(607)  public String getValue() throws ComException {
    final Object obj = this._dispatchCall(607,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(0)  public void setChecked(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Checked", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public Boolean getChecked() throws ComException {
    final Object obj = this._dispatchCall(0,"Checked", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public HTMLCheckbox2() throws ComException {
    super("{5CBA34AE-E344-40CF-B61D-FBA4D0D1FF54}", "{5512D117-5CC6-11CF-8D67-00AA00BDCE1D}");
  }
  protected HTMLCheckbox2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[HTMLCheckbox2" + super.toString() + "]";
  }
}
