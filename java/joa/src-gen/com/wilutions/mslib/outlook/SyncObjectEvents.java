/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * SyncObjectEvents.
 * 
 */
@CoInterface(guid="{00063085-0000-0000-C000-000000000046}")
public interface SyncObjectEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61441)  public void onSyncStart() throws ComException;
  @DeclDISPID(61442)  public void onProgress(final OlSyncState State, final String Description, final Integer Value, final Integer Max) throws ComException;
  @DeclDISPID(61443)  public void onOnError(final Integer Code, final String Description) throws ComException;
  @DeclDISPID(61444)  public void onSyncEnd() throws ComException;
}
