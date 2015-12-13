/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * MUAFOLDER.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MUAFOLDER {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MUAFOLDER MUAFOLDER_INBOX = new MUAFOLDER(0);
  public final static MUAFOLDER MUAFOLDER_ALL_OTHER_FOLDERS = new MUAFOLDER(1);

  // Integer constants for bitsets and switch statements
  public final static int _MUAFOLDER_INBOX = 0;
  public final static int _MUAFOLDER_ALL_OTHER_FOLDERS = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MUAFOLDER(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MUAFOLDER valueOf(int value) {
    switch(value) {
    case 0: return MUAFOLDER_INBOX;
    case 1: return MUAFOLDER_ALL_OTHER_FOLDERS;
    default: return new MUAFOLDER(value);
    }
  }
}
