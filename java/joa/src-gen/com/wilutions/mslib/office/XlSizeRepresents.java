/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlSizeRepresents.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{8B544093-ECC1-43E3-80EF-25D6FBCC7540}")
public class XlSizeRepresents implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlSizeRepresents xlSizeIsWidth = new XlSizeRepresents(2);
  public final static XlSizeRepresents xlSizeIsArea = new XlSizeRepresents(1);

  // Integer constants for bitsets and switch statements
  public final static int _xlSizeIsWidth = 2;
  public final static int _xlSizeIsArea = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlSizeRepresents(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlSizeRepresents valueOf(int value) {
    switch(value) {
    case 2: return xlSizeIsWidth;
    case 1: return xlSizeIsArea;
    default: return new XlSizeRepresents(value);
    }
  }

  public String toString() {
    switch(value) {
    case 2: return "xlSizeIsWidth";
    case 1: return "xlSizeIsArea";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 2) != 0) sbuf.append("|xlSizeIsWidth");
      if ((value & 1) != 0) sbuf.append("|xlSizeIsArea");
      return sbuf.toString();
      }
    }
  }
}
