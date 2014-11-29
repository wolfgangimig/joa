/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8C5B-A463-DB41-5DAE-69E7A5F7FCBC}")
public class OfficeDataSourceObjectImpl extends Dispatch implements com.wilutions.mslib.office.OfficeDataSourceObject {
  @DeclDISPID(1)  public String getConnectString() throws ComException {
    final Object obj = this._dispatchCall(1,"ConnectString", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1)  public void setConnectString(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"ConnectString", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(2)  public String getTable() throws ComException {
    final Object obj = this._dispatchCall(2,"Table", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public void setTable(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"Table", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3)  public String getDataSource() throws ComException {
    final Object obj = this._dispatchCall(3,"DataSource", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3)  public void setDataSource(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(3,"DataSource", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4)  public IDispatch getColumns() throws ComException {
    final Object obj = this._dispatchCall(4,"Columns", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(5)  public Integer getRowCount() throws ComException {
    final Object obj = this._dispatchCall(5,"RowCount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(6)  public IDispatch getFilters() throws ComException {
    final Object obj = this._dispatchCall(6,"Filters", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743817)  public Integer Move(final com.wilutions.mslib.office.MsoMoveRow MsoMoveRow, final Integer RowNbr) throws ComException {
    assert(MsoMoveRow != null);
    assert(RowNbr != null);
    final Object obj = this._dispatchCall(1610743817,"Move", DISPATCH_METHOD,null,MsoMoveRow.value,RowNbr);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743818)  public void Open(final String bstrSrc, final String bstrConnect, final String bstrTable, final Integer fOpenExclusive, final Integer fNeverPrompt) throws ComException {
    assert(bstrSrc != null);
    assert(bstrConnect != null);
    assert(bstrTable != null);
    assert(fOpenExclusive != null);
    assert(fNeverPrompt != null);
    this._dispatchCall(1610743818,"Open", DISPATCH_METHOD,null,bstrSrc,bstrConnect,bstrTable,fOpenExclusive,fNeverPrompt);
  }
  @DeclDISPID(1610743819)  public void SetSortOrder(final String SortField1, final Boolean SortAscending1, final String SortField2, final Boolean SortAscending2, final String SortField3, final Boolean SortAscending3) throws ComException {
    assert(SortField1 != null);
    assert(SortAscending1 != null);
    assert(SortField2 != null);
    assert(SortAscending2 != null);
    assert(SortField3 != null);
    assert(SortAscending3 != null);
    this._dispatchCall(1610743819,"SetSortOrder", DISPATCH_METHOD,null,SortField1,SortAscending1,SortField2,SortAscending2,SortField3,SortAscending3);
  }
  @DeclDISPID(1610743820)  public void ApplyFilter() throws ComException {
    this._dispatchCall(1610743820,"ApplyFilter", DISPATCH_METHOD,null);
  }
  public OfficeDataSourceObjectImpl(String progId) throws ComException {
    super(progId, "{000C1530-0000-0000-C000-000000000046}");
  }
  protected OfficeDataSourceObjectImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OfficeDataSourceObjectImpl" + super.toString() + "]";
  }
}
