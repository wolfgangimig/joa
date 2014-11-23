/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * DefaultNoteType.
 * Defines default note type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum DefaultNoteType {
  ucNoteTypeUnknown(0),
  ucNoteTypePersonal(1),
  ucNoteTypeOutOfOffice(2);

  public final int value;
  private DefaultNoteType(int value) { this.value = value; }
  public static  DefaultNoteType valueOf(int value) {
    switch(value) {
    case 0: return ucNoteTypeUnknown;
    case 1: return ucNoteTypePersonal;
    case 2: return ucNoteTypeOutOfOffice;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + DefaultNoteType.class);
    }
  }
}
