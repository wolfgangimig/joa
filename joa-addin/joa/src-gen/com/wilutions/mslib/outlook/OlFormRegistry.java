/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormRegistry.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlFormRegistry implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlFormRegistry olDefaultRegistry = new OlFormRegistry(0);
  public final static OlFormRegistry olPersonalRegistry = new OlFormRegistry(2);
  public final static OlFormRegistry olFolderRegistry = new OlFormRegistry(3);
  public final static OlFormRegistry olOrganizationRegistry = new OlFormRegistry(4);

  // Integer constants for bitsets and switch statements
  public final static int _olDefaultRegistry = 0;
  public final static int _olPersonalRegistry = 2;
  public final static int _olFolderRegistry = 3;
  public final static int _olOrganizationRegistry = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlFormRegistry(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlFormRegistry valueOf(int value) {
    switch(value) {
    case 0: return olDefaultRegistry;
    case 2: return olPersonalRegistry;
    case 3: return olFolderRegistry;
    case 4: return olOrganizationRegistry;
    default: return new OlFormRegistry(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olDefaultRegistry";
    case 2: return "olPersonalRegistry";
    case 3: return "olFolderRegistry";
    case 4: return "olOrganizationRegistry";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olDefaultRegistry");
      if ((value & 2) != 0) sbuf.append("|olPersonalRegistry");
      if ((value & 3) != 0) sbuf.append("|olFolderRegistry");
      if ((value & 4) != 0) sbuf.append("|olOrganizationRegistry");
      return sbuf.toString();
      }
    }
  }
}
