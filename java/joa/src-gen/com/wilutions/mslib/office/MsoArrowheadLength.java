/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoArrowheadLength.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoArrowheadLength implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoArrowheadLength msoArrowheadLengthMixed = new MsoArrowheadLength(-2);
  public final static MsoArrowheadLength msoArrowheadShort = new MsoArrowheadLength(1);
  public final static MsoArrowheadLength msoArrowheadLengthMedium = new MsoArrowheadLength(2);
  public final static MsoArrowheadLength msoArrowheadLong = new MsoArrowheadLength(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoArrowheadLengthMixed = -2;
  public final static int _msoArrowheadShort = 1;
  public final static int _msoArrowheadLengthMedium = 2;
  public final static int _msoArrowheadLong = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoArrowheadLength(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoArrowheadLength valueOf(int value) {
    switch(value) {
    case -2: return msoArrowheadLengthMixed;
    case 1: return msoArrowheadShort;
    case 2: return msoArrowheadLengthMedium;
    case 3: return msoArrowheadLong;
    default: return new MsoArrowheadLength(value);
    }
  }

  public String toString() {
    switch(value) {
    case -2: return "msoArrowheadLengthMixed";
    case 1: return "msoArrowheadShort";
    case 2: return "msoArrowheadLengthMedium";
    case 3: return "msoArrowheadLong";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -2) != 0) sbuf.append("|msoArrowheadLengthMixed");
      if ((value & 1) != 0) sbuf.append("|msoArrowheadShort");
      if ((value & 2) != 0) sbuf.append("|msoArrowheadLengthMedium");
      if ((value & 3) != 0) sbuf.append("|msoArrowheadLong");
      return sbuf.toString();
      }
    }
  }
}
