/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A4B-A463-DB41-5DAE-69E7A5F7FCBC}")
public class TextFrameImpl extends Dispatch implements com.wilutions.mslib.office.TextFrame {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(100)  public Float getMarginBottom() throws ComException {
    final Object obj = this._dispatchCall(100,"MarginBottom", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(100)  public void setMarginBottom(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(100,"MarginBottom", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(101)  public Float getMarginLeft() throws ComException {
    final Object obj = this._dispatchCall(101,"MarginLeft", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(101)  public void setMarginLeft(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(101,"MarginLeft", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(102)  public Float getMarginRight() throws ComException {
    final Object obj = this._dispatchCall(102,"MarginRight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(102)  public void setMarginRight(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(102,"MarginRight", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(103)  public Float getMarginTop() throws ComException {
    final Object obj = this._dispatchCall(103,"MarginTop", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(103)  public void setMarginTop(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"MarginTop", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(104)  public com.wilutions.mslib.office.MsoTextOrientation getOrientation() throws ComException {
    final Object obj = this._dispatchCall(104,"Orientation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTextOrientation.valueOf((Integer)obj);
  }
  @DeclDISPID(104)  public void setOrientation(com.wilutions.mslib.office.MsoTextOrientation value) throws ComException {
    assert(value != null);
    this._dispatchCall(104,"Orientation", DISPATCH_PROPERTYPUT,value.value);
  }
  public TextFrameImpl(String progId) throws ComException {
    super(progId, "{000C0320-0000-0000-C000-000000000046}");
  }
  protected TextFrameImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[TextFrameImpl" + super.toString() + "]";
  }
}
