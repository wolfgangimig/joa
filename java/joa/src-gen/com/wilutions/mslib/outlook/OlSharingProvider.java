/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSharingProvider.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlSharingProvider {

  // Typed constants
  public final static OlSharingProvider olProviderUnknown = new OlSharingProvider(0);
  public final static OlSharingProvider olProviderExchange = new OlSharingProvider(1);
  public final static OlSharingProvider olProviderWebCal = new OlSharingProvider(2);
  public final static OlSharingProvider olProviderPubCal = new OlSharingProvider(3);
  public final static OlSharingProvider olProviderICal = new OlSharingProvider(4);
  public final static OlSharingProvider olProviderSharePoint = new OlSharingProvider(5);
  public final static OlSharingProvider olProviderRSS = new OlSharingProvider(6);
  public final static OlSharingProvider olProviderFederate = new OlSharingProvider(7);

  // Integer constants for bitsets and switch statements
  public final static int _olProviderUnknown = 0;
  public final static int _olProviderExchange = 1;
  public final static int _olProviderWebCal = 2;
  public final static int _olProviderPubCal = 3;
  public final static int _olProviderICal = 4;
  public final static int _olProviderSharePoint = 5;
  public final static int _olProviderRSS = 6;
  public final static int _olProviderFederate = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlSharingProvider(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new OlSharingProvider(value);
    }
  }
}
