/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoChartGroup.
 * 
 */
@CoInterface(guid="{000C1727-0000-0000-C000-000000000046}")
public interface IMsoChartGroup extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public void setAxisGroup(Integer value) throws ComException;
  @DeclDISPID(1610743808)  public Integer getAxisGroup() throws ComException;
  @DeclDISPID(1610743810)  public void setDoughnutHoleSize(Integer value) throws ComException;
  @DeclDISPID(1610743810)  public Integer getDoughnutHoleSize() throws ComException;
  @DeclDISPID(1610743812)  public IMsoDownBars getDownBars() throws ComException;
  @DeclDISPID(1610743813)  public IMsoDropLines getDropLines() throws ComException;
  @DeclDISPID(1610743814)  public void setFirstSliceAngle(Integer value) throws ComException;
  @DeclDISPID(1610743814)  public Integer getFirstSliceAngle() throws ComException;
  @DeclDISPID(1610743816)  public void setGapWidth(Integer value) throws ComException;
  @DeclDISPID(1610743816)  public Integer getGapWidth() throws ComException;
  @DeclDISPID(1610743818)  public void setHasDropLines(Boolean value) throws ComException;
  @DeclDISPID(1610743818)  public Boolean getHasDropLines() throws ComException;
  @DeclDISPID(1610743820)  public void setHasHiLoLines(Boolean value) throws ComException;
  @DeclDISPID(1610743820)  public Boolean getHasHiLoLines() throws ComException;
  @DeclDISPID(1610743822)  public void setHasRadarAxisLabels(Boolean value) throws ComException;
  @DeclDISPID(1610743822)  public Boolean getHasRadarAxisLabels() throws ComException;
  @DeclDISPID(1610743824)  public void setHasSeriesLines(Boolean value) throws ComException;
  @DeclDISPID(1610743824)  public Boolean getHasSeriesLines() throws ComException;
  @DeclDISPID(1610743826)  public void setHasUpDownBars(Boolean value) throws ComException;
  @DeclDISPID(1610743826)  public Boolean getHasUpDownBars() throws ComException;
  @DeclDISPID(1610743828)  public IMsoHiLoLines getHiLoLines() throws ComException;
  @DeclDISPID(1610743829)  public Integer getIndex() throws ComException;
  @DeclDISPID(1610743830)  public void setOverlap(Integer value) throws ComException;
  @DeclDISPID(1610743830)  public Integer getOverlap() throws ComException;
  @DeclDISPID(1610743832)  public IDispatch getRadarAxisLabels() throws ComException;
  @DeclDISPID(1610743833)  public IDispatch SeriesCollection(Object Index) throws ComException;
  @DeclDISPID(1610743834)  public IMsoSeriesLines getSeriesLines() throws ComException;
  @DeclDISPID(1610743839)  public IMsoUpBars getUpBars() throws ComException;
  @DeclDISPID(1610743840)  public void setVaryByCategories(Boolean value) throws ComException;
  @DeclDISPID(1610743840)  public Boolean getVaryByCategories() throws ComException;
  @DeclDISPID(1610743842)  public XlSizeRepresents getSizeRepresents() throws ComException;
  @DeclDISPID(1610743842)  public void setSizeRepresents(XlSizeRepresents value) throws ComException;
  @DeclDISPID(1610743844)  public void setBubbleScale(Integer value) throws ComException;
  @DeclDISPID(1610743844)  public Integer getBubbleScale() throws ComException;
  @DeclDISPID(1610743846)  public void setShowNegativeBubbles(Boolean value) throws ComException;
  @DeclDISPID(1610743846)  public Boolean getShowNegativeBubbles() throws ComException;
  @DeclDISPID(1610743848)  public void setSplitType(XlChartSplitType value) throws ComException;
  @DeclDISPID(1610743848)  public XlChartSplitType getSplitType() throws ComException;
  @DeclDISPID(1610743850)  public Object getSplitValue() throws ComException;
  @DeclDISPID(1610743850)  public void setSplitValue(Object value) throws ComException;
  @DeclDISPID(1610743852)  public Integer getSecondPlotSize() throws ComException;
  @DeclDISPID(1610743852)  public void setSecondPlotSize(Integer value) throws ComException;
  @DeclDISPID(1610743854)  public Boolean getHas3DShading() throws ComException;
  @DeclDISPID(1610743854)  public void setHas3DShading(Boolean value) throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(151)  public IDispatch CategoryCollection(Object Index) throws ComException;
  @DeclDISPID(152)  public IDispatch FullCategoryCollection(Object Index) throws ComException;
}
