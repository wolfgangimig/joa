/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _NavigationGroup.
 * 
 */
@CoInterface(guid="{000630F0-0000-0000-C000-000000000046}")
public interface _NavigationGroup extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(64448)  public OlGroupType getGroupType() throws ComException;
  @DeclDISPID(64449)  public NavigationFolders getNavigationFolders() throws ComException;
  @DeclDISPID(8450)  public String getName() throws ComException;
  @DeclDISPID(8450)  public void setName(String value) throws ComException;
  @DeclDISPID(64455)  public Integer getPosition() throws ComException;
  @DeclDISPID(64455)  public void setPosition(Integer value) throws ComException;
}
