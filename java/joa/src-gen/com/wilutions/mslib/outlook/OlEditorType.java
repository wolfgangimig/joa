/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlEditorType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlEditorType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlEditorType olEditorText = new OlEditorType(1);
  public final static OlEditorType olEditorHTML = new OlEditorType(2);
  public final static OlEditorType olEditorRTF = new OlEditorType(3);
  public final static OlEditorType olEditorWord = new OlEditorType(4);

  // Integer constants for bitsets and switch statements
  public final static int _olEditorText = 1;
  public final static int _olEditorHTML = 2;
  public final static int _olEditorRTF = 3;
  public final static int _olEditorWord = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlEditorType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlEditorType valueOf(int value) {
    switch(value) {
    case 1: return olEditorText;
    case 2: return olEditorHTML;
    case 3: return olEditorRTF;
    case 4: return olEditorWord;
    default: return new OlEditorType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "olEditorText";
    case 2: return "olEditorHTML";
    case 3: return "olEditorRTF";
    case 4: return "olEditorWord";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|olEditorText");
      if ((value & 2) != 0) sbuf.append("|olEditorHTML");
      if ((value & 3) != 0) sbuf.append("|olEditorRTF");
      if ((value & 4) != 0) sbuf.append("|olEditorWord");
      return sbuf.toString();
      }
    }
  }
}
