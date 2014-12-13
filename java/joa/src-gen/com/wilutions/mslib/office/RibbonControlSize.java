/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * RibbonControlSize.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class RibbonControlSize implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static RibbonControlSize RibbonControlSizeRegular = new RibbonControlSize(0);
  public final static RibbonControlSize RibbonControlSizeLarge = new RibbonControlSize(1);

  // Integer constants for bitsets and switch statements
  public final static int _RibbonControlSizeRegular = 0;
  public final static int _RibbonControlSizeLarge = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private RibbonControlSize(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  RibbonControlSize valueOf(int value) {
    switch(value) {
    case 0: return RibbonControlSizeRegular;
    case 1: return RibbonControlSizeLarge;
    default: return new RibbonControlSize(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "RibbonControlSizeRegular";
    case 1: return "RibbonControlSizeLarge";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|RibbonControlSizeRegular");
      if ((value & 1) != 0) sbuf.append("|RibbonControlSizeLarge");
      return sbuf.toString();
      }
    }
  }
}
