/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OutlookBarGroupsEvents.
 * 
 */
@CoInterface(guid="{0006307B-0000-0000-C000-000000000046}")
public interface OutlookBarGroupsEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61441)  public void onGroupAdd(OutlookBarGroup NewGroup) throws ComException;
  @DeclDISPID(61442)  public void onBeforeGroupAdd(ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61443)  public void onBeforeGroupRemove(OutlookBarGroup Group, ByRef<Boolean> Cancel) throws ComException;
}
