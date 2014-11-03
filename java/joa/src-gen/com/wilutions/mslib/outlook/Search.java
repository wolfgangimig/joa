/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Search.
 * 
 */
@CoInterface(guid="{0006300B-0000-0000-C000-000000000046}")
public interface Search extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException;
  @DeclDISPID(64100)  public String getFilter() throws ComException;
  @DeclDISPID(64104)  public Boolean getIsSynchronous() throws ComException;
  @DeclDISPID(64105)  public _Results getResults() throws ComException;
  @DeclDISPID(64102)  public Boolean getSearchSubFolders() throws ComException;
  @DeclDISPID(64103)  public void Stop() throws ComException;
  @DeclDISPID(64109)  public String getTag() throws ComException;
  @DeclDISPID(64165)  public String getScope() throws ComException;
  @DeclDISPID(64173)  public MAPIFolder Save(String Name) throws ComException;
  @DeclDISPID(64285)  public Table GetTable() throws ComException;
}
