/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * FileDialogSelectedItems.
 * 
 */
@CoInterface(guid="{000C0363-0000-0000-C000-000000000046}")
public interface FileDialogSelectedItems extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public Dispatch getParent() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610809346)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public String Item(Integer Index) throws ComException;
}
