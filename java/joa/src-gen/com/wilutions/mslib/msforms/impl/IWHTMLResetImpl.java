/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{9585487E-F8A5-CA8E-10C9-694DA54A32E7}")
public class IWHTMLResetImpl extends Dispatch implements com.wilutions.mslib.msforms.IWHTMLReset {
  @DeclDISPID(602)  public void setCaption(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(602,"Caption", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(602)  public String getCaption() throws ComException {
    final Object obj = this._dispatchCall(602,"Caption", DISPATCH_PROPERTYGET,null);
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
  public IWHTMLResetImpl(String progId) throws ComException {
    super(progId);
  }
  protected IWHTMLResetImpl(long ndisp) {
    super(ndisp);
  }
  public IWHTMLResetImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IWHTMLResetImpl" + super.toString() + "]";
  }
}
