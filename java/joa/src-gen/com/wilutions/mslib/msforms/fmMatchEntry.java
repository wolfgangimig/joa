/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmMatchEntry.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{8CCD0AC2-B1AD-11CE-8276-00AA004BA6AE}")
public class fmMatchEntry {

  // Typed constants
  public final static fmMatchEntry fmMatchEntryFirstLetter = new fmMatchEntry(0);
  public final static fmMatchEntry fmMatchEntryComplete = new fmMatchEntry(1);
  public final static fmMatchEntry fmMatchEntryNone = new fmMatchEntry(2);

  // Integer constants for bitsets and switch statements
  public final static int _fmMatchEntryFirstLetter = 0;
  public final static int _fmMatchEntryComplete = 1;
  public final static int _fmMatchEntryNone = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmMatchEntry(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmMatchEntry valueOf(int value) {
    switch(value) {
    case 0: return fmMatchEntryFirstLetter;
    case 1: return fmMatchEntryComplete;
    case 2: return fmMatchEntryNone;
    default: return new fmMatchEntry(value);
    }
  }
}
