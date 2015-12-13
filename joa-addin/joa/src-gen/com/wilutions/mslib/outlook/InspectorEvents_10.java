/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * InspectorEvents_10.
 * 
 */
@CoInterface(guid="{0006302A-0000-0000-C000-000000000046}")
public interface InspectorEvents_10 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61441)  public void onActivate() throws ComException;
  @DeclDISPID(61446)  public void onDeactivate() throws ComException;
  @DeclDISPID(61448)  public void onClose() throws ComException;
  @DeclDISPID(64017)  public void onBeforeMaximize(final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64018)  public void onBeforeMinimize(final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64019)  public void onBeforeMove(final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64020)  public void onBeforeSize(final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64500)  public void onPageChange(final String ActivePageName) throws ComException;
  @DeclDISPID(64633)  public void onAttachmentSelectionChange() throws ComException;
}
