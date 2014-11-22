/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A79-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ColorFormatImpl extends Dispatch implements com.wilutions.mslib.office.ColorFormat {
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
  @DeclDISPID(1)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.MsoRGBType getRGB() throws ComException {
    final Object obj = this._dispatchCall(0,"RGB", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new com.wilutions.mslib.office.MsoRGBType(als);
  }
  @DeclDISPID(0)  public void setRGB(com.wilutions.mslib.office.MsoRGBType value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"RGB", DISPATCH_PROPERTYPUT,value.getValue());
  }
  @DeclDISPID(100)  public Integer getSchemeColor() throws ComException {
    final Object obj = this._dispatchCall(100,"SchemeColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(100)  public void setSchemeColor(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(100,"SchemeColor", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(101)  public com.wilutions.mslib.office.MsoColorType getType() throws ComException {
    final Object obj = this._dispatchCall(101,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoColorType.valueOf((Integer)obj);
  }
  @DeclDISPID(103)  public Float getTintAndShade() throws ComException {
    final Object obj = this._dispatchCall(103,"TintAndShade", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(103)  public void setTintAndShade(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"TintAndShade", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(104)  public com.wilutions.mslib.office.MsoThemeColorIndex getObjectThemeColor() throws ComException {
    final Object obj = this._dispatchCall(104,"ObjectThemeColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoThemeColorIndex.valueOf((Integer)obj);
  }
  @DeclDISPID(104)  public void setObjectThemeColor(com.wilutions.mslib.office.MsoThemeColorIndex value) throws ComException {
    assert(value != null);
    this._dispatchCall(104,"ObjectThemeColor", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(105)  public Float getBrightness() throws ComException {
    final Object obj = this._dispatchCall(105,"Brightness", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(105)  public void setBrightness(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(105,"Brightness", DISPATCH_PROPERTYPUT,value);
  }
  public ColorFormatImpl(String progId) throws ComException {
    super(progId, "{000C0312-0000-0000-C000-000000000046}");
  }
  protected ColorFormatImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ColorFormatImpl" + super.toString() + "]";
  }
}
