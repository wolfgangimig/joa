/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ICustomAvailabilityState.
 * ICustomAvailabilityState Interface 
 */
@CoInterface(guid="{D0984CEF-E323-4574-B07B-5C970C9CAEE0}")
public interface ICustomAvailabilityState extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ContactAvailability getAvailability() throws ComException;
  @DeclDISPID(1610743809)  public Integer getId() throws ComException;
  @DeclDISPID(1610743810)  public String getActivity() throws ComException;
}
