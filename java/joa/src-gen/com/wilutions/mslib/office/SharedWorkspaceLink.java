/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SharedWorkspaceLink.
 * 
 */
@CoInterface(guid="{000C037F-0000-0000-C000-000000000046}")
public interface SharedWorkspaceLink extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public String getURL() throws ComException;
  @DeclDISPID(0)  public void setURL(String value) throws ComException;
  @DeclDISPID(1)  public String getDescription() throws ComException;
  @DeclDISPID(1)  public void setDescription(String value) throws ComException;
  @DeclDISPID(2)  public String getNotes() throws ComException;
  @DeclDISPID(2)  public void setNotes(String value) throws ComException;
  @DeclDISPID(3)  public String getCreatedBy() throws ComException;
  @DeclDISPID(4)  public Object getCreatedDate() throws ComException;
  @DeclDISPID(5)  public String getModifiedBy() throws ComException;
  @DeclDISPID(6)  public Object getModifiedDate() throws ComException;
  @DeclDISPID(7)  public void Save() throws ComException;
  @DeclDISPID(8)  public void Delete() throws ComException;
  @DeclDISPID(9)  public IDispatch getParent() throws ComException;
}
