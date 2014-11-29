/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTriState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoTriState {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoTriState msoTrue = new MsoTriState(-1);
  public final static MsoTriState msoFalse = new MsoTriState(0);
  public final static MsoTriState msoCTrue = new MsoTriState(1);
  public final static MsoTriState msoTriStateToggle = new MsoTriState(-3);
  public final static MsoTriState msoTriStateMixed = new MsoTriState(-2);

  // Integer constants for bitsets and switch statements
  public final static int _msoTrue = -1;
  public final static int _msoFalse = 0;
  public final static int _msoCTrue = 1;
  public final static int _msoTriStateToggle = -3;
  public final static int _msoTriStateMixed = -2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoTriState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoTriState valueOf(int value) {
    switch(value) {
    case -1: return msoTrue;
    case 0: return msoFalse;
    case 1: return msoCTrue;
    case -3: return msoTriStateToggle;
    case -2: return msoTriStateMixed;
    default: return new MsoTriState(value);
    }
  }
}
