/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * PickerDialog.
 * 
 */
@CoInterface(guid="{000C03E6-0000-0000-C000-000000000046}")
public interface PickerDialog extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public String getDataHandlerId() throws ComException;
  @DeclDISPID(1)  public void setDataHandlerId(String value) throws ComException;
  @DeclDISPID(2)  public String getTitle() throws ComException;
  @DeclDISPID(2)  public void setTitle(String value) throws ComException;
  @DeclDISPID(3)  public PickerProperties getProperties() throws ComException;
  @DeclDISPID(4)  public PickerResults CreatePickerResults() throws ComException;
  @DeclDISPID(5)  public PickerResults Show(Boolean IsMultiSelect, PickerResults ExistingResults) throws ComException;
  @DeclDISPID(6)  public PickerResults Resolve(String TokenText, Integer duplicateDlgMode) throws ComException;
}
