/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Table.
 * 
 */
@CoInterface(guid="{000630D2-0000-0000-C000-000000000046}")
public interface _Table extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(98)  public Row FindRow(String Filter) throws ComException;
  @DeclDISPID(99)  public Row FindNextRow() throws ComException;
  @DeclDISPID(64463)  public Object GetArray(Integer MaxRows) throws ComException;
  @DeclDISPID(87)  public Row GetNextRow() throws ComException;
  @DeclDISPID(80)  public Integer GetRowCount() throws ComException;
  @DeclDISPID(64286)  public void MoveToStart() throws ComException;
  @DeclDISPID(100)  public Table Restrict(String Filter) throws ComException;
  @DeclDISPID(97)  public void Sort(String SortProperty, Object Descending) throws ComException;
  @DeclDISPID(64403)  public Columns getColumns() throws ComException;
  @DeclDISPID(64287)  public Boolean getEndOfTable() throws ComException;
}
