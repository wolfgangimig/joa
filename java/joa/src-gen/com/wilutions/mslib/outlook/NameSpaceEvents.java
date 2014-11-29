/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * NameSpaceEvents.
 * 
 */
@CoInterface(guid="{0006308C-0000-0000-C000-000000000046}")
public interface NameSpaceEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61445)  public void onOptionsPagesAdd(PropertyPages Pages, MAPIFolder Folder) throws ComException;
  @DeclDISPID(64557)  public void onAutoDiscoverComplete() throws ComException;
}
