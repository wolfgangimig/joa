/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Columns.
 * 
 */
@CoInterface(guid="{000630E1-0000-0000-C000-000000000046}")
public interface _Columns extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public _Column Item(Object Index) throws ComException;
  @DeclDISPID(95)  public Column Add(String Name) throws ComException;
  @DeclDISPID(82)  public void Remove(Object Index) throws ComException;
  @DeclDISPID(83)  public void RemoveAll() throws ComException;
}
