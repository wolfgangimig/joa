/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{9585487C-F8A5-CA8E-10C9-694DA54A32E7}")
public class IWHTMLCheckboxImpl extends Dispatch implements com.wilutions.mslib.msforms.IWHTMLCheckbox {
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
  public IWHTMLCheckboxImpl(String progId) throws ComException {
    super(progId);
  }
  protected IWHTMLCheckboxImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IWHTMLCheckboxImpl" + super.toString() + "]";
  }
}
