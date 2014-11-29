/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SmartDocument.
 * 
 */
@CoInterface(guid="{000C0377-0000-0000-C000-000000000046}")
public interface SmartDocument extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public String getSolutionID() throws ComException;
  @DeclDISPID(1)  public void setSolutionID(String value) throws ComException;
  @DeclDISPID(2)  public String getSolutionURL() throws ComException;
  @DeclDISPID(2)  public void setSolutionURL(String value) throws ComException;
  @DeclDISPID(3)  public void PickSolution(Boolean ConsiderAllSchemas) throws ComException;
  @DeclDISPID(4)  public void RefreshPane() throws ComException;
}
