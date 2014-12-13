/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCalloutType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoCalloutType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoCalloutType msoCalloutMixed = new MsoCalloutType(-2);
  public final static MsoCalloutType msoCalloutOne = new MsoCalloutType(1);
  public final static MsoCalloutType msoCalloutTwo = new MsoCalloutType(2);
  public final static MsoCalloutType msoCalloutThree = new MsoCalloutType(3);
  public final static MsoCalloutType msoCalloutFour = new MsoCalloutType(4);

  // Integer constants for bitsets and switch statements
  public final static int _msoCalloutMixed = -2;
  public final static int _msoCalloutOne = 1;
  public final static int _msoCalloutTwo = 2;
  public final static int _msoCalloutThree = 3;
  public final static int _msoCalloutFour = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoCalloutType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoCalloutType valueOf(int value) {
    switch(value) {
    case -2: return msoCalloutMixed;
    case 1: return msoCalloutOne;
    case 2: return msoCalloutTwo;
    case 3: return msoCalloutThree;
    case 4: return msoCalloutFour;
    default: return new MsoCalloutType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 2: return "msoCalloutTwo";
    case -2: return "msoCalloutMixed";
    case 1: return "msoCalloutOne";
    case 3: return "msoCalloutThree";
    case 4: return "msoCalloutFour";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 2) != 0) sbuf.append("|msoCalloutTwo");
      if ((value & -2) != 0) sbuf.append("|msoCalloutMixed");
      if ((value & 1) != 0) sbuf.append("|msoCalloutOne");
      if ((value & 3) != 0) sbuf.append("|msoCalloutThree");
      if ((value & 4) != 0) sbuf.append("|msoCalloutFour");
      return sbuf.toString();
      }
    }
  }
}
