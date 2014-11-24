/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoAxis.
 * 
 */
@CoInterface(guid="{000C1713-0000-0000-C000-000000000046}")
public interface IMsoAxis extends IDispatch {
  @DeclDISPID(1610743808)  public Boolean getAxisBetweenCategories() throws ComException;
  @DeclDISPID(1610743808)  public void setAxisBetweenCategories(Boolean value) throws ComException;
  @DeclDISPID(1610743810)  public XlAxisGroup getAxisGroup() throws ComException;
  @DeclDISPID(1610743811)  public IMsoAxisTitle getAxisTitle() throws ComException;
  @DeclDISPID(1610743812)  public Object getCategoryNames() throws ComException;
  @DeclDISPID(1610743812)  public void setCategoryNames(Object value) throws ComException;
  @DeclDISPID(1610743814)  public XlAxisCrosses getCrosses() throws ComException;
  @DeclDISPID(1610743814)  public void setCrosses(XlAxisCrosses value) throws ComException;
  @DeclDISPID(1610743816)  public Double getCrossesAt() throws ComException;
  @DeclDISPID(1610743816)  public void setCrossesAt(Double value) throws ComException;
  @DeclDISPID(1610743818)  public Object Delete() throws ComException;
  @DeclDISPID(1610743819)  public Boolean getHasMajorGridlines() throws ComException;
  @DeclDISPID(1610743819)  public void setHasMajorGridlines(Boolean value) throws ComException;
  @DeclDISPID(1610743821)  public Boolean getHasMinorGridlines() throws ComException;
  @DeclDISPID(1610743821)  public void setHasMinorGridlines(Boolean value) throws ComException;
  @DeclDISPID(1610743823)  public Boolean getHasTitle() throws ComException;
  @DeclDISPID(1610743823)  public void setHasTitle(Boolean value) throws ComException;
  @DeclDISPID(1610743825)  public GridLines getMajorGridlines() throws ComException;
  @DeclDISPID(1610743826)  public XlTickMark getMajorTickMark() throws ComException;
  @DeclDISPID(1610743826)  public void setMajorTickMark(XlTickMark value) throws ComException;
  @DeclDISPID(1610743828)  public Double getMajorUnit() throws ComException;
  @DeclDISPID(1610743828)  public void setMajorUnit(Double value) throws ComException;
  @DeclDISPID(1610743830)  public Double getLogBase() throws ComException;
  @DeclDISPID(1610743830)  public void setLogBase(Double value) throws ComException;
  @DeclDISPID(1610743832)  public Boolean getTickLabelSpacingIsAuto() throws ComException;
  @DeclDISPID(1610743832)  public void setTickLabelSpacingIsAuto(Boolean value) throws ComException;
  @DeclDISPID(1610743834)  public Boolean getMajorUnitIsAuto() throws ComException;
  @DeclDISPID(1610743834)  public void setMajorUnitIsAuto(Boolean value) throws ComException;
  @DeclDISPID(1610743836)  public Double getMaximumScale() throws ComException;
  @DeclDISPID(1610743836)  public void setMaximumScale(Double value) throws ComException;
  @DeclDISPID(1610743838)  public Boolean getMaximumScaleIsAuto() throws ComException;
  @DeclDISPID(1610743838)  public void setMaximumScaleIsAuto(Boolean value) throws ComException;
  @DeclDISPID(1610743840)  public Double getMinimumScale() throws ComException;
  @DeclDISPID(1610743840)  public void setMinimumScale(Double value) throws ComException;
  @DeclDISPID(1610743842)  public Boolean getMinimumScaleIsAuto() throws ComException;
  @DeclDISPID(1610743842)  public void setMinimumScaleIsAuto(Boolean value) throws ComException;
  @DeclDISPID(1610743844)  public GridLines getMinorGridlines() throws ComException;
  @DeclDISPID(1610743845)  public XlTickMark getMinorTickMark() throws ComException;
  @DeclDISPID(1610743845)  public void setMinorTickMark(XlTickMark value) throws ComException;
  @DeclDISPID(1610743847)  public Double getMinorUnit() throws ComException;
  @DeclDISPID(1610743847)  public void setMinorUnit(Double value) throws ComException;
  @DeclDISPID(1610743849)  public Boolean getMinorUnitIsAuto() throws ComException;
  @DeclDISPID(1610743849)  public void setMinorUnitIsAuto(Boolean value) throws ComException;
  @DeclDISPID(1610743851)  public Boolean getReversePlotOrder() throws ComException;
  @DeclDISPID(1610743851)  public void setReversePlotOrder(Boolean value) throws ComException;
  @DeclDISPID(1610743853)  public XlScaleType getScaleType() throws ComException;
  @DeclDISPID(1610743853)  public void setScaleType(XlScaleType value) throws ComException;
  @DeclDISPID(1610743855)  public Object Select() throws ComException;
  @DeclDISPID(1610743856)  public XlTickLabelPosition getTickLabelPosition() throws ComException;
  @DeclDISPID(1610743856)  public void setTickLabelPosition(XlTickLabelPosition value) throws ComException;
  @DeclDISPID(1610743858)  public IMsoTickLabels getTickLabels() throws ComException;
  @DeclDISPID(1610743859)  public Integer getTickLabelSpacing() throws ComException;
  @DeclDISPID(1610743859)  public void setTickLabelSpacing(Integer value) throws ComException;
  @DeclDISPID(1610743861)  public Integer getTickMarkSpacing() throws ComException;
  @DeclDISPID(1610743861)  public void setTickMarkSpacing(Integer value) throws ComException;
  @DeclDISPID(1610743863)  public XlAxisType getType() throws ComException;
  @DeclDISPID(1610743863)  public void setType(XlAxisType value) throws ComException;
  @DeclDISPID(1610743865)  public XlTimeUnit getBaseUnit() throws ComException;
  @DeclDISPID(1610743865)  public void setBaseUnit(XlTimeUnit value) throws ComException;
  @DeclDISPID(1610743867)  public Boolean getBaseUnitIsAuto() throws ComException;
  @DeclDISPID(1610743867)  public void setBaseUnitIsAuto(Boolean value) throws ComException;
  @DeclDISPID(1610743869)  public XlTimeUnit getMajorUnitScale() throws ComException;
  @DeclDISPID(1610743869)  public void setMajorUnitScale(XlTimeUnit value) throws ComException;
  @DeclDISPID(1610743871)  public XlTimeUnit getMinorUnitScale() throws ComException;
  @DeclDISPID(1610743871)  public void setMinorUnitScale(XlTimeUnit value) throws ComException;
  @DeclDISPID(1610743873)  public XlCategoryType getCategoryType() throws ComException;
  @DeclDISPID(1610743873)  public void setCategoryType(XlCategoryType value) throws ComException;
  @DeclDISPID(1610743875)  public Double getLeft() throws ComException;
  @DeclDISPID(1610743876)  public Double getTop() throws ComException;
  @DeclDISPID(1610743877)  public Double getWidth() throws ComException;
  @DeclDISPID(1610743878)  public Double getHeight() throws ComException;
  @DeclDISPID(1610743879)  public XlDisplayUnit getDisplayUnit() throws ComException;
  @DeclDISPID(1610743879)  public void setDisplayUnit(XlDisplayUnit value) throws ComException;
  @DeclDISPID(1610743881)  public Double getDisplayUnitCustom() throws ComException;
  @DeclDISPID(1610743881)  public void setDisplayUnitCustom(Double value) throws ComException;
  @DeclDISPID(1610743883)  public Boolean getHasDisplayUnitLabel() throws ComException;
  @DeclDISPID(1610743883)  public void setHasDisplayUnitLabel(Boolean value) throws ComException;
  @DeclDISPID(1610743885)  public IMsoDisplayUnitLabel getDisplayUnitLabel() throws ComException;
  @DeclDISPID(1610743886)  public IMsoBorder getBorder() throws ComException;
  @DeclDISPID(1610743887)  public String getName() throws ComException;
  @DeclDISPID(1610743888)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
}
