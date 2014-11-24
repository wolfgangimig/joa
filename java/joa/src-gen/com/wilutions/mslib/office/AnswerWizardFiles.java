/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * AnswerWizardFiles.
 * 
 */
@CoInterface(guid="{000C0361-0000-0000-C000-000000000046}")
public interface AnswerWizardFiles extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException;
  @DeclDISPID(0)  public String getItem(Integer Index) throws ComException;
  @DeclDISPID(1610809346)  public Integer getCount() throws ComException;
  @DeclDISPID(1610809347)  public void Add(String FileName) throws ComException;
  @DeclDISPID(1610809348)  public void Delete(String FileName) throws ComException;
}
