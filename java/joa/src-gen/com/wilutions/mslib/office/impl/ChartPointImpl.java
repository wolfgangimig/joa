/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E67-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ChartPointImpl extends Dispatch implements com.wilutions.mslib.office.ChartPoint {
  @DeclDISPID(150)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
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
  @DeclDISPID(551)  public Object Copy() throws ComException {
    final Object obj = this._dispatchCall(551,"Copy", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(158)  public com.wilutions.mslib.office.IMsoDataLabel getDataLabel() throws ComException {
    final Object obj = this._dispatchCall(158,"DataLabel", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoDataLabel)obj;
  }
  @DeclDISPID(117)  public Object Delete() throws ComException {
    final Object obj = this._dispatchCall(117,"Delete", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(182)  public Integer getExplosion() throws ComException {
    final Object obj = this._dispatchCall(182,"Explosion", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(182)  public void setExplosion(Integer RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(182,"Explosion", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(77)  public Boolean getHasDataLabel() throws ComException {
    final Object obj = this._dispatchCall(77,"HasDataLabel", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(77)  public void setHasDataLabel(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(77,"HasDataLabel", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(129)  public com.wilutions.mslib.office.IMsoInterior getInterior() throws ComException {
    final Object obj = this._dispatchCall(129,"Interior", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoInterior)obj;
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
  @DeclDISPID(211)  public Object Paste() throws ComException {
    final Object obj = this._dispatchCall(211,"Paste", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(161)  public com.wilutions.mslib.office.XlChartPictureType getPictureType() throws ComException {
    final Object obj = this._dispatchCall(161,"PictureType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlChartPictureType.valueOf((Integer)obj);
  }
  @DeclDISPID(161)  public void setPictureType(com.wilutions.mslib.office.XlChartPictureType RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(161,"PictureType", DISPATCH_PROPERTYPUT,RHS.value);
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
  @DeclDISPID(1659)  public Boolean getApplyPictToSides() throws ComException {
    final Object obj = this._dispatchCall(1659,"ApplyPictToSides", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1659)  public void setApplyPictToSides(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(1659,"ApplyPictToSides", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(1660)  public Boolean getApplyPictToFront() throws ComException {
    final Object obj = this._dispatchCall(1660,"ApplyPictToFront", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1660)  public void setApplyPictToFront(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(1660,"ApplyPictToFront", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(1661)  public Boolean getApplyPictToEnd() throws ComException {
    final Object obj = this._dispatchCall(1661,"ApplyPictToEnd", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1661)  public void setApplyPictToEnd(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(1661,"ApplyPictToEnd", DISPATCH_PROPERTYPUT,RHS);
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
  @DeclDISPID(1662)  public Boolean getSecondaryPlot() throws ComException {
    final Object obj = this._dispatchCall(1662,"SecondaryPlot", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1662)  public void setSecondaryPlot(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(1662,"SecondaryPlot", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(1663)  public com.wilutions.mslib.office.ChartFillFormat getFill() throws ComException {
    final Object obj = this._dispatchCall(1663,"Fill", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.ChartFillFormat)obj;
  }
  @DeclDISPID(1922)  public Object ApplyDataLabels(com.wilutions.mslib.office.XlDataLabelsType Type, Object IMsoLegendKey, Object AutoText, Object HasLeaderLines, Object ShowSeriesName, Object ShowCategoryName, Object ShowValue, Object ShowPercentage, Object ShowBubbleSize, Object Separator) throws ComException {
    assert(Type != null);
    assert(IMsoLegendKey != null);
    assert(AutoText != null);
    assert(HasLeaderLines != null);
    assert(ShowSeriesName != null);
    assert(ShowCategoryName != null);
    assert(ShowValue != null);
    assert(ShowPercentage != null);
    assert(ShowBubbleSize != null);
    assert(Separator != null);
    final Object obj = this._dispatchCall(1922,"ApplyDataLabels", DISPATCH_METHOD,null,Type.value,IMsoLegendKey,AutoText,HasLeaderLines,ShowSeriesName,ShowCategoryName,ShowValue,ShowPercentage,ShowBubbleSize,Separator);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1665)  public Boolean getHas3DEffect() throws ComException {
    final Object obj = this._dispatchCall(1665,"Has3DEffect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1665)  public void setHas3DEffect(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(1665,"Has3DEffect", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(1610743854)  public com.wilutions.mslib.office.IMsoChartFormat getFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743854,"Format", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoChartFormat)obj;
  }
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(148,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
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
  @DeclDISPID(2651)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(2651,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2652)  public Double getHeight() throws ComException {
    final Object obj = this._dispatchCall(2652,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(2653)  public Double getWidth() throws ComException {
    final Object obj = this._dispatchCall(2653,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(2654)  public Double getLeft() throws ComException {
    final Object obj = this._dispatchCall(2654,"Left", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(2655)  public Double getTop() throws ComException {
    final Object obj = this._dispatchCall(2655,"Top", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(2656)  public Double PieSliceLocation(com.wilutions.mslib.office.XlPieSliceLocation loc, com.wilutions.mslib.office.XlPieSliceIndex Index) throws ComException {
    assert(loc != null);
    assert(Index != null);
    final Object obj = this._dispatchCall(2656,"PieSliceLocation", DISPATCH_METHOD,null,loc.value,Index.value);
    if (obj == null) return null;
    return (Double)obj;
  }
  public ChartPointImpl(String progId) throws ComException {
    super(progId, "{000C170C-0000-0000-C000-000000000046}");
  }
  protected ChartPointImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ChartPointImpl" + super.toString() + "]";
  }
}
