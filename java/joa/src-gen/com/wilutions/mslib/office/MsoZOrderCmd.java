/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoZOrderCmd.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoZOrderCmd {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoZOrderCmd msoBringToFront = new MsoZOrderCmd(0);
  public final static MsoZOrderCmd msoSendToBack = new MsoZOrderCmd(1);
  public final static MsoZOrderCmd msoBringForward = new MsoZOrderCmd(2);
  public final static MsoZOrderCmd msoSendBackward = new MsoZOrderCmd(3);
  public final static MsoZOrderCmd msoBringInFrontOfText = new MsoZOrderCmd(4);
  public final static MsoZOrderCmd msoSendBehindText = new MsoZOrderCmd(5);

  // Integer constants for bitsets and switch statements
  public final static int _msoBringToFront = 0;
  public final static int _msoSendToBack = 1;
  public final static int _msoBringForward = 2;
  public final static int _msoSendBackward = 3;
  public final static int _msoBringInFrontOfText = 4;
  public final static int _msoSendBehindText = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoZOrderCmd(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoZOrderCmd valueOf(int value) {
    switch(value) {
    case 0: return msoBringToFront;
    case 1: return msoSendToBack;
    case 2: return msoBringForward;
    case 3: return msoSendBackward;
    case 4: return msoBringInFrontOfText;
    case 5: return msoSendBehindText;
    default: return new MsoZOrderCmd(value);
    }
  }
}
