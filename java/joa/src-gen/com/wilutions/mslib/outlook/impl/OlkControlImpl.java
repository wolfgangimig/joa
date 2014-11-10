/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091EA0D-A463-DB41-5DAE-69E7A5F7FCBC}")
public class OlkControlImpl extends Dispatch implements com.wilutions.mslib.outlook.OlkControl {
  @DeclDISPID(-2147356671)  public String getItemProperty() throws ComException {
    final Object obj = this._dispatchCall(-2147356671,"ItemProperty", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-2147356671)  public void setItemProperty(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147356671,"ItemProperty", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147356669)  public String getControlProperty() throws ComException {
    final Object obj = this._dispatchCall(-2147356669,"ControlProperty", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-2147356669)  public void setControlProperty(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147356669,"ControlProperty", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147356668)  public String getPossibleValues() throws ComException {
    final Object obj = this._dispatchCall(-2147356668,"PossibleValues", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-2147356668)  public void setPossibleValues(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147356668,"PossibleValues", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147356670)  public Integer getFormat() throws ComException {
    final Object obj = this._dispatchCall(-2147356670,"Format", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-2147356670)  public void setFormat(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147356670,"Format", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147356655)  public Boolean getEnableAutoLayout() throws ComException {
    final Object obj = this._dispatchCall(-2147356655,"EnableAutoLayout", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-2147356655)  public void setEnableAutoLayout(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147356655,"EnableAutoLayout", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147356654)  public Integer getMinimumWidth() throws ComException {
    final Object obj = this._dispatchCall(-2147356654,"MinimumWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-2147356654)  public void setMinimumWidth(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147356654,"MinimumWidth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147356653)  public Integer getMinimumHeight() throws ComException {
    final Object obj = this._dispatchCall(-2147356653,"MinimumHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-2147356653)  public void setMinimumHeight(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147356653,"MinimumHeight", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147356652)  public com.wilutions.mslib.outlook.OlHorizontalLayout getHorizontalLayout() throws ComException {
    final Object obj = this._dispatchCall(-2147356652,"HorizontalLayout", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlHorizontalLayout.valueOf((Integer)obj);
  }
  @DeclDISPID(-2147356652)  public void setHorizontalLayout(com.wilutions.mslib.outlook.OlHorizontalLayout value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147356652,"HorizontalLayout", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-2147356651)  public com.wilutions.mslib.outlook.OlVerticalLayout getVerticalLayout() throws ComException {
    final Object obj = this._dispatchCall(-2147356651,"VerticalLayout", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlVerticalLayout.valueOf((Integer)obj);
  }
  @DeclDISPID(-2147356651)  public void setVerticalLayout(com.wilutions.mslib.outlook.OlVerticalLayout value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147356651,"VerticalLayout", DISPATCH_PROPERTYPUT,value.value);
  }
  public OlkControlImpl(String progId) throws ComException {
    super(progId);
  }
  protected OlkControlImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OlkControlImpl" + super.toString() + "]";
  }
}
