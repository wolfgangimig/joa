/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IUtilities2.
 * IUtilities2 Interface 
 */
@CoInterface(guid="{9112CE9B-3704-48C0-86DC-7A7B0F34D7A3}")
public interface IUtilities2 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(268435457)  public String getExchangeECPUrl() throws ComException;
  @DeclDISPID(268435458)  public IScheduledConferenceManager getScheduledConferenceManager() throws ComException;
  @DeclDISPID(268435459)  public String Normalize(final String _displayString) throws ComException;
}
