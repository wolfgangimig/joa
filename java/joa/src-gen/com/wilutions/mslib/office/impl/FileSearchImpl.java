/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A59-A463-DB41-5DAE-69E7A5F7FCBC}")
public class FileSearchImpl extends Dispatch implements com.wilutions.mslib.office.FileSearch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1)  public Boolean getSearchSubFolders() throws ComException {
    final Object obj = this._dispatchCall(1,"SearchSubFolders", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1)  public void setSearchSubFolders(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"SearchSubFolders", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(2)  public Boolean getMatchTextExactly() throws ComException {
    final Object obj = this._dispatchCall(2,"MatchTextExactly", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2)  public void setMatchTextExactly(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"MatchTextExactly", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3)  public Boolean getMatchAllWordForms() throws ComException {
    final Object obj = this._dispatchCall(3,"MatchAllWordForms", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(3)  public void setMatchAllWordForms(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(3,"MatchAllWordForms", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4)  public String getFileName() throws ComException {
    final Object obj = this._dispatchCall(4,"FileName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4)  public void setFileName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(4,"FileName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(5)  public com.wilutions.mslib.office.MsoFileType getFileType() throws ComException {
    final Object obj = this._dispatchCall(5,"FileType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoFileType.valueOf((Integer)obj);
  }
  @DeclDISPID(5)  public void setFileType(final com.wilutions.mslib.office.MsoFileType value) throws ComException {
    assert(value != null);
    this._dispatchCall(5,"FileType", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(6)  public com.wilutions.mslib.office.MsoLastModified getLastModified() throws ComException {
    final Object obj = this._dispatchCall(6,"LastModified", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoLastModified.valueOf((Integer)obj);
  }
  @DeclDISPID(6)  public void setLastModified(final com.wilutions.mslib.office.MsoLastModified value) throws ComException {
    assert(value != null);
    this._dispatchCall(6,"LastModified", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(7)  public String getTextOrProperty() throws ComException {
    final Object obj = this._dispatchCall(7,"TextOrProperty", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(7)  public void setTextOrProperty(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(7,"TextOrProperty", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8)  public String getLookIn() throws ComException {
    final Object obj = this._dispatchCall(8,"LookIn", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8)  public void setLookIn(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(8,"LookIn", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(9)  public Integer Execute(final com.wilutions.mslib.office.MsoSortBy SortBy, final com.wilutions.mslib.office.MsoSortOrder SortOrder, final Boolean AlwaysAccurate) throws ComException {
    assert(SortBy != null);
    assert(SortOrder != null);
    assert(AlwaysAccurate != null);
    final Object obj = this._dispatchCall(9,"Execute", DISPATCH_METHOD,null,SortBy.value,SortOrder.value,AlwaysAccurate);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(10)  public void NewSearch() throws ComException {
    this._dispatchCall(10,"NewSearch", DISPATCH_METHOD,null);
  }
  @DeclDISPID(11)  public com.wilutions.mslib.office.FoundFiles getFoundFiles() throws ComException {
    final Object obj = this._dispatchCall(11,"FoundFiles", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.FoundFilesImpl.class);
  }
  @DeclDISPID(12)  public com.wilutions.mslib.office.PropertyTests getPropertyTests() throws ComException {
    final Object obj = this._dispatchCall(12,"PropertyTests", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.PropertyTestsImpl.class);
  }
  @DeclDISPID(13)  public com.wilutions.mslib.office.SearchScopes getSearchScopes() throws ComException {
    final Object obj = this._dispatchCall(13,"SearchScopes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.SearchScopesImpl.class);
  }
  @DeclDISPID(14)  public com.wilutions.mslib.office.SearchFolders getSearchFolders() throws ComException {
    final Object obj = this._dispatchCall(14,"SearchFolders", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.SearchFoldersImpl.class);
  }
  @DeclDISPID(16)  public com.wilutions.mslib.office.FileTypes getFileTypes() throws ComException {
    final Object obj = this._dispatchCall(16,"FileTypes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.FileTypesImpl.class);
  }
  @DeclDISPID(17)  public void RefreshScopes() throws ComException {
    this._dispatchCall(17,"RefreshScopes", DISPATCH_METHOD,null);
  }
  public FileSearchImpl(String progId) throws ComException {
    super(progId, "{000C0332-0000-0000-C000-000000000046}");
  }
  protected FileSearchImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[FileSearchImpl" + super.toString() + "]";
  }
}
