/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoTickLabels.
 * 
 */
@CoInterface(guid="{000C1726-0000-0000-C000-000000000046}")
public interface IMsoTickLabels extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610743809)  public Object Delete() throws ComException;
  @DeclDISPID(1610743810)  public ChartFont getFont() throws ComException;
  @DeclDISPID(1610743811)  public String getName() throws ComException;
  @DeclDISPID(1610743812)  public String getNumberFormat() throws ComException;
  @DeclDISPID(1610743812)  public void setNumberFormat(String value) throws ComException;
  @DeclDISPID(1610743814)  public Boolean getNumberFormatLinked() throws ComException;
  @DeclDISPID(1610743814)  public void setNumberFormatLinked(Boolean value) throws ComException;
  @DeclDISPID(1610743816)  public Object getNumberFormatLocal() throws ComException;
  @DeclDISPID(1610743816)  public void setNumberFormatLocal(Object value) throws ComException;
  @DeclDISPID(1610743818)  public XlTickLabelOrientation getOrientation() throws ComException;
  @DeclDISPID(1610743818)  public void setOrientation(XlTickLabelOrientation value) throws ComException;
  @DeclDISPID(1610743820)  public Object Select() throws ComException;
  @DeclDISPID(1610743821)  public Integer getReadingOrder() throws ComException;
  @DeclDISPID(1610743821)  public void setReadingOrder(Integer value) throws ComException;
  @DeclDISPID(1610743823)  public Object getAutoScaleFont() throws ComException;
  @DeclDISPID(1610743823)  public void setAutoScaleFont(Object value) throws ComException;
  @DeclDISPID(1610743825)  public Integer getDepth() throws ComException;
  @DeclDISPID(1610743826)  public Integer getOffset() throws ComException;
  @DeclDISPID(1610743826)  public void setOffset(Integer value) throws ComException;
  @DeclDISPID(1610743828)  public Integer getAlignment() throws ComException;
  @DeclDISPID(1610743828)  public void setAlignment(Integer value) throws ComException;
  @DeclDISPID(1610743830)  public Boolean getMultiLevel() throws ComException;
  @DeclDISPID(1610743830)  public void setMultiLevel(Boolean value) throws ComException;
  @DeclDISPID(1610743832)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
}
