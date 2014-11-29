/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * NewFile.
 * 
 */
@CoInterface(guid="{000C0936-0000-0000-C000-000000000046}")
public interface NewFile extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public Boolean Add(String FileName, Object Section, Object DisplayName, Object Action) throws ComException;
  @DeclDISPID(2)  public Boolean Remove(String FileName, Object Section, Object DisplayName, Object Action) throws ComException;
}
