/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _OrderFields.
 * 
 */
@CoInterface(guid="{0006309A-0000-0000-C000-000000000046}")
public interface _OrderFields extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public _OrderField Item(Object Index) throws ComException;
  @DeclDISPID(95)  public OrderField Add(String PropertyName, Object IsDescending) throws ComException;
  @DeclDISPID(82)  public void Remove(Object Index) throws ComException;
  @DeclDISPID(64343)  public void RemoveAll() throws ComException;
  @DeclDISPID(64342)  public OrderField Insert(String PropertyName, Object Index, Object IsDescending) throws ComException;
}
