/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _MoveOrCopyRuleAction.
 * 
 */
@CoInterface(guid="{000630D0-0000-0000-C000-000000000046}")
public interface _MoveOrCopyRuleAction extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(103)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(103)  public void setEnabled(final Boolean value) throws ComException;
  @DeclDISPID(64271)  public OlRuleActionType getActionType() throws ComException;
  @DeclDISPID(64273)  public MAPIFolder getFolder() throws ComException;
  @DeclDISPID(64273)  public void setFolder(final MAPIFolder value) throws ComException;
}
