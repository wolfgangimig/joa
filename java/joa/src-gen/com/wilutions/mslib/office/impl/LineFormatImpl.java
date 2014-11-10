/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A7C-A463-DB41-5DAE-69E7A5F7FCBC}")
public class LineFormatImpl extends Dispatch implements com.wilutions.mslib.office.LineFormat {
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
  @DeclDISPID(100)  public com.wilutions.mslib.office.ColorFormat getBackColor() throws ComException {
    final Object obj = this._dispatchCall(100,"BackColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ColorFormatImpl.class);
  }
  @DeclDISPID(100)  public void setBackColor(com.wilutions.mslib.office.ColorFormat value) throws ComException {
    this._dispatchCall(100,"BackColor", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(101)  public com.wilutions.mslib.office.MsoArrowheadLength getBeginArrowheadLength() throws ComException {
    final Object obj = this._dispatchCall(101,"BeginArrowheadLength", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoArrowheadLength.valueOf((Integer)obj);
  }
  @DeclDISPID(101)  public void setBeginArrowheadLength(com.wilutions.mslib.office.MsoArrowheadLength value) throws ComException {
    assert(value != null);
    this._dispatchCall(101,"BeginArrowheadLength", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(102)  public com.wilutions.mslib.office.MsoArrowheadStyle getBeginArrowheadStyle() throws ComException {
    final Object obj = this._dispatchCall(102,"BeginArrowheadStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoArrowheadStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(102)  public void setBeginArrowheadStyle(com.wilutions.mslib.office.MsoArrowheadStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(102,"BeginArrowheadStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(103)  public com.wilutions.mslib.office.MsoArrowheadWidth getBeginArrowheadWidth() throws ComException {
    final Object obj = this._dispatchCall(103,"BeginArrowheadWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoArrowheadWidth.valueOf((Integer)obj);
  }
  @DeclDISPID(103)  public void setBeginArrowheadWidth(com.wilutions.mslib.office.MsoArrowheadWidth value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"BeginArrowheadWidth", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(104)  public com.wilutions.mslib.office.MsoLineDashStyle getDashStyle() throws ComException {
    final Object obj = this._dispatchCall(104,"DashStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoLineDashStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(104)  public void setDashStyle(com.wilutions.mslib.office.MsoLineDashStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(104,"DashStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(105)  public com.wilutions.mslib.office.MsoArrowheadLength getEndArrowheadLength() throws ComException {
    final Object obj = this._dispatchCall(105,"EndArrowheadLength", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoArrowheadLength.valueOf((Integer)obj);
  }
  @DeclDISPID(105)  public void setEndArrowheadLength(com.wilutions.mslib.office.MsoArrowheadLength value) throws ComException {
    assert(value != null);
    this._dispatchCall(105,"EndArrowheadLength", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(106)  public com.wilutions.mslib.office.MsoArrowheadStyle getEndArrowheadStyle() throws ComException {
    final Object obj = this._dispatchCall(106,"EndArrowheadStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoArrowheadStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(106)  public void setEndArrowheadStyle(com.wilutions.mslib.office.MsoArrowheadStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(106,"EndArrowheadStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(107)  public com.wilutions.mslib.office.MsoArrowheadWidth getEndArrowheadWidth() throws ComException {
    final Object obj = this._dispatchCall(107,"EndArrowheadWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoArrowheadWidth.valueOf((Integer)obj);
  }
  @DeclDISPID(107)  public void setEndArrowheadWidth(com.wilutions.mslib.office.MsoArrowheadWidth value) throws ComException {
    assert(value != null);
    this._dispatchCall(107,"EndArrowheadWidth", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(108)  public com.wilutions.mslib.office.ColorFormat getForeColor() throws ComException {
    final Object obj = this._dispatchCall(108,"ForeColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ColorFormatImpl.class);
  }
  @DeclDISPID(108)  public void setForeColor(com.wilutions.mslib.office.ColorFormat value) throws ComException {
    this._dispatchCall(108,"ForeColor", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(109)  public com.wilutions.mslib.office.MsoPatternType getPattern() throws ComException {
    final Object obj = this._dispatchCall(109,"Pattern", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoPatternType.valueOf((Integer)obj);
  }
  @DeclDISPID(109)  public void setPattern(com.wilutions.mslib.office.MsoPatternType value) throws ComException {
    assert(value != null);
    this._dispatchCall(109,"Pattern", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(110)  public com.wilutions.mslib.office.MsoLineStyle getStyle() throws ComException {
    final Object obj = this._dispatchCall(110,"Style", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoLineStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(110)  public void setStyle(com.wilutions.mslib.office.MsoLineStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(110,"Style", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(111)  public Float getTransparency() throws ComException {
    final Object obj = this._dispatchCall(111,"Transparency", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(111)  public void setTransparency(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(111,"Transparency", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(112)  public com.wilutions.mslib.office.MsoTriState getVisible() throws ComException {
    final Object obj = this._dispatchCall(112,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(112)  public void setVisible(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(112,"Visible", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(113)  public Float getWeight() throws ComException {
    final Object obj = this._dispatchCall(113,"Weight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(113)  public void setWeight(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(113,"Weight", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(114)  public com.wilutions.mslib.office.MsoTriState getInsetPen() throws ComException {
    final Object obj = this._dispatchCall(114,"InsetPen", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(114)  public void setInsetPen(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(114,"InsetPen", DISPATCH_PROPERTYPUT,value.value);
  }
  public LineFormatImpl(String progId) throws ComException {
    super(progId);
  }
  protected LineFormatImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[LineFormatImpl" + super.toString() + "]";
  }
}
