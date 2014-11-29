/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoChartData.
 * 
 */
@CoInterface(guid="{000C172F-0000-0000-C000-000000000046}")
public interface IMsoChartData extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getWorkbook() throws ComException;
  @DeclDISPID(1610743809)  public void Activate() throws ComException;
  @DeclDISPID(1610743810)  public Boolean getIsLinked() throws ComException;
  @DeclDISPID(1610743811)  public void BreakLink() throws ComException;
  @DeclDISPID(1610743812)  public void ActivateChartDataWindow() throws ComException;
}
