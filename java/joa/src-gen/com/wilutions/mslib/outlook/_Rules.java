/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Rules.
 * 
 */
@CoInterface(guid="{000630CC-0000-0000-C000-000000000046}")
public interface _Rules extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public _Rule Item(final Object Index) throws ComException;
  @DeclDISPID(64266)  public Rule Create(final String Name, final OlRuleType RuleType) throws ComException;
  @DeclDISPID(61512)  public void Save(final Object ShowProgress) throws ComException;
  @DeclDISPID(82)  public void Remove(final Object Index) throws ComException;
  @DeclDISPID(64533)  public Boolean getIsRssRulesProcessingEnabled() throws ComException;
  @DeclDISPID(64533)  public void setIsRssRulesProcessingEnabled(final Boolean value) throws ComException;
}
