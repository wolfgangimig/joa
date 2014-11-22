/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B486A-A463-DB41-5DAE-69E7A5F7FCBC}")
public class WebComponentWindowExternalImpl extends Dispatch implements com.wilutions.mslib.office.WebComponentWindowExternal {
  @DeclDISPID(1)  public Integer getInterfaceVersion() throws ComException {
    final Object obj = this._dispatchCall(1,"InterfaceVersion", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2)  public String getApplicationName() throws ComException {
    final Object obj = this._dispatchCall(2,"ApplicationName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3)  public Integer getApplicationVersion() throws ComException {
    final Object obj = this._dispatchCall(3,"ApplicationVersion", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(4)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(4,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(5)  public void CloseWindow() throws ComException {
    this._dispatchCall(5,"CloseWindow", DISPATCH_METHOD,null);
  }
  @DeclDISPID(6)  public com.wilutions.mslib.office.WebComponent getWebComponent() throws ComException {
    final Object obj = this._dispatchCall(6,"WebComponent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.WebComponentImpl.class);
  }
  public WebComponentWindowExternalImpl(String progId) throws ComException {
    super(progId, "{000CD101-0000-0000-C000-000000000046}");
  }
  protected WebComponentWindowExternalImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[WebComponentWindowExternalImpl" + super.toString() + "]";
  }
}
