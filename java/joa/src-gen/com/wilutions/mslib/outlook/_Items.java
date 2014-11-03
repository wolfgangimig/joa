/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Items.
 * 
 */
@CoInterface(guid="{00063041-0000-0000-C000-000000000046}")
public interface _Items extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public Dispatch Item(Object Index) throws ComException;
  @DeclDISPID(206)  public Boolean getIncludeRecurrences() throws ComException;
  @DeclDISPID(206)  public void setIncludeRecurrences(Boolean value) throws ComException;
  @DeclDISPID(95)  public Dispatch Add(Object Type) throws ComException;
  @DeclDISPID(98)  public Dispatch Find(String Filter) throws ComException;
  @DeclDISPID(99)  public Dispatch FindNext() throws ComException;
  @DeclDISPID(86)  public Dispatch GetFirst() throws ComException;
  @DeclDISPID(88)  public Dispatch GetLast() throws ComException;
  @DeclDISPID(87)  public Dispatch GetNext() throws ComException;
  @DeclDISPID(89)  public Dispatch GetPrevious() throws ComException;
  @DeclDISPID(84)  public void Remove(Integer Index) throws ComException;
  @DeclDISPID(93)  public void ResetColumns() throws ComException;
  @DeclDISPID(100)  public _Items Restrict(String Filter) throws ComException;
  @DeclDISPID(92)  public void SetColumns(String Columns) throws ComException;
  @DeclDISPID(97)  public void Sort(String Property, Object Descending) throws ComException;
}
