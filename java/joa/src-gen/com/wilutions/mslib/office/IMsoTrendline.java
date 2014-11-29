/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoTrendline.
 * 
 */
@CoInterface(guid="{000C170E-0000-0000-C000-000000000046}")
public interface IMsoTrendline extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(185)  public Double getBackward() throws ComException;
  @DeclDISPID(185)  public void setBackward(Double RHS) throws ComException;
  @DeclDISPID(128)  public IMsoBorder getBorder() throws ComException;
  @DeclDISPID(112)  public Object ClearFormats() throws ComException;
  @DeclDISPID(158)  public IMsoDataLabel getDataLabel() throws ComException;
  @DeclDISPID(117)  public Object Delete() throws ComException;
  @DeclDISPID(190)  public Boolean getDisplayEquation() throws ComException;
  @DeclDISPID(190)  public void setDisplayEquation(Boolean RHS) throws ComException;
  @DeclDISPID(189)  public Boolean getDisplayRSquared() throws ComException;
  @DeclDISPID(189)  public void setDisplayRSquared(Boolean RHS) throws ComException;
  @DeclDISPID(191)  public Double getForward() throws ComException;
  @DeclDISPID(191)  public void setForward(Double RHS) throws ComException;
  @DeclDISPID(486)  public Integer getIndex() throws ComException;
  @DeclDISPID(186)  public Double getIntercept() throws ComException;
  @DeclDISPID(186)  public void setIntercept(Double RHS) throws ComException;
  @DeclDISPID(187)  public Boolean getInterceptIsAuto() throws ComException;
  @DeclDISPID(187)  public void setInterceptIsAuto(Boolean RHS) throws ComException;
  @DeclDISPID(110)  public String getName() throws ComException;
  @DeclDISPID(110)  public void setName(String RHS) throws ComException;
  @DeclDISPID(188)  public Boolean getNameIsAuto() throws ComException;
  @DeclDISPID(188)  public void setNameIsAuto(Boolean RHS) throws ComException;
  @DeclDISPID(192)  public Integer getOrder() throws ComException;
  @DeclDISPID(192)  public void setOrder(Integer RHS) throws ComException;
  @DeclDISPID(184)  public Integer getPeriod() throws ComException;
  @DeclDISPID(184)  public void setPeriod(Integer RHS) throws ComException;
  @DeclDISPID(235)  public Object Select() throws ComException;
  @DeclDISPID(108)  public XlTrendlineType getType() throws ComException;
  @DeclDISPID(108)  public void setType(XlTrendlineType RHS) throws ComException;
  @DeclDISPID(1610743837)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(2650)  public Double getBackward2() throws ComException;
  @DeclDISPID(2650)  public void setBackward2(Double RHS) throws ComException;
  @DeclDISPID(2651)  public Double getForward2() throws ComException;
  @DeclDISPID(2651)  public void setForward2(Double RHS) throws ComException;
}
