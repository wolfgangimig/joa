/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SharedWorkspaceMembers.
 * 
 */
@CoInterface(guid="{000C0382-0000-0000-C000-000000000046}")
public interface SharedWorkspaceMembers extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(0)  public SharedWorkspaceMember getItem(final Integer Index) throws ComException;
  @DeclDISPID(1)  public Integer getCount() throws ComException;
  @DeclDISPID(2)  public SharedWorkspaceMember Add(final String Email, final String DomainName, final String DisplayName, final Object Role) throws ComException;
  @DeclDISPID(3)  public IDispatch getParent() throws ComException;
  @DeclDISPID(4)  public Boolean getItemCountExceeded() throws ComException;
}
