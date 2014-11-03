/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ChartFillFormat.
 * 
 */
@CoInterface(guid="{000C171C-0000-0000-C000-000000000046}")
public interface ChartFillFormat extends IDispatch {
  @DeclDISPID(1610743808)  public void OneColorGradient(Integer Style, Integer Variant, Float Degree) throws ComException;
  @DeclDISPID(1610743809)  public void TwoColorGradient(Integer Style, Integer Variant) throws ComException;
  @DeclDISPID(1610743810)  public void PresetTextured(Integer PresetTexture) throws ComException;
  @DeclDISPID(1610743811)  public void Solid() throws ComException;
  @DeclDISPID(1610743812)  public void Patterned(Integer Pattern) throws ComException;
  @DeclDISPID(1610743813)  public void UserPicture(Object PictureFile, Object PictureFormat, Object PictureStackUnit, Object PicturePlacement) throws ComException;
  @DeclDISPID(1610743814)  public void UserTextured(String TextureFile) throws ComException;
  @DeclDISPID(1610743815)  public void PresetGradient(Integer Style, Integer Variant, Integer PresetGradientType) throws ComException;
  @DeclDISPID(1610743816)  public ChartColorFormat getBackColor() throws ComException;
  @DeclDISPID(1610743817)  public ChartColorFormat getForeColor() throws ComException;
  @DeclDISPID(1610743818)  public Integer getGradientColorType() throws ComException;
  @DeclDISPID(1610743819)  public Float getGradientDegree() throws ComException;
  @DeclDISPID(1610743820)  public Integer getGradientStyle() throws ComException;
  @DeclDISPID(1610743821)  public Integer getGradientVariant() throws ComException;
  @DeclDISPID(1610743822)  public Integer getPattern() throws ComException;
  @DeclDISPID(1610743823)  public Integer getPresetGradientType() throws ComException;
  @DeclDISPID(1610743824)  public Integer getPresetTexture() throws ComException;
  @DeclDISPID(1610743825)  public String getTextureName() throws ComException;
  @DeclDISPID(1610743826)  public Integer getTextureType() throws ComException;
  @DeclDISPID(1610743827)  public Integer getType() throws ComException;
  @DeclDISPID(1610743828)  public void setVisible(Integer value) throws ComException;
  @DeclDISPID(1610743828)  public Integer getVisible() throws ComException;
  @DeclDISPID(148)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(150)  public Dispatch getParent() throws ComException;
}
