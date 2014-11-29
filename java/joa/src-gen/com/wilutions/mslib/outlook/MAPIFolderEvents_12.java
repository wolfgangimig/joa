/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * MAPIFolderEvents_12.
 * 
 */
@CoInterface(guid="{000630F7-0000-0000-C000-000000000046}")
public interface MAPIFolderEvents_12 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(64424)  public void onBeforeFolderMove(MAPIFolder MoveTo, ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64425)  public void onBeforeItemMove(IDispatch Item, MAPIFolder MoveTo, ByRef<Boolean> Cancel) throws ComException;
}
