/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IWorkingHours.
 * IWorkingHours Interface 
 */
@CoInterface(guid="{53D014C1-54DB-42B3-9DFD-8E231EF2C356}")
public interface IWorkingHours extends IDispatch {
  @DeclDISPID(1610743808)  public String getEmailAddress() throws ComException;
  @DeclDISPID(1610743809)  public IWorkingPeriod[] getWorkingPeriods() throws ComException;
}
