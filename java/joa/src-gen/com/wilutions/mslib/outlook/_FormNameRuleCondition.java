/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _FormNameRuleCondition.
 * 
 */
@CoInterface(guid="{000630DD-0000-0000-C000-000000000046}")
public interface _FormNameRuleCondition extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(103)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(103)  public void setEnabled(final Boolean value) throws ComException;
  @DeclDISPID(64298)  public OlRuleConditionType getConditionType() throws ComException;
  @DeclDISPID(64326)  public Object getFormName() throws ComException;
  @DeclDISPID(64326)  public void setFormName(final Object value) throws ComException;
}
