/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E60-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoSeriesImpl extends Dispatch implements com.wilutions.mslib.office.IMsoSeries {
  @DeclDISPID(150)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(47)  public com.wilutions.mslib.office.XlAxisGroup getAxisGroup() throws ComException {
    final Object obj = this._dispatchCall(47,"AxisGroup", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlAxisGroup.valueOf((Integer)obj);
  }
  @DeclDISPID(47)  public void setAxisGroup(com.wilutions.mslib.office.XlAxisGroup RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(47,"AxisGroup", DISPATCH_PROPERTYPUT,RHS.value);
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
  @DeclDISPID(157)  public Dispatch DataLabels(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(157,"DataLabels", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(117)  public Object Delete() throws ComException {
    final Object obj = this._dispatchCall(117,"Delete", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(152)  public Object ErrorBar(com.wilutions.mslib.office.XlErrorBarDirection Direction, com.wilutions.mslib.office.XlErrorBarInclude Include, com.wilutions.mslib.office.XlErrorBarType Type, Object Amount, Object MinusValues) throws ComException {
    assert(Direction != null);
    assert(Include != null);
    assert(Type != null);
    assert(Amount != null);
    assert(MinusValues != null);
    final Object obj = this._dispatchCall(152,"ErrorBar", DISPATCH_METHOD,null,Direction.value,Include.value,Type.value,Amount,MinusValues);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(159)  public com.wilutions.mslib.office.IMsoErrorBars getErrorBars() throws ComException {
    final Object obj = this._dispatchCall(159,"ErrorBars", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoErrorBars)obj;
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
  @DeclDISPID(261)  public String getFormula() throws ComException {
    final Object obj = this._dispatchCall(261,"Formula", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(261)  public void setFormula(String RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(261,"Formula", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(263)  public String getFormulaLocal() throws ComException {
    final Object obj = this._dispatchCall(263,"FormulaLocal", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(263)  public void setFormulaLocal(String RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(263,"FormulaLocal", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(264)  public String getFormulaR1C1() throws ComException {
    final Object obj = this._dispatchCall(264,"FormulaR1C1", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(264)  public void setFormulaR1C1(String RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(264,"FormulaR1C1", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(265)  public String getFormulaR1C1Local() throws ComException {
    final Object obj = this._dispatchCall(265,"FormulaR1C1Local", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(265)  public void setFormulaR1C1Local(String RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(265,"FormulaR1C1Local", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(78)  public Boolean getHasDataLabels() throws ComException {
    final Object obj = this._dispatchCall(78,"HasDataLabels", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(78)  public void setHasDataLabels(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(78,"HasDataLabels", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(160)  public Boolean getHasErrorBars() throws ComException {
    final Object obj = this._dispatchCall(160,"HasErrorBars", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(160)  public void setHasErrorBars(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(160,"HasErrorBars", DISPATCH_PROPERTYPUT,RHS);
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
  @DeclDISPID(110)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(110,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(110)  public void setName(String RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(110,"Name", DISPATCH_PROPERTYPUT,RHS);
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
  @DeclDISPID(228)  public Integer getPlotOrder() throws ComException {
    final Object obj = this._dispatchCall(228,"PlotOrder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(228)  public void setPlotOrder(Integer RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(228,"PlotOrder", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(70)  public Dispatch Points(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(70,"Points", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (Dispatch)obj;
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
  @DeclDISPID(154)  public Dispatch Trendlines(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(154,"Trendlines", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(108)  public Integer getType() throws ComException {
    final Object obj = this._dispatchCall(108,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(108)  public void setType(Integer RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(108,"Type", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(1400)  public com.wilutions.mslib.office.XlChartType getChartType() throws ComException {
    final Object obj = this._dispatchCall(1400,"ChartType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlChartType.valueOf((Integer)obj);
  }
  @DeclDISPID(1400)  public void setChartType(com.wilutions.mslib.office.XlChartType RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(1400,"ChartType", DISPATCH_PROPERTYPUT,RHS.value);
  }
  @DeclDISPID(1401)  public void ApplyCustomType(com.wilutions.mslib.office.XlChartType ChartType) throws ComException {
    assert(ChartType != null);
    this._dispatchCall(1401,"ApplyCustomType", DISPATCH_METHOD,null,ChartType.value);
  }
  @DeclDISPID(164)  public Object getValues() throws ComException {
    final Object obj = this._dispatchCall(164,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(164)  public void setValues(Object RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(164,"Values", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(1111)  public Object getXValues() throws ComException {
    final Object obj = this._dispatchCall(1111,"XValues", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1111)  public void setXValues(Object RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(1111,"XValues", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(1664)  public Object getBubbleSizes() throws ComException {
    final Object obj = this._dispatchCall(1664,"BubbleSizes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1664)  public void setBubbleSizes(Object RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(1664,"BubbleSizes", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(1403)  public com.wilutions.mslib.office.XlBarShape getBarShape() throws ComException {
    final Object obj = this._dispatchCall(1403,"BarShape", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlBarShape.valueOf((Integer)obj);
  }
  @DeclDISPID(1403)  public void setBarShape(com.wilutions.mslib.office.XlBarShape RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(1403,"BarShape", DISPATCH_PROPERTYPUT,RHS.value);
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
  @DeclDISPID(1665)  public Boolean getHas3DEffect() throws ComException {
    final Object obj = this._dispatchCall(1665,"Has3DEffect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1665)  public void setHas3DEffect(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(1665,"Has3DEffect", DISPATCH_PROPERTYPUT,RHS);
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
  @DeclDISPID(1394)  public Boolean getHasLeaderLines() throws ComException {
    final Object obj = this._dispatchCall(1394,"HasLeaderLines", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1394)  public void setHasLeaderLines(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(1394,"HasLeaderLines", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(1666)  public com.wilutions.mslib.office.IMsoLeaderLines getLeaderLines() throws ComException {
    final Object obj = this._dispatchCall(1666,"LeaderLines", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoLeaderLines)obj;
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
  @DeclDISPID(1610743890)  public com.wilutions.mslib.office.IMsoChartFormat getFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743890,"Format", DISPATCH_PROPERTYGET,null);
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
  @DeclDISPID(1924)  public Integer getPlotColorIndex() throws ComException {
    final Object obj = this._dispatchCall(1924,"PlotColorIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2884)  public Integer getInvertColor() throws ComException {
    final Object obj = this._dispatchCall(2884,"InvertColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2884)  public void setInvertColor(Integer RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(2884,"InvertColor", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(2885)  public com.wilutions.mslib.office.XlColorIndex getInvertColorIndex() throws ComException {
    final Object obj = this._dispatchCall(2885,"InvertColorIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlColorIndex.valueOf((Integer)obj);
  }
  @DeclDISPID(2885)  public void setInvertColorIndex(com.wilutions.mslib.office.XlColorIndex RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(2885,"InvertColorIndex", DISPATCH_PROPERTYPUT,RHS.value);
  }
  @DeclDISPID(2887)  public Boolean getIsFiltered() throws ComException {
    final Object obj = this._dispatchCall(2887,"IsFiltered", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2887)  public void setIsFiltered(Boolean RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(2887,"IsFiltered", DISPATCH_PROPERTYPUT,RHS);
  }
  public IMsoSeriesImpl(String progId) throws ComException {
    super(progId);
  }
  protected IMsoSeriesImpl(long ndisp) {
    super(ndisp);
  }
  public IMsoSeriesImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoSeriesImpl" + super.toString() + "]";
  }
}
