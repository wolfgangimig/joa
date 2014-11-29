/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * FileDialogFilter.
 * 
 */
@CoInterface(guid="{000C0364-0000-0000-C000-000000000046}")
public interface FileDialogFilter extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809345)  public String getExtensions() throws ComException;
  @DeclDISPID(1610809346)  public String getDescription() throws ComException;
}
