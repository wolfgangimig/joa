/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSearchIn.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoSearchIn {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoSearchIn msoSearchInMyComputer = new MsoSearchIn(0);
  public final static MsoSearchIn msoSearchInOutlook = new MsoSearchIn(1);
  public final static MsoSearchIn msoSearchInMyNetworkPlaces = new MsoSearchIn(2);
  public final static MsoSearchIn msoSearchInCustom = new MsoSearchIn(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoSearchInMyComputer = 0;
  public final static int _msoSearchInOutlook = 1;
  public final static int _msoSearchInMyNetworkPlaces = 2;
  public final static int _msoSearchInCustom = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoSearchIn(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoSearchIn valueOf(int value) {
    switch(value) {
    case 0: return msoSearchInMyComputer;
    case 1: return msoSearchInOutlook;
    case 2: return msoSearchInMyNetworkPlaces;
    case 3: return msoSearchInCustom;
    default: return new MsoSearchIn(value);
    }
  }
}
