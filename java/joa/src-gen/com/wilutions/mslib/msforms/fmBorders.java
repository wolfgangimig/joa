/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmBorders.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{E1FC1640-70DF-101B-BC16-00AA003E3B29}")
public class fmBorders implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmBorders fmBordersNone = new fmBorders(0);
  public final static fmBorders fmBordersBox = new fmBorders(1);
  public final static fmBorders fmBordersLeft = new fmBorders(2);
  public final static fmBorders fmBordersTop = new fmBorders(3);

  // Integer constants for bitsets and switch statements
  public final static int _fmBordersNone = 0;
  public final static int _fmBordersBox = 1;
  public final static int _fmBordersLeft = 2;
  public final static int _fmBordersTop = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmBorders(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmBorders valueOf(int value) {
    switch(value) {
    case 0: return fmBordersNone;
    case 1: return fmBordersBox;
    case 2: return fmBordersLeft;
    case 3: return fmBordersTop;
    default: return new fmBorders(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "fmBordersNone";
    case 1: return "fmBordersBox";
    case 2: return "fmBordersLeft";
    case 3: return "fmBordersTop";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|fmBordersNone");
      if ((value & 1) != 0) sbuf.append("|fmBordersBox");
      if ((value & 2) != 0) sbuf.append("|fmBordersLeft");
      if ((value & 3) != 0) sbuf.append("|fmBordersTop");
      return sbuf.toString();
      }
    }
  }
}
