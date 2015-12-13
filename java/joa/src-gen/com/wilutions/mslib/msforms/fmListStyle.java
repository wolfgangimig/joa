/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmListStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{F00164C1-B17B-11CE-A95D-00AA006CB389}")
public class fmListStyle implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmListStyle fmListStylePlain = new fmListStyle(0);
  public final static fmListStyle fmListStyleOption = new fmListStyle(1);

  // Integer constants for bitsets and switch statements
  public final static int _fmListStylePlain = 0;
  public final static int _fmListStyleOption = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmListStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmListStyle valueOf(int value) {
    switch(value) {
    case 0: return fmListStylePlain;
    case 1: return fmListStyleOption;
    default: return new fmListStyle(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "fmListStylePlain";
    case 1: return "fmListStyleOption";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|fmListStylePlain");
      if ((value & 1) != 0) sbuf.append("|fmListStyleOption");
      return sbuf.toString();
      }
    }
  }
}
