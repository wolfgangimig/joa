/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoDataTable.
 * 
 */
@CoInterface(guid="{000C1711-0000-0000-C000-000000000046}")
public interface IMsoDataTable extends IDispatch {
  @DeclDISPID(1610743808)  public void setShowLegendKey(Boolean value) throws ComException;
  @DeclDISPID(1610743808)  public Boolean getShowLegendKey() throws ComException;
  @DeclDISPID(1610743810)  public void setHasBorderHorizontal(Boolean value) throws ComException;
  @DeclDISPID(1610743810)  public Boolean getHasBorderHorizontal() throws ComException;
  @DeclDISPID(1610743812)  public void setHasBorderVertical(Boolean value) throws ComException;
  @DeclDISPID(1610743812)  public Boolean getHasBorderVertical() throws ComException;
  @DeclDISPID(1610743814)  public void setHasBorderOutline(Boolean value) throws ComException;
  @DeclDISPID(1610743814)  public Boolean getHasBorderOutline() throws ComException;
  @DeclDISPID(1610743816)  public IMsoBorder getBorder() throws ComException;
  @DeclDISPID(1610743817)  public ChartFont getFont() throws ComException;
  @DeclDISPID(1610743818)  public void Select() throws ComException;
  @DeclDISPID(1610743819)  public void Delete() throws ComException;
  @DeclDISPID(1610743820)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610743821)  public Object getAutoScaleFont() throws ComException;
  @DeclDISPID(1610743821)  public void setAutoScaleFont(Object value) throws ComException;
  @DeclDISPID(1610743823)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
}
