/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{631C66A8-01C3-CA8F-1CA9-694DA596EC7A}")
public class TabImpl extends Dispatch implements com.wilutions.mslib.msforms.Tab {
  @DeclDISPID(-518)  public void setCaption(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-518,"Caption", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-518)  public String getCaption() throws ComException {
    final Object obj = this._dispatchCall(-518,"Caption", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-2147418043)  public void setControlTipText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418043,"ControlTipText", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418043)  public String getControlTipText() throws ComException {
    final Object obj = this._dispatchCall(-2147418043,"ControlTipText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-514)  public void setEnabled(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1)  public void setIndex(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"Index", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1)  public Integer getIndex() throws ComException {
    final Object obj = this._dispatchCall(1,"Index", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-2147418112)  public void setName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418112,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418112)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(-2147418112,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-2147418101)  public void setTag(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418101,"Tag", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418101)  public String getTag() throws ComException {
    final Object obj = this._dispatchCall(-2147418101,"Tag", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-2147418105)  public void setVisible(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418105,"Visible", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418105)  public Boolean getVisible() throws ComException {
    final Object obj = this._dispatchCall(-2147418105,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-543)  public void setAccelerator(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-543,"Accelerator", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-543)  public String getAccelerator() throws ComException {
    final Object obj = this._dispatchCall(-543,"Accelerator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public TabImpl(String progId) throws ComException {
    super(progId, "{A38BFFC3-A5A0-11CE-8107-00AA00611080}");
  }
  protected TabImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[TabImpl" + super.toString() + "]";
  }
}
