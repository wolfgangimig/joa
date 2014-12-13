/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmSnapPoint.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{317A54C1-C7B1-11CE-9AFD-00AA00600AB8}")
public class fmSnapPoint implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmSnapPoint fmSnapPointTopLeft = new fmSnapPoint(0);
  public final static fmSnapPoint fmSnapPointTopCenter = new fmSnapPoint(1);
  public final static fmSnapPoint fmSnapPointTopRight = new fmSnapPoint(2);
  public final static fmSnapPoint fmSnapPointCenterLeft = new fmSnapPoint(3);
  public final static fmSnapPoint fmSnapPointCenter = new fmSnapPoint(4);
  public final static fmSnapPoint fmSnapPointCenterRight = new fmSnapPoint(5);
  public final static fmSnapPoint fmSnapPointBottomLeft = new fmSnapPoint(6);
  public final static fmSnapPoint fmSnapPointBottomCenter = new fmSnapPoint(7);
  public final static fmSnapPoint fmSnapPointBottomRight = new fmSnapPoint(8);

  // Integer constants for bitsets and switch statements
  public final static int _fmSnapPointTopLeft = 0;
  public final static int _fmSnapPointTopCenter = 1;
  public final static int _fmSnapPointTopRight = 2;
  public final static int _fmSnapPointCenterLeft = 3;
  public final static int _fmSnapPointCenter = 4;
  public final static int _fmSnapPointCenterRight = 5;
  public final static int _fmSnapPointBottomLeft = 6;
  public final static int _fmSnapPointBottomCenter = 7;
  public final static int _fmSnapPointBottomRight = 8;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmSnapPoint(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmSnapPoint valueOf(int value) {
    switch(value) {
    case 0: return fmSnapPointTopLeft;
    case 1: return fmSnapPointTopCenter;
    case 2: return fmSnapPointTopRight;
    case 3: return fmSnapPointCenterLeft;
    case 4: return fmSnapPointCenter;
    case 5: return fmSnapPointCenterRight;
    case 6: return fmSnapPointBottomLeft;
    case 7: return fmSnapPointBottomCenter;
    case 8: return fmSnapPointBottomRight;
    default: return new fmSnapPoint(value);
    }
  }

  public String toString() {
    switch(value) {
    case 8: return "fmSnapPointBottomRight";
    case 0: return "fmSnapPointTopLeft";
    case 1: return "fmSnapPointTopCenter";
    case 2: return "fmSnapPointTopRight";
    case 3: return "fmSnapPointCenterLeft";
    case 4: return "fmSnapPointCenter";
    case 5: return "fmSnapPointCenterRight";
    case 6: return "fmSnapPointBottomLeft";
    case 7: return "fmSnapPointBottomCenter";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 8) != 0) sbuf.append("|fmSnapPointBottomRight");
      if ((value & 0) != 0) sbuf.append("|fmSnapPointTopLeft");
      if ((value & 1) != 0) sbuf.append("|fmSnapPointTopCenter");
      if ((value & 2) != 0) sbuf.append("|fmSnapPointTopRight");
      if ((value & 3) != 0) sbuf.append("|fmSnapPointCenterLeft");
      if ((value & 4) != 0) sbuf.append("|fmSnapPointCenter");
      if ((value & 5) != 0) sbuf.append("|fmSnapPointCenterRight");
      if ((value & 6) != 0) sbuf.append("|fmSnapPointBottomLeft");
      if ((value & 7) != 0) sbuf.append("|fmSnapPointBottomCenter");
      return sbuf.toString();
      }
    }
  }
}
