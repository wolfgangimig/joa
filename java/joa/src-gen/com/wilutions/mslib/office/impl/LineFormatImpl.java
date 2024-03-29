/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A7C-A463-DB41-5DAE-69E7A5F7FCBC}")
public class LineFormatImpl extends Dispatch implements com.wilutions.mslib.office.LineFormat {
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
  @DeclDISPID(100)  public com.wilutions.mslib.office.ColorFormat getBackColor() throws ComException {
    final Object obj = this._dispatchCall(100,"BackColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ColorFormatImpl.class);
  }
  @DeclDISPID(100)  public void setBackColor(final com.wilutions.mslib.office.ColorFormat value) throws ComException {
    this._dispatchCall(100,"BackColor", DISPATCH_PROPERTYPUT,Dispatch.param(value));
  }
  @DeclDISPID(101)  public com.wilutions.mslib.office.MsoArrowheadLength getBeginArrowheadLength() throws ComException {
    final Object obj = this._dispatchCall(101,"BeginArrowheadLength", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoArrowheadLength.valueOf((Integer)obj);
  }
  @DeclDISPID(101)  public void setBeginArrowheadLength(final com.wilutions.mslib.office.MsoArrowheadLength value) throws ComException {
    assert(value != null);
    this._dispatchCall(101,"BeginArrowheadLength", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(102)  public com.wilutions.mslib.office.MsoArrowheadStyle getBeginArrowheadStyle() throws ComException {
    final Object obj = this._dispatchCall(102,"BeginArrowheadStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoArrowheadStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(102)  public void setBeginArrowheadStyle(final com.wilutions.mslib.office.MsoArrowheadStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(102,"BeginArrowheadStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(103)  public com.wilutions.mslib.office.MsoArrowheadWidth getBeginArrowheadWidth() throws ComException {
    final Object obj = this._dispatchCall(103,"BeginArrowheadWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoArrowheadWidth.valueOf((Integer)obj);
  }
  @DeclDISPID(103)  public void setBeginArrowheadWidth(final com.wilutions.mslib.office.MsoArrowheadWidth value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"BeginArrowheadWidth", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(104)  public com.wilutions.mslib.office.MsoLineDashStyle getDashStyle() throws ComException {
    final Object obj = this._dispatchCall(104,"DashStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoLineDashStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(104)  public void setDashStyle(final com.wilutions.mslib.office.MsoLineDashStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(104,"DashStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(105)  public com.wilutions.mslib.office.MsoArrowheadLength getEndArrowheadLength() throws ComException {
    final Object obj = this._dispatchCall(105,"EndArrowheadLength", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoArrowheadLength.valueOf((Integer)obj);
  }
  @DeclDISPID(105)  public void setEndArrowheadLength(final com.wilutions.mslib.office.MsoArrowheadLength value) throws ComException {
    assert(value != null);
    this._dispatchCall(105,"EndArrowheadLength", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(106)  public com.wilutions.mslib.office.MsoArrowheadStyle getEndArrowheadStyle() throws ComException {
    final Object obj = this._dispatchCall(106,"EndArrowheadStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoArrowheadStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(106)  public void setEndArrowheadStyle(final com.wilutions.mslib.office.MsoArrowheadStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(106,"EndArrowheadStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(107)  public com.wilutions.mslib.office.MsoArrowheadWidth getEndArrowheadWidth() throws ComException {
    final Object obj = this._dispatchCall(107,"EndArrowheadWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoArrowheadWidth.valueOf((Integer)obj);
  }
  @DeclDISPID(107)  public void setEndArrowheadWidth(final com.wilutions.mslib.office.MsoArrowheadWidth value) throws ComException {
    assert(value != null);
    this._dispatchCall(107,"EndArrowheadWidth", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(108)  public com.wilutions.mslib.office.ColorFormat getForeColor() throws ComException {
    final Object obj = this._dispatchCall(108,"ForeColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ColorFormatImpl.class);
  }
  @DeclDISPID(108)  public void setForeColor(final com.wilutions.mslib.office.ColorFormat value) throws ComException {
    this._dispatchCall(108,"ForeColor", DISPATCH_PROPERTYPUT,Dispatch.param(value));
  }
  @DeclDISPID(109)  public com.wilutions.mslib.office.MsoPatternType getPattern() throws ComException {
    final Object obj = this._dispatchCall(109,"Pattern", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoPatternType.valueOf((Integer)obj);
  }
  @DeclDISPID(109)  public void setPattern(final com.wilutions.mslib.office.MsoPatternType value) throws ComException {
    assert(value != null);
    this._dispatchCall(109,"Pattern", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(110)  public com.wilutions.mslib.office.MsoLineStyle getStyle() throws ComException {
    final Object obj = this._dispatchCall(110,"Style", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoLineStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(110)  public void setStyle(final com.wilutions.mslib.office.MsoLineStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(110,"Style", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(111)  public Float getTransparency() throws ComException {
    final Object obj = this._dispatchCall(111,"Transparency", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(111)  public void setTransparency(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(111,"Transparency", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(112)  public com.wilutions.mslib.office.MsoTriState getVisible() throws ComException {
    final Object obj = this._dispatchCall(112,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(112)  public void setVisible(final com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(112,"Visible", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(113)  public Float getWeight() throws ComException {
    final Object obj = this._dispatchCall(113,"Weight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(113)  public void setWeight(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(113,"Weight", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(114)  public com.wilutions.mslib.office.MsoTriState getInsetPen() throws ComException {
    final Object obj = this._dispatchCall(114,"InsetPen", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(114)  public void setInsetPen(final com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(114,"InsetPen", DISPATCH_PROPERTYPUT,value.value);
  }
  public LineFormatImpl(String progId) throws ComException {
    super(progId, "{000C0317-0000-0000-C000-000000000046}");
  }
  protected LineFormatImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[LineFormatImpl" + super.toString() + "]";
  }
}
