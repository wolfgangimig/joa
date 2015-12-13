/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlShowItemCount.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlShowItemCount implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlShowItemCount olNoItemCount = new OlShowItemCount(0);
  public final static OlShowItemCount olShowUnreadItemCount = new OlShowItemCount(1);
  public final static OlShowItemCount olShowTotalItemCount = new OlShowItemCount(2);

  // Integer constants for bitsets and switch statements
  public final static int _olNoItemCount = 0;
  public final static int _olShowUnreadItemCount = 1;
  public final static int _olShowTotalItemCount = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlShowItemCount(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlShowItemCount valueOf(int value) {
    switch(value) {
    case 0: return olNoItemCount;
    case 1: return olShowUnreadItemCount;
    case 2: return olShowTotalItemCount;
    default: return new OlShowItemCount(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olNoItemCount";
    case 1: return "olShowUnreadItemCount";
    case 2: return "olShowTotalItemCount";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olNoItemCount");
      if ((value & 1) != 0) sbuf.append("|olShowUnreadItemCount");
      if ((value & 2) != 0) sbuf.append("|olShowTotalItemCount");
      return sbuf.toString();
      }
    }
  }
}
