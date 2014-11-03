/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmMatchEntry.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{8CCD0AC2-B1AD-11CE-8276-00AA004BA6AE}")
public enum fmMatchEntry {
  fmMatchEntryFirstLetter(0),
  fmMatchEntryComplete(1),
  fmMatchEntryNone(2);

  public final int value;
  private fmMatchEntry(int value) { this.value = value; }
  public static  fmMatchEntry valueOf(int value) {
    switch(value) {
    case 0: return fmMatchEntryFirstLetter;
    case 1: return fmMatchEntryComplete;
    case 2: return fmMatchEntryNone;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmMatchEntry.class);
    }
  }
}
