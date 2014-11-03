/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SharedWorkspaceFile.
 * 
 */
@CoInterface(guid="{000C037B-0000-0000-C000-000000000046}")
public interface SharedWorkspaceFile extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public String getURL() throws ComException;
  @DeclDISPID(1)  public String getCreatedBy() throws ComException;
  @DeclDISPID(2)  public Object getCreatedDate() throws ComException;
  @DeclDISPID(3)  public String getModifiedBy() throws ComException;
  @DeclDISPID(4)  public Object getModifiedDate() throws ComException;
  @DeclDISPID(5)  public void Delete() throws ComException;
  @DeclDISPID(6)  public Dispatch getParent() throws ComException;
}
