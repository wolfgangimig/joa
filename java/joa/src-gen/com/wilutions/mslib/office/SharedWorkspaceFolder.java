/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SharedWorkspaceFolder.
 * 
 */
@CoInterface(guid="{000C037D-0000-0000-C000-000000000046}")
public interface SharedWorkspaceFolder extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public String getFolderName() throws ComException;
  @DeclDISPID(1)  public void Delete(Object DeleteEventIfFolderContainsFiles) throws ComException;
  @DeclDISPID(2)  public IDispatch getParent() throws ComException;
}
