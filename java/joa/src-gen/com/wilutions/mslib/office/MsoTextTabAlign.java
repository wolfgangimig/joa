/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextTabAlign.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoTextTabAlign implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoTextTabAlign msoTabAlignMixed = new MsoTextTabAlign(-2);
  public final static MsoTextTabAlign msoTabAlignLeft = new MsoTextTabAlign(0);
  public final static MsoTextTabAlign msoTabAlignCenter = new MsoTextTabAlign(1);
  public final static MsoTextTabAlign msoTabAlignRight = new MsoTextTabAlign(2);
  public final static MsoTextTabAlign msoTabAlignDecimal = new MsoTextTabAlign(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoTabAlignMixed = -2;
  public final static int _msoTabAlignLeft = 0;
  public final static int _msoTabAlignCenter = 1;
  public final static int _msoTabAlignRight = 2;
  public final static int _msoTabAlignDecimal = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoTextTabAlign(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoTextTabAlign valueOf(int value) {
    switch(value) {
    case -2: return msoTabAlignMixed;
    case 0: return msoTabAlignLeft;
    case 1: return msoTabAlignCenter;
    case 2: return msoTabAlignRight;
    case 3: return msoTabAlignDecimal;
    default: return new MsoTextTabAlign(value);
    }
  }

  public String toString() {
    switch(value) {
    case -2: return "msoTabAlignMixed";
    case 0: return "msoTabAlignLeft";
    case 1: return "msoTabAlignCenter";
    case 2: return "msoTabAlignRight";
    case 3: return "msoTabAlignDecimal";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -2) != 0) sbuf.append("|msoTabAlignMixed");
      if ((value & 0) != 0) sbuf.append("|msoTabAlignLeft");
      if ((value & 1) != 0) sbuf.append("|msoTabAlignCenter");
      if ((value & 2) != 0) sbuf.append("|msoTabAlignRight");
      if ((value & 3) != 0) sbuf.append("|msoTabAlignDecimal");
      return sbuf.toString();
      }
    }
  }
}
