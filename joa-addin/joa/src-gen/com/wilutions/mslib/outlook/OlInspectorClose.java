/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlInspectorClose.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlInspectorClose implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlInspectorClose olSave = new OlInspectorClose(0);
  public final static OlInspectorClose olDiscard = new OlInspectorClose(1);
  public final static OlInspectorClose olPromptForSave = new OlInspectorClose(2);

  // Integer constants for bitsets and switch statements
  public final static int _olSave = 0;
  public final static int _olDiscard = 1;
  public final static int _olPromptForSave = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlInspectorClose(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlInspectorClose valueOf(int value) {
    switch(value) {
    case 0: return olSave;
    case 1: return olDiscard;
    case 2: return olPromptForSave;
    default: return new OlInspectorClose(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olSave";
    case 1: return "olDiscard";
    case 2: return "olPromptForSave";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olSave");
      if ((value & 1) != 0) sbuf.append("|olDiscard");
      if ((value & 2) != 0) sbuf.append("|olPromptForSave");
      return sbuf.toString();
      }
    }
  }
}
