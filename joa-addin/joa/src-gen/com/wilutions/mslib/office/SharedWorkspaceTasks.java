/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SharedWorkspaceTasks.
 * 
 */
@CoInterface(guid="{000C037A-0000-0000-C000-000000000046}")
public interface SharedWorkspaceTasks extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public SharedWorkspaceTask getItem(final Integer Index) throws ComException;
  @DeclDISPID(1)  public Integer getCount() throws ComException;
  @DeclDISPID(2)  public SharedWorkspaceTask Add(final String Title, final Object Status, final Object Priority, final Object Assignee, final Object Description, final Object DueDate) throws ComException;
  @DeclDISPID(3)  public IDispatch getParent() throws ComException;
  @DeclDISPID(4)  public Boolean getItemCountExceeded() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
