/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoLeaderLines.
 * 
 */
@CoInterface(guid="{000C1723-0000-0000-C000-000000000046}")
public interface IMsoLeaderLines extends IDispatch {
  @DeclDISPID(235)  public void Select() throws ComException;
  @DeclDISPID(128)  public IMsoBorder getBorder() throws ComException;
  @DeclDISPID(117)  public void Delete() throws ComException;
  @DeclDISPID(1610743811)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
}
