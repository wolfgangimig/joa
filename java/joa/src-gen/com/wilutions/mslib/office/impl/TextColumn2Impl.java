/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AD9-A463-DB41-5DAE-69E7A5F7FCBC}")
public class TextColumn2Impl extends Dispatch implements com.wilutions.mslib.office.TextColumn2 {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1)  public Integer getNumber() throws ComException {
    final Object obj = this._dispatchCall(1,"Number", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1)  public void setNumber(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"Number", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(2)  public Float getSpacing() throws ComException {
    final Object obj = this._dispatchCall(2,"Spacing", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(2)  public void setSpacing(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"Spacing", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3)  public com.wilutions.mslib.office.MsoTextDirection getTextDirection() throws ComException {
    final Object obj = this._dispatchCall(3,"TextDirection", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTextDirection.valueOf((Integer)obj);
  }
  @DeclDISPID(3)  public void setTextDirection(com.wilutions.mslib.office.MsoTextDirection value) throws ComException {
    assert(value != null);
    this._dispatchCall(3,"TextDirection", DISPATCH_PROPERTYPUT,value.value);
  }
  public TextColumn2Impl(String progId) throws ComException {
    super(progId);
  }
  protected TextColumn2Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[TextColumn2Impl" + super.toString() + "]";
  }
}
