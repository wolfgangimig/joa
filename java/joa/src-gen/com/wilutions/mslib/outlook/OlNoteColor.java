/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlNoteColor.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlNoteColor {
  olBlue(0),
  olGreen(1),
  olPink(2),
  olYellow(3),
  olWhite(4);

  public final int value;
  private OlNoteColor(int value) { this.value = value; }
  public static  OlNoteColor valueOf(int value) {
    switch(value) {
    case 0: return olBlue;
    case 1: return olGreen;
    case 2: return olPink;
    case 3: return olYellow;
    case 4: return olWhite;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlNoteColor.class);
    }
  }
}
