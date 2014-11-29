/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _AutoFormatRules.
 * 
 */
@CoInterface(guid="{00063094-0000-0000-C000-000000000046}")
public interface _AutoFormatRules extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public AutoFormatRule Item(Object Index) throws ComException;
  @DeclDISPID(95)  public AutoFormatRule Add(String Name) throws ComException;
  @DeclDISPID(64342)  public AutoFormatRule Insert(String Name, Object Index) throws ComException;
  @DeclDISPID(82)  public void Remove(Object Index) throws ComException;
  @DeclDISPID(64343)  public void RemoveAll() throws ComException;
  @DeclDISPID(61512)  public void Save() throws ComException;
}
