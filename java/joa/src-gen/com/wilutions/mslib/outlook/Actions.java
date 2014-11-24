/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Actions.
 * 
 */
@CoInterface(guid="{0006303E-0000-0000-C000-000000000046}")
public interface Actions extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public Action Item(Object Index) throws ComException;
  @DeclDISPID(100)  public Action Add() throws ComException;
  @DeclDISPID(82)  public void Remove(Integer Index) throws ComException;
}
