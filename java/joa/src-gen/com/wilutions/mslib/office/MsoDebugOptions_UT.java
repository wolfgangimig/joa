/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoDebugOptions_UT.
 * 
 */
@CoInterface(guid="{000C038B-0000-0000-C000-000000000046}")
public interface MsoDebugOptions_UT extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public String getName() throws ComException;
  @DeclDISPID(1)  public String getCollectionName() throws ComException;
  @DeclDISPID(2)  public MsoDebugOptions_UTRunResult Run() throws ComException;
}
