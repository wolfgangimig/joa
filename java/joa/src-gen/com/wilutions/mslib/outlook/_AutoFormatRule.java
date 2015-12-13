/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _AutoFormatRule.
 * 
 */
@CoInterface(guid="{00063093-0000-0000-C000-000000000046}")
public interface _AutoFormatRule extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(8450)  public String getName() throws ComException;
  @DeclDISPID(8450)  public void setName(final String value) throws ComException;
  @DeclDISPID(64024)  public String getFilter() throws ComException;
  @DeclDISPID(64024)  public void setFilter(final String value) throws ComException;
  @DeclDISPID(103)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(103)  public void setEnabled(final Boolean value) throws ComException;
  @DeclDISPID(64023)  public ViewFont getFont() throws ComException;
  @DeclDISPID(64023)  public void setFont(final ViewFont value) throws ComException;
  @DeclDISPID(64062)  public Boolean getStandard() throws ComException;
}
