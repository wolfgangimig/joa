/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _NavigationPane.
 * 
 */
@CoInterface(guid="{000630E6-0000-0000-C000-000000000046}")
public interface _NavigationPane extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(64436)  public Boolean getIsCollapsed() throws ComException;
  @DeclDISPID(64436)  public void setIsCollapsed(final Boolean value) throws ComException;
  @DeclDISPID(64437)  public NavigationModule getCurrentModule() throws ComException;
  @DeclDISPID(64437)  public void setCurrentModule(final NavigationModule value) throws ComException;
  @DeclDISPID(64438)  public Integer getDisplayedModuleCount() throws ComException;
  @DeclDISPID(64438)  public void setDisplayedModuleCount(final Integer value) throws ComException;
  @DeclDISPID(64439)  public NavigationModules getModules() throws ComException;
}
