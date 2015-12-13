/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmDropButtonStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{14D122B0-C6E7-11CE-827C-00AA004BA6AE}")
public class fmDropButtonStyle implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmDropButtonStyle fmDropButtonStylePlain = new fmDropButtonStyle(0);
  public final static fmDropButtonStyle fmDropButtonStyleArrow = new fmDropButtonStyle(1);
  public final static fmDropButtonStyle fmDropButtonStyleEllipsis = new fmDropButtonStyle(2);
  public final static fmDropButtonStyle fmDropButtonStyleReduce = new fmDropButtonStyle(3);

  // Integer constants for bitsets and switch statements
  public final static int _fmDropButtonStylePlain = 0;
  public final static int _fmDropButtonStyleArrow = 1;
  public final static int _fmDropButtonStyleEllipsis = 2;
  public final static int _fmDropButtonStyleReduce = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmDropButtonStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmDropButtonStyle valueOf(int value) {
    switch(value) {
    case 0: return fmDropButtonStylePlain;
    case 1: return fmDropButtonStyleArrow;
    case 2: return fmDropButtonStyleEllipsis;
    case 3: return fmDropButtonStyleReduce;
    default: return new fmDropButtonStyle(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "fmDropButtonStylePlain";
    case 1: return "fmDropButtonStyleArrow";
    case 2: return "fmDropButtonStyleEllipsis";
    case 3: return "fmDropButtonStyleReduce";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|fmDropButtonStylePlain");
      if ((value & 1) != 0) sbuf.append("|fmDropButtonStyleArrow");
      if ((value & 2) != 0) sbuf.append("|fmDropButtonStyleEllipsis");
      if ((value & 3) != 0) sbuf.append("|fmDropButtonStyleReduce");
      return sbuf.toString();
      }
    }
  }
}
