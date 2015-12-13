/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAppointmentTimeField.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{BA5537F4-8941-4E26-871E-0D53D647B9FC}")
public class OlAppointmentTimeField implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlAppointmentTimeField olAppointmentTimeFieldNone = new OlAppointmentTimeField(1);
  public final static OlAppointmentTimeField olAppointmentTimeFieldStart = new OlAppointmentTimeField(2);
  public final static OlAppointmentTimeField olAppointmentTimeFieldEnd = new OlAppointmentTimeField(3);

  // Integer constants for bitsets and switch statements
  public final static int _olAppointmentTimeFieldNone = 1;
  public final static int _olAppointmentTimeFieldStart = 2;
  public final static int _olAppointmentTimeFieldEnd = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlAppointmentTimeField(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlAppointmentTimeField valueOf(int value) {
    switch(value) {
    case 1: return olAppointmentTimeFieldNone;
    case 2: return olAppointmentTimeFieldStart;
    case 3: return olAppointmentTimeFieldEnd;
    default: return new OlAppointmentTimeField(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "olAppointmentTimeFieldNone";
    case 2: return "olAppointmentTimeFieldStart";
    case 3: return "olAppointmentTimeFieldEnd";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|olAppointmentTimeFieldNone");
      if ((value & 2) != 0) sbuf.append("|olAppointmentTimeFieldStart");
      if ((value & 3) != 0) sbuf.append("|olAppointmentTimeFieldEnd");
      return sbuf.toString();
      }
    }
  }
}
