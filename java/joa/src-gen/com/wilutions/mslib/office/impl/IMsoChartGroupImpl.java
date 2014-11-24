/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E4C-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoChartGroupImpl extends Dispatch implements com.wilutions.mslib.office.IMsoChartGroup {
  @DeclDISPID(1610743808)  public void setAxisGroup(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743808,"AxisGroup", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743808)  public Integer getAxisGroup() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"AxisGroup", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743810)  public void setDoughnutHoleSize(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743810,"DoughnutHoleSize", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743810)  public Integer getDoughnutHoleSize() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"DoughnutHoleSize", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.office.IMsoDownBars getDownBars() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"DownBars", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoDownBarsImpl.class);
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.office.IMsoDropLines getDropLines() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"DropLines", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoDropLinesImpl.class);
  }
  @DeclDISPID(1610743814)  public void setFirstSliceAngle(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743814,"FirstSliceAngle", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743814)  public Integer getFirstSliceAngle() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"FirstSliceAngle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743816)  public void setGapWidth(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743816,"GapWidth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743816)  public Integer getGapWidth() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"GapWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743818)  public void setHasDropLines(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743818,"HasDropLines", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743818)  public Boolean getHasDropLines() throws ComException {
    final Object obj = this._dispatchCall(1610743818,"HasDropLines", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743820)  public void setHasHiLoLines(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743820,"HasHiLoLines", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743820)  public Boolean getHasHiLoLines() throws ComException {
    final Object obj = this._dispatchCall(1610743820,"HasHiLoLines", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743822)  public void setHasRadarAxisLabels(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743822,"HasRadarAxisLabels", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743822)  public Boolean getHasRadarAxisLabels() throws ComException {
    final Object obj = this._dispatchCall(1610743822,"HasRadarAxisLabels", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743824)  public void setHasSeriesLines(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743824,"HasSeriesLines", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743824)  public Boolean getHasSeriesLines() throws ComException {
    final Object obj = this._dispatchCall(1610743824,"HasSeriesLines", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743826)  public void setHasUpDownBars(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743826,"HasUpDownBars", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743826)  public Boolean getHasUpDownBars() throws ComException {
    final Object obj = this._dispatchCall(1610743826,"HasUpDownBars", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743828)  public com.wilutions.mslib.office.IMsoHiLoLines getHiLoLines() throws ComException {
    final Object obj = this._dispatchCall(1610743828,"HiLoLines", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoHiLoLinesImpl.class);
  }
  @DeclDISPID(1610743829)  public Integer getIndex() throws ComException {
    final Object obj = this._dispatchCall(1610743829,"Index", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743830)  public void setOverlap(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743830,"Overlap", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743830)  public Integer getOverlap() throws ComException {
    final Object obj = this._dispatchCall(1610743830,"Overlap", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743832)  public IDispatch getRadarAxisLabels() throws ComException {
    final Object obj = this._dispatchCall(1610743832,"RadarAxisLabels", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743833)  public IDispatch SeriesCollection(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(1610743833,"SeriesCollection", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743834)  public com.wilutions.mslib.office.IMsoSeriesLines getSeriesLines() throws ComException {
    final Object obj = this._dispatchCall(1610743834,"SeriesLines", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoSeriesLinesImpl.class);
  }
  @DeclDISPID(1610743839)  public com.wilutions.mslib.office.IMsoUpBars getUpBars() throws ComException {
    final Object obj = this._dispatchCall(1610743839,"UpBars", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoUpBarsImpl.class);
  }
  @DeclDISPID(1610743840)  public void setVaryByCategories(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743840,"VaryByCategories", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743840)  public Boolean getVaryByCategories() throws ComException {
    final Object obj = this._dispatchCall(1610743840,"VaryByCategories", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743842)  public com.wilutions.mslib.office.XlSizeRepresents getSizeRepresents() throws ComException {
    final Object obj = this._dispatchCall(1610743842,"SizeRepresents", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlSizeRepresents.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743842)  public void setSizeRepresents(com.wilutions.mslib.office.XlSizeRepresents value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743842,"SizeRepresents", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743844)  public void setBubbleScale(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743844,"BubbleScale", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743844)  public Integer getBubbleScale() throws ComException {
    final Object obj = this._dispatchCall(1610743844,"BubbleScale", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743846)  public void setShowNegativeBubbles(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743846,"ShowNegativeBubbles", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743846)  public Boolean getShowNegativeBubbles() throws ComException {
    final Object obj = this._dispatchCall(1610743846,"ShowNegativeBubbles", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743848)  public void setSplitType(com.wilutions.mslib.office.XlChartSplitType value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743848,"SplitType", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743848)  public com.wilutions.mslib.office.XlChartSplitType getSplitType() throws ComException {
    final Object obj = this._dispatchCall(1610743848,"SplitType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlChartSplitType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743850)  public Object getSplitValue() throws ComException {
    final Object obj = this._dispatchCall(1610743850,"SplitValue", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743850)  public void setSplitValue(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743850,"SplitValue", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743852)  public Integer getSecondPlotSize() throws ComException {
    final Object obj = this._dispatchCall(1610743852,"SecondPlotSize", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743852)  public void setSecondPlotSize(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743852,"SecondPlotSize", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743854)  public Boolean getHas3DShading() throws ComException {
    final Object obj = this._dispatchCall(1610743854,"Has3DShading", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743854)  public void setHas3DShading(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743854,"Has3DShading", DISPATCH_PROPERTYPUT,value);
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
  @DeclDISPID(150)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(151)  public IDispatch CategoryCollection(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(151,"CategoryCollection", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(152)  public IDispatch FullCategoryCollection(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(152,"FullCategoryCollection", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  public IMsoChartGroupImpl(String progId) throws ComException {
    super(progId, "{000C1727-0000-0000-C000-000000000046}");
  }
  protected IMsoChartGroupImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoChartGroupImpl" + super.toString() + "]";
  }
}
