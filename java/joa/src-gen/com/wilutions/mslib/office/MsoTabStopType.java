/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTabStopType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoTabStopType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoTabStopType msoTabStopMixed = new MsoTabStopType(-2);
  public final static MsoTabStopType msoTabStopLeft = new MsoTabStopType(1);
  public final static MsoTabStopType msoTabStopCenter = new MsoTabStopType(2);
  public final static MsoTabStopType msoTabStopRight = new MsoTabStopType(3);
  public final static MsoTabStopType msoTabStopDecimal = new MsoTabStopType(4);

  // Integer constants for bitsets and switch statements
  public final static int _msoTabStopMixed = -2;
  public final static int _msoTabStopLeft = 1;
  public final static int _msoTabStopCenter = 2;
  public final static int _msoTabStopRight = 3;
  public final static int _msoTabStopDecimal = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoTabStopType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoTabStopType valueOf(int value) {
    switch(value) {
    case -2: return msoTabStopMixed;
    case 1: return msoTabStopLeft;
    case 2: return msoTabStopCenter;
    case 3: return msoTabStopRight;
    case 4: return msoTabStopDecimal;
    default: return new MsoTabStopType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 2: return "msoTabStopCenter";
    case -2: return "msoTabStopMixed";
    case 1: return "msoTabStopLeft";
    case 3: return "msoTabStopRight";
    case 4: return "msoTabStopDecimal";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 2) != 0) sbuf.append("|msoTabStopCenter");
      if ((value & -2) != 0) sbuf.append("|msoTabStopMixed");
      if ((value & 1) != 0) sbuf.append("|msoTabStopLeft");
      if ((value & 3) != 0) sbuf.append("|msoTabStopRight");
      if ((value & 4) != 0) sbuf.append("|msoTabStopDecimal");
      return sbuf.toString();
      }
    }
  }
}
