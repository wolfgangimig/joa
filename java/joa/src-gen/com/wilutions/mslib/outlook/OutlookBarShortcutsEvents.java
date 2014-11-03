/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OutlookBarShortcutsEvents.
 * 
 */
@CoInterface(guid="{0006307C-0000-0000-C000-000000000046}")
public interface OutlookBarShortcutsEvents extends IDispatch {
  @DeclDISPID(61441)  public void onShortcutAdd(OutlookBarShortcut NewShortcut) throws ComException;
  @DeclDISPID(61442)  public void onBeforeShortcutAdd(ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61443)  public void onBeforeShortcutRemove(OutlookBarShortcut Shortcut, ByRef<Boolean> Cancel) throws ComException;
}
