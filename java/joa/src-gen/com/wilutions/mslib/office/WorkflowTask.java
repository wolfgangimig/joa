/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * WorkflowTask.
 * 
 */
@CoInterface(guid="{000CD900-0000-0000-C000-000000000046}")
public interface WorkflowTask extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public String getId() throws ComException;
  @DeclDISPID(2)  public String getListID() throws ComException;
  @DeclDISPID(3)  public String getWorkflowID() throws ComException;
  @DeclDISPID(4)  public String getName() throws ComException;
  @DeclDISPID(5)  public String getDescription() throws ComException;
  @DeclDISPID(6)  public String getAssignedTo() throws ComException;
  @DeclDISPID(7)  public String getCreatedBy() throws ComException;
  @DeclDISPID(8)  public java.util.Date getDueDate() throws ComException;
  @DeclDISPID(9)  public java.util.Date getCreatedDate() throws ComException;
  @DeclDISPID(10)  public Integer Show() throws ComException;
}
