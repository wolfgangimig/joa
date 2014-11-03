/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * PropertyTests.
 * 
 */
@CoInterface(guid="{000C0334-0000-0000-C000-000000000046}")
public interface PropertyTests extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public PropertyTest getItem(Integer Index) throws ComException;
  @DeclDISPID(4)  public Integer getCount() throws ComException;
  @DeclDISPID(5)  public void Add(String Name, MsoCondition Condition, Object Value, Object SecondValue, MsoConnector Connector) throws ComException;
  @DeclDISPID(6)  public void Remove(Integer Index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
