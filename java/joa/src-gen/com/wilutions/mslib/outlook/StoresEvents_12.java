/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * StoresEvents_12.
 * 
 */
@CoInterface(guid="{000630F8-0000-0000-C000-000000000046}")
public interface StoresEvents_12 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(64433)  public void onBeforeStoreRemove(_Store Store, ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61441)  public void onStoreAdd(_Store Store) throws ComException;
}
