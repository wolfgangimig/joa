/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _ViewFields.
 * 
 */
@CoInterface(guid="{000630A1-0000-0000-C000-000000000046}")
public interface _ViewFields extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public _ViewField Item(final Object Index) throws ComException;
  @DeclDISPID(95)  public ViewField Add(final String PropertyName) throws ComException;
  @DeclDISPID(64342)  public ViewField Insert(final String PropertyName, final Object Index) throws ComException;
  @DeclDISPID(82)  public void Remove(final Object Index) throws ComException;
}
