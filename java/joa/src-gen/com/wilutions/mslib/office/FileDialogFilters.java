/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * FileDialogFilters.
 * 
 */
@CoInterface(guid="{000C0365-0000-0000-C000-000000000046}")
public interface FileDialogFilters extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610809346)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public FileDialogFilter Item(Integer Index) throws ComException;
  @DeclDISPID(1610809348)  public void Delete(Object filter) throws ComException;
  @DeclDISPID(1610809349)  public void Clear() throws ComException;
  @DeclDISPID(1610809350)  public FileDialogFilter Add(String Description, String Extensions, Object Position) throws ComException;
}
