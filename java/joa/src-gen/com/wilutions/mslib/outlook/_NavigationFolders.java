/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _NavigationFolders.
 * 
 */
@CoInterface(guid="{000630F1-0000-0000-C000-000000000046}")
public interface _NavigationFolders extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public _NavigationFolder Item(final Object Index) throws ComException;
  @DeclDISPID(64450)  public NavigationFolder Add(final MAPIFolder Folder) throws ComException;
  @DeclDISPID(64451)  public void Remove(final NavigationFolder RemovableFolder) throws ComException;
}
