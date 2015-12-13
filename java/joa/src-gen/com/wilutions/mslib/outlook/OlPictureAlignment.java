/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlPictureAlignment.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{0BEAB7D8-3BA8-4960-899B-096FCE2EE60F}")
public class OlPictureAlignment implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlPictureAlignment olPictureAlignmentLeft = new OlPictureAlignment(0);
  public final static OlPictureAlignment olPictureAlignmentTop = new OlPictureAlignment(1);

  // Integer constants for bitsets and switch statements
  public final static int _olPictureAlignmentLeft = 0;
  public final static int _olPictureAlignmentTop = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlPictureAlignment(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlPictureAlignment valueOf(int value) {
    switch(value) {
    case 0: return olPictureAlignmentLeft;
    case 1: return olPictureAlignmentTop;
    default: return new OlPictureAlignment(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olPictureAlignmentLeft";
    case 1: return "olPictureAlignmentTop";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olPictureAlignmentLeft");
      if ((value & 1) != 0) sbuf.append("|olPictureAlignmentTop");
      return sbuf.toString();
      }
    }
  }
}
