/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A74-A463-DB41-5DAE-69E7A5F7FCBC}")
public class TextEffectFormatImpl extends Dispatch implements com.wilutions.mslib.office.TextEffectFormat {
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
  @DeclDISPID(10)  public void ToggleVerticalText() throws ComException {
    this._dispatchCall(10,"ToggleVerticalText", DISPATCH_METHOD,null);
  }
  @DeclDISPID(100)  public com.wilutions.mslib.office.MsoTextEffectAlignment getAlignment() throws ComException {
    final Object obj = this._dispatchCall(100,"Alignment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTextEffectAlignment.valueOf((Integer)obj);
  }
  @DeclDISPID(100)  public void setAlignment(com.wilutions.mslib.office.MsoTextEffectAlignment value) throws ComException {
    assert(value != null);
    this._dispatchCall(100,"Alignment", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(101)  public com.wilutions.mslib.office.MsoTriState getFontBold() throws ComException {
    final Object obj = this._dispatchCall(101,"FontBold", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(101)  public void setFontBold(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(101,"FontBold", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(102)  public com.wilutions.mslib.office.MsoTriState getFontItalic() throws ComException {
    final Object obj = this._dispatchCall(102,"FontItalic", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(102)  public void setFontItalic(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(102,"FontItalic", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(103)  public String getFontName() throws ComException {
    final Object obj = this._dispatchCall(103,"FontName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(103)  public void setFontName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"FontName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(104)  public Float getFontSize() throws ComException {
    final Object obj = this._dispatchCall(104,"FontSize", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(104)  public void setFontSize(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(104,"FontSize", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(105)  public com.wilutions.mslib.office.MsoTriState getKernedPairs() throws ComException {
    final Object obj = this._dispatchCall(105,"KernedPairs", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(105)  public void setKernedPairs(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(105,"KernedPairs", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(106)  public com.wilutions.mslib.office.MsoTriState getNormalizedHeight() throws ComException {
    final Object obj = this._dispatchCall(106,"NormalizedHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(106)  public void setNormalizedHeight(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(106,"NormalizedHeight", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(107)  public com.wilutions.mslib.office.MsoPresetTextEffectShape getPresetShape() throws ComException {
    final Object obj = this._dispatchCall(107,"PresetShape", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoPresetTextEffectShape.valueOf((Integer)obj);
  }
  @DeclDISPID(107)  public void setPresetShape(com.wilutions.mslib.office.MsoPresetTextEffectShape value) throws ComException {
    assert(value != null);
    this._dispatchCall(107,"PresetShape", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(108)  public com.wilutions.mslib.office.MsoPresetTextEffect getPresetTextEffect() throws ComException {
    final Object obj = this._dispatchCall(108,"PresetTextEffect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoPresetTextEffect.valueOf((Integer)obj);
  }
  @DeclDISPID(108)  public void setPresetTextEffect(com.wilutions.mslib.office.MsoPresetTextEffect value) throws ComException {
    assert(value != null);
    this._dispatchCall(108,"PresetTextEffect", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(109)  public com.wilutions.mslib.office.MsoTriState getRotatedChars() throws ComException {
    final Object obj = this._dispatchCall(109,"RotatedChars", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(109)  public void setRotatedChars(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(109,"RotatedChars", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(110)  public String getText() throws ComException {
    final Object obj = this._dispatchCall(110,"Text", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(110)  public void setText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(110,"Text", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(111)  public Float getTracking() throws ComException {
    final Object obj = this._dispatchCall(111,"Tracking", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(111)  public void setTracking(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(111,"Tracking", DISPATCH_PROPERTYPUT,value);
  }
  public TextEffectFormatImpl(String progId) throws ComException {
    super(progId);
  }
  protected TextEffectFormatImpl(long ndisp) {
    super(ndisp);
  }
  public TextEffectFormatImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[TextEffectFormatImpl" + super.toString() + "]";
  }
}
