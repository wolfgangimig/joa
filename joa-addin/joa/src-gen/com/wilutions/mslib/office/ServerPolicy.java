/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ServerPolicy.
 * 
 */
@CoInterface(guid="{000C0390-0000-0000-C000-000000000046}")
public interface ServerPolicy extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public PolicyItem getItem(final Object Index) throws ComException;
  @DeclDISPID(1)  public String getId() throws ComException;
  @DeclDISPID(2)  public String getName() throws ComException;
  @DeclDISPID(3)  public String getDescription() throws ComException;
  @DeclDISPID(4)  public String getStatement() throws ComException;
  @DeclDISPID(5)  public Integer getCount() throws ComException;
  @DeclDISPID(6)  public Boolean getBlockPreview() throws ComException;
  @DeclDISPID(7)  public IDispatch getParent() throws ComException;
}
