/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SharedWorkspaceFiles.
 * 
 */
@CoInterface(guid="{000C037C-0000-0000-C000-000000000046}")
public interface SharedWorkspaceFiles extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(0)  public SharedWorkspaceFile getItem(Integer Index) throws ComException;
  @DeclDISPID(1)  public Integer getCount() throws ComException;
  @DeclDISPID(2)  public SharedWorkspaceFile Add(String FileName, Object ParentFolder, Object OverwriteIfFileAlreadyExists, Object KeepInSync) throws ComException;
  @DeclDISPID(3)  public IDispatch getParent() throws ComException;
  @DeclDISPID(4)  public Boolean getItemCountExceeded() throws ComException;
}
