/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlTableContents.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlTableContents implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlTableContents olUserItems = new OlTableContents(0);
  public final static OlTableContents olHiddenItems = new OlTableContents(1);

  // Integer constants for bitsets and switch statements
  public final static int _olUserItems = 0;
  public final static int _olHiddenItems = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlTableContents(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlTableContents valueOf(int value) {
    switch(value) {
    case 0: return olUserItems;
    case 1: return olHiddenItems;
    default: return new OlTableContents(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olUserItems";
    case 1: return "olHiddenItems";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olUserItems");
      if ((value & 1) != 0) sbuf.append("|olHiddenItems");
      return sbuf.toString();
      }
    }
  }
}
