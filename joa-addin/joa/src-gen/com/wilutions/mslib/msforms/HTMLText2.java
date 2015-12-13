/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * HTMLText2.
 * 
 */
@CoClass(guid="{04082FC6-E032-49F2-A263-FE64E9DA1FA3}")
public class HTMLText2 extends Dispatch implements IWHTMLText {
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
  public HTMLText2() throws ComException {
    super("{04082FC6-E032-49F2-A263-FE64E9DA1FA3}", "{5512D11B-5CC6-11CF-8D67-00AA00BDCE1D}");
  }
  protected HTMLText2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[HTMLText2" + super.toString() + "]";
  }
}
