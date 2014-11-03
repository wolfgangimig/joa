/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoPlotArea.
 * 
 */
@CoInterface(guid="{000C1724-0000-0000-C000-000000000046}")
public interface IMsoPlotArea extends IDispatch {
  @DeclDISPID(110)  public String getName() throws ComException;
  @DeclDISPID(235)  public Object Select() throws ComException;
  @DeclDISPID(150)  public Dispatch getParent() throws ComException;
  @DeclDISPID(128)  public IMsoBorder getBorder() throws ComException;
  @DeclDISPID(112)  public Object ClearFormats() throws ComException;
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
  @DeclDISPID(1667)  public Double getInsideLeft() throws ComException;
  @DeclDISPID(1667)  public void setInsideLeft(Double value) throws ComException;
  @DeclDISPID(1668)  public Double getInsideTop() throws ComException;
  @DeclDISPID(1668)  public void setInsideTop(Double value) throws ComException;
  @DeclDISPID(1669)  public Double getInsideWidth() throws ComException;
  @DeclDISPID(1669)  public void setInsideWidth(Double value) throws ComException;
  @DeclDISPID(1670)  public Double getInsideHeight() throws ComException;
  @DeclDISPID(1670)  public void setInsideHeight(Double value) throws ComException;
  @DeclDISPID(1671)  public XlChartElementPosition getPosition() throws ComException;
  @DeclDISPID(1671)  public void setPosition(XlChartElementPosition value) throws ComException;
  @DeclDISPID(1610743833)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(148)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
}
