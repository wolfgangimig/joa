/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoScriptLocation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoScriptLocation {

  // Typed constants
  public final static MsoScriptLocation msoScriptLocationInHead = new MsoScriptLocation(1);
  public final static MsoScriptLocation msoScriptLocationInBody = new MsoScriptLocation(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoScriptLocationInHead = 1;
  public final static int _msoScriptLocationInBody = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoScriptLocation(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoScriptLocation valueOf(int value) {
    switch(value) {
    case 1: return msoScriptLocationInHead;
    case 2: return msoScriptLocationInBody;
    default: return new MsoScriptLocation(value);
    }
  }
}
