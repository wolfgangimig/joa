/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Results.
 * 
 */
@CoInterface(guid="{0006300C-0000-0000-C000-000000000046}")
public interface _Results extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public IDispatch Item(Object Index) throws ComException;
  @DeclDISPID(86)  public IDispatch GetFirst() throws ComException;
  @DeclDISPID(88)  public IDispatch GetLast() throws ComException;
  @DeclDISPID(87)  public IDispatch GetNext() throws ComException;
  @DeclDISPID(89)  public IDispatch GetPrevious() throws ComException;
  @DeclDISPID(93)  public void ResetColumns() throws ComException;
  @DeclDISPID(92)  public void SetColumns(String Columns) throws ComException;
  @DeclDISPID(97)  public void Sort(String Property, Object Descending) throws ComException;
  @DeclDISPID(64143)  public OlItemType getDefaultItemType() throws ComException;
  @DeclDISPID(64143)  public void setDefaultItemType(OlItemType value) throws ComException;
}
