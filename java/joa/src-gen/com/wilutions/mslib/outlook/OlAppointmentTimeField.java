/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAppointmentTimeField.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{BA5537F4-8941-4E26-871E-0D53D647B9FC}")
public enum OlAppointmentTimeField {
  olAppointmentTimeFieldNone(1),
  olAppointmentTimeFieldStart(2),
  olAppointmentTimeFieldEnd(3);

  public final int value;
  private OlAppointmentTimeField(int value) { this.value = value; }
  public static  OlAppointmentTimeField valueOf(int value) {
    switch(value) {
    case 1: return olAppointmentTimeFieldNone;
    case 2: return olAppointmentTimeFieldStart;
    case 3: return olAppointmentTimeFieldEnd;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlAppointmentTimeField.class);
    }
  }
}
