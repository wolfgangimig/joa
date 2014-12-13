/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * HTMLImage2.
 * 
 */
@CoClass(guid="{9BDAC276-BE24-4F04-BB22-11469B28A496}")
public class HTMLImage2 extends Dispatch implements IWHTMLImage {
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
  @DeclDISPID(606)  public void setSource(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(606,"Source", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(606)  public String getSource() throws ComException {
    final Object obj = this._dispatchCall(606,"Source", DISPATCH_PROPERTYGET,null);
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
  public HTMLImage2() throws ComException {
    super("{9BDAC276-BE24-4F04-BB22-11469B28A496}", "{5512D113-5CC6-11CF-8D67-00AA00BDCE1D}");
  }
  protected HTMLImage2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[HTMLImage2" + super.toString() + "]";
  }
}
