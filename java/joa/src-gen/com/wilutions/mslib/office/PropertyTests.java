/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * PropertyTests.
 * 
 */
@CoInterface(guid="{000C0334-0000-0000-C000-000000000046}")
public interface PropertyTests extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public PropertyTest getItem(final Integer Index) throws ComException;
  @DeclDISPID(4)  public Integer getCount() throws ComException;
  @DeclDISPID(5)  public void Add(final String Name, final MsoCondition Condition, final Object Value, final Object SecondValue, final MsoConnector Connector) throws ComException;
  @DeclDISPID(6)  public void Remove(final Integer Index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
