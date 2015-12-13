/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlChartPictureType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class XlChartPictureType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlChartPictureType xlStackScale = new XlChartPictureType(3);
  public final static XlChartPictureType xlStack = new XlChartPictureType(2);
  public final static XlChartPictureType xlStretch = new XlChartPictureType(1);

  // Integer constants for bitsets and switch statements
  public final static int _xlStackScale = 3;
  public final static int _xlStack = 2;
  public final static int _xlStretch = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlChartPictureType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlChartPictureType valueOf(int value) {
    switch(value) {
    case 3: return xlStackScale;
    case 2: return xlStack;
    case 1: return xlStretch;
    default: return new XlChartPictureType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 3: return "xlStackScale";
    case 2: return "xlStack";
    case 1: return "xlStretch";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 3) != 0) sbuf.append("|xlStackScale");
      if ((value & 2) != 0) sbuf.append("|xlStack");
      if ((value & 1) != 0) sbuf.append("|xlStretch");
      return sbuf.toString();
      }
    }
  }
}
