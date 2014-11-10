/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * HTMLCheckbox.
 * 
 */
@CoClass(guid="{5512D116-5CC6-11CF-8D67-00AA00BDCE1D}")
public class HTMLCheckbox extends Dispatch implements IWHTMLCheckbox {
  @DeclDISPID(-541)  public void setHTMLName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-541)  public String getHTMLName() throws ComException {
    final Object obj = this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(607)  public void setValue(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(607,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(607)  public String getValue() throws ComException {
    final Object obj = this._dispatchCall(607,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(0)  public void setChecked(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Checked", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public Boolean getChecked() throws ComException {
    final Object obj = this._dispatchCall(0,"Checked", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public HTMLCheckbox() throws ComException {
    super("{5512D116-5CC6-11CF-8D67-00AA00BDCE1D}");
  }
  protected HTMLCheckbox(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[HTMLCheckbox" + super.toString() + "]";
  }
}
