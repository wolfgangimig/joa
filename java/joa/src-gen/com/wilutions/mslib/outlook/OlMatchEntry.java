/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMatchEntry.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{73628D00-B812-419F-8212-3D62079E22DB}")
public class OlMatchEntry {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlMatchEntry olMatchEntryFirstLetter = new OlMatchEntry(0);
  public final static OlMatchEntry olMatchEntryComplete = new OlMatchEntry(1);
  public final static OlMatchEntry olMatchEntryNone = new OlMatchEntry(2);

  // Integer constants for bitsets and switch statements
  public final static int _olMatchEntryFirstLetter = 0;
  public final static int _olMatchEntryComplete = 1;
  public final static int _olMatchEntryNone = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlMatchEntry(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlMatchEntry valueOf(int value) {
    switch(value) {
    case 0: return olMatchEntryFirstLetter;
    case 1: return olMatchEntryComplete;
    case 2: return olMatchEntryNone;
    default: return new OlMatchEntry(value);
    }
  }
}
