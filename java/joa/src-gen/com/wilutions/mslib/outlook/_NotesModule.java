/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _NotesModule.
 * 
 */
@CoInterface(guid="{000630EE-0000-0000-C000-000000000046}")
public interface _NotesModule extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(64441)  public OlNavigationModuleType getNavigationModuleType() throws ComException;
  @DeclDISPID(8450)  public String getName() throws ComException;
  @DeclDISPID(64442)  public Integer getPosition() throws ComException;
  @DeclDISPID(64442)  public void setPosition(Integer value) throws ComException;
  @DeclDISPID(64443)  public Boolean getVisible() throws ComException;
  @DeclDISPID(64443)  public void setVisible(Boolean value) throws ComException;
  @DeclDISPID(64444)  public _NavigationGroups getNavigationGroups() throws ComException;
}
