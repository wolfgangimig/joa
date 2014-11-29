/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * ExplorerEvents.
 * 
 */
@CoInterface(guid="{0006304F-0000-0000-C000-000000000046}")
public interface ExplorerEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61441)  public void onActivate() throws ComException;
  @DeclDISPID(61442)  public void onFolderSwitch() throws ComException;
  @DeclDISPID(61443)  public void onBeforeFolderSwitch(IDispatch NewFolder, ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61444)  public void onViewSwitch() throws ComException;
  @DeclDISPID(61445)  public void onBeforeViewSwitch(Object NewView, ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61446)  public void onDeactivate() throws ComException;
  @DeclDISPID(61447)  public void onSelectionChange() throws ComException;
  @DeclDISPID(61448)  public void onClose() throws ComException;
}
