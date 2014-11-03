/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AF1-A463-DB41-5DAE-69E7A5F7FCBC}")
public class Font2Impl extends Dispatch implements com.wilutions.mslib.office.Font2 {
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
  @DeclDISPID(2)  public com.wilutions.mslib.office.MsoTriState getBold() throws ComException {
    final Object obj = this._dispatchCall(2,"Bold", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(2)  public void setBold(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"Bold", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(3)  public com.wilutions.mslib.office.MsoTriState getItalic() throws ComException {
    final Object obj = this._dispatchCall(3,"Italic", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(3)  public void setItalic(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(3,"Italic", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(4)  public com.wilutions.mslib.office.MsoTextStrike getStrike() throws ComException {
    final Object obj = this._dispatchCall(4,"Strike", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTextStrike.valueOf((Integer)obj);
  }
  @DeclDISPID(4)  public void setStrike(com.wilutions.mslib.office.MsoTextStrike value) throws ComException {
    assert(value != null);
    this._dispatchCall(4,"Strike", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(5)  public com.wilutions.mslib.office.MsoTextCaps getCaps() throws ComException {
    final Object obj = this._dispatchCall(5,"Caps", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTextCaps.valueOf((Integer)obj);
  }
  @DeclDISPID(5)  public void setCaps(com.wilutions.mslib.office.MsoTextCaps value) throws ComException {
    assert(value != null);
    this._dispatchCall(5,"Caps", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(6)  public com.wilutions.mslib.office.MsoTriState getAutorotateNumbers() throws ComException {
    final Object obj = this._dispatchCall(6,"AutorotateNumbers", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(6)  public void setAutorotateNumbers(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(6,"AutorotateNumbers", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(7)  public Float getBaselineOffset() throws ComException {
    final Object obj = this._dispatchCall(7,"BaselineOffset", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(7)  public void setBaselineOffset(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(7,"BaselineOffset", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8)  public Float getKerning() throws ComException {
    final Object obj = this._dispatchCall(8,"Kerning", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(8)  public void setKerning(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(8,"Kerning", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(9)  public Float getSize() throws ComException {
    final Object obj = this._dispatchCall(9,"Size", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(9)  public void setSize(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(9,"Size", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(10)  public Float getSpacing() throws ComException {
    final Object obj = this._dispatchCall(10,"Spacing", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(10)  public void setSpacing(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(10,"Spacing", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(11)  public com.wilutions.mslib.office.MsoTextUnderlineType getUnderlineStyle() throws ComException {
    final Object obj = this._dispatchCall(11,"UnderlineStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTextUnderlineType.valueOf((Integer)obj);
  }
  @DeclDISPID(11)  public void setUnderlineStyle(com.wilutions.mslib.office.MsoTextUnderlineType value) throws ComException {
    assert(value != null);
    this._dispatchCall(11,"UnderlineStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(12)  public com.wilutions.mslib.office.MsoTriState getAllcaps() throws ComException {
    final Object obj = this._dispatchCall(12,"Allcaps", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(12)  public void setAllcaps(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(12,"Allcaps", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(13)  public com.wilutions.mslib.office.MsoTriState getDoubleStrikeThrough() throws ComException {
    final Object obj = this._dispatchCall(13,"DoubleStrikeThrough", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(13)  public void setDoubleStrikeThrough(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(13,"DoubleStrikeThrough", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(14)  public com.wilutions.mslib.office.MsoTriState getEqualize() throws ComException {
    final Object obj = this._dispatchCall(14,"Equalize", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(14)  public void setEqualize(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(14,"Equalize", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(15)  public com.wilutions.mslib.office.FillFormat getFill() throws ComException {
    final Object obj = this._dispatchCall(15,"Fill", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.FillFormatImpl.class);
  }
  @DeclDISPID(16)  public com.wilutions.mslib.office.GlowFormat getGlow() throws ComException {
    final Object obj = this._dispatchCall(16,"Glow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.GlowFormatImpl.class);
  }
  @DeclDISPID(17)  public com.wilutions.mslib.office.ReflectionFormat getReflection() throws ComException {
    final Object obj = this._dispatchCall(17,"Reflection", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ReflectionFormatImpl.class);
  }
  @DeclDISPID(18)  public com.wilutions.mslib.office.LineFormat getLine() throws ComException {
    final Object obj = this._dispatchCall(18,"Line", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.LineFormatImpl.class);
  }
  @DeclDISPID(19)  public com.wilutions.mslib.office.ShadowFormat getShadow() throws ComException {
    final Object obj = this._dispatchCall(19,"Shadow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShadowFormatImpl.class);
  }
  @DeclDISPID(20)  public com.wilutions.mslib.office.ColorFormat getHighlight() throws ComException {
    final Object obj = this._dispatchCall(20,"Highlight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ColorFormatImpl.class);
  }
  @DeclDISPID(21)  public com.wilutions.mslib.office.ColorFormat getUnderlineColor() throws ComException {
    final Object obj = this._dispatchCall(21,"UnderlineColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ColorFormatImpl.class);
  }
  @DeclDISPID(22)  public com.wilutions.mslib.office.MsoTriState getSmallcaps() throws ComException {
    final Object obj = this._dispatchCall(22,"Smallcaps", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(22)  public void setSmallcaps(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(22,"Smallcaps", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(23)  public com.wilutions.mslib.office.MsoSoftEdgeType getSoftEdgeFormat() throws ComException {
    final Object obj = this._dispatchCall(23,"SoftEdgeFormat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoSoftEdgeType.valueOf((Integer)obj);
  }
  @DeclDISPID(23)  public void setSoftEdgeFormat(com.wilutions.mslib.office.MsoSoftEdgeType value) throws ComException {
    assert(value != null);
    this._dispatchCall(23,"SoftEdgeFormat", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(24)  public com.wilutions.mslib.office.MsoTriState getStrikeThrough() throws ComException {
    final Object obj = this._dispatchCall(24,"StrikeThrough", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(24)  public void setStrikeThrough(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(24,"StrikeThrough", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(25)  public com.wilutions.mslib.office.MsoTriState getSubscript() throws ComException {
    final Object obj = this._dispatchCall(25,"Subscript", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(25)  public void setSubscript(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(25,"Subscript", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(26)  public com.wilutions.mslib.office.MsoTriState getSuperscript() throws ComException {
    final Object obj = this._dispatchCall(26,"Superscript", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(26)  public void setSuperscript(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(26,"Superscript", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(27)  public com.wilutions.mslib.office.MsoPresetTextEffect getWordArtformat() throws ComException {
    final Object obj = this._dispatchCall(27,"WordArtformat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoPresetTextEffect.valueOf((Integer)obj);
  }
  @DeclDISPID(27)  public void setWordArtformat(com.wilutions.mslib.office.MsoPresetTextEffect value) throws ComException {
    assert(value != null);
    this._dispatchCall(27,"WordArtformat", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(28)  public com.wilutions.mslib.office.MsoTriState getEmbeddable() throws ComException {
    final Object obj = this._dispatchCall(28,"Embeddable", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(29)  public com.wilutions.mslib.office.MsoTriState getEmbedded() throws ComException {
    final Object obj = this._dispatchCall(29,"Embedded", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(30)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(30,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(30)  public void setName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(30,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(31)  public String getNameAscii() throws ComException {
    final Object obj = this._dispatchCall(31,"NameAscii", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(31)  public void setNameAscii(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(31,"NameAscii", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32)  public String getNameComplexScript() throws ComException {
    final Object obj = this._dispatchCall(32,"NameComplexScript", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32)  public void setNameComplexScript(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32,"NameComplexScript", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33)  public String getNameFarEast() throws ComException {
    final Object obj = this._dispatchCall(33,"NameFarEast", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(33)  public void setNameFarEast(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(33,"NameFarEast", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34)  public String getNameOther() throws ComException {
    final Object obj = this._dispatchCall(34,"NameOther", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(34)  public void setNameOther(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(34,"NameOther", DISPATCH_PROPERTYPUT,value);
  }
  public Font2Impl(String progId) throws ComException {
    super(progId);
  }
  protected Font2Impl(long ndisp) {
    super(ndisp);
  }
  public Font2Impl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Font2Impl" + super.toString() + "]";
  }
}
