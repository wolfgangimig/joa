/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoChartTitle.
 * 
 */
@CoInterface(guid="{000C170F-0000-0000-C000-000000000046}")
public interface IMsoChartTitle extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public void setCaption(final String value) throws ComException;
  @DeclDISPID(1610743808)  public String getCaption() throws ComException;
  @DeclDISPID(1610743810)  public IMsoCharacters getCharacters(final Object Start, final Object Length) throws ComException;
  @DeclDISPID(1610743811)  public ChartFont getFont() throws ComException;
  @DeclDISPID(1610743812)  public void setHorizontalAlignment(final Object value) throws ComException;
  @DeclDISPID(1610743812)  public Object getHorizontalAlignment() throws ComException;
  @DeclDISPID(1610743814)  public Double getLeft() throws ComException;
  @DeclDISPID(1610743814)  public void setLeft(final Double value) throws ComException;
  @DeclDISPID(1610743816)  public void setOrientation(final Object value) throws ComException;
  @DeclDISPID(1610743816)  public Object getOrientation() throws ComException;
  @DeclDISPID(1610743818)  public Boolean getShadow() throws ComException;
  @DeclDISPID(1610743818)  public void setShadow(final Boolean value) throws ComException;
  @DeclDISPID(1610743820)  public void setText(final String value) throws ComException;
  @DeclDISPID(1610743820)  public String getText() throws ComException;
  @DeclDISPID(1610743822)  public Double getTop() throws ComException;
  @DeclDISPID(1610743822)  public void setTop(final Double value) throws ComException;
  @DeclDISPID(1610743824)  public void setVerticalAlignment(final Object value) throws ComException;
  @DeclDISPID(1610743824)  public Object getVerticalAlignment() throws ComException;
  @DeclDISPID(1610743826)  public Integer getReadingOrder() throws ComException;
  @DeclDISPID(1610743826)  public void setReadingOrder(final Integer value) throws ComException;
  @DeclDISPID(1610743828)  public void setAutoScaleFont(final Object value) throws ComException;
  @DeclDISPID(1610743828)  public Object getAutoScaleFont() throws ComException;
  @DeclDISPID(1610743830)  public IMsoInterior getInterior() throws ComException;
  @DeclDISPID(1610743831)  public ChartFillFormat getFill() throws ComException;
  @DeclDISPID(1610743832)  public Object Delete() throws ComException;
  @DeclDISPID(1610743833)  public IMsoBorder getBorder() throws ComException;
  @DeclDISPID(1610743834)  public String getName() throws ComException;
  @DeclDISPID(1610743835)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610743836)  public Object Select() throws ComException;
  @DeclDISPID(2418)  public Boolean getIncludeInLayout() throws ComException;
  @DeclDISPID(2418)  public void setIncludeInLayout(final Boolean value) throws ComException;
  @DeclDISPID(1671)  public XlChartElementPosition getPosition() throws ComException;
  @DeclDISPID(1671)  public void setPosition(final XlChartElementPosition value) throws ComException;
  @DeclDISPID(1610743841)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(1610743842)  public Double getHeight() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610743845)  public Double getWidth() throws ComException;
  @DeclDISPID(1610743846)  public void setFormula(final String value) throws ComException;
  @DeclDISPID(1610743846)  public String getFormula() throws ComException;
  @DeclDISPID(1610743848)  public void setFormulaR1C1(final String value) throws ComException;
  @DeclDISPID(1610743848)  public String getFormulaR1C1() throws ComException;
  @DeclDISPID(1610743850)  public void setFormulaLocal(final String value) throws ComException;
  @DeclDISPID(1610743850)  public String getFormulaLocal() throws ComException;
  @DeclDISPID(1610743852)  public void setFormulaR1C1Local(final String value) throws ComException;
  @DeclDISPID(1610743852)  public String getFormulaR1C1Local() throws ComException;
}
