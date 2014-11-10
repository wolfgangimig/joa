/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AF2-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ParagraphFormat2Impl extends Dispatch implements com.wilutions.mslib.office.ParagraphFormat2 {
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
  @DeclDISPID(2)  public com.wilutions.mslib.office.MsoParagraphAlignment getAlignment() throws ComException {
    final Object obj = this._dispatchCall(2,"Alignment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoParagraphAlignment.valueOf((Integer)obj);
  }
  @DeclDISPID(2)  public void setAlignment(com.wilutions.mslib.office.MsoParagraphAlignment value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"Alignment", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(3)  public com.wilutions.mslib.office.MsoBaselineAlignment getBaselineAlignment() throws ComException {
    final Object obj = this._dispatchCall(3,"BaselineAlignment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoBaselineAlignment.valueOf((Integer)obj);
  }
  @DeclDISPID(3)  public void setBaselineAlignment(com.wilutions.mslib.office.MsoBaselineAlignment value) throws ComException {
    assert(value != null);
    this._dispatchCall(3,"BaselineAlignment", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(4)  public com.wilutions.mslib.office.BulletFormat2 getBullet() throws ComException {
    final Object obj = this._dispatchCall(4,"Bullet", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.BulletFormat2Impl.class);
  }
  @DeclDISPID(5)  public com.wilutions.mslib.office.MsoTriState getFarEastLineBreakLevel() throws ComException {
    final Object obj = this._dispatchCall(5,"FarEastLineBreakLevel", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(5)  public void setFarEastLineBreakLevel(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(5,"FarEastLineBreakLevel", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(6)  public Float getFirstLineIndent() throws ComException {
    final Object obj = this._dispatchCall(6,"FirstLineIndent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(6)  public void setFirstLineIndent(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(6,"FirstLineIndent", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(7)  public com.wilutions.mslib.office.MsoTriState getHangingPunctuation() throws ComException {
    final Object obj = this._dispatchCall(7,"HangingPunctuation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(7)  public void setHangingPunctuation(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(7,"HangingPunctuation", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(8)  public Integer getIndentLevel() throws ComException {
    final Object obj = this._dispatchCall(8,"IndentLevel", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(8)  public void setIndentLevel(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(8,"IndentLevel", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(9)  public Float getLeftIndent() throws ComException {
    final Object obj = this._dispatchCall(9,"LeftIndent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(9)  public void setLeftIndent(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(9,"LeftIndent", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(10)  public com.wilutions.mslib.office.MsoTriState getLineRuleAfter() throws ComException {
    final Object obj = this._dispatchCall(10,"LineRuleAfter", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(10)  public void setLineRuleAfter(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(10,"LineRuleAfter", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(11)  public com.wilutions.mslib.office.MsoTriState getLineRuleBefore() throws ComException {
    final Object obj = this._dispatchCall(11,"LineRuleBefore", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(11)  public void setLineRuleBefore(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(11,"LineRuleBefore", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(12)  public com.wilutions.mslib.office.MsoTriState getLineRuleWithin() throws ComException {
    final Object obj = this._dispatchCall(12,"LineRuleWithin", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(12)  public void setLineRuleWithin(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(12,"LineRuleWithin", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(13)  public Float getRightIndent() throws ComException {
    final Object obj = this._dispatchCall(13,"RightIndent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(13)  public void setRightIndent(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(13,"RightIndent", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14)  public Float getSpaceAfter() throws ComException {
    final Object obj = this._dispatchCall(14,"SpaceAfter", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(14)  public void setSpaceAfter(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(14,"SpaceAfter", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(15)  public Float getSpaceBefore() throws ComException {
    final Object obj = this._dispatchCall(15,"SpaceBefore", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(15)  public void setSpaceBefore(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(15,"SpaceBefore", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(16)  public Float getSpaceWithin() throws ComException {
    final Object obj = this._dispatchCall(16,"SpaceWithin", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(16)  public void setSpaceWithin(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(16,"SpaceWithin", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(17)  public com.wilutions.mslib.office.TabStops2 getTabStops() throws ComException {
    final Object obj = this._dispatchCall(17,"TabStops", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TabStops2Impl.class);
  }
  @DeclDISPID(18)  public com.wilutions.mslib.office.MsoTextDirection getTextDirection() throws ComException {
    final Object obj = this._dispatchCall(18,"TextDirection", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTextDirection.valueOf((Integer)obj);
  }
  @DeclDISPID(18)  public void setTextDirection(com.wilutions.mslib.office.MsoTextDirection value) throws ComException {
    assert(value != null);
    this._dispatchCall(18,"TextDirection", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(19)  public com.wilutions.mslib.office.MsoTriState getWordWrap() throws ComException {
    final Object obj = this._dispatchCall(19,"WordWrap", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(19)  public void setWordWrap(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(19,"WordWrap", DISPATCH_PROPERTYPUT,value.value);
  }
  public ParagraphFormat2Impl(String progId) throws ComException {
    super(progId);
  }
  protected ParagraphFormat2Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ParagraphFormat2Impl" + super.toString() + "]";
  }
}
