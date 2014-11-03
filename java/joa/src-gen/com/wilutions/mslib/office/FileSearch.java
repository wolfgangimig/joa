/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * FileSearch.
 * 
 */
@CoInterface(guid="{000C0332-0000-0000-C000-000000000046}")
public interface FileSearch extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public Boolean getSearchSubFolders() throws ComException;
  @DeclDISPID(1)  public void setSearchSubFolders(Boolean value) throws ComException;
  @DeclDISPID(2)  public Boolean getMatchTextExactly() throws ComException;
  @DeclDISPID(2)  public void setMatchTextExactly(Boolean value) throws ComException;
  @DeclDISPID(3)  public Boolean getMatchAllWordForms() throws ComException;
  @DeclDISPID(3)  public void setMatchAllWordForms(Boolean value) throws ComException;
  @DeclDISPID(4)  public String getFileName() throws ComException;
  @DeclDISPID(4)  public void setFileName(String value) throws ComException;
  @DeclDISPID(5)  public MsoFileType getFileType() throws ComException;
  @DeclDISPID(5)  public void setFileType(MsoFileType value) throws ComException;
  @DeclDISPID(6)  public MsoLastModified getLastModified() throws ComException;
  @DeclDISPID(6)  public void setLastModified(MsoLastModified value) throws ComException;
  @DeclDISPID(7)  public String getTextOrProperty() throws ComException;
  @DeclDISPID(7)  public void setTextOrProperty(String value) throws ComException;
  @DeclDISPID(8)  public String getLookIn() throws ComException;
  @DeclDISPID(8)  public void setLookIn(String value) throws ComException;
  @DeclDISPID(9)  public Integer Execute(MsoSortBy SortBy, MsoSortOrder SortOrder, Boolean AlwaysAccurate) throws ComException;
  @DeclDISPID(10)  public void NewSearch() throws ComException;
  @DeclDISPID(11)  public FoundFiles getFoundFiles() throws ComException;
  @DeclDISPID(12)  public PropertyTests getPropertyTests() throws ComException;
  @DeclDISPID(13)  public SearchScopes getSearchScopes() throws ComException;
  @DeclDISPID(14)  public SearchFolders getSearchFolders() throws ComException;
  @DeclDISPID(16)  public FileTypes getFileTypes() throws ComException;
  @DeclDISPID(17)  public void RefreshScopes() throws ComException;
}
