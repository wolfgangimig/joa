/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * DefaultNoteType.
 * Defines default note type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class DefaultNoteType {

  // Typed constants
  public final static DefaultNoteType ucNoteTypeUnknown = new DefaultNoteType(0);
  public final static DefaultNoteType ucNoteTypePersonal = new DefaultNoteType(1);
  public final static DefaultNoteType ucNoteTypeOutOfOffice = new DefaultNoteType(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucNoteTypeUnknown = 0;
  public final static int _ucNoteTypePersonal = 1;
  public final static int _ucNoteTypeOutOfOffice = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private DefaultNoteType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  DefaultNoteType valueOf(int value) {
    switch(value) {
    case 0: return ucNoteTypeUnknown;
    case 1: return ucNoteTypePersonal;
    case 2: return ucNoteTypeOutOfOffice;
    default: return new DefaultNoteType(value);
    }
  }
}
