/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoHorizontalAnchor.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoHorizontalAnchor implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoHorizontalAnchor msoHorizontalAnchorMixed = new MsoHorizontalAnchor(-2);
  public final static MsoHorizontalAnchor msoAnchorNone = new MsoHorizontalAnchor(1);
  public final static MsoHorizontalAnchor msoAnchorCenter = new MsoHorizontalAnchor(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoHorizontalAnchorMixed = -2;
  public final static int _msoAnchorNone = 1;
  public final static int _msoAnchorCenter = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoHorizontalAnchor(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoHorizontalAnchor valueOf(int value) {
    switch(value) {
    case -2: return msoHorizontalAnchorMixed;
    case 1: return msoAnchorNone;
    case 2: return msoAnchorCenter;
    default: return new MsoHorizontalAnchor(value);
    }
  }

  public String toString() {
    switch(value) {
    case 2: return "msoAnchorCenter";
    case -2: return "msoHorizontalAnchorMixed";
    case 1: return "msoAnchorNone";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 2) != 0) sbuf.append("|msoAnchorCenter");
      if ((value & -2) != 0) sbuf.append("|msoHorizontalAnchorMixed");
      if ((value & 1) != 0) sbuf.append("|msoAnchorNone");
      return sbuf.toString();
      }
    }
  }
}
