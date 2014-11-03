/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoDebugOptions_UTManager.
 * 
 */
@CoInterface(guid="{000C0389-0000-0000-C000-000000000046}")
public interface MsoDebugOptions_UTManager extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public MsoDebugOptions_UTs getUnitTests() throws ComException;
  @DeclDISPID(1)  public void NotifyStartOfTestSuiteRun() throws ComException;
  @DeclDISPID(2)  public void NotifyEndOfTestSuiteRun() throws ComException;
  @DeclDISPID(3)  public Boolean getReportErrors() throws ComException;
  @DeclDISPID(3)  public void setReportErrors(Boolean value) throws ComException;
}
