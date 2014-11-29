/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IFind.
 * 
 */
@CoInterface(guid="{000C0337-0000-0000-C000-000000000046}")
public interface IFind extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(0)  public String getSearchPath() throws ComException;
  @DeclDISPID(1610743809)  public String getName() throws ComException;
  @DeclDISPID(1610743810)  public Boolean getSubDir() throws ComException;
  @DeclDISPID(1610743811)  public String getTitle() throws ComException;
  @DeclDISPID(1610743812)  public String getAuthor() throws ComException;
  @DeclDISPID(1610743813)  public String getKeywords() throws ComException;
  @DeclDISPID(1610743814)  public String getSubject() throws ComException;
  @DeclDISPID(1610743815)  public MsoFileFindOptions getOptions() throws ComException;
  @DeclDISPID(1610743816)  public Boolean getMatchCase() throws ComException;
  @DeclDISPID(1610743817)  public String getText() throws ComException;
  @DeclDISPID(1610743818)  public Boolean getPatternMatch() throws ComException;
  @DeclDISPID(1610743819)  public Object getDateSavedFrom() throws ComException;
  @DeclDISPID(1610743820)  public Object getDateSavedTo() throws ComException;
  @DeclDISPID(1610743821)  public String getSavedBy() throws ComException;
  @DeclDISPID(1610743822)  public Object getDateCreatedFrom() throws ComException;
  @DeclDISPID(1610743823)  public Object getDateCreatedTo() throws ComException;
  @DeclDISPID(1610743824)  public MsoFileFindView getView() throws ComException;
  @DeclDISPID(1610743825)  public MsoFileFindSortBy getSortBy() throws ComException;
  @DeclDISPID(1610743826)  public MsoFileFindListBy getListBy() throws ComException;
  @DeclDISPID(1610743827)  public Integer getSelectedFile() throws ComException;
  @DeclDISPID(1610743828)  public IFoundFiles getResults() throws ComException;
  @DeclDISPID(1610743829)  public Integer Show() throws ComException;
  @DeclDISPID(0)  public void setSearchPath(String value) throws ComException;
  @DeclDISPID(1610743809)  public void setName(String value) throws ComException;
  @DeclDISPID(1610743810)  public void setSubDir(Boolean value) throws ComException;
  @DeclDISPID(1610743811)  public void setTitle(String value) throws ComException;
  @DeclDISPID(1610743812)  public void setAuthor(String value) throws ComException;
  @DeclDISPID(1610743813)  public void setKeywords(String value) throws ComException;
  @DeclDISPID(1610743814)  public void setSubject(String value) throws ComException;
  @DeclDISPID(1610743815)  public void setOptions(MsoFileFindOptions value) throws ComException;
  @DeclDISPID(1610743816)  public void setMatchCase(Boolean value) throws ComException;
  @DeclDISPID(1610743817)  public void setText(String value) throws ComException;
  @DeclDISPID(1610743818)  public void setPatternMatch(Boolean value) throws ComException;
  @DeclDISPID(1610743819)  public void setDateSavedFrom(Object value) throws ComException;
  @DeclDISPID(1610743820)  public void setDateSavedTo(Object value) throws ComException;
  @DeclDISPID(1610743821)  public void setSavedBy(String value) throws ComException;
  @DeclDISPID(1610743822)  public void setDateCreatedFrom(Object value) throws ComException;
  @DeclDISPID(1610743823)  public void setDateCreatedTo(Object value) throws ComException;
  @DeclDISPID(1610743824)  public void setView(MsoFileFindView value) throws ComException;
  @DeclDISPID(1610743825)  public void setSortBy(MsoFileFindSortBy value) throws ComException;
  @DeclDISPID(1610743826)  public void setListBy(MsoFileFindListBy value) throws ComException;
  @DeclDISPID(1610743827)  public void setSelectedFile(Integer value) throws ComException;
  @DeclDISPID(1610743850)  public void Execute() throws ComException;
  @DeclDISPID(1610743851)  public void Load(String bstrQueryName) throws ComException;
  @DeclDISPID(1610743852)  public void Save(String bstrQueryName) throws ComException;
  @DeclDISPID(1610743853)  public void Delete(String bstrQueryName) throws ComException;
  @DeclDISPID(1610743854)  public Integer getFileType() throws ComException;
  @DeclDISPID(1610743854)  public void setFileType(Integer value) throws ComException;
}
