/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * LegendEntry.
 * 
 */
@CoInterface(guid="{000C171A-0000-0000-C000-000000000046}")
public interface LegendEntry extends IDispatch {
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(117)  public Object Delete() throws ComException;
  @DeclDISPID(146)  public ChartFont getFont() throws ComException;
  @DeclDISPID(486)  public Integer getIndex() throws ComException;
  @DeclDISPID(174)  public IMsoLegendKey getLegendKey() throws ComException;
  @DeclDISPID(235)  public Object Select() throws ComException;
  @DeclDISPID(1525)  public Object getAutoScaleFont() throws ComException;
  @DeclDISPID(1525)  public void setAutoScaleFont(Object RHS) throws ComException;
  @DeclDISPID(127)  public Double getLeft() throws ComException;
  @DeclDISPID(126)  public Double getTop() throws ComException;
  @DeclDISPID(122)  public Double getWidth() throws ComException;
  @DeclDISPID(123)  public Double getHeight() throws ComException;
  @DeclDISPID(1610743820)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
}
