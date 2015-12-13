/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * HTMLSubmit2.
 * 
 */
@CoClass(guid="{9432194C-DF54-4824-8E24-B013BF2B90E3}")
public class HTMLSubmit2 extends Dispatch implements IWHTMLSubmitButton {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(601)  public void setAction(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(601,"Action", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(601)  public String getAction() throws ComException {
    final Object obj = this._dispatchCall(601,"Action", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(602)  public void setCaption(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(602,"Caption", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(602)  public String getCaption() throws ComException {
    final Object obj = this._dispatchCall(602,"Caption", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(603)  public void setEncoding(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(603,"Encoding", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(603)  public String getEncoding() throws ComException {
    final Object obj = this._dispatchCall(603,"Encoding", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(604)  public void setMethod(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(604,"Method", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(604)  public String getMethod() throws ComException {
    final Object obj = this._dispatchCall(604,"Method", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-541)  public void setHTMLName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-541)  public String getHTMLName() throws ComException {
    final Object obj = this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public HTMLSubmit2() throws ComException {
    super("{9432194C-DF54-4824-8E24-B013BF2B90E3}", "{5512D111-5CC6-11CF-8D67-00AA00BDCE1D}");
  }
  protected HTMLSubmit2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[HTMLSubmit2" + super.toString() + "]";
  }
}
