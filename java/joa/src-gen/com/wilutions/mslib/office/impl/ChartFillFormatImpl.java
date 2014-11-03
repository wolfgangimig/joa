/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E77-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ChartFillFormatImpl extends Dispatch implements com.wilutions.mslib.office.ChartFillFormat {
  @DeclDISPID(1610743808)  public void OneColorGradient(Integer Style, Integer Variant, Float Degree) throws ComException {
    assert(Style != null);
    assert(Variant != null);
    assert(Degree != null);
    this._dispatchCall(1610743808,"OneColorGradient", DISPATCH_METHOD,null,Style,Variant,Degree);
  }
  @DeclDISPID(1610743809)  public void TwoColorGradient(Integer Style, Integer Variant) throws ComException {
    assert(Style != null);
    assert(Variant != null);
    this._dispatchCall(1610743809,"TwoColorGradient", DISPATCH_METHOD,null,Style,Variant);
  }
  @DeclDISPID(1610743810)  public void PresetTextured(Integer PresetTexture) throws ComException {
    assert(PresetTexture != null);
    this._dispatchCall(1610743810,"PresetTextured", DISPATCH_METHOD,null,PresetTexture);
  }
  @DeclDISPID(1610743811)  public void Solid() throws ComException {
    this._dispatchCall(1610743811,"Solid", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743812)  public void Patterned(Integer Pattern) throws ComException {
    assert(Pattern != null);
    this._dispatchCall(1610743812,"Patterned", DISPATCH_METHOD,null,Pattern);
  }
  @DeclDISPID(1610743813)  public void UserPicture(Object PictureFile, Object PictureFormat, Object PictureStackUnit, Object PicturePlacement) throws ComException {
    assert(PictureFile != null);
    assert(PictureFormat != null);
    assert(PictureStackUnit != null);
    assert(PicturePlacement != null);
    this._dispatchCall(1610743813,"UserPicture", DISPATCH_METHOD,null,PictureFile,PictureFormat,PictureStackUnit,PicturePlacement);
  }
  @DeclDISPID(1610743814)  public void UserTextured(String TextureFile) throws ComException {
    assert(TextureFile != null);
    this._dispatchCall(1610743814,"UserTextured", DISPATCH_METHOD,null,TextureFile);
  }
  @DeclDISPID(1610743815)  public void PresetGradient(Integer Style, Integer Variant, Integer PresetGradientType) throws ComException {
    assert(Style != null);
    assert(Variant != null);
    assert(PresetGradientType != null);
    this._dispatchCall(1610743815,"PresetGradient", DISPATCH_METHOD,null,Style,Variant,PresetGradientType);
  }
  @DeclDISPID(1610743816)  public com.wilutions.mslib.office.ChartColorFormat getBackColor() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"BackColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ChartColorFormatImpl.class);
  }
  @DeclDISPID(1610743817)  public com.wilutions.mslib.office.ChartColorFormat getForeColor() throws ComException {
    final Object obj = this._dispatchCall(1610743817,"ForeColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ChartColorFormatImpl.class);
  }
  @DeclDISPID(1610743818)  public Integer getGradientColorType() throws ComException {
    final Object obj = this._dispatchCall(1610743818,"GradientColorType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743819)  public Float getGradientDegree() throws ComException {
    final Object obj = this._dispatchCall(1610743819,"GradientDegree", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(1610743820)  public Integer getGradientStyle() throws ComException {
    final Object obj = this._dispatchCall(1610743820,"GradientStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743821)  public Integer getGradientVariant() throws ComException {
    final Object obj = this._dispatchCall(1610743821,"GradientVariant", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743822)  public Integer getPattern() throws ComException {
    final Object obj = this._dispatchCall(1610743822,"Pattern", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743823)  public Integer getPresetGradientType() throws ComException {
    final Object obj = this._dispatchCall(1610743823,"PresetGradientType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743824)  public Integer getPresetTexture() throws ComException {
    final Object obj = this._dispatchCall(1610743824,"PresetTexture", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743825)  public String getTextureName() throws ComException {
    final Object obj = this._dispatchCall(1610743825,"TextureName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743826)  public Integer getTextureType() throws ComException {
    final Object obj = this._dispatchCall(1610743826,"TextureType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743827)  public Integer getType() throws ComException {
    final Object obj = this._dispatchCall(1610743827,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743828)  public void setVisible(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743828,"Visible", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743828)  public Integer getVisible() throws ComException {
    final Object obj = this._dispatchCall(1610743828,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(148)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(148,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(149)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(149,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(150)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  public ChartFillFormatImpl(String progId) throws ComException {
    super(progId);
  }
  protected ChartFillFormatImpl(long ndisp) {
    super(ndisp);
  }
  public ChartFillFormatImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ChartFillFormatImpl" + super.toString() + "]";
  }
}
