/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMatchEntry.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{73628D00-B812-419F-8212-3D62079E22DB}")
public enum OlMatchEntry {
  olMatchEntryFirstLetter(0),
  olMatchEntryComplete(1),
  olMatchEntryNone(2);

  public final int value;
  private OlMatchEntry(int value) { this.value = value; }
  public static  OlMatchEntry valueOf(int value) {
    switch(value) {
    case 0: return olMatchEntryFirstLetter;
    case 1: return olMatchEntryComplete;
    case 2: return olMatchEntryNone;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlMatchEntry.class);
    }
  }
}
