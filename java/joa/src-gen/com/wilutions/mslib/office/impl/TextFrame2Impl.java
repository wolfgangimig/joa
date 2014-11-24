/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AF3-A463-DB41-5DAE-69E7A5F7FCBC}")
public class TextFrame2Impl extends Dispatch implements com.wilutions.mslib.office.TextFrame2 {
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
  @DeclDISPID(100)  public Float getMarginBottom() throws ComException {
    final Object obj = this._dispatchCall(100,"MarginBottom", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(100)  public void setMarginBottom(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(100,"MarginBottom", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(101)  public Float getMarginLeft() throws ComException {
    final Object obj = this._dispatchCall(101,"MarginLeft", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(101)  public void setMarginLeft(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(101,"MarginLeft", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(102)  public Float getMarginRight() throws ComException {
    final Object obj = this._dispatchCall(102,"MarginRight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(102)  public void setMarginRight(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(102,"MarginRight", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(103)  public Float getMarginTop() throws ComException {
    final Object obj = this._dispatchCall(103,"MarginTop", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(103)  public void setMarginTop(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"MarginTop", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(104)  public com.wilutions.mslib.office.MsoTextOrientation getOrientation() throws ComException {
    final Object obj = this._dispatchCall(104,"Orientation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTextOrientation.valueOf((Integer)obj);
  }
  @DeclDISPID(104)  public void setOrientation(com.wilutions.mslib.office.MsoTextOrientation value) throws ComException {
    assert(value != null);
    this._dispatchCall(104,"Orientation", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(105)  public com.wilutions.mslib.office.MsoHorizontalAnchor getHorizontalAnchor() throws ComException {
    final Object obj = this._dispatchCall(105,"HorizontalAnchor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoHorizontalAnchor.valueOf((Integer)obj);
  }
  @DeclDISPID(105)  public void setHorizontalAnchor(com.wilutions.mslib.office.MsoHorizontalAnchor value) throws ComException {
    assert(value != null);
    this._dispatchCall(105,"HorizontalAnchor", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(106)  public com.wilutions.mslib.office.MsoVerticalAnchor getVerticalAnchor() throws ComException {
    final Object obj = this._dispatchCall(106,"VerticalAnchor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoVerticalAnchor.valueOf((Integer)obj);
  }
  @DeclDISPID(106)  public void setVerticalAnchor(com.wilutions.mslib.office.MsoVerticalAnchor value) throws ComException {
    assert(value != null);
    this._dispatchCall(106,"VerticalAnchor", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(107)  public com.wilutions.mslib.office.MsoPathFormat getPathFormat() throws ComException {
    final Object obj = this._dispatchCall(107,"PathFormat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoPathFormat.valueOf((Integer)obj);
  }
  @DeclDISPID(107)  public void setPathFormat(com.wilutions.mslib.office.MsoPathFormat value) throws ComException {
    assert(value != null);
    this._dispatchCall(107,"PathFormat", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(108)  public com.wilutions.mslib.office.MsoWarpFormat getWarpFormat() throws ComException {
    final Object obj = this._dispatchCall(108,"WarpFormat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoWarpFormat.valueOf((Integer)obj);
  }
  @DeclDISPID(108)  public void setWarpFormat(com.wilutions.mslib.office.MsoWarpFormat value) throws ComException {
    assert(value != null);
    this._dispatchCall(108,"WarpFormat", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(109)  public com.wilutions.mslib.office.MsoPresetTextEffect getWordArtformat() throws ComException {
    final Object obj = this._dispatchCall(109,"WordArtformat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoPresetTextEffect.valueOf((Integer)obj);
  }
  @DeclDISPID(109)  public void setWordArtformat(com.wilutions.mslib.office.MsoPresetTextEffect value) throws ComException {
    assert(value != null);
    this._dispatchCall(109,"WordArtformat", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(110)  public com.wilutions.mslib.office.MsoTriState getWordWrap() throws ComException {
    final Object obj = this._dispatchCall(110,"WordWrap", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(110)  public void setWordWrap(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(110,"WordWrap", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(111)  public com.wilutions.mslib.office.MsoAutoSize getAutoSize() throws ComException {
    final Object obj = this._dispatchCall(111,"AutoSize", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoAutoSize.valueOf((Integer)obj);
  }
  @DeclDISPID(111)  public void setAutoSize(com.wilutions.mslib.office.MsoAutoSize value) throws ComException {
    assert(value != null);
    this._dispatchCall(111,"AutoSize", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(112)  public com.wilutions.mslib.office.ThreeDFormat getThreeD() throws ComException {
    final Object obj = this._dispatchCall(112,"ThreeD", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ThreeDFormatImpl.class);
  }
  @DeclDISPID(113)  public com.wilutions.mslib.office.MsoTriState getHasText() throws ComException {
    final Object obj = this._dispatchCall(113,"HasText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(114)  public com.wilutions.mslib.office.TextRange2 getTextRange() throws ComException {
    final Object obj = this._dispatchCall(114,"TextRange", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.TextRange2Impl.class);
  }
  @DeclDISPID(115)  public com.wilutions.mslib.office.TextColumn2 getColumn() throws ComException {
    final Object obj = this._dispatchCall(115,"Column", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.TextColumn2Impl.class);
  }
  @DeclDISPID(116)  public com.wilutions.mslib.office.Ruler2 getRuler() throws ComException {
    final Object obj = this._dispatchCall(116,"Ruler", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.Ruler2Impl.class);
  }
  @DeclDISPID(117)  public void DeleteText() throws ComException {
    this._dispatchCall(117,"DeleteText", DISPATCH_METHOD,null);
  }
  @DeclDISPID(118)  public com.wilutions.mslib.office.MsoTriState getNoTextRotation() throws ComException {
    final Object obj = this._dispatchCall(118,"NoTextRotation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(118)  public void setNoTextRotation(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(118,"NoTextRotation", DISPATCH_PROPERTYPUT,value.value);
  }
  public TextFrame2Impl(String progId) throws ComException {
    super(progId, "{000C0398-0000-0000-C000-000000000046}");
  }
  protected TextFrame2Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[TextFrame2Impl" + super.toString() + "]";
  }
}
