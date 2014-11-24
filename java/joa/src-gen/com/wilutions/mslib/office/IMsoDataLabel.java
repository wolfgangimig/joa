/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoDataLabel.
 * 
 */
@CoInterface(guid="{000C1720-0000-0000-C000-000000000046}")
public interface IMsoDataLabel extends IDispatch {
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(110)  public String getName() throws ComException;
  @DeclDISPID(235)  public Object Select() throws ComException;
  @DeclDISPID(128)  public IMsoBorder getBorder() throws ComException;
  @DeclDISPID(117)  public Object Delete() throws ComException;
  @DeclDISPID(129)  public IMsoInterior getInterior() throws ComException;
  @DeclDISPID(1663)  public ChartFillFormat getFill() throws ComException;
  @DeclDISPID(139)  public String getCaption() throws ComException;
  @DeclDISPID(139)  public void setCaption(String RHS) throws ComException;
  @DeclDISPID(603)  public IMsoCharacters getCharacters(Object Start, Object Length) throws ComException;
  @DeclDISPID(146)  public ChartFont getFont() throws ComException;
  @DeclDISPID(136)  public Object getHorizontalAlignment() throws ComException;
  @DeclDISPID(136)  public void setHorizontalAlignment(Object RHS) throws ComException;
  @DeclDISPID(127)  public Double getLeft() throws ComException;
  @DeclDISPID(127)  public void setLeft(Double RHS) throws ComException;
  @DeclDISPID(134)  public Object getOrientation() throws ComException;
  @DeclDISPID(134)  public void setOrientation(Object RHS) throws ComException;
  @DeclDISPID(103)  public Boolean getShadow() throws ComException;
  @DeclDISPID(103)  public void setShadow(Boolean RHS) throws ComException;
  @DeclDISPID(138)  public String getText() throws ComException;
  @DeclDISPID(138)  public void setText(String RHS) throws ComException;
  @DeclDISPID(126)  public Double getTop() throws ComException;
  @DeclDISPID(126)  public void setTop(Double RHS) throws ComException;
  @DeclDISPID(137)  public Object getVerticalAlignment() throws ComException;
  @DeclDISPID(137)  public void setVerticalAlignment(Object RHS) throws ComException;
  @DeclDISPID(975)  public Integer getReadingOrder() throws ComException;
  @DeclDISPID(975)  public void setReadingOrder(Integer RHS) throws ComException;
  @DeclDISPID(1525)  public Object getAutoScaleFont() throws ComException;
  @DeclDISPID(1525)  public void setAutoScaleFont(Object RHS) throws ComException;
  @DeclDISPID(135)  public Boolean getAutoText() throws ComException;
  @DeclDISPID(135)  public void setAutoText(Boolean RHS) throws ComException;
  @DeclDISPID(193)  public String getNumberFormat() throws ComException;
  @DeclDISPID(193)  public void setNumberFormat(String RHS) throws ComException;
  @DeclDISPID(194)  public Boolean getNumberFormatLinked() throws ComException;
  @DeclDISPID(194)  public void setNumberFormatLinked(Boolean RHS) throws ComException;
  @DeclDISPID(1097)  public Object getNumberFormatLocal() throws ComException;
  @DeclDISPID(1097)  public void setNumberFormatLocal(Object RHS) throws ComException;
  @DeclDISPID(171)  public Boolean getShowLegendKey() throws ComException;
  @DeclDISPID(171)  public void setShowLegendKey(Boolean RHS) throws ComException;
  @DeclDISPID(108)  public Object getType() throws ComException;
  @DeclDISPID(108)  public void setType(Object RHS) throws ComException;
  @DeclDISPID(133)  public XlDataLabelPosition getPosition() throws ComException;
  @DeclDISPID(133)  public void setPosition(XlDataLabelPosition RHS) throws ComException;
  @DeclDISPID(2022)  public Boolean getShowSeriesName() throws ComException;
  @DeclDISPID(2022)  public void setShowSeriesName(Boolean RHS) throws ComException;
  @DeclDISPID(2023)  public Boolean getShowCategoryName() throws ComException;
  @DeclDISPID(2023)  public void setShowCategoryName(Boolean RHS) throws ComException;
  @DeclDISPID(2024)  public Boolean getShowValue() throws ComException;
  @DeclDISPID(2024)  public void setShowValue(Boolean RHS) throws ComException;
  @DeclDISPID(2025)  public Boolean getShowPercentage() throws ComException;
  @DeclDISPID(2025)  public void setShowPercentage(Boolean RHS) throws ComException;
  @DeclDISPID(2026)  public Boolean getShowBubbleSize() throws ComException;
  @DeclDISPID(2026)  public void setShowBubbleSize(Boolean RHS) throws ComException;
  @DeclDISPID(2027)  public Object getSeparator() throws ComException;
  @DeclDISPID(2027)  public void setSeparator(Object RHS) throws ComException;
  @DeclDISPID(1610743863)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(2031)  public void setFormula(String pbstr) throws ComException;
  @DeclDISPID(2031)  public String getFormula() throws ComException;
  @DeclDISPID(2032)  public void setFormulaR1C1(String pbstr) throws ComException;
  @DeclDISPID(2032)  public String getFormulaR1C1() throws ComException;
  @DeclDISPID(2033)  public void setFormulaLocal(String pbstr) throws ComException;
  @DeclDISPID(2033)  public String getFormulaLocal() throws ComException;
  @DeclDISPID(2034)  public void setFormulaR1C1Local(String pbstr) throws ComException;
  @DeclDISPID(2034)  public String getFormulaR1C1Local() throws ComException;
  @DeclDISPID(2035)  public Boolean getShowRange() throws ComException;
  @DeclDISPID(2035)  public void setShowRange(Boolean RHS) throws ComException;
  @DeclDISPID(2036)  public Double getHeight() throws ComException;
  @DeclDISPID(2036)  public void setHeight(Double pHeight) throws ComException;
  @DeclDISPID(2037)  public Double getWidth() throws ComException;
  @DeclDISPID(2037)  public void setWidth(Double pWidth) throws ComException;
}
