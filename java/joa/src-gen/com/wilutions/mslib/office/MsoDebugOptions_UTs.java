/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoDebugOptions_UTs.
 * 
 */
@CoInterface(guid="{000C038A-0000-0000-C000-000000000046}")
public interface MsoDebugOptions_UTs extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public MsoDebugOptions_UT getItem(Integer Index) throws ComException;
  @DeclDISPID(1)  public Integer getCount() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(2)  public MsoDebugOptions_UTs GetUnitTestsInCollection(String bstrCollectionName) throws ComException;
  @DeclDISPID(3)  public MsoDebugOptions_UT GetUnitTest(String bstrCollectionName, String bstrUnitTestName) throws ComException;
  @DeclDISPID(4)  public MsoDebugOptions_UTs GetMatchingUnitTestsInCollection(String bstrCollectionName, String bstrUnitTestNameFilter) throws ComException;
}
