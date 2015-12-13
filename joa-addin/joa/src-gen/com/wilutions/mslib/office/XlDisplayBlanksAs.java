/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlDisplayBlanksAs.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{3439EA79-5069-4404-A6E3-8EE3A1B9BD0E}")
public class XlDisplayBlanksAs implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlDisplayBlanksAs xlInterpolated = new XlDisplayBlanksAs(3);
  public final static XlDisplayBlanksAs xlNotPlotted = new XlDisplayBlanksAs(1);
  public final static XlDisplayBlanksAs xlZero = new XlDisplayBlanksAs(2);

  // Integer constants for bitsets and switch statements
  public final static int _xlInterpolated = 3;
  public final static int _xlNotPlotted = 1;
  public final static int _xlZero = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlDisplayBlanksAs(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlDisplayBlanksAs valueOf(int value) {
    switch(value) {
    case 3: return xlInterpolated;
    case 1: return xlNotPlotted;
    case 2: return xlZero;
    default: return new XlDisplayBlanksAs(value);
    }
  }

  public String toString() {
    switch(value) {
    case 3: return "xlInterpolated";
    case 1: return "xlNotPlotted";
    case 2: return "xlZero";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 3) != 0) sbuf.append("|xlInterpolated");
      if ((value & 1) != 0) sbuf.append("|xlNotPlotted");
      if ((value & 2) != 0) sbuf.append("|xlZero");
      return sbuf.toString();
      }
    }
  }
}
