/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoAutoSize.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoAutoSize implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoAutoSize msoAutoSizeMixed = new MsoAutoSize(-2);
  public final static MsoAutoSize msoAutoSizeNone = new MsoAutoSize(0);
  public final static MsoAutoSize msoAutoSizeShapeToFitText = new MsoAutoSize(1);
  public final static MsoAutoSize msoAutoSizeTextToFitShape = new MsoAutoSize(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoAutoSizeMixed = -2;
  public final static int _msoAutoSizeNone = 0;
  public final static int _msoAutoSizeShapeToFitText = 1;
  public final static int _msoAutoSizeTextToFitShape = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoAutoSize(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoAutoSize valueOf(int value) {
    switch(value) {
    case -2: return msoAutoSizeMixed;
    case 0: return msoAutoSizeNone;
    case 1: return msoAutoSizeShapeToFitText;
    case 2: return msoAutoSizeTextToFitShape;
    default: return new MsoAutoSize(value);
    }
  }

  public String toString() {
    switch(value) {
    case -2: return "msoAutoSizeMixed";
    case 0: return "msoAutoSizeNone";
    case 1: return "msoAutoSizeShapeToFitText";
    case 2: return "msoAutoSizeTextToFitShape";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -2) != 0) sbuf.append("|msoAutoSizeMixed");
      if ((value & 0) != 0) sbuf.append("|msoAutoSizeNone");
      if ((value & 1) != 0) sbuf.append("|msoAutoSizeShapeToFitText");
      if ((value & 2) != 0) sbuf.append("|msoAutoSizeTextToFitShape");
      return sbuf.toString();
      }
    }
  }
}
