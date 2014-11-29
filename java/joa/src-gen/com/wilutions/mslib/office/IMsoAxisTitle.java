/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoAxisTitle.
 * 
 */
@CoInterface(guid="{ABFA087C-F703-4D53-946E-37FF82B2C994}")
public interface IMsoAxisTitle extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public void setCaption(String value) throws ComException;
  @DeclDISPID(1610743808)  public String getCaption() throws ComException;
  @DeclDISPID(1610743810)  public IMsoCharacters getCharacters(Object Start, Object Length) throws ComException;
  @DeclDISPID(1610743811)  public ChartFont getFont() throws ComException;
  @DeclDISPID(1610743812)  public void setHorizontalAlignment(Object value) throws ComException;
  @DeclDISPID(1610743812)  public Object getHorizontalAlignment() throws ComException;
  @DeclDISPID(1610743814)  public Double getLeft() throws ComException;
  @DeclDISPID(1610743814)  public void setLeft(Double value) throws ComException;
  @DeclDISPID(1610743816)  public void setOrientation(Object value) throws ComException;
  @DeclDISPID(1610743816)  public Object getOrientation() throws ComException;
  @DeclDISPID(1610743818)  public Boolean getShadow() throws ComException;
  @DeclDISPID(1610743818)  public void setShadow(Boolean value) throws ComException;
  @DeclDISPID(1610743820)  public void setText(String value) throws ComException;
  @DeclDISPID(1610743820)  public String getText() throws ComException;
  @DeclDISPID(1610743822)  public Double getTop() throws ComException;
  @DeclDISPID(1610743822)  public void setTop(Double value) throws ComException;
  @DeclDISPID(1610743824)  public void setVerticalAlignment(Object value) throws ComException;
  @DeclDISPID(1610743824)  public Object getVerticalAlignment() throws ComException;
  @DeclDISPID(1610743826)  public Integer getReadingOrder() throws ComException;
  @DeclDISPID(1610743826)  public void setReadingOrder(Integer value) throws ComException;
  @DeclDISPID(1610743828)  public void setAutoScaleFont(Object value) throws ComException;
  @DeclDISPID(1610743828)  public Object getAutoScaleFont() throws ComException;
  @DeclDISPID(1610743830)  public IMsoInterior getInterior() throws ComException;
  @DeclDISPID(1610743831)  public ChartFillFormat getFill() throws ComException;
  @DeclDISPID(1610743832)  public Object Delete() throws ComException;
  @DeclDISPID(1610743833)  public IMsoBorder getBorder() throws ComException;
  @DeclDISPID(1610743834)  public String getName() throws ComException;
  @DeclDISPID(1610743835)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610743836)  public Object Select() throws ComException;
  @DeclDISPID(2418)  public Boolean getIncludeInLayout() throws ComException;
  @DeclDISPID(2418)  public void setIncludeInLayout(Boolean value) throws ComException;
  @DeclDISPID(1671)  public XlChartElementPosition getPosition() throws ComException;
  @DeclDISPID(1671)  public void setPosition(XlChartElementPosition value) throws ComException;
  @DeclDISPID(1610743841)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(1610743842)  public Double getHeight() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610743845)  public Double getWidth() throws ComException;
  @DeclDISPID(1610743846)  public void setFormula(String value) throws ComException;
  @DeclDISPID(1610743846)  public String getFormula() throws ComException;
  @DeclDISPID(1610743848)  public void setFormulaR1C1(String value) throws ComException;
  @DeclDISPID(1610743848)  public String getFormulaR1C1() throws ComException;
  @DeclDISPID(1610743850)  public void setFormulaLocal(String value) throws ComException;
  @DeclDISPID(1610743850)  public String getFormulaLocal() throws ComException;
  @DeclDISPID(1610743852)  public void setFormulaR1C1Local(String value) throws ComException;
  @DeclDISPID(1610743852)  public String getFormulaR1C1Local() throws ComException;
}
