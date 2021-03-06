/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * ExplorerEvents_10.
 * 
 */
@CoInterface(guid="{0006300F-0000-0000-C000-000000000046}")
public interface ExplorerEvents_10 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61441)  public void onActivate() throws ComException;
  @DeclDISPID(61442)  public void onFolderSwitch() throws ComException;
  @DeclDISPID(61443)  public void onBeforeFolderSwitch(final IDispatch NewFolder, final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61444)  public void onViewSwitch() throws ComException;
  @DeclDISPID(61445)  public void onBeforeViewSwitch(final Object NewView, final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61446)  public void onDeactivate() throws ComException;
  @DeclDISPID(61447)  public void onSelectionChange() throws ComException;
  @DeclDISPID(61448)  public void onClose() throws ComException;
  @DeclDISPID(64017)  public void onBeforeMaximize(final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64018)  public void onBeforeMinimize(final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64019)  public void onBeforeMove(final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64020)  public void onBeforeSize(final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64014)  public void onBeforeItemCopy(final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64015)  public void onBeforeItemCut(final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64016)  public void onBeforeItemPaste(final Object ClipboardContent, final MAPIFolder Target, final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64633)  public void onAttachmentSelectionChange() throws ComException;
  @DeclDISPID(64658)  public void onInlineResponse(final IDispatch Item) throws ComException;
  @DeclDISPID(64662)  public void onInlineResponseClose() throws ComException;
}
