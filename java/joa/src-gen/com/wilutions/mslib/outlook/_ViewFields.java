/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _ViewFields.
 * 
 */
@CoInterface(guid="{000630A1-0000-0000-C000-000000000046}")
public interface _ViewFields extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public _ViewField Item(Object Index) throws ComException;
  @DeclDISPID(95)  public ViewField Add(String PropertyName) throws ComException;
  @DeclDISPID(64342)  public ViewField Insert(String PropertyName, Object Index) throws ComException;
  @DeclDISPID(82)  public void Remove(Object Index) throws ComException;
}
