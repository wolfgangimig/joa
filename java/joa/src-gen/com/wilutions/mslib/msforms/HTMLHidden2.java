/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * HTMLHidden2.
 * 
 */
@CoClass(guid="{FB453AD8-2EF4-44D3-98A8-8C6474E63CE4}")
public class HTMLHidden2 extends Dispatch implements IWHTMLHidden {
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
  @DeclDISPID(0)  public void setValue(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public String getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public HTMLHidden2() throws ComException {
    super("{FB453AD8-2EF4-44D3-98A8-8C6474E63CE4}", "{5512D11D-5CC6-11CF-8D67-00AA00BDCE1D}");
  }
  protected HTMLHidden2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[HTMLHidden2" + super.toString() + "]";
  }
}
