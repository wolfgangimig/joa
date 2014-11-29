/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoDebugOptions.
 * 
 */
@CoInterface(guid="{000C035A-0000-0000-C000-000000000046}")
public interface MsoDebugOptions extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(5)  public Boolean getOutputToDebugger() throws ComException;
  @DeclDISPID(5)  public void setOutputToDebugger(Boolean value) throws ComException;
  @DeclDISPID(6)  public Boolean getOutputToFile() throws ComException;
  @DeclDISPID(6)  public void setOutputToFile(Boolean value) throws ComException;
  @DeclDISPID(7)  public Boolean getOutputToMessageBox() throws ComException;
  @DeclDISPID(7)  public void setOutputToMessageBox(Boolean value) throws ComException;
  @DeclDISPID(8)  public Object getUnitTestManager() throws ComException;
  @DeclDISPID(9)  public void AddIgnoredAssertTag(String bstrTagToIgnore) throws ComException;
  @DeclDISPID(10)  public void RemoveIgnoredAssertTag(String bstrTagToIgnore) throws ComException;
}
