/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * OfficeDataSourceObject.
 * 
 */
@CoInterface(guid="{000C1530-0000-0000-C000-000000000046}")
public interface OfficeDataSourceObject extends IDispatch {
  @DeclDISPID(1)  public String getConnectString() throws ComException;
  @DeclDISPID(1)  public void setConnectString(String value) throws ComException;
  @DeclDISPID(2)  public String getTable() throws ComException;
  @DeclDISPID(2)  public void setTable(String value) throws ComException;
  @DeclDISPID(3)  public String getDataSource() throws ComException;
  @DeclDISPID(3)  public void setDataSource(String value) throws ComException;
  @DeclDISPID(4)  public IDispatch getColumns() throws ComException;
  @DeclDISPID(5)  public Integer getRowCount() throws ComException;
  @DeclDISPID(6)  public IDispatch getFilters() throws ComException;
  @DeclDISPID(1610743817)  public Integer Move(MsoMoveRow MsoMoveRow, Integer RowNbr) throws ComException;
  @DeclDISPID(1610743818)  public void Open(String bstrSrc, String bstrConnect, String bstrTable, Integer fOpenExclusive, Integer fNeverPrompt) throws ComException;
  @DeclDISPID(1610743819)  public void SetSortOrder(String SortField1, Boolean SortAscending1, String SortField2, Boolean SortAscending2, String SortField3, Boolean SortAscending3) throws ComException;
  @DeclDISPID(1610743820)  public void ApplyFilter() throws ComException;
}
