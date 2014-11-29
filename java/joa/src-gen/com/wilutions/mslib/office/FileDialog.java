/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * FileDialog.
 * 
 */
@CoInterface(guid="{000C0362-0000-0000-C000-000000000046}")
public interface FileDialog extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809345)  public FileDialogFilters getFilters() throws ComException;
  @DeclDISPID(1610809346)  public Integer getFilterIndex() throws ComException;
  @DeclDISPID(1610809346)  public void setFilterIndex(Integer value) throws ComException;
  @DeclDISPID(1610809348)  public String getTitle() throws ComException;
  @DeclDISPID(1610809348)  public void setTitle(String value) throws ComException;
  @DeclDISPID(1610809350)  public String getButtonName() throws ComException;
  @DeclDISPID(1610809350)  public void setButtonName(String value) throws ComException;
  @DeclDISPID(1610809352)  public Boolean getAllowMultiSelect() throws ComException;
  @DeclDISPID(1610809352)  public void setAllowMultiSelect(Boolean value) throws ComException;
  @DeclDISPID(1610809354)  public MsoFileDialogView getInitialView() throws ComException;
  @DeclDISPID(1610809354)  public void setInitialView(MsoFileDialogView value) throws ComException;
  @DeclDISPID(1610809356)  public String getInitialFileName() throws ComException;
  @DeclDISPID(1610809356)  public void setInitialFileName(String value) throws ComException;
  @DeclDISPID(1610809358)  public FileDialogSelectedItems getSelectedItems() throws ComException;
  @DeclDISPID(1610809359)  public MsoFileDialogType getDialogType() throws ComException;
  @DeclDISPID(0)  public String getItem() throws ComException;
  @DeclDISPID(1610809361)  public Integer Show() throws ComException;
  @DeclDISPID(1610809362)  public void Execute() throws ComException;
}
