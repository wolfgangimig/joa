/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Views.
 * 
 */
@CoInterface(guid="{0006308D-0000-0000-C000-000000000046}")
public interface _Views extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public View Item(Object Index) throws ComException;
  @DeclDISPID(95)  public View Add(String Name, OlViewType ViewType, OlViewSaveOption SaveOption) throws ComException;
  @DeclDISPID(84)  public void Remove(Object Index) throws ComException;
}
