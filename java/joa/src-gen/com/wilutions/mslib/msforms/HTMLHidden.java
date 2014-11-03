/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * HTMLHidden.
 * 
 */
@CoClass(guid="{5512D11C-5CC6-11CF-8D67-00AA00BDCE1D}")
public class HTMLHidden extends Dispatch implements IWHTMLHidden {
  @DeclDISPID(-541)  public void setHTMLName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-541)  public String getHTMLName() throws ComException {
    final Object obj = this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(0)  public void setValue(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public String getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public HTMLHidden() throws ComException {
    super("{5512D11C-5CC6-11CF-8D67-00AA00BDCE1D}");
  }
  protected HTMLHidden(long ndisp) {
    super(ndisp);
  }
  public HTMLHidden(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[HTMLHidden" + super.toString() + "]";
  }
}
