/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AD5-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ReflectionFormatImpl extends Dispatch implements com.wilutions.mslib.office.ReflectionFormat {
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
  @DeclDISPID(1)  public com.wilutions.mslib.office.MsoReflectionType getType() throws ComException {
    final Object obj = this._dispatchCall(1,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoReflectionType.valueOf((Integer)obj);
  }
  @DeclDISPID(1)  public void setType(com.wilutions.mslib.office.MsoReflectionType value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"Type", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(2)  public Float getTransparency() throws ComException {
    final Object obj = this._dispatchCall(2,"Transparency", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(2)  public void setTransparency(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"Transparency", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3)  public Float getSize() throws ComException {
    final Object obj = this._dispatchCall(3,"Size", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(3)  public void setSize(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(3,"Size", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4)  public Float getOffset() throws ComException {
    final Object obj = this._dispatchCall(4,"Offset", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(4)  public void setOffset(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(4,"Offset", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(5)  public Float getBlur() throws ComException {
    final Object obj = this._dispatchCall(5,"Blur", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(5)  public void setBlur(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(5,"Blur", DISPATCH_PROPERTYPUT,value);
  }
  public ReflectionFormatImpl(String progId) throws ComException {
    super(progId, "{000C03BE-0000-0000-C000-000000000046}");
  }
  protected ReflectionFormatImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ReflectionFormatImpl" + super.toString() + "]";
  }
}
