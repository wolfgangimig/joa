/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAttachmentType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlAttachmentType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlAttachmentType olByValue = new OlAttachmentType(1);
  public final static OlAttachmentType olByReference = new OlAttachmentType(4);
  public final static OlAttachmentType olEmbeddeditem = new OlAttachmentType(5);
  public final static OlAttachmentType olOLE = new OlAttachmentType(6);

  // Integer constants for bitsets and switch statements
  public final static int _olByValue = 1;
  public final static int _olByReference = 4;
  public final static int _olEmbeddeditem = 5;
  public final static int _olOLE = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlAttachmentType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlAttachmentType valueOf(int value) {
    switch(value) {
    case 1: return olByValue;
    case 4: return olByReference;
    case 5: return olEmbeddeditem;
    case 6: return olOLE;
    default: return new OlAttachmentType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "olByValue";
    case 4: return "olByReference";
    case 5: return "olEmbeddeditem";
    case 6: return "olOLE";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|olByValue");
      if ((value & 4) != 0) sbuf.append("|olByReference");
      if ((value & 5) != 0) sbuf.append("|olEmbeddeditem");
      if ((value & 6) != 0) sbuf.append("|olOLE");
      return sbuf.toString();
      }
    }
  }
}
