/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ODSOColumn.
 * 
 */
@CoInterface(guid="{000C1531-0000-0000-C000-000000000046}")
public interface ODSOColumn extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public Integer getIndex() throws ComException;
  @DeclDISPID(2)  public String getName() throws ComException;
  @DeclDISPID(3)  public IDispatch getParent() throws ComException;
  @DeclDISPID(4)  public String getValue() throws ComException;
}
