/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * OfficeDataSourceObject.
 * 
 */
@CoInterface(guid="{000C1530-0000-0000-C000-000000000046}")
public interface OfficeDataSourceObject extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public String getConnectString() throws ComException;
  @DeclDISPID(1)  public void setConnectString(final String value) throws ComException;
  @DeclDISPID(2)  public String getTable() throws ComException;
  @DeclDISPID(2)  public void setTable(final String value) throws ComException;
  @DeclDISPID(3)  public String getDataSource() throws ComException;
  @DeclDISPID(3)  public void setDataSource(final String value) throws ComException;
  @DeclDISPID(4)  public IDispatch getColumns() throws ComException;
  @DeclDISPID(5)  public Integer getRowCount() throws ComException;
  @DeclDISPID(6)  public IDispatch getFilters() throws ComException;
  @DeclDISPID(1610743817)  public Integer Move(final MsoMoveRow MsoMoveRow, final Integer RowNbr) throws ComException;
  @DeclDISPID(1610743818)  public void Open(final String bstrSrc, final String bstrConnect, final String bstrTable, final Integer fOpenExclusive, final Integer fNeverPrompt) throws ComException;
  @DeclDISPID(1610743819)  public void SetSortOrder(final String SortField1, final Boolean SortAscending1, final String SortField2, final Boolean SortAscending2, final String SortField3, final Boolean SortAscending3) throws ComException;
  @DeclDISPID(1610743820)  public void ApplyFilter() throws ComException;
}
