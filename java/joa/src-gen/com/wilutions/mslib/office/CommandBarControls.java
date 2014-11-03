/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CommandBarControls.
 * 
 */
@CoInterface(guid="{000C0306-0000-0000-C000-000000000046}")
public interface CommandBarControls extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public CommandBarControl Add(Object Type, Object Id, Object Parameter, Object Before, Object Temporary) throws ComException;
  @DeclDISPID(1610809345)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public CommandBarControl getItem(Object Index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610809348)  public CommandBar getParent() throws ComException;
}
