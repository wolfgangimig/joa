/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoHiLoLines.
 * 
 */
@CoInterface(guid="{000C172E-0000-0000-C000-000000000046}")
public interface IMsoHiLoLines extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610743809)  public String getName() throws ComException;
  @DeclDISPID(1610743810)  public void Select() throws ComException;
  @DeclDISPID(1610743811)  public IMsoBorder getBorder() throws ComException;
  @DeclDISPID(1610743812)  public void Delete() throws ComException;
  @DeclDISPID(1610743813)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
}
