/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Rules.
 * 
 */
@CoInterface(guid="{000630CC-0000-0000-C000-000000000046}")
public interface _Rules extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public _Rule Item(Object Index) throws ComException;
  @DeclDISPID(64266)  public Rule Create(String Name, OlRuleType RuleType) throws ComException;
  @DeclDISPID(61512)  public void Save(Object ShowProgress) throws ComException;
  @DeclDISPID(82)  public void Remove(Object Index) throws ComException;
  @DeclDISPID(64533)  public Boolean getIsRssRulesProcessingEnabled() throws ComException;
  @DeclDISPID(64533)  public void setIsRssRulesProcessingEnabled(Boolean value) throws ComException;
}
