/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{95854878-F8A5-CA8E-10C9-694DA54A32E7}")
public class IWHTMLImageImpl extends Dispatch implements com.wilutions.mslib.msforms.IWHTMLImage {
  @DeclDISPID(601)  public void setAction(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(601,"Action", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(601)  public String getAction() throws ComException {
    final Object obj = this._dispatchCall(601,"Action", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(606)  public void setSource(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(606,"Source", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(606)  public String getSource() throws ComException {
    final Object obj = this._dispatchCall(606,"Source", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(603)  public void setEncoding(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(603,"Encoding", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(603)  public String getEncoding() throws ComException {
    final Object obj = this._dispatchCall(603,"Encoding", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(604)  public void setMethod(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(604,"Method", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(604)  public String getMethod() throws ComException {
    final Object obj = this._dispatchCall(604,"Method", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-541)  public void setHTMLName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-541)  public String getHTMLName() throws ComException {
    final Object obj = this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public IWHTMLImageImpl(String progId) throws ComException {
    super(progId);
  }
  protected IWHTMLImageImpl(long ndisp) {
    super(ndisp);
  }
  public IWHTMLImageImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IWHTMLImageImpl" + super.toString() + "]";
  }
}
