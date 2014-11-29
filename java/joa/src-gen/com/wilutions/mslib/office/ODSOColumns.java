/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ODSOColumns.
 * 
 */
@CoInterface(guid="{000C1532-0000-0000-C000-000000000046}")
public interface ODSOColumns extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public Integer getCount() throws ComException;
  @DeclDISPID(2)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809346)  public IDispatch Item(final Object varIndex) throws ComException;
}
