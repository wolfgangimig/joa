/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ThreeDFormat.
 * 
 */
@CoInterface(guid="{000C0321-0000-0000-C000-000000000046}")
public interface ThreeDFormat extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(10)  public void IncrementRotationX(final Float Increment) throws ComException;
  @DeclDISPID(11)  public void IncrementRotationY(final Float Increment) throws ComException;
  @DeclDISPID(12)  public void ResetRotation() throws ComException;
  @DeclDISPID(13)  public void SetThreeDFormat(final MsoPresetThreeDFormat PresetThreeDFormat) throws ComException;
  @DeclDISPID(14)  public void SetExtrusionDirection(final MsoPresetExtrusionDirection PresetExtrusionDirection) throws ComException;
  @DeclDISPID(100)  public Float getDepth() throws ComException;
  @DeclDISPID(100)  public void setDepth(final Float value) throws ComException;
  @DeclDISPID(101)  public ColorFormat getExtrusionColor() throws ComException;
  @DeclDISPID(102)  public MsoExtrusionColorType getExtrusionColorType() throws ComException;
  @DeclDISPID(102)  public void setExtrusionColorType(final MsoExtrusionColorType value) throws ComException;
  @DeclDISPID(103)  public MsoTriState getPerspective() throws ComException;
  @DeclDISPID(103)  public void setPerspective(final MsoTriState value) throws ComException;
  @DeclDISPID(104)  public MsoPresetExtrusionDirection getPresetExtrusionDirection() throws ComException;
  @DeclDISPID(105)  public MsoPresetLightingDirection getPresetLightingDirection() throws ComException;
  @DeclDISPID(105)  public void setPresetLightingDirection(final MsoPresetLightingDirection value) throws ComException;
  @DeclDISPID(106)  public MsoPresetLightingSoftness getPresetLightingSoftness() throws ComException;
  @DeclDISPID(106)  public void setPresetLightingSoftness(final MsoPresetLightingSoftness value) throws ComException;
  @DeclDISPID(107)  public MsoPresetMaterial getPresetMaterial() throws ComException;
  @DeclDISPID(107)  public void setPresetMaterial(final MsoPresetMaterial value) throws ComException;
  @DeclDISPID(108)  public MsoPresetThreeDFormat getPresetThreeDFormat() throws ComException;
  @DeclDISPID(109)  public Float getRotationX() throws ComException;
  @DeclDISPID(109)  public void setRotationX(final Float value) throws ComException;
  @DeclDISPID(110)  public Float getRotationY() throws ComException;
  @DeclDISPID(110)  public void setRotationY(final Float value) throws ComException;
  @DeclDISPID(111)  public MsoTriState getVisible() throws ComException;
  @DeclDISPID(111)  public void setVisible(final MsoTriState value) throws ComException;
  @DeclDISPID(15)  public void SetPresetCamera(final MsoPresetCamera PresetCamera) throws ComException;
  @DeclDISPID(16)  public void IncrementRotationZ(final Float Increment) throws ComException;
  @DeclDISPID(17)  public void IncrementRotationHorizontal(final Float Increment) throws ComException;
  @DeclDISPID(18)  public void IncrementRotationVertical(final Float Increment) throws ComException;
  @DeclDISPID(112)  public MsoLightRigType getPresetLighting() throws ComException;
  @DeclDISPID(112)  public void setPresetLighting(final MsoLightRigType value) throws ComException;
  @DeclDISPID(113)  public Float getZ() throws ComException;
  @DeclDISPID(113)  public void setZ(final Float value) throws ComException;
  @DeclDISPID(114)  public MsoBevelType getBevelTopType() throws ComException;
  @DeclDISPID(114)  public void setBevelTopType(final MsoBevelType value) throws ComException;
  @DeclDISPID(115)  public Float getBevelTopInset() throws ComException;
  @DeclDISPID(115)  public void setBevelTopInset(final Float value) throws ComException;
  @DeclDISPID(116)  public Float getBevelTopDepth() throws ComException;
  @DeclDISPID(116)  public void setBevelTopDepth(final Float value) throws ComException;
  @DeclDISPID(117)  public MsoBevelType getBevelBottomType() throws ComException;
  @DeclDISPID(117)  public void setBevelBottomType(final MsoBevelType value) throws ComException;
  @DeclDISPID(118)  public Float getBevelBottomInset() throws ComException;
  @DeclDISPID(118)  public void setBevelBottomInset(final Float value) throws ComException;
  @DeclDISPID(119)  public Float getBevelBottomDepth() throws ComException;
  @DeclDISPID(119)  public void setBevelBottomDepth(final Float value) throws ComException;
  @DeclDISPID(120)  public MsoPresetCamera getPresetCamera() throws ComException;
  @DeclDISPID(121)  public Float getRotationZ() throws ComException;
  @DeclDISPID(121)  public void setRotationZ(final Float value) throws ComException;
  @DeclDISPID(122)  public Float getContourWidth() throws ComException;
  @DeclDISPID(122)  public void setContourWidth(final Float value) throws ComException;
  @DeclDISPID(123)  public ColorFormat getContourColor() throws ComException;
  @DeclDISPID(124)  public Float getFieldOfView() throws ComException;
  @DeclDISPID(124)  public void setFieldOfView(final Float value) throws ComException;
  @DeclDISPID(125)  public MsoTriState getProjectText() throws ComException;
  @DeclDISPID(125)  public void setProjectText(final MsoTriState value) throws ComException;
  @DeclDISPID(126)  public Float getLightAngle() throws ComException;
  @DeclDISPID(126)  public void setLightAngle(final Float value) throws ComException;
}
