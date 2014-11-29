/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * HTMLText.
 * 
 */
@CoClass(guid="{5512D11A-5CC6-11CF-8D67-00AA00BDCE1D}")
public class HTMLText extends Dispatch implements IWHTMLText {
  static boolean __typelib__loaded = __TypeLib.load();
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
  @DeclDISPID(609)  public void setMaxLength(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(609,"MaxLength", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(609)  public Integer getMaxLength() throws ComException {
    final Object obj = this._dispatchCall(609,"MaxLength", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(610)  public void setWidth(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(610,"Width", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(610)  public Integer getWidth() throws ComException {
    final Object obj = this._dispatchCall(610,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public HTMLText() throws ComException {
    super("{5512D11A-5CC6-11CF-8D67-00AA00BDCE1D}", "{5512D11B-5CC6-11CF-8D67-00AA00BDCE1D}");
  }
  protected HTMLText(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[HTMLText" + super.toString() + "]";
  }
}
