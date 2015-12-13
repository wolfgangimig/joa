/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A7F-A463-DB41-5DAE-69E7A5F7FCBC}")
public class FillFormatImpl extends Dispatch implements com.wilutions.mslib.office.FillFormat {
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
  @DeclDISPID(10)  public void Background() throws ComException {
    this._dispatchCall(10,"Background", DISPATCH_METHOD,null);
  }
  @DeclDISPID(11)  public void OneColorGradient(final com.wilutions.mslib.office.MsoGradientStyle Style, final Integer Variant, final Float Degree) throws ComException {
    assert(Style != null);
    assert(Variant != null);
    assert(Degree != null);
    this._dispatchCall(11,"OneColorGradient", DISPATCH_METHOD,null,Style.value,Variant,Degree);
  }
  @DeclDISPID(12)  public void Patterned(final com.wilutions.mslib.office.MsoPatternType Pattern) throws ComException {
    assert(Pattern != null);
    this._dispatchCall(12,"Patterned", DISPATCH_METHOD,null,Pattern.value);
  }
  @DeclDISPID(13)  public void PresetGradient(final com.wilutions.mslib.office.MsoGradientStyle Style, final Integer Variant, final com.wilutions.mslib.office.MsoPresetGradientType PresetGradientType) throws ComException {
    assert(Style != null);
    assert(Variant != null);
    assert(PresetGradientType != null);
    this._dispatchCall(13,"PresetGradient", DISPATCH_METHOD,null,Style.value,Variant,PresetGradientType.value);
  }
  @DeclDISPID(14)  public void PresetTextured(final com.wilutions.mslib.office.MsoPresetTexture PresetTexture) throws ComException {
    assert(PresetTexture != null);
    this._dispatchCall(14,"PresetTextured", DISPATCH_METHOD,null,PresetTexture.value);
  }
  @DeclDISPID(15)  public void Solid() throws ComException {
    this._dispatchCall(15,"Solid", DISPATCH_METHOD,null);
  }
  @DeclDISPID(16)  public void TwoColorGradient(final com.wilutions.mslib.office.MsoGradientStyle Style, final Integer Variant) throws ComException {
    assert(Style != null);
    assert(Variant != null);
    this._dispatchCall(16,"TwoColorGradient", DISPATCH_METHOD,null,Style.value,Variant);
  }
  @DeclDISPID(17)  public void UserPicture(final String PictureFile) throws ComException {
    assert(PictureFile != null);
    this._dispatchCall(17,"UserPicture", DISPATCH_METHOD,null,PictureFile);
  }
  @DeclDISPID(18)  public void UserTextured(final String TextureFile) throws ComException {
    assert(TextureFile != null);
    this._dispatchCall(18,"UserTextured", DISPATCH_METHOD,null,TextureFile);
  }
  @DeclDISPID(100)  public com.wilutions.mslib.office.ColorFormat getBackColor() throws ComException {
    final Object obj = this._dispatchCall(100,"BackColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ColorFormatImpl.class);
  }
  @DeclDISPID(100)  public void setBackColor(final com.wilutions.mslib.office.ColorFormat value) throws ComException {
    this._dispatchCall(100,"BackColor", DISPATCH_PROPERTYPUT,Dispatch.param(value));
  }
  @DeclDISPID(101)  public com.wilutions.mslib.office.ColorFormat getForeColor() throws ComException {
    final Object obj = this._dispatchCall(101,"ForeColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ColorFormatImpl.class);
  }
  @DeclDISPID(101)  public void setForeColor(final com.wilutions.mslib.office.ColorFormat value) throws ComException {
    this._dispatchCall(101,"ForeColor", DISPATCH_PROPERTYPUT,Dispatch.param(value));
  }
  @DeclDISPID(102)  public com.wilutions.mslib.office.MsoGradientColorType getGradientColorType() throws ComException {
    final Object obj = this._dispatchCall(102,"GradientColorType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoGradientColorType.valueOf((Integer)obj);
  }
  @DeclDISPID(103)  public Float getGradientDegree() throws ComException {
    final Object obj = this._dispatchCall(103,"GradientDegree", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(104)  public com.wilutions.mslib.office.MsoGradientStyle getGradientStyle() throws ComException {
    final Object obj = this._dispatchCall(104,"GradientStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoGradientStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(105)  public Integer getGradientVariant() throws ComException {
    final Object obj = this._dispatchCall(105,"GradientVariant", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(106)  public com.wilutions.mslib.office.MsoPatternType getPattern() throws ComException {
    final Object obj = this._dispatchCall(106,"Pattern", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoPatternType.valueOf((Integer)obj);
  }
  @DeclDISPID(107)  public com.wilutions.mslib.office.MsoPresetGradientType getPresetGradientType() throws ComException {
    final Object obj = this._dispatchCall(107,"PresetGradientType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoPresetGradientType.valueOf((Integer)obj);
  }
  @DeclDISPID(108)  public com.wilutions.mslib.office.MsoPresetTexture getPresetTexture() throws ComException {
    final Object obj = this._dispatchCall(108,"PresetTexture", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoPresetTexture.valueOf((Integer)obj);
  }
  @DeclDISPID(109)  public String getTextureName() throws ComException {
    final Object obj = this._dispatchCall(109,"TextureName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(110)  public com.wilutions.mslib.office.MsoTextureType getTextureType() throws ComException {
    final Object obj = this._dispatchCall(110,"TextureType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTextureType.valueOf((Integer)obj);
  }
  @DeclDISPID(111)  public Float getTransparency() throws ComException {
    final Object obj = this._dispatchCall(111,"Transparency", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(111)  public void setTransparency(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(111,"Transparency", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(112)  public com.wilutions.mslib.office.MsoFillType getType() throws ComException {
    final Object obj = this._dispatchCall(112,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoFillType.valueOf((Integer)obj);
  }
  @DeclDISPID(113)  public com.wilutions.mslib.office.MsoTriState getVisible() throws ComException {
    final Object obj = this._dispatchCall(113,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(113)  public void setVisible(final com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(113,"Visible", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(114)  public com.wilutions.mslib.office.GradientStops getGradientStops() throws ComException {
    final Object obj = this._dispatchCall(114,"GradientStops", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.GradientStopsImpl.class);
  }
  @DeclDISPID(115)  public Float getTextureOffsetX() throws ComException {
    final Object obj = this._dispatchCall(115,"TextureOffsetX", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(115)  public void setTextureOffsetX(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(115,"TextureOffsetX", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(116)  public Float getTextureOffsetY() throws ComException {
    final Object obj = this._dispatchCall(116,"TextureOffsetY", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(116)  public void setTextureOffsetY(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(116,"TextureOffsetY", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(117)  public com.wilutions.mslib.office.MsoTextureAlignment getTextureAlignment() throws ComException {
    final Object obj = this._dispatchCall(117,"TextureAlignment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTextureAlignment.valueOf((Integer)obj);
  }
  @DeclDISPID(117)  public void setTextureAlignment(final com.wilutions.mslib.office.MsoTextureAlignment value) throws ComException {
    assert(value != null);
    this._dispatchCall(117,"TextureAlignment", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(118)  public Float getTextureHorizontalScale() throws ComException {
    final Object obj = this._dispatchCall(118,"TextureHorizontalScale", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(118)  public void setTextureHorizontalScale(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(118,"TextureHorizontalScale", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(119)  public Float getTextureVerticalScale() throws ComException {
    final Object obj = this._dispatchCall(119,"TextureVerticalScale", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(119)  public void setTextureVerticalScale(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(119,"TextureVerticalScale", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(120)  public com.wilutions.mslib.office.MsoTriState getTextureTile() throws ComException {
    final Object obj = this._dispatchCall(120,"TextureTile", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(120)  public void setTextureTile(final com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(120,"TextureTile", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(121)  public com.wilutions.mslib.office.MsoTriState getRotateWithObject() throws ComException {
    final Object obj = this._dispatchCall(121,"RotateWithObject", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(121)  public void setRotateWithObject(final com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(121,"RotateWithObject", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(122)  public com.wilutions.mslib.office.PictureEffects getPictureEffects() throws ComException {
    final Object obj = this._dispatchCall(122,"PictureEffects", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.PictureEffectsImpl.class);
  }
  @DeclDISPID(123)  public Float getGradientAngle() throws ComException {
    final Object obj = this._dispatchCall(123,"GradientAngle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(123)  public void setGradientAngle(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(123,"GradientAngle", DISPATCH_PROPERTYPUT,value);
  }
  public FillFormatImpl(String progId) throws ComException {
    super(progId, "{000C0314-0000-0000-C000-000000000046}");
  }
  protected FillFormatImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[FillFormatImpl" + super.toString() + "]";
  }
}
