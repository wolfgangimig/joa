/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ThemeFont.
 * 
 */
@CoInterface(guid="{000C03A3-0000-0000-C000-000000000046}")
public interface ThemeFont extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public String getName() throws ComException;
  @DeclDISPID(0)  public void setName(String value) throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
}
