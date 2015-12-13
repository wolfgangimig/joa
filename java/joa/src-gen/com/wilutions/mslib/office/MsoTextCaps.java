/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextCaps.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoTextCaps implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoTextCaps msoCapsMixed = new MsoTextCaps(-2);
  public final static MsoTextCaps msoNoCaps = new MsoTextCaps(0);
  public final static MsoTextCaps msoSmallCaps = new MsoTextCaps(1);
  public final static MsoTextCaps msoAllCaps = new MsoTextCaps(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoCapsMixed = -2;
  public final static int _msoNoCaps = 0;
  public final static int _msoSmallCaps = 1;
  public final static int _msoAllCaps = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoTextCaps(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoTextCaps valueOf(int value) {
    switch(value) {
    case -2: return msoCapsMixed;
    case 0: return msoNoCaps;
    case 1: return msoSmallCaps;
    case 2: return msoAllCaps;
    default: return new MsoTextCaps(value);
    }
  }

  public String toString() {
    switch(value) {
    case -2: return "msoCapsMixed";
    case 0: return "msoNoCaps";
    case 1: return "msoSmallCaps";
    case 2: return "msoAllCaps";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -2) != 0) sbuf.append("|msoCapsMixed");
      if ((value & 0) != 0) sbuf.append("|msoNoCaps");
      if ((value & 1) != 0) sbuf.append("|msoSmallCaps");
      if ((value & 2) != 0) sbuf.append("|msoAllCaps");
      return sbuf.toString();
      }
    }
  }
}
