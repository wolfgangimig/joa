/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoChartArea.
 * 
 */
@CoInterface(guid="{000C1728-0000-0000-C000-000000000046}")
public interface IMsoChartArea extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(110)  public String getName() throws ComException;
  @DeclDISPID(235)  public Object Select() throws ComException;
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(128)  public IMsoBorder getBorder() throws ComException;
  @DeclDISPID(111)  public Object Clear() throws ComException;
  @DeclDISPID(113)  public Object ClearContents() throws ComException;
  @DeclDISPID(551)  public Object Copy() throws ComException;
  @DeclDISPID(146)  public ChartFont getFont() throws ComException;
  @DeclDISPID(103)  public Boolean getShadow() throws ComException;
  @DeclDISPID(103)  public void setShadow(Boolean value) throws ComException;
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
  @DeclDISPID(1525)  public Object getAutoScaleFont() throws ComException;
  @DeclDISPID(1525)  public void setAutoScaleFont(Object value) throws ComException;
  @DeclDISPID(1610743831)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(1610743832)  public Boolean getRoundedCorners() throws ComException;
  @DeclDISPID(1610743832)  public void setRoundedCorners(Boolean value) throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
}
