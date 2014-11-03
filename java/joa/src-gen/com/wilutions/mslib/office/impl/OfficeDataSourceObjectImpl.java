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
  @DeclDISPID(1)  public void setConnectString(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"ConnectString", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(2)  public String getTable() throws ComException {
    final Object obj = this._dispatchCall(2,"Table", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public void setTable(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"Table", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3)  public String getDataSource() throws ComException {
    final Object obj = this._dispatchCall(3,"DataSource", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3)  public void setDataSource(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(3,"DataSource", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4)  public Dispatch getColumns() throws ComException {
    final Object obj = this._dispatchCall(4,"Columns", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(5)  public Integer getRowCount() throws ComException {
    final Object obj = this._dispatchCall(5,"RowCount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(6)  public Dispatch getFilters() throws ComException {
    final Object obj = this._dispatchCall(6,"Filters", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743817)  public Integer Move(com.wilutions.mslib.office.MsoMoveRow MsoMoveRow, Integer RowNbr) throws ComException {
    assert(MsoMoveRow != null);
    assert(RowNbr != null);
    final Object obj = this._dispatchCall(1610743817,"Move", DISPATCH_METHOD,null,MsoMoveRow.value,RowNbr);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743818)  public void Open(String bstrSrc, String bstrConnect, String bstrTable, Integer fOpenExclusive, Integer fNeverPrompt) throws ComException {
    assert(bstrSrc != null);
    assert(bstrConnect != null);
    assert(bstrTable != null);
    assert(fOpenExclusive != null);
    assert(fNeverPrompt != null);
    this._dispatchCall(1610743818,"Open", DISPATCH_METHOD,null,bstrSrc,bstrConnect,bstrTable,fOpenExclusive,fNeverPrompt);
  }
  @DeclDISPID(1610743819)  public void SetSortOrder(String SortField1, Boolean SortAscending1, String SortField2, Boolean SortAscending2, String SortField3, Boolean SortAscending3) throws ComException {
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
    super(progId);
  }
  protected OfficeDataSourceObjectImpl(long ndisp) {
    super(ndisp);
  }
  public OfficeDataSourceObjectImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OfficeDataSourceObjectImpl" + super.toString() + "]";
  }
}
