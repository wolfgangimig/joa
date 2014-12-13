/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * HTMLPassword2.
 * 
 */
@CoClass(guid="{787A2D6B-EF66-488D-A303-513C9C75C344}")
public class HTMLPassword2 extends Dispatch implements IWHTMLPassword {
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
  @DeclDISPID(609)  public void setMaxLength(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(609,"MaxLength", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(609)  public Integer getMaxLength() throws ComException {
    final Object obj = this._dispatchCall(609,"MaxLength", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(610)  public void setWidth(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(610,"Width", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(610)  public Integer getWidth() throws ComException {
    final Object obj = this._dispatchCall(610,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public HTMLPassword2() throws ComException {
    super("{787A2D6B-EF66-488D-A303-513C9C75C344}", "{5512D11F-5CC6-11CF-8D67-00AA00BDCE1D}");
  }
  protected HTMLPassword2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[HTMLPassword2" + super.toString() + "]";
  }
}
