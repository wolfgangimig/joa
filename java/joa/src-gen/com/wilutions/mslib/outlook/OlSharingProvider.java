/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSharingProvider.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlSharingProvider {
  olProviderUnknown(0),
  olProviderExchange(1),
  olProviderWebCal(2),
  olProviderPubCal(3),
  olProviderICal(4),
  olProviderSharePoint(5),
  olProviderRSS(6),
  olProviderFederate(7);

  public final int value;
  private OlSharingProvider(int value) { this.value = value; }
  public static  OlSharingProvider valueOf(int value) {
    switch(value) {
    case 0: return olProviderUnknown;
    case 1: return olProviderExchange;
    case 2: return olProviderWebCal;
    case 3: return olProviderPubCal;
    case 4: return olProviderICal;
    case 5: return olProviderSharePoint;
    case 6: return olProviderRSS;
    case 7: return olProviderFederate;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlSharingProvider.class);
    }
  }
}
