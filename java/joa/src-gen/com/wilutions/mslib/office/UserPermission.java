/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * UserPermission.
 * 
 */
@CoInterface(guid="{000C0375-0000-0000-C000-000000000046}")
public interface UserPermission extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public String getUserId() throws ComException;
  @DeclDISPID(1)  public Integer getPermission() throws ComException;
  @DeclDISPID(1)  public void setPermission(final Integer value) throws ComException;
  @DeclDISPID(2)  public Object getExpirationDate() throws ComException;
  @DeclDISPID(2)  public void setExpirationDate(final Object value) throws ComException;
  @DeclDISPID(3)  public IDispatch getParent() throws ComException;
  @DeclDISPID(4)  public void Remove() throws ComException;
}
