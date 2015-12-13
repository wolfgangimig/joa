/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSensitivity.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlSensitivity implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlSensitivity olNormal = new OlSensitivity(0);
  public final static OlSensitivity olPersonal = new OlSensitivity(1);
  public final static OlSensitivity olPrivate = new OlSensitivity(2);
  public final static OlSensitivity olConfidential = new OlSensitivity(3);

  // Integer constants for bitsets and switch statements
  public final static int _olNormal = 0;
  public final static int _olPersonal = 1;
  public final static int _olPrivate = 2;
  public final static int _olConfidential = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlSensitivity(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlSensitivity valueOf(int value) {
    switch(value) {
    case 0: return olNormal;
    case 1: return olPersonal;
    case 2: return olPrivate;
    case 3: return olConfidential;
    default: return new OlSensitivity(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olNormal";
    case 1: return "olPersonal";
    case 2: return "olPrivate";
    case 3: return "olConfidential";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olNormal");
      if ((value & 1) != 0) sbuf.append("|olPersonal");
      if ((value & 2) != 0) sbuf.append("|olPrivate");
      if ((value & 3) != 0) sbuf.append("|olConfidential");
      return sbuf.toString();
      }
    }
  }
}
