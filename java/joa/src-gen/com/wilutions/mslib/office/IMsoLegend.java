/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoLegend.
 * 
 */
@CoInterface(guid="{000C1710-0000-0000-C000-000000000046}")
public interface IMsoLegend extends IDispatch {
  @DeclDISPID(150)  public Dispatch getParent() throws ComException;
  @DeclDISPID(110)  public String getName() throws ComException;
  @DeclDISPID(235)  public Object Select() throws ComException;
  @DeclDISPID(128)  public IMsoBorder getBorder() throws ComException;
  @DeclDISPID(117)  public Object Delete() throws ComException;
  @DeclDISPID(146)  public ChartFont getFont() throws ComException;
  @DeclDISPID(173)  public Dispatch LegendEntries(Object Index) throws ComException;
  @DeclDISPID(133)  public XlLegendPosition getPosition() throws ComException;
  @DeclDISPID(133)  public void setPosition(XlLegendPosition value) throws ComException;
  @DeclDISPID(103)  public Boolean getShadow() throws ComException;
  @DeclDISPID(103)  public void setShadow(Boolean value) throws ComException;
  @DeclDISPID(111)  public Object Clear() throws ComException;
  @DeclDISPID(123)  public Double getHeight() throws ComException;
  @DeclDISPID(123)  public void setHeight(Double value) throws ComException;
  @DeclDISPID(129)  public IMsoInterior getInterior() throws ComException;
  @DeclDISPID(1663)  public ChartFillFormat getFill() throws ComException;
  @DeclDISPID(127)  public Double getLeft() throws ComException;
  @DeclDISPID(127)  public void setLeft(Double value) throws ComException;
  @DeclDISPID(126)  public Double getTop() throws ComException;
  @DeclDISPID(126)  public void setTop(Double value) throws ComException;
  @DeclDISPID(122)  public Double getWidth() throws ComException;
  @DeclDISPID(122)  public void setWidth(Double value) throws ComException;
  @DeclDISPID(1525)  public Object getAutoScaleFont() throws ComException;
  @DeclDISPID(1525)  public void setAutoScaleFont(Object value) throws ComException;
  @DeclDISPID(2418)  public Boolean getIncludeInLayout() throws ComException;
  @DeclDISPID(2418)  public void setIncludeInLayout(Boolean value) throws ComException;
  @DeclDISPID(1610743834)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(148)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
}
