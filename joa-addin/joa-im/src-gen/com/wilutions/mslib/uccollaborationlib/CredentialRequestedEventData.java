/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * CredentialRequestedEventData.
 * CredentialRequestedEventData Class which is used to get the credential request type, domain 
 * and user names. The password, domain and user names can be changed from the event data object 
 * obtained from the event OnCredentialRequested. 
 */
@CoClass(guid="{CBD9B3DE-2ED2-47CC-AE82-54DAEB26EBB7}")
public class CredentialRequestedEventData extends Dispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  public CredentialRequestedEventData() throws ComException {
    super("{CBD9B3DE-2ED2-47CC-AE82-54DAEB26EBB7}");
  }
  protected CredentialRequestedEventData(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CredentialRequestedEventData" + super.toString() + "]";
  }
}
