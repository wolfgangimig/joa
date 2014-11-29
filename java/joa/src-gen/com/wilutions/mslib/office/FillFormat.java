/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * FillFormat.
 * 
 */
@CoInterface(guid="{000C0314-0000-0000-C000-000000000046}")
public interface FillFormat extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(10)  public void Background() throws ComException;
  @DeclDISPID(11)  public void OneColorGradient(final MsoGradientStyle Style, final Integer Variant, final Float Degree) throws ComException;
  @DeclDISPID(12)  public void Patterned(final MsoPatternType Pattern) throws ComException;
  @DeclDISPID(13)  public void PresetGradient(final MsoGradientStyle Style, final Integer Variant, final MsoPresetGradientType PresetGradientType) throws ComException;
  @DeclDISPID(14)  public void PresetTextured(final MsoPresetTexture PresetTexture) throws ComException;
  @DeclDISPID(15)  public void Solid() throws ComException;
  @DeclDISPID(16)  public void TwoColorGradient(final MsoGradientStyle Style, final Integer Variant) throws ComException;
  @DeclDISPID(17)  public void UserPicture(final String PictureFile) throws ComException;
  @DeclDISPID(18)  public void UserTextured(final String TextureFile) throws ComException;
  @DeclDISPID(100)  public ColorFormat getBackColor() throws ComException;
  @DeclDISPID(100)  public void setBackColor(final ColorFormat value) throws ComException;
  @DeclDISPID(101)  public ColorFormat getForeColor() throws ComException;
  @DeclDISPID(101)  public void setForeColor(final ColorFormat value) throws ComException;
  @DeclDISPID(102)  public MsoGradientColorType getGradientColorType() throws ComException;
  @DeclDISPID(103)  public Float getGradientDegree() throws ComException;
  @DeclDISPID(104)  public MsoGradientStyle getGradientStyle() throws ComException;
  @DeclDISPID(105)  public Integer getGradientVariant() throws ComException;
  @DeclDISPID(106)  public MsoPatternType getPattern() throws ComException;
  @DeclDISPID(107)  public MsoPresetGradientType getPresetGradientType() throws ComException;
  @DeclDISPID(108)  public MsoPresetTexture getPresetTexture() throws ComException;
  @DeclDISPID(109)  public String getTextureName() throws ComException;
  @DeclDISPID(110)  public MsoTextureType getTextureType() throws ComException;
  @DeclDISPID(111)  public Float getTransparency() throws ComException;
  @DeclDISPID(111)  public void setTransparency(final Float value) throws ComException;
  @DeclDISPID(112)  public MsoFillType getType() throws ComException;
  @DeclDISPID(113)  public MsoTriState getVisible() throws ComException;
  @DeclDISPID(113)  public void setVisible(final MsoTriState value) throws ComException;
  @DeclDISPID(114)  public GradientStops getGradientStops() throws ComException;
  @DeclDISPID(115)  public Float getTextureOffsetX() throws ComException;
  @DeclDISPID(115)  public void setTextureOffsetX(final Float value) throws ComException;
  @DeclDISPID(116)  public Float getTextureOffsetY() throws ComException;
  @DeclDISPID(116)  public void setTextureOffsetY(final Float value) throws ComException;
  @DeclDISPID(117)  public MsoTextureAlignment getTextureAlignment() throws ComException;
  @DeclDISPID(117)  public void setTextureAlignment(final MsoTextureAlignment value) throws ComException;
  @DeclDISPID(118)  public Float getTextureHorizontalScale() throws ComException;
  @DeclDISPID(118)  public void setTextureHorizontalScale(final Float value) throws ComException;
  @DeclDISPID(119)  public Float getTextureVerticalScale() throws ComException;
  @DeclDISPID(119)  public void setTextureVerticalScale(final Float value) throws ComException;
  @DeclDISPID(120)  public MsoTriState getTextureTile() throws ComException;
  @DeclDISPID(120)  public void setTextureTile(final MsoTriState value) throws ComException;
  @DeclDISPID(121)  public MsoTriState getRotateWithObject() throws ComException;
  @DeclDISPID(121)  public void setRotateWithObject(final MsoTriState value) throws ComException;
  @DeclDISPID(122)  public PictureEffects getPictureEffects() throws ComException;
  @DeclDISPID(123)  public Float getGradientAngle() throws ComException;
  @DeclDISPID(123)  public void setGradientAngle(final Float value) throws ComException;
}
