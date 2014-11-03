/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAppointmentCopyOptions.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlAppointmentCopyOptions {
  olPromptUser(0),
  olCreateAppointment(1),
  olCopyAsAccept(2);

  public final int value;
  private OlAppointmentCopyOptions(int value) { this.value = value; }
  public static  OlAppointmentCopyOptions valueOf(int value) {
    switch(value) {
    case 0: return olPromptUser;
    case 1: return olCreateAppointment;
    case 2: return olCopyAsAccept;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlAppointmentCopyOptions.class);
    }
  }
}
