/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SharedWorkspaceTask.
 * 
 */
@CoInterface(guid="{000C0379-0000-0000-C000-000000000046}")
public interface SharedWorkspaceTask extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public String getTitle() throws ComException;
  @DeclDISPID(0)  public void setTitle(String value) throws ComException;
  @DeclDISPID(1)  public String getAssignedTo() throws ComException;
  @DeclDISPID(1)  public void setAssignedTo(String value) throws ComException;
  @DeclDISPID(2)  public MsoSharedWorkspaceTaskStatus getStatus() throws ComException;
  @DeclDISPID(2)  public void setStatus(MsoSharedWorkspaceTaskStatus value) throws ComException;
  @DeclDISPID(3)  public MsoSharedWorkspaceTaskPriority getPriority() throws ComException;
  @DeclDISPID(3)  public void setPriority(MsoSharedWorkspaceTaskPriority value) throws ComException;
  @DeclDISPID(4)  public String getDescription() throws ComException;
  @DeclDISPID(4)  public void setDescription(String value) throws ComException;
  @DeclDISPID(5)  public Object getDueDate() throws ComException;
  @DeclDISPID(5)  public void setDueDate(Object value) throws ComException;
  @DeclDISPID(6)  public String getCreatedBy() throws ComException;
  @DeclDISPID(7)  public Object getCreatedDate() throws ComException;
  @DeclDISPID(8)  public String getModifiedBy() throws ComException;
  @DeclDISPID(9)  public Object getModifiedDate() throws ComException;
  @DeclDISPID(10)  public void Save() throws ComException;
  @DeclDISPID(11)  public void Delete() throws ComException;
  @DeclDISPID(12)  public Dispatch getParent() throws ComException;
}
