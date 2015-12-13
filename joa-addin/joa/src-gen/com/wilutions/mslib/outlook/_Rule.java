/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Rule.
 * 
 */
@CoInterface(guid="{000630CD-0000-0000-C000-000000000046}")
public interface _Rule extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(8450)  public String getName() throws ComException;
  @DeclDISPID(8450)  public void setName(final String value) throws ComException;
  @DeclDISPID(64267)  public Integer getExecutionOrder() throws ComException;
  @DeclDISPID(64267)  public void setExecutionOrder(final Integer value) throws ComException;
  @DeclDISPID(64268)  public OlRuleType getRuleType() throws ComException;
  @DeclDISPID(103)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(103)  public void setEnabled(final Boolean value) throws ComException;
  @DeclDISPID(64269)  public Boolean getIsLocalRule() throws ComException;
  @DeclDISPID(64270)  public void Execute(final Object ShowProgress, final Object Folder, final Object IncludeSubfolders, final Object RuleExecuteOption) throws ComException;
  @DeclDISPID(64272)  public RuleActions getActions() throws ComException;
  @DeclDISPID(64297)  public RuleConditions getConditions() throws ComException;
  @DeclDISPID(64307)  public RuleConditions getExceptions() throws ComException;
}
