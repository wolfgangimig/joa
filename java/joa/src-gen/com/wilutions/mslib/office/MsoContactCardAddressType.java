/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoContactCardAddressType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{EC67AF3B-F2DF-4A52-9B85-E06A7FF28DB7}")
public enum MsoContactCardAddressType {
  msoContactCardAddressTypeUnknown(0),
  msoContactCardAddressTypeOutlook(1),
  msoContactCardAddressTypeSMTP(2),
  msoContactCardAddressTypeIM(3);

  public final int value;
  private MsoContactCardAddressType(int value) { this.value = value; }
  public static  MsoContactCardAddressType valueOf(int value) {
    switch(value) {
    case 0: return msoContactCardAddressTypeUnknown;
    case 1: return msoContactCardAddressTypeOutlook;
    case 2: return msoContactCardAddressTypeSMTP;
    case 3: return msoContactCardAddressTypeIM;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoContactCardAddressType.class);
    }
  }
}
