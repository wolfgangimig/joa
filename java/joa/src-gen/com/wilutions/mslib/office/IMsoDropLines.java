/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoDropLines.
 * 
 */
@CoInterface(guid="{000C172C-0000-0000-C000-000000000046}")
public interface IMsoDropLines extends IDispatch {
  @DeclDISPID(1610743808)  public String getName() throws ComException;
  @DeclDISPID(1610743809)  public void Select() throws ComException;
  @DeclDISPID(1610743810)  public Dispatch getParent() throws ComException;
  @DeclDISPID(1610743811)  public IMsoBorder getBorder() throws ComException;
  @DeclDISPID(1610743812)  public void Delete() throws ComException;
  @DeclDISPID(1610743813)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(148)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
}
