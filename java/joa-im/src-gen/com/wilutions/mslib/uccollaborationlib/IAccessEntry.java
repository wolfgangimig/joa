/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IAccessEntry.
 * IAccessEntry Interface 
 */
@CoInterface(guid="{65B71572-5338-43C8-9E4C-F1DFC6711AD1}")
public interface IAccessEntry extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public AccessEntryScope getScope() throws ComException;
  @DeclDISPID(1610743809)  public String getId() throws ComException;
  @DeclDISPID(1610743810)  public IAccessPermission getPermission() throws ComException;
  @DeclDISPID(1610743811)  public void SetPermission(final IAccessPermission _permission) throws ComException;
  @DeclDISPID(1610743812)  public void ClearPermission() throws ComException;
  @DeclDISPID(1610743813)  public Boolean CanSetPermission(final IAccessPermission _permission) throws ComException;
  @DeclDISPID(1610743814)  public Boolean CanClearPermission() throws ComException;
}
