/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _UserDefinedProperties.
 * 
 */
@CoInterface(guid="{00063047-0000-0000-C000-000000000046}")
public interface _UserDefinedProperties extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public _UserDefinedProperty Item(Object Index) throws ComException;
  @DeclDISPID(102)  public UserDefinedProperty Add(String Name, OlUserPropertyType Type, Object DisplayFormat, Object Formula) throws ComException;
  @DeclDISPID(103)  public UserDefinedProperty Find(String Name) throws ComException;
  @DeclDISPID(82)  public void Remove(Integer Index) throws ComException;
  @DeclDISPID(64069)  public void Refresh() throws ComException;
}
