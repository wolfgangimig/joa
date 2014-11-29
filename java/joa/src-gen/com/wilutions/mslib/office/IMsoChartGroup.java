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
  @DeclDISPID(1610743808)  public void setAxisGroup(final Integer value) throws ComException;
  @DeclDISPID(1610743808)  public Integer getAxisGroup() throws ComException;
  @DeclDISPID(1610743810)  public void setDoughnutHoleSize(final Integer value) throws ComException;
  @DeclDISPID(1610743810)  public Integer getDoughnutHoleSize() throws ComException;
  @DeclDISPID(1610743812)  public IMsoDownBars getDownBars() throws ComException;
  @DeclDISPID(1610743813)  public IMsoDropLines getDropLines() throws ComException;
  @DeclDISPID(1610743814)  public void setFirstSliceAngle(final Integer value) throws ComException;
  @DeclDISPID(1610743814)  public Integer getFirstSliceAngle() throws ComException;
  @DeclDISPID(1610743816)  public void setGapWidth(final Integer value) throws ComException;
  @DeclDISPID(1610743816)  public Integer getGapWidth() throws ComException;
  @DeclDISPID(1610743818)  public void setHasDropLines(final Boolean value) throws ComException;
  @DeclDISPID(1610743818)  public Boolean getHasDropLines() throws ComException;
  @DeclDISPID(1610743820)  public void setHasHiLoLines(final Boolean value) throws ComException;
  @DeclDISPID(1610743820)  public Boolean getHasHiLoLines() throws ComException;
  @DeclDISPID(1610743822)  public void setHasRadarAxisLabels(final Boolean value) throws ComException;
  @DeclDISPID(1610743822)  public Boolean getHasRadarAxisLabels() throws ComException;
  @DeclDISPID(1610743824)  public void setHasSeriesLines(final Boolean value) throws ComException;
  @DeclDISPID(1610743824)  public Boolean getHasSeriesLines() throws ComException;
  @DeclDISPID(1610743826)  public void setHasUpDownBars(final Boolean value) throws ComException;
  @DeclDISPID(1610743826)  public Boolean getHasUpDownBars() throws ComException;
  @DeclDISPID(1610743828)  public IMsoHiLoLines getHiLoLines() throws ComException;
  @DeclDISPID(1610743829)  public Integer getIndex() throws ComException;
  @DeclDISPID(1610743830)  public void setOverlap(final Integer value) throws ComException;
  @DeclDISPID(1610743830)  public Integer getOverlap() throws ComException;
  @DeclDISPID(1610743832)  public IDispatch getRadarAxisLabels() throws ComException;
  @DeclDISPID(1610743833)  public IDispatch SeriesCollection(final Object Index) throws ComException;
  @DeclDISPID(1610743834)  public IMsoSeriesLines getSeriesLines() throws ComException;
  @DeclDISPID(1610743839)  public IMsoUpBars getUpBars() throws ComException;
  @DeclDISPID(1610743840)  public void setVaryByCategories(final Boolean value) throws ComException;
  @DeclDISPID(1610743840)  public Boolean getVaryByCategories() throws ComException;
  @DeclDISPID(1610743842)  public XlSizeRepresents getSizeRepresents() throws ComException;
  @DeclDISPID(1610743842)  public void setSizeRepresents(final XlSizeRepresents value) throws ComException;
  @DeclDISPID(1610743844)  public void setBubbleScale(final Integer value) throws ComException;
  @DeclDISPID(1610743844)  public Integer getBubbleScale() throws ComException;
  @DeclDISPID(1610743846)  public void setShowNegativeBubbles(final Boolean value) throws ComException;
  @DeclDISPID(1610743846)  public Boolean getShowNegativeBubbles() throws ComException;
  @DeclDISPID(1610743848)  public void setSplitType(final XlChartSplitType value) throws ComException;
  @DeclDISPID(1610743848)  public XlChartSplitType getSplitType() throws ComException;
  @DeclDISPID(1610743850)  public Object getSplitValue() throws ComException;
  @DeclDISPID(1610743850)  public void setSplitValue(final Object value) throws ComException;
  @DeclDISPID(1610743852)  public Integer getSecondPlotSize() throws ComException;
  @DeclDISPID(1610743852)  public void setSecondPlotSize(final Integer value) throws ComException;
  @DeclDISPID(1610743854)  public Boolean getHas3DShading() throws ComException;
  @DeclDISPID(1610743854)  public void setHas3DShading(final Boolean value) throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(151)  public IDispatch CategoryCollection(final Object Index) throws ComException;
  @DeclDISPID(152)  public IDispatch FullCategoryCollection(final Object Index) throws ComException;
}
