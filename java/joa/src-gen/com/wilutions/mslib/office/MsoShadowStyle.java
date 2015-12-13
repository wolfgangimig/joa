/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoShadowStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoShadowStyle implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoShadowStyle msoShadowStyleMixed = new MsoShadowStyle(-2);
  public final static MsoShadowStyle msoShadowStyleInnerShadow = new MsoShadowStyle(1);
  public final static MsoShadowStyle msoShadowStyleOuterShadow = new MsoShadowStyle(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoShadowStyleMixed = -2;
  public final static int _msoShadowStyleInnerShadow = 1;
  public final static int _msoShadowStyleOuterShadow = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoShadowStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoShadowStyle valueOf(int value) {
    switch(value) {
    case -2: return msoShadowStyleMixed;
    case 1: return msoShadowStyleInnerShadow;
    case 2: return msoShadowStyleOuterShadow;
    default: return new MsoShadowStyle(value);
    }
  }

  public String toString() {
    switch(value) {
    case -2: return "msoShadowStyleMixed";
    case 1: return "msoShadowStyleInnerShadow";
    case 2: return "msoShadowStyleOuterShadow";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -2) != 0) sbuf.append("|msoShadowStyleMixed");
      if ((value & 1) != 0) sbuf.append("|msoShadowStyleInnerShadow");
      if ((value & 2) != 0) sbuf.append("|msoShadowStyleOuterShadow");
      return sbuf.toString();
      }
    }
  }
}
