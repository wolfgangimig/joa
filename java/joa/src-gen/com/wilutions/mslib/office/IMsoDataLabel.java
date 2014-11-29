/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoDataLabel.
 * 
 */
@CoInterface(guid="{000C1720-0000-0000-C000-000000000046}")
public interface IMsoDataLabel extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(110)  public String getName() throws ComException;
  @DeclDISPID(235)  public Object Select() throws ComException;
  @DeclDISPID(128)  public IMsoBorder getBorder() throws ComException;
  @DeclDISPID(117)  public Object Delete() throws ComException;
  @DeclDISPID(129)  public IMsoInterior getInterior() throws ComException;
  @DeclDISPID(1663)  public ChartFillFormat getFill() throws ComException;
  @DeclDISPID(139)  public String getCaption() throws ComException;
  @DeclDISPID(139)  public void setCaption(final String RHS) throws ComException;
  @DeclDISPID(603)  public IMsoCharacters getCharacters(final Object Start, final Object Length) throws ComException;
  @DeclDISPID(146)  public ChartFont getFont() throws ComException;
  @DeclDISPID(136)  public Object getHorizontalAlignment() throws ComException;
  @DeclDISPID(136)  public void setHorizontalAlignment(final Object RHS) throws ComException;
  @DeclDISPID(127)  public Double getLeft() throws ComException;
  @DeclDISPID(127)  public void setLeft(final Double RHS) throws ComException;
  @DeclDISPID(134)  public Object getOrientation() throws ComException;
  @DeclDISPID(134)  public void setOrientation(final Object RHS) throws ComException;
  @DeclDISPID(103)  public Boolean getShadow() throws ComException;
  @DeclDISPID(103)  public void setShadow(final Boolean RHS) throws ComException;
  @DeclDISPID(138)  public String getText() throws ComException;
  @DeclDISPID(138)  public void setText(final String RHS) throws ComException;
  @DeclDISPID(126)  public Double getTop() throws ComException;
  @DeclDISPID(126)  public void setTop(final Double RHS) throws ComException;
  @DeclDISPID(137)  public Object getVerticalAlignment() throws ComException;
  @DeclDISPID(137)  public void setVerticalAlignment(final Object RHS) throws ComException;
  @DeclDISPID(975)  public Integer getReadingOrder() throws ComException;
  @DeclDISPID(975)  public void setReadingOrder(final Integer RHS) throws ComException;
  @DeclDISPID(1525)  public Object getAutoScaleFont() throws ComException;
  @DeclDISPID(1525)  public void setAutoScaleFont(final Object RHS) throws ComException;
  @DeclDISPID(135)  public Boolean getAutoText() throws ComException;
  @DeclDISPID(135)  public void setAutoText(final Boolean RHS) throws ComException;
  @DeclDISPID(193)  public String getNumberFormat() throws ComException;
  @DeclDISPID(193)  public void setNumberFormat(final String RHS) throws ComException;
  @DeclDISPID(194)  public Boolean getNumberFormatLinked() throws ComException;
  @DeclDISPID(194)  public void setNumberFormatLinked(final Boolean RHS) throws ComException;
  @DeclDISPID(1097)  public Object getNumberFormatLocal() throws ComException;
  @DeclDISPID(1097)  public void setNumberFormatLocal(final Object RHS) throws ComException;
  @DeclDISPID(171)  public Boolean getShowLegendKey() throws ComException;
  @DeclDISPID(171)  public void setShowLegendKey(final Boolean RHS) throws ComException;
  @DeclDISPID(108)  public Object getType() throws ComException;
  @DeclDISPID(108)  public void setType(final Object RHS) throws ComException;
  @DeclDISPID(133)  public XlDataLabelPosition getPosition() throws ComException;
  @DeclDISPID(133)  public void setPosition(final XlDataLabelPosition RHS) throws ComException;
  @DeclDISPID(2022)  public Boolean getShowSeriesName() throws ComException;
  @DeclDISPID(2022)  public void setShowSeriesName(final Boolean RHS) throws ComException;
  @DeclDISPID(2023)  public Boolean getShowCategoryName() throws ComException;
  @DeclDISPID(2023)  public void setShowCategoryName(final Boolean RHS) throws ComException;
  @DeclDISPID(2024)  public Boolean getShowValue() throws ComException;
  @DeclDISPID(2024)  public void setShowValue(final Boolean RHS) throws ComException;
  @DeclDISPID(2025)  public Boolean getShowPercentage() throws ComException;
  @DeclDISPID(2025)  public void setShowPercentage(final Boolean RHS) throws ComException;
  @DeclDISPID(2026)  public Boolean getShowBubbleSize() throws ComException;
  @DeclDISPID(2026)  public void setShowBubbleSize(final Boolean RHS) throws ComException;
  @DeclDISPID(2027)  public Object getSeparator() throws ComException;
  @DeclDISPID(2027)  public void setSeparator(final Object RHS) throws ComException;
  @DeclDISPID(1610743863)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(2031)  public void setFormula(final String pbstr) throws ComException;
  @DeclDISPID(2031)  public String getFormula() throws ComException;
  @DeclDISPID(2032)  public void setFormulaR1C1(final String pbstr) throws ComException;
  @DeclDISPID(2032)  public String getFormulaR1C1() throws ComException;
  @DeclDISPID(2033)  public void setFormulaLocal(final String pbstr) throws ComException;
  @DeclDISPID(2033)  public String getFormulaLocal() throws ComException;
  @DeclDISPID(2034)  public void setFormulaR1C1Local(final String pbstr) throws ComException;
  @DeclDISPID(2034)  public String getFormulaR1C1Local() throws ComException;
  @DeclDISPID(2035)  public Boolean getShowRange() throws ComException;
  @DeclDISPID(2035)  public void setShowRange(final Boolean RHS) throws ComException;
  @DeclDISPID(2036)  public Double getHeight() throws ComException;
  @DeclDISPID(2036)  public void setHeight(final Double pHeight) throws ComException;
  @DeclDISPID(2037)  public Double getWidth() throws ComException;
  @DeclDISPID(2037)  public void setWidth(final Double pWidth) throws ComException;
}
