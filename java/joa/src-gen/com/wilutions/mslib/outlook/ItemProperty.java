/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * ItemProperty.
 * 
 */
@CoInterface(guid="{000630A7-0000-0000-C000-000000000046}")
public interface ItemProperty extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(112)  public String getName() throws ComException;
  @DeclDISPID(109)  public OlUserPropertyType getType() throws ComException;
  @DeclDISPID(0)  public Object getValue() throws ComException;
  @DeclDISPID(0)  public void setValue(Object value) throws ComException;
  @DeclDISPID(64008)  public Boolean getIsUserProperty() throws ComException;
}
