/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B4869-A463-DB41-5DAE-69E7A5F7FCBC}")
public class WebComponentFormatImpl extends Dispatch implements com.wilutions.mslib.office.WebComponentFormat {
  @DeclDISPID(1)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(2)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(2,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(3)  public String getURL() throws ComException {
    final Object obj = this._dispatchCall(3,"URL", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3)  public void setURL(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(3,"URL", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4)  public String getHTML() throws ComException {
    final Object obj = this._dispatchCall(4,"HTML", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4)  public void setHTML(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(4,"HTML", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(5)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(5,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(5)  public void setName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(5,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(6)  public Integer getWidth() throws ComException {
    final Object obj = this._dispatchCall(6,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(6)  public void setWidth(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(6,"Width", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(7)  public Integer getHeight() throws ComException {
    final Object obj = this._dispatchCall(7,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(7)  public void setHeight(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(7,"Height", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8)  public String getPreviewGraphic() throws ComException {
    final Object obj = this._dispatchCall(8,"PreviewGraphic", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8)  public void setPreviewGraphic(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(8,"PreviewGraphic", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(9)  public void LaunchPropertiesWindow() throws ComException {
    this._dispatchCall(9,"LaunchPropertiesWindow", DISPATCH_METHOD,null);
  }
  public WebComponentFormatImpl(String progId) throws ComException {
    super(progId);
  }
  protected WebComponentFormatImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[WebComponentFormatImpl" + super.toString() + "]";
  }
}
