/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B486B-A463-DB41-5DAE-69E7A5F7FCBC}")
public class WebComponentImpl extends Dispatch implements com.wilutions.mslib.office.WebComponent {
  @DeclDISPID(1)  public Dispatch getShape() throws ComException {
    final Object obj = this._dispatchCall(1,"Shape", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(2)  public String getURL() throws ComException {
    final Object obj = this._dispatchCall(2,"URL", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public void setURL(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"URL", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3)  public String getHTML() throws ComException {
    final Object obj = this._dispatchCall(3,"HTML", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3)  public void setHTML(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(3,"HTML", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(4,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4)  public void setName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(4,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(5)  public Integer getWidth() throws ComException {
    final Object obj = this._dispatchCall(5,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(5)  public void setWidth(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(5,"Width", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(6)  public Integer getHeight() throws ComException {
    final Object obj = this._dispatchCall(6,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(6)  public void setHeight(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(6,"Height", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(7)  public void SetPlaceHolderGraphic(String PlaceHolderGraphic) throws ComException {
    assert(PlaceHolderGraphic != null);
    this._dispatchCall(7,"SetPlaceHolderGraphic", DISPATCH_METHOD,null,PlaceHolderGraphic);
  }
  @DeclDISPID(8)  public void Commit() throws ComException {
    this._dispatchCall(8,"Commit", DISPATCH_METHOD,null);
  }
  @DeclDISPID(9)  public void Revert() throws ComException {
    this._dispatchCall(9,"Revert", DISPATCH_METHOD,null);
  }
  public WebComponentImpl(String progId) throws ComException {
    super(progId, "{000CD100-0000-0000-C000-000000000046}");
  }
  protected WebComponentImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[WebComponentImpl" + super.toString() + "]";
  }
}
