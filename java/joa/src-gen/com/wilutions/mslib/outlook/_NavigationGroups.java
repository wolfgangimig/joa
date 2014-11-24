/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _NavigationGroups.
 * 
 */
@CoInterface(guid="{000630EF-0000-0000-C000-000000000046}")
public interface _NavigationGroups extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public _NavigationGroup Item(Object Index) throws ComException;
  @DeclDISPID(64445)  public NavigationGroup Create(String GroupDisplayName) throws ComException;
  @DeclDISPID(64446)  public void Delete(NavigationGroup Group) throws ComException;
  @DeclDISPID(64447)  public NavigationGroup GetDefaultNavigationGroup(OlGroupType DefaultFolderGroup) throws ComException;
}
