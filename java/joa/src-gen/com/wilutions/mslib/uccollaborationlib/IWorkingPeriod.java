/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IWorkingPeriod.
 * IWorkingPeriod Interface 
 */
@CoInterface(guid="{339D28C6-3D1A-45D4-BA14-A56742749A43}")
public interface IWorkingPeriod extends IDispatch {
  @DeclDISPID(1610743808)  public java.util.Date getStartTime() throws ComException;
  @DeclDISPID(1610743809)  public java.util.Date getEndTime() throws ComException;
  @DeclDISPID(1610743810)  public DaysOfWeek getDays() throws ComException;
}
