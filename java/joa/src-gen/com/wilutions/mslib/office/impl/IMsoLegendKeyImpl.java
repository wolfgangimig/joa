/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E75-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoLegendKeyImpl extends Dispatch implements com.wilutions.mslib.office.IMsoLegendKey {
  @DeclDISPID(150)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(128)  public com.wilutions.mslib.office.IMsoBorder getBorder() throws ComException {
    final Object obj = this._dispatchCall(128,"Border", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoBorder)obj;
  }
  @DeclDISPID(112)  public Object ClearFormats() throws ComException {
    final Object obj = this._dispatchCall(112,"ClearFormats", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(117)  public Object Delete() throws ComException {
    final Object obj = this._dispatchCall(117,"Delete", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(129)  public com.wilutions.mslib.office.IMsoInterior getInterior() throws ComException {
    final Object obj = this._dispatchCall(129,"Interior", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoInterior)obj;
  }
  @DeclDISPID(1663)  public com.wilutions.mslib.office.ChartFillFormat getFill() throws ComException {
    final Object obj = this._dispatchCall(1663,"Fill", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.ChartFillFormat)obj;
  }
  @DeclDISPID(132)  public Boolean getInvertIfNegative() throws ComException {
    final Object obj = this._dispatchCall(132,"InvertIfNegative", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(132)  public void setInvertIfNegative(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(132,"InvertIfNegative", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(73)  public Integer getMarkerBackgroundColor() throws ComException {
    final Object obj = this._dispatchCall(73,"MarkerBackgroundColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(73)  public void setMarkerBackgroundColor(Integer RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(73,"MarkerBackgroundColor", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(74)  public com.wilutions.mslib.office.XlColorIndex getMarkerBackgroundColorIndex() throws ComException {
    final Object obj = this._dispatchCall(74,"MarkerBackgroundColorIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlColorIndex.valueOf((Integer)obj);
  }
  @DeclDISPID(74)  public void setMarkerBackgroundColorIndex(com.wilutions.mslib.office.XlColorIndex RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(74,"MarkerBackgroundColorIndex", DISPATCH_PROPERTYPUT,RHS.value);
  }
  @DeclDISPID(75)  public Integer getMarkerForegroundColor() throws ComException {
    final Object obj = this._dispatchCall(75,"MarkerForegroundColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(75)  public void setMarkerForegroundColor(Integer RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(75,"MarkerForegroundColor", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(76)  public com.wilutions.mslib.office.XlColorIndex getMarkerForegroundColorIndex() throws ComException {
    final Object obj = this._dispatchCall(76,"MarkerForegroundColorIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlColorIndex.valueOf((Integer)obj);
  }
  @DeclDISPID(76)  public void setMarkerForegroundColorIndex(com.wilutions.mslib.office.XlColorIndex RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(76,"MarkerForegroundColorIndex", DISPATCH_PROPERTYPUT,RHS.value);
  }
  @DeclDISPID(231)  public Integer getMarkerSize() throws ComException {
    final Object obj = this._dispatchCall(231,"MarkerSize", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(231)  public void setMarkerSize(Integer RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(231,"MarkerSize", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(72)  public com.wilutions.mslib.office.XlMarkerStyle getMarkerStyle() throws ComException {
    final Object obj = this._dispatchCall(72,"MarkerStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlMarkerStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(72)  public void setMarkerStyle(com.wilutions.mslib.office.XlMarkerStyle RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(72,"MarkerStyle", DISPATCH_PROPERTYPUT,RHS.value);
  }
  @DeclDISPID(161)  public Integer getPictureType() throws ComException {
    final Object obj = this._dispatchCall(161,"PictureType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(161)  public void setPictureType(Integer RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(161,"PictureType", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(162)  public Double getPictureUnit() throws ComException {
    final Object obj = this._dispatchCall(162,"PictureUnit", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(162)  public void setPictureUnit(Double RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(162,"PictureUnit", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(235)  public Object Select() throws ComException {
    final Object obj = this._dispatchCall(235,"Select", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(163)  public Boolean getSmooth() throws ComException {
    final Object obj = this._dispatchCall(163,"Smooth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(163)  public void setSmooth(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(163,"Smooth", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(127)  public Double getLeft() throws ComException {
    final Object obj = this._dispatchCall(127,"Left", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(126)  public Double getTop() throws ComException {
    final Object obj = this._dispatchCall(126,"Top", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(122)  public Double getWidth() throws ComException {
    final Object obj = this._dispatchCall(122,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(123)  public Double getHeight() throws ComException {
    final Object obj = this._dispatchCall(123,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(103)  public Boolean getShadow() throws ComException {
    final Object obj = this._dispatchCall(103,"Shadow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(103)  public void setShadow(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(103,"Shadow", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(1610743841)  public com.wilutions.mslib.office.IMsoChartFormat getFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743841,"Format", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoChartFormat)obj;
  }
  @DeclDISPID(148)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(148,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(149)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(149,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2649)  public Double getPictureUnit2() throws ComException {
    final Object obj = this._dispatchCall(2649,"PictureUnit2", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(2649)  public void setPictureUnit2(Double RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(2649,"PictureUnit2", DISPATCH_PROPERTYPUT,RHS);
  }
  public IMsoLegendKeyImpl(String progId) throws ComException {
    super(progId);
  }
  protected IMsoLegendKeyImpl(long ndisp) {
    super(ndisp);
  }
  public IMsoLegendKeyImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoLegendKeyImpl" + super.toString() + "]";
  }
}
