/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * PickerResult.
 * 
 */
@CoInterface(guid="{000C03E4-0000-0000-C000-000000000046}")
public interface PickerResult extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public String getId() throws ComException;
  @DeclDISPID(2)  public String getDisplayName() throws ComException;
  @DeclDISPID(2)  public void setDisplayName(String value) throws ComException;
  @DeclDISPID(3)  public String getType() throws ComException;
  @DeclDISPID(3)  public void setType(String value) throws ComException;
  @DeclDISPID(4)  public String getSIPId() throws ComException;
  @DeclDISPID(4)  public void setSIPId(String value) throws ComException;
  @DeclDISPID(5)  public Object getItemData() throws ComException;
  @DeclDISPID(5)  public void setItemData(Object value) throws ComException;
  @DeclDISPID(6)  public Object getSubItems() throws ComException;
  @DeclDISPID(6)  public void setSubItems(Object value) throws ComException;
  @DeclDISPID(7)  public Object getDuplicateResults() throws ComException;
  @DeclDISPID(8)  public PickerFields getFields() throws ComException;
  @DeclDISPID(8)  public void setFields(PickerFields value) throws ComException;
}
