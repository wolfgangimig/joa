/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * UserProperties.
 * 
 */
@CoInterface(guid="{0006303D-0000-0000-C000-000000000046}")
public interface UserProperties extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public UserProperty Item(final Object Index) throws ComException;
  @DeclDISPID(102)  public UserProperty Add(final String Name, final OlUserPropertyType Type, final Object AddToFolderFields, final Object DisplayFormat) throws ComException;
  @DeclDISPID(103)  public UserProperty Find(final String Name, final Object Custom) throws ComException;
  @DeclDISPID(82)  public void Remove(final Integer Index) throws ComException;
}
