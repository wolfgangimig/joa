/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A71-A463-DB41-5DAE-69E7A5F7FCBC}")
public class PictureFormatImpl extends Dispatch implements com.wilutions.mslib.office.PictureFormat {
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
  @DeclDISPID(10)  public void IncrementBrightness(final Float Increment) throws ComException {
    assert(Increment != null);
    this._dispatchCall(10,"IncrementBrightness", DISPATCH_METHOD,null,Increment);
  }
  @DeclDISPID(11)  public void IncrementContrast(final Float Increment) throws ComException {
    assert(Increment != null);
    this._dispatchCall(11,"IncrementContrast", DISPATCH_METHOD,null,Increment);
  }
  @DeclDISPID(100)  public Float getBrightness() throws ComException {
    final Object obj = this._dispatchCall(100,"Brightness", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(100)  public void setBrightness(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(100,"Brightness", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(101)  public com.wilutions.mslib.office.MsoPictureColorType getColorType() throws ComException {
    final Object obj = this._dispatchCall(101,"ColorType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoPictureColorType.valueOf((Integer)obj);
  }
  @DeclDISPID(101)  public void setColorType(final com.wilutions.mslib.office.MsoPictureColorType value) throws ComException {
    assert(value != null);
    this._dispatchCall(101,"ColorType", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(102)  public Float getContrast() throws ComException {
    final Object obj = this._dispatchCall(102,"Contrast", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(102)  public void setContrast(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(102,"Contrast", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(103)  public Float getCropBottom() throws ComException {
    final Object obj = this._dispatchCall(103,"CropBottom", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(103)  public void setCropBottom(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"CropBottom", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(104)  public Float getCropLeft() throws ComException {
    final Object obj = this._dispatchCall(104,"CropLeft", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(104)  public void setCropLeft(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(104,"CropLeft", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(105)  public Float getCropRight() throws ComException {
    final Object obj = this._dispatchCall(105,"CropRight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(105)  public void setCropRight(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(105,"CropRight", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(106)  public Float getCropTop() throws ComException {
    final Object obj = this._dispatchCall(106,"CropTop", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(106)  public void setCropTop(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(106,"CropTop", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(107)  public com.wilutions.mslib.office.MsoRGBType getTransparencyColor() throws ComException {
    final Object obj = this._dispatchCall(107,"TransparencyColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new com.wilutions.mslib.office.MsoRGBType(als);
  }
  @DeclDISPID(107)  public void setTransparencyColor(final com.wilutions.mslib.office.MsoRGBType value) throws ComException {
    assert(value != null);
    this._dispatchCall(107,"TransparencyColor", DISPATCH_PROPERTYPUT,value.getValue());
  }
  @DeclDISPID(108)  public com.wilutions.mslib.office.MsoTriState getTransparentBackground() throws ComException {
    final Object obj = this._dispatchCall(108,"TransparentBackground", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(108)  public void setTransparentBackground(final com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(108,"TransparentBackground", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(109)  public com.wilutions.mslib.office.Crop getCrop() throws ComException {
    final Object obj = this._dispatchCall(109,"Crop", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CropImpl.class);
  }
  public PictureFormatImpl(String progId) throws ComException {
    super(progId, "{000C031A-0000-0000-C000-000000000046}");
  }
  protected PictureFormatImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PictureFormatImpl" + super.toString() + "]";
  }
}
