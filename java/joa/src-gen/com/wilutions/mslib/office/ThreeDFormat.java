/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ThreeDFormat.
 * 
 */
@CoInterface(guid="{000C0321-0000-0000-C000-000000000046}")
public interface ThreeDFormat extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public Dispatch getParent() throws ComException;
  @DeclDISPID(10)  public void IncrementRotationX(Float Increment) throws ComException;
  @DeclDISPID(11)  public void IncrementRotationY(Float Increment) throws ComException;
  @DeclDISPID(12)  public void ResetRotation() throws ComException;
  @DeclDISPID(13)  public void SetThreeDFormat(MsoPresetThreeDFormat PresetThreeDFormat) throws ComException;
  @DeclDISPID(14)  public void SetExtrusionDirection(MsoPresetExtrusionDirection PresetExtrusionDirection) throws ComException;
  @DeclDISPID(100)  public Float getDepth() throws ComException;
  @DeclDISPID(100)  public void setDepth(Float value) throws ComException;
  @DeclDISPID(101)  public ColorFormat getExtrusionColor() throws ComException;
  @DeclDISPID(102)  public MsoExtrusionColorType getExtrusionColorType() throws ComException;
  @DeclDISPID(102)  public void setExtrusionColorType(MsoExtrusionColorType value) throws ComException;
  @DeclDISPID(103)  public MsoTriState getPerspective() throws ComException;
  @DeclDISPID(103)  public void setPerspective(MsoTriState value) throws ComException;
  @DeclDISPID(104)  public MsoPresetExtrusionDirection getPresetExtrusionDirection() throws ComException;
  @DeclDISPID(105)  public MsoPresetLightingDirection getPresetLightingDirection() throws ComException;
  @DeclDISPID(105)  public void setPresetLightingDirection(MsoPresetLightingDirection value) throws ComException;
  @DeclDISPID(106)  public MsoPresetLightingSoftness getPresetLightingSoftness() throws ComException;
  @DeclDISPID(106)  public void setPresetLightingSoftness(MsoPresetLightingSoftness value) throws ComException;
  @DeclDISPID(107)  public MsoPresetMaterial getPresetMaterial() throws ComException;
  @DeclDISPID(107)  public void setPresetMaterial(MsoPresetMaterial value) throws ComException;
  @DeclDISPID(108)  public MsoPresetThreeDFormat getPresetThreeDFormat() throws ComException;
  @DeclDISPID(109)  public Float getRotationX() throws ComException;
  @DeclDISPID(109)  public void setRotationX(Float value) throws ComException;
  @DeclDISPID(110)  public Float getRotationY() throws ComException;
  @DeclDISPID(110)  public void setRotationY(Float value) throws ComException;
  @DeclDISPID(111)  public MsoTriState getVisible() throws ComException;
  @DeclDISPID(111)  public void setVisible(MsoTriState value) throws ComException;
  @DeclDISPID(15)  public void SetPresetCamera(MsoPresetCamera PresetCamera) throws ComException;
  @DeclDISPID(16)  public void IncrementRotationZ(Float Increment) throws ComException;
  @DeclDISPID(17)  public void IncrementRotationHorizontal(Float Increment) throws ComException;
  @DeclDISPID(18)  public void IncrementRotationVertical(Float Increment) throws ComException;
  @DeclDISPID(112)  public MsoLightRigType getPresetLighting() throws ComException;
  @DeclDISPID(112)  public void setPresetLighting(MsoLightRigType value) throws ComException;
  @DeclDISPID(113)  public Float getZ() throws ComException;
  @DeclDISPID(113)  public void setZ(Float value) throws ComException;
  @DeclDISPID(114)  public MsoBevelType getBevelTopType() throws ComException;
  @DeclDISPID(114)  public void setBevelTopType(MsoBevelType value) throws ComException;
  @DeclDISPID(115)  public Float getBevelTopInset() throws ComException;
  @DeclDISPID(115)  public void setBevelTopInset(Float value) throws ComException;
  @DeclDISPID(116)  public Float getBevelTopDepth() throws ComException;
  @DeclDISPID(116)  public void setBevelTopDepth(Float value) throws ComException;
  @DeclDISPID(117)  public MsoBevelType getBevelBottomType() throws ComException;
  @DeclDISPID(117)  public void setBevelBottomType(MsoBevelType value) throws ComException;
  @DeclDISPID(118)  public Float getBevelBottomInset() throws ComException;
  @DeclDISPID(118)  public void setBevelBottomInset(Float value) throws ComException;
  @DeclDISPID(119)  public Float getBevelBottomDepth() throws ComException;
  @DeclDISPID(119)  public void setBevelBottomDepth(Float value) throws ComException;
  @DeclDISPID(120)  public MsoPresetCamera getPresetCamera() throws ComException;
  @DeclDISPID(121)  public Float getRotationZ() throws ComException;
  @DeclDISPID(121)  public void setRotationZ(Float value) throws ComException;
  @DeclDISPID(122)  public Float getContourWidth() throws ComException;
  @DeclDISPID(122)  public void setContourWidth(Float value) throws ComException;
  @DeclDISPID(123)  public ColorFormat getContourColor() throws ComException;
  @DeclDISPID(124)  public Float getFieldOfView() throws ComException;
  @DeclDISPID(124)  public void setFieldOfView(Float value) throws ComException;
  @DeclDISPID(125)  public MsoTriState getProjectText() throws ComException;
  @DeclDISPID(125)  public void setProjectText(MsoTriState value) throws ComException;
  @DeclDISPID(126)  public Float getLightAngle() throws ComException;
  @DeclDISPID(126)  public void setLightAngle(Float value) throws ComException;
}
