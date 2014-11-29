/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SharedWorkspace.
 * 
 */
@CoInterface(guid="{000C0385-0000-0000-C000-000000000046}")
public interface SharedWorkspace extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public String getName() throws ComException;
  @DeclDISPID(0)  public void setName(String value) throws ComException;
  @DeclDISPID(1)  public SharedWorkspaceMembers getMembers() throws ComException;
  @DeclDISPID(2)  public SharedWorkspaceTasks getTasks() throws ComException;
  @DeclDISPID(3)  public SharedWorkspaceFiles getFiles() throws ComException;
  @DeclDISPID(4)  public SharedWorkspaceFolders getFolders() throws ComException;
  @DeclDISPID(5)  public SharedWorkspaceLinks getLinks() throws ComException;
  @DeclDISPID(6)  public void Refresh() throws ComException;
  @DeclDISPID(7)  public void CreateNew(Object URL, Object Name) throws ComException;
  @DeclDISPID(8)  public void Delete() throws ComException;
  @DeclDISPID(9)  public IDispatch getParent() throws ComException;
  @DeclDISPID(10)  public String getURL() throws ComException;
  @DeclDISPID(11)  public Boolean getConnected() throws ComException;
  @DeclDISPID(12)  public Object getLastRefreshed() throws ComException;
  @DeclDISPID(13)  public String getSourceURL() throws ComException;
  @DeclDISPID(13)  public void setSourceURL(String value) throws ComException;
  @DeclDISPID(14)  public void RemoveDocument() throws ComException;
  @DeclDISPID(15)  public void Disconnect() throws ComException;
}
