/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A5C-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IFindImpl extends Dispatch implements com.wilutions.mslib.office.IFind {
  @DeclDISPID(0)  public String getSearchPath() throws ComException {
    final Object obj = this._dispatchCall(0,"SearchPath", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743810)  public Boolean getSubDir() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"SubDir", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743811)  public String getTitle() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Title", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743812)  public String getAuthor() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"Author", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743813)  public String getKeywords() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"Keywords", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743814)  public String getSubject() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"Subject", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743815)  public com.wilutions.mslib.office.MsoFileFindOptions getOptions() throws ComException {
    final Object obj = this._dispatchCall(1610743815,"Options", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoFileFindOptions.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743816)  public Boolean getMatchCase() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"MatchCase", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743817)  public String getText() throws ComException {
    final Object obj = this._dispatchCall(1610743817,"Text", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743818)  public Boolean getPatternMatch() throws ComException {
    final Object obj = this._dispatchCall(1610743818,"PatternMatch", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743819)  public Object getDateSavedFrom() throws ComException {
    final Object obj = this._dispatchCall(1610743819,"DateSavedFrom", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743820)  public Object getDateSavedTo() throws ComException {
    final Object obj = this._dispatchCall(1610743820,"DateSavedTo", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743821)  public String getSavedBy() throws ComException {
    final Object obj = this._dispatchCall(1610743821,"SavedBy", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743822)  public Object getDateCreatedFrom() throws ComException {
    final Object obj = this._dispatchCall(1610743822,"DateCreatedFrom", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743823)  public Object getDateCreatedTo() throws ComException {
    final Object obj = this._dispatchCall(1610743823,"DateCreatedTo", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743824)  public com.wilutions.mslib.office.MsoFileFindView getView() throws ComException {
    final Object obj = this._dispatchCall(1610743824,"View", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoFileFindView.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743825)  public com.wilutions.mslib.office.MsoFileFindSortBy getSortBy() throws ComException {
    final Object obj = this._dispatchCall(1610743825,"SortBy", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoFileFindSortBy.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743826)  public com.wilutions.mslib.office.MsoFileFindListBy getListBy() throws ComException {
    final Object obj = this._dispatchCall(1610743826,"ListBy", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoFileFindListBy.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743827)  public Integer getSelectedFile() throws ComException {
    final Object obj = this._dispatchCall(1610743827,"SelectedFile", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743828)  public com.wilutions.mslib.office.IFoundFiles getResults() throws ComException {
    final Object obj = this._dispatchCall(1610743828,"Results", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.IFoundFilesImpl.class);
  }
  @DeclDISPID(1610743829)  public Integer Show() throws ComException {
    final Object obj = this._dispatchCall(1610743829,"Show", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public void setSearchPath(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"SearchPath", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743809)  public void setName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743809,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743810)  public void setSubDir(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743810,"SubDir", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743811)  public void setTitle(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743811,"Title", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743812)  public void setAuthor(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743812,"Author", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743813)  public void setKeywords(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743813,"Keywords", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743814)  public void setSubject(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743814,"Subject", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743815)  public void setOptions(com.wilutions.mslib.office.MsoFileFindOptions value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743815,"Options", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743816)  public void setMatchCase(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743816,"MatchCase", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743817)  public void setText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743817,"Text", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743818)  public void setPatternMatch(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743818,"PatternMatch", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743819)  public void setDateSavedFrom(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743819,"DateSavedFrom", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743820)  public void setDateSavedTo(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743820,"DateSavedTo", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743821)  public void setSavedBy(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743821,"SavedBy", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743822)  public void setDateCreatedFrom(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743822,"DateCreatedFrom", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743823)  public void setDateCreatedTo(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743823,"DateCreatedTo", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743824)  public void setView(com.wilutions.mslib.office.MsoFileFindView value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743824,"View", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743825)  public void setSortBy(com.wilutions.mslib.office.MsoFileFindSortBy value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743825,"SortBy", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743826)  public void setListBy(com.wilutions.mslib.office.MsoFileFindListBy value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743826,"ListBy", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743827)  public void setSelectedFile(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743827,"SelectedFile", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743850)  public void Execute() throws ComException {
    this._dispatchCall(1610743850,"Execute", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743851)  public void Load(String bstrQueryName) throws ComException {
    assert(bstrQueryName != null);
    this._dispatchCall(1610743851,"Load", DISPATCH_METHOD,null,bstrQueryName);
  }
  @DeclDISPID(1610743852)  public void Save(String bstrQueryName) throws ComException {
    assert(bstrQueryName != null);
    this._dispatchCall(1610743852,"Save", DISPATCH_METHOD,null,bstrQueryName);
  }
  @DeclDISPID(1610743853)  public void Delete(String bstrQueryName) throws ComException {
    assert(bstrQueryName != null);
    this._dispatchCall(1610743853,"Delete", DISPATCH_METHOD,null,bstrQueryName);
  }
  @DeclDISPID(1610743854)  public Integer getFileType() throws ComException {
    final Object obj = this._dispatchCall(1610743854,"FileType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743854)  public void setFileType(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743854,"FileType", DISPATCH_PROPERTYPUT,value);
  }
  public IFindImpl(String progId) throws ComException {
    super(progId, "{000C0337-0000-0000-C000-000000000046}");
  }
  protected IFindImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IFindImpl" + super.toString() + "]";
  }
}
