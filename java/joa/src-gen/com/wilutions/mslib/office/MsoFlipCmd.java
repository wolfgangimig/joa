/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFlipCmd.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoFlipCmd implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoFlipCmd msoFlipHorizontal = new MsoFlipCmd(0);
  public final static MsoFlipCmd msoFlipVertical = new MsoFlipCmd(1);

  // Integer constants for bitsets and switch statements
  public final static int _msoFlipHorizontal = 0;
  public final static int _msoFlipVertical = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoFlipCmd(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoFlipCmd valueOf(int value) {
    switch(value) {
    case 0: return msoFlipHorizontal;
    case 1: return msoFlipVertical;
    default: return new MsoFlipCmd(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoFlipHorizontal";
    case 1: return "msoFlipVertical";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoFlipHorizontal");
      if ((value & 1) != 0) sbuf.append("|msoFlipVertical");
      return sbuf.toString();
      }
    }
  }
}
