/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * AccountSelectorEvents.
 * 
 */
@CoInterface(guid="{00063104-0000-0000-C000-000000000046}")
public interface AccountSelectorEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(64627)  public void onSelectedAccountChange(final Account SelectedAccount) throws ComException;
}
