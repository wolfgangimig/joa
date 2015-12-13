/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ClientStateChangedEventData.
 * ClientStateChangedEventData Class which is used to get the old, new client states and the 
 * status code from the event OnStateChanged in the interface _ICommunicatorClientEvent. 
 */
@CoClass(guid="{36522520-67A7-48AE-AA63-B5A7BEA21B7C}")
public class ClientStateChangedEventData extends Dispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  public ClientStateChangedEventData() throws ComException {
    super("{36522520-67A7-48AE-AA63-B5A7BEA21B7C}");
  }
  protected ClientStateChangedEventData(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ClientStateChangedEventData" + super.toString() + "]";
  }
}
