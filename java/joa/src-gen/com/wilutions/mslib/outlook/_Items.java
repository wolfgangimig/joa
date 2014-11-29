/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Items.
 * 
 */
@CoInterface(guid="{00063041-0000-0000-C000-000000000046}")
public interface _Items extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public IDispatch Item(final Object Index) throws ComException;
  @DeclDISPID(206)  public Boolean getIncludeRecurrences() throws ComException;
  @DeclDISPID(206)  public void setIncludeRecurrences(final Boolean value) throws ComException;
  @DeclDISPID(95)  public IDispatch Add(final Object Type) throws ComException;
  @DeclDISPID(98)  public IDispatch Find(final String Filter) throws ComException;
  @DeclDISPID(99)  public IDispatch FindNext() throws ComException;
  @DeclDISPID(86)  public IDispatch GetFirst() throws ComException;
  @DeclDISPID(88)  public IDispatch GetLast() throws ComException;
  @DeclDISPID(87)  public IDispatch GetNext() throws ComException;
  @DeclDISPID(89)  public IDispatch GetPrevious() throws ComException;
  @DeclDISPID(84)  public void Remove(final Integer Index) throws ComException;
  @DeclDISPID(93)  public void ResetColumns() throws ComException;
  @DeclDISPID(100)  public _Items Restrict(final String Filter) throws ComException;
  @DeclDISPID(92)  public void SetColumns(final String Columns) throws ComException;
  @DeclDISPID(97)  public void Sort(final String Property, final Object Descending) throws ComException;
}
