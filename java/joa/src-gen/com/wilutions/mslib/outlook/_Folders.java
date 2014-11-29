/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Folders.
 * 
 */
@CoInterface(guid="{00063040-0000-0000-C000-000000000046}")
public interface _Folders extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public MAPIFolder Item(Object Index) throws ComException;
  @DeclDISPID(95)  public MAPIFolder Add(String Name, Object Type) throws ComException;
  @DeclDISPID(86)  public MAPIFolder GetFirst() throws ComException;
  @DeclDISPID(88)  public MAPIFolder GetLast() throws ComException;
  @DeclDISPID(87)  public MAPIFolder GetNext() throws ComException;
  @DeclDISPID(89)  public MAPIFolder GetPrevious() throws ComException;
  @DeclDISPID(84)  public void Remove(Integer Index) throws ComException;
}
