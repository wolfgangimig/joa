/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoLegend.
 * 
 */
@CoInterface(guid="{000C1710-0000-0000-C000-000000000046}")
public interface IMsoLegend extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(110)  public String getName() throws ComException;
  @DeclDISPID(235)  public Object Select() throws ComException;
  @DeclDISPID(128)  public IMsoBorder getBorder() throws ComException;
  @DeclDISPID(117)  public Object Delete() throws ComException;
  @DeclDISPID(146)  public ChartFont getFont() throws ComException;
  @DeclDISPID(173)  public IDispatch LegendEntries(final Object Index) throws ComException;
  @DeclDISPID(133)  public XlLegendPosition getPosition() throws ComException;
  @DeclDISPID(133)  public void setPosition(final XlLegendPosition value) throws ComException;
  @DeclDISPID(103)  public Boolean getShadow() throws ComException;
  @DeclDISPID(103)  public void setShadow(final Boolean value) throws ComException;
  @DeclDISPID(111)  public Object Clear() throws ComException;
  @DeclDISPID(123)  public Double getHeight() throws ComException;
  @DeclDISPID(123)  public void setHeight(final Double value) throws ComException;
  @DeclDISPID(129)  public IMsoInterior getInterior() throws ComException;
  @DeclDISPID(1663)  public ChartFillFormat getFill() throws ComException;
  @DeclDISPID(127)  public Double getLeft() throws ComException;
  @DeclDISPID(127)  public void setLeft(final Double value) throws ComException;
  @DeclDISPID(126)  public Double getTop() throws ComException;
  @DeclDISPID(126)  public void setTop(final Double value) throws ComException;
  @DeclDISPID(122)  public Double getWidth() throws ComException;
  @DeclDISPID(122)  public void setWidth(final Double value) throws ComException;
  @DeclDISPID(1525)  public Object getAutoScaleFont() throws ComException;
  @DeclDISPID(1525)  public void setAutoScaleFont(final Object value) throws ComException;
  @DeclDISPID(2418)  public Boolean getIncludeInLayout() throws ComException;
  @DeclDISPID(2418)  public void setIncludeInLayout(final Boolean value) throws ComException;
  @DeclDISPID(1610743834)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
}
