/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMeetingRecipientType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlMeetingRecipientType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlMeetingRecipientType olOrganizer = new OlMeetingRecipientType(0);
  public final static OlMeetingRecipientType olRequired = new OlMeetingRecipientType(1);
  public final static OlMeetingRecipientType olOptional = new OlMeetingRecipientType(2);
  public final static OlMeetingRecipientType olResource = new OlMeetingRecipientType(3);

  // Integer constants for bitsets and switch statements
  public final static int _olOrganizer = 0;
  public final static int _olRequired = 1;
  public final static int _olOptional = 2;
  public final static int _olResource = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlMeetingRecipientType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlMeetingRecipientType valueOf(int value) {
    switch(value) {
    case 0: return olOrganizer;
    case 1: return olRequired;
    case 2: return olOptional;
    case 3: return olResource;
    default: return new OlMeetingRecipientType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olOrganizer";
    case 1: return "olRequired";
    case 2: return "olOptional";
    case 3: return "olResource";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olOrganizer");
      if ((value & 1) != 0) sbuf.append("|olRequired");
      if ((value & 2) != 0) sbuf.append("|olOptional");
      if ((value & 3) != 0) sbuf.append("|olResource");
      return sbuf.toString();
      }
    }
  }
}
