/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * DocumentInspector.
 * 
 */
@CoInterface(guid="{000C0393-0000-0000-C000-000000000046}")
public interface DocumentInspector extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public String getName() throws ComException;
  @DeclDISPID(1)  public String getDescription() throws ComException;
  @DeclDISPID(2)  public void Inspect(ByRef<MsoDocInspectorStatus> Status, ByRef<String> Results) throws ComException;
  @DeclDISPID(3)  public void Fix(ByRef<MsoDocInspectorStatus> Status, ByRef<String> Results) throws ComException;
  @DeclDISPID(4)  public IDispatch getParent() throws ComException;
}
