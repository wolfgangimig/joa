/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Categories.
 * 
 */
@CoInterface(guid="{000630E4-0000-0000-C000-000000000046}")
public interface _Categories extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public _Category Item(final Object Index) throws ComException;
  @DeclDISPID(95)  public Category Add(final String Name, final Object Color, final Object ShortcutKey) throws ComException;
  @DeclDISPID(82)  public void Remove(final Object Index) throws ComException;
}
