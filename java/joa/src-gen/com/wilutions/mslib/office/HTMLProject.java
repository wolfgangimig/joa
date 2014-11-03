/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * HTMLProject.
 * 
 */
@CoInterface(guid="{000C0356-0000-0000-C000-000000000046}")
public interface HTMLProject extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public MsoHTMLProjectState getState() throws ComException;
  @DeclDISPID(1)  public void RefreshProject(Boolean Refresh) throws ComException;
  @DeclDISPID(2)  public void RefreshDocument(Boolean Refresh) throws ComException;
  @DeclDISPID(3)  public HTMLProjectItems getHTMLProjectItems() throws ComException;
  @DeclDISPID(4)  public Dispatch getParent() throws ComException;
  @DeclDISPID(5)  public void Open(MsoHTMLProjectOpen OpenKind) throws ComException;
}
