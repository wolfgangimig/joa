/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoZOrderCmd.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoZOrderCmd {
  msoBringToFront(0),
  msoSendToBack(1),
  msoBringForward(2),
  msoSendBackward(3),
  msoBringInFrontOfText(4),
  msoSendBehindText(5);

  public final int value;
  private MsoZOrderCmd(int value) { this.value = value; }
  public static  MsoZOrderCmd valueOf(int value) {
    switch(value) {
    case 0: return msoBringToFront;
    case 1: return msoSendToBack;
    case 2: return msoBringForward;
    case 3: return msoSendBackward;
    case 4: return msoBringInFrontOfText;
    case 5: return msoSendBehindText;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoZOrderCmd.class);
    }
  }
}
