/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OutlookBarPaneEvents.
 * 
 */
@CoInterface(guid="{0006307A-0000-0000-C000-000000000046}")
public interface OutlookBarPaneEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61441)  public void onBeforeNavigate(OutlookBarShortcut Shortcut, ByRef<Boolean> Cancel) throws ComException;
}
