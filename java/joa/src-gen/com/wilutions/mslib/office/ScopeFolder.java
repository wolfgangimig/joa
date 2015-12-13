/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ScopeFolder.
 * 
 */
@CoInterface(guid="{000C0368-0000-0000-C000-000000000046}")
public interface ScopeFolder extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public String getName() throws ComException;
  @DeclDISPID(2)  public String getPath() throws ComException;
  @DeclDISPID(3)  public ScopeFolders getScopeFolders() throws ComException;
  @DeclDISPID(4)  public void AddToSearchFolders() throws ComException;
}
