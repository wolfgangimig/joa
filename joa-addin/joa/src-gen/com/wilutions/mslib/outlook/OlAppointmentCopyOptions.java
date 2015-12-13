/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAppointmentCopyOptions.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlAppointmentCopyOptions implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlAppointmentCopyOptions olPromptUser = new OlAppointmentCopyOptions(0);
  public final static OlAppointmentCopyOptions olCreateAppointment = new OlAppointmentCopyOptions(1);
  public final static OlAppointmentCopyOptions olCopyAsAccept = new OlAppointmentCopyOptions(2);

  // Integer constants for bitsets and switch statements
  public final static int _olPromptUser = 0;
  public final static int _olCreateAppointment = 1;
  public final static int _olCopyAsAccept = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlAppointmentCopyOptions(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlAppointmentCopyOptions valueOf(int value) {
    switch(value) {
    case 0: return olPromptUser;
    case 1: return olCreateAppointment;
    case 2: return olCopyAsAccept;
    default: return new OlAppointmentCopyOptions(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olPromptUser";
    case 1: return "olCreateAppointment";
    case 2: return "olCopyAsAccept";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olPromptUser");
      if ((value & 1) != 0) sbuf.append("|olCreateAppointment");
      if ((value & 2) != 0) sbuf.append("|olCopyAsAccept");
      return sbuf.toString();
      }
    }
  }
}
