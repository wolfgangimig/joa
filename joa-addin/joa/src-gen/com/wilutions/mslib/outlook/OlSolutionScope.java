/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSolutionScope.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlSolutionScope implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlSolutionScope olHideInDefaultModules = new OlSolutionScope(0);
  public final static OlSolutionScope olShowInDefaultModules = new OlSolutionScope(1);

  // Integer constants for bitsets and switch statements
  public final static int _olHideInDefaultModules = 0;
  public final static int _olShowInDefaultModules = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlSolutionScope(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlSolutionScope valueOf(int value) {
    switch(value) {
    case 0: return olHideInDefaultModules;
    case 1: return olShowInDefaultModules;
    default: return new OlSolutionScope(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olHideInDefaultModules";
    case 1: return "olShowInDefaultModules";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olHideInDefaultModules");
      if ((value & 1) != 0) sbuf.append("|olShowInDefaultModules");
      return sbuf.toString();
      }
    }
  }
}
