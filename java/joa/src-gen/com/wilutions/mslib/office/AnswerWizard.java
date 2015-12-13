/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * AnswerWizard.
 * 
 */
@CoInterface(guid="{000C0360-0000-0000-C000-000000000046}")
public interface AnswerWizard extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809345)  public AnswerWizardFiles getFiles() throws ComException;
  @DeclDISPID(1610809346)  public void ClearFileList() throws ComException;
  @DeclDISPID(1610809347)  public void ResetFileList() throws ComException;
}
