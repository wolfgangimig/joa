/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlBorderWeight.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class XlBorderWeight implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlBorderWeight xlHairline = new XlBorderWeight(1);
  public final static XlBorderWeight xlMedium = new XlBorderWeight(-4138);
  public final static XlBorderWeight xlThick = new XlBorderWeight(4);
  public final static XlBorderWeight xlThin = new XlBorderWeight(2);

  // Integer constants for bitsets and switch statements
  public final static int _xlHairline = 1;
  public final static int _xlMedium = -4138;
  public final static int _xlThick = 4;
  public final static int _xlThin = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlBorderWeight(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlBorderWeight valueOf(int value) {
    switch(value) {
    case 1: return xlHairline;
    case -4138: return xlMedium;
    case 4: return xlThick;
    case 2: return xlThin;
    default: return new XlBorderWeight(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "xlHairline";
    case -4138: return "xlMedium";
    case 4: return "xlThick";
    case 2: return "xlThin";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|xlHairline");
      if ((value & -4138) != 0) sbuf.append("|xlMedium");
      if ((value & 4) != 0) sbuf.append("|xlThick");
      if ((value & 2) != 0) sbuf.append("|xlThin");
      return sbuf.toString();
      }
    }
  }
}
