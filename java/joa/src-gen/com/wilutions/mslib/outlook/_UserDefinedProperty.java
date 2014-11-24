/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _UserDefinedProperty.
 * 
 */
@CoInterface(guid="{0006305C-0000-0000-C000-000000000046}")
public interface _UserDefinedProperty extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(103)  public String getFormula() throws ComException;
  @DeclDISPID(112)  public String getName() throws ComException;
  @DeclDISPID(109)  public OlUserPropertyType getType() throws ComException;
  @DeclDISPID(64039)  public Integer getDisplayFormat() throws ComException;
  @DeclDISPID(64523)  public void Delete() throws ComException;
}
