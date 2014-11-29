/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoContactCardAddressType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{EC67AF3B-F2DF-4A52-9B85-E06A7FF28DB7}")
public class MsoContactCardAddressType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoContactCardAddressType msoContactCardAddressTypeUnknown = new MsoContactCardAddressType(0);
  public final static MsoContactCardAddressType msoContactCardAddressTypeOutlook = new MsoContactCardAddressType(1);
  public final static MsoContactCardAddressType msoContactCardAddressTypeSMTP = new MsoContactCardAddressType(2);
  public final static MsoContactCardAddressType msoContactCardAddressTypeIM = new MsoContactCardAddressType(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoContactCardAddressTypeUnknown = 0;
  public final static int _msoContactCardAddressTypeOutlook = 1;
  public final static int _msoContactCardAddressTypeSMTP = 2;
  public final static int _msoContactCardAddressTypeIM = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoContactCardAddressType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoContactCardAddressType valueOf(int value) {
    switch(value) {
    case 0: return msoContactCardAddressTypeUnknown;
    case 1: return msoContactCardAddressTypeOutlook;
    case 2: return msoContactCardAddressTypeSMTP;
    case 3: return msoContactCardAddressTypeIM;
    default: return new MsoContactCardAddressType(value);
    }
  }
}
