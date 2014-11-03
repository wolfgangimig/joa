/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A4A-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ThreeDFormatImpl extends Dispatch implements com.wilutions.mslib.office.ThreeDFormat {
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
  @DeclDISPID(10)  public void IncrementRotationX(Float Increment) throws ComException {
    assert(Increment != null);
    this._dispatchCall(10,"IncrementRotationX", DISPATCH_METHOD,null,Increment);
  }
  @DeclDISPID(11)  public void IncrementRotationY(Float Increment) throws ComException {
    assert(Increment != null);
    this._dispatchCall(11,"IncrementRotationY", DISPATCH_METHOD,null,Increment);
  }
  @DeclDISPID(12)  public void ResetRotation() throws ComException {
    this._dispatchCall(12,"ResetRotation", DISPATCH_METHOD,null);
  }
  @DeclDISPID(13)  public void SetThreeDFormat(com.wilutions.mslib.office.MsoPresetThreeDFormat PresetThreeDFormat) throws ComException {
    assert(PresetThreeDFormat != null);
    this._dispatchCall(13,"SetThreeDFormat", DISPATCH_METHOD,null,PresetThreeDFormat.value);
  }
  @DeclDISPID(14)  public void SetExtrusionDirection(com.wilutions.mslib.office.MsoPresetExtrusionDirection PresetExtrusionDirection) throws ComException {
    assert(PresetExtrusionDirection != null);
    this._dispatchCall(14,"SetExtrusionDirection", DISPATCH_METHOD,null,PresetExtrusionDirection.value);
  }
  @DeclDISPID(100)  public Float getDepth() throws ComException {
    final Object obj = this._dispatchCall(100,"Depth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(100)  public void setDepth(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(100,"Depth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(101)  public com.wilutions.mslib.office.ColorFormat getExtrusionColor() throws ComException {
    final Object obj = this._dispatchCall(101,"ExtrusionColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ColorFormatImpl.class);
  }
  @DeclDISPID(102)  public com.wilutions.mslib.office.MsoExtrusionColorType getExtrusionColorType() throws ComException {
    final Object obj = this._dispatchCall(102,"ExtrusionColorType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoExtrusionColorType.valueOf((Integer)obj);
  }
  @DeclDISPID(102)  public void setExtrusionColorType(com.wilutions.mslib.office.MsoExtrusionColorType value) throws ComException {
    assert(value != null);
    this._dispatchCall(102,"ExtrusionColorType", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(103)  public com.wilutions.mslib.office.MsoTriState getPerspective() throws ComException {
    final Object obj = this._dispatchCall(103,"Perspective", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(103)  public void setPerspective(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"Perspective", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(104)  public com.wilutions.mslib.office.MsoPresetExtrusionDirection getPresetExtrusionDirection() throws ComException {
    final Object obj = this._dispatchCall(104,"PresetExtrusionDirection", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoPresetExtrusionDirection.valueOf((Integer)obj);
  }
  @DeclDISPID(105)  public com.wilutions.mslib.office.MsoPresetLightingDirection getPresetLightingDirection() throws ComException {
    final Object obj = this._dispatchCall(105,"PresetLightingDirection", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoPresetLightingDirection.valueOf((Integer)obj);
  }
  @DeclDISPID(105)  public void setPresetLightingDirection(com.wilutions.mslib.office.MsoPresetLightingDirection value) throws ComException {
    assert(value != null);
    this._dispatchCall(105,"PresetLightingDirection", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(106)  public com.wilutions.mslib.office.MsoPresetLightingSoftness getPresetLightingSoftness() throws ComException {
    final Object obj = this._dispatchCall(106,"PresetLightingSoftness", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoPresetLightingSoftness.valueOf((Integer)obj);
  }
  @DeclDISPID(106)  public void setPresetLightingSoftness(com.wilutions.mslib.office.MsoPresetLightingSoftness value) throws ComException {
    assert(value != null);
    this._dispatchCall(106,"PresetLightingSoftness", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(107)  public com.wilutions.mslib.office.MsoPresetMaterial getPresetMaterial() throws ComException {
    final Object obj = this._dispatchCall(107,"PresetMaterial", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoPresetMaterial.valueOf((Integer)obj);
  }
  @DeclDISPID(107)  public void setPresetMaterial(com.wilutions.mslib.office.MsoPresetMaterial value) throws ComException {
    assert(value != null);
    this._dispatchCall(107,"PresetMaterial", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(108)  public com.wilutions.mslib.office.MsoPresetThreeDFormat getPresetThreeDFormat() throws ComException {
    final Object obj = this._dispatchCall(108,"PresetThreeDFormat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoPresetThreeDFormat.valueOf((Integer)obj);
  }
  @DeclDISPID(109)  public Float getRotationX() throws ComException {
    final Object obj = this._dispatchCall(109,"RotationX", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(109)  public void setRotationX(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(109,"RotationX", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(110)  public Float getRotationY() throws ComException {
    final Object obj = this._dispatchCall(110,"RotationY", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(110)  public void setRotationY(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(110,"RotationY", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(111)  public com.wilutions.mslib.office.MsoTriState getVisible() throws ComException {
    final Object obj = this._dispatchCall(111,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(111)  public void setVisible(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(111,"Visible", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(15)  public void SetPresetCamera(com.wilutions.mslib.office.MsoPresetCamera PresetCamera) throws ComException {
    assert(PresetCamera != null);
    this._dispatchCall(15,"SetPresetCamera", DISPATCH_METHOD,null,PresetCamera.value);
  }
  @DeclDISPID(16)  public void IncrementRotationZ(Float Increment) throws ComException {
    assert(Increment != null);
    this._dispatchCall(16,"IncrementRotationZ", DISPATCH_METHOD,null,Increment);
  }
  @DeclDISPID(17)  public void IncrementRotationHorizontal(Float Increment) throws ComException {
    assert(Increment != null);
    this._dispatchCall(17,"IncrementRotationHorizontal", DISPATCH_METHOD,null,Increment);
  }
  @DeclDISPID(18)  public void IncrementRotationVertical(Float Increment) throws ComException {
    assert(Increment != null);
    this._dispatchCall(18,"IncrementRotationVertical", DISPATCH_METHOD,null,Increment);
  }
  @DeclDISPID(112)  public com.wilutions.mslib.office.MsoLightRigType getPresetLighting() throws ComException {
    final Object obj = this._dispatchCall(112,"PresetLighting", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoLightRigType.valueOf((Integer)obj);
  }
  @DeclDISPID(112)  public void setPresetLighting(com.wilutions.mslib.office.MsoLightRigType value) throws ComException {
    assert(value != null);
    this._dispatchCall(112,"PresetLighting", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(113)  public Float getZ() throws ComException {
    final Object obj = this._dispatchCall(113,"Z", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(113)  public void setZ(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(113,"Z", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(114)  public com.wilutions.mslib.office.MsoBevelType getBevelTopType() throws ComException {
    final Object obj = this._dispatchCall(114,"BevelTopType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoBevelType.valueOf((Integer)obj);
  }
  @DeclDISPID(114)  public void setBevelTopType(com.wilutions.mslib.office.MsoBevelType value) throws ComException {
    assert(value != null);
    this._dispatchCall(114,"BevelTopType", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(115)  public Float getBevelTopInset() throws ComException {
    final Object obj = this._dispatchCall(115,"BevelTopInset", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(115)  public void setBevelTopInset(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(115,"BevelTopInset", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(116)  public Float getBevelTopDepth() throws ComException {
    final Object obj = this._dispatchCall(116,"BevelTopDepth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(116)  public void setBevelTopDepth(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(116,"BevelTopDepth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(117)  public com.wilutions.mslib.office.MsoBevelType getBevelBottomType() throws ComException {
    final Object obj = this._dispatchCall(117,"BevelBottomType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoBevelType.valueOf((Integer)obj);
  }
  @DeclDISPID(117)  public void setBevelBottomType(com.wilutions.mslib.office.MsoBevelType value) throws ComException {
    assert(value != null);
    this._dispatchCall(117,"BevelBottomType", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(118)  public Float getBevelBottomInset() throws ComException {
    final Object obj = this._dispatchCall(118,"BevelBottomInset", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(118)  public void setBevelBottomInset(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(118,"BevelBottomInset", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(119)  public Float getBevelBottomDepth() throws ComException {
    final Object obj = this._dispatchCall(119,"BevelBottomDepth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(119)  public void setBevelBottomDepth(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(119,"BevelBottomDepth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(120)  public com.wilutions.mslib.office.MsoPresetCamera getPresetCamera() throws ComException {
    final Object obj = this._dispatchCall(120,"PresetCamera", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoPresetCamera.valueOf((Integer)obj);
  }
  @DeclDISPID(121)  public Float getRotationZ() throws ComException {
    final Object obj = this._dispatchCall(121,"RotationZ", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(121)  public void setRotationZ(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(121,"RotationZ", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(122)  public Float getContourWidth() throws ComException {
    final Object obj = this._dispatchCall(122,"ContourWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(122)  public void setContourWidth(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(122,"ContourWidth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(123)  public com.wilutions.mslib.office.ColorFormat getContourColor() throws ComException {
    final Object obj = this._dispatchCall(123,"ContourColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ColorFormatImpl.class);
  }
  @DeclDISPID(124)  public Float getFieldOfView() throws ComException {
    final Object obj = this._dispatchCall(124,"FieldOfView", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(124)  public void setFieldOfView(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(124,"FieldOfView", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(125)  public com.wilutions.mslib.office.MsoTriState getProjectText() throws ComException {
    final Object obj = this._dispatchCall(125,"ProjectText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(125)  public void setProjectText(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(125,"ProjectText", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(126)  public Float getLightAngle() throws ComException {
    final Object obj = this._dispatchCall(126,"LightAngle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(126)  public void setLightAngle(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(126,"LightAngle", DISPATCH_PROPERTYPUT,value);
  }
  public ThreeDFormatImpl(String progId) throws ComException {
    super(progId);
  }
  protected ThreeDFormatImpl(long ndisp) {
    super(ndisp);
  }
  public ThreeDFormatImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ThreeDFormatImpl" + super.toString() + "]";
  }
}
