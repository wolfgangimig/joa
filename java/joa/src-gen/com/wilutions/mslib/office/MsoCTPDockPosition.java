/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCTPDockPosition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoCTPDockPosition {
  msoCTPDockPositionLeft(0),
  msoCTPDockPositionTop(1),
  msoCTPDockPositionRight(2),
  msoCTPDockPositionBottom(3),
  msoCTPDockPositionFloating(4);

  public final int value;
  private MsoCTPDockPosition(int value) { this.value = value; }
  public static  MsoCTPDockPosition valueOf(int value) {
    switch(value) {
    case 0: return msoCTPDockPositionLeft;
    case 1: return msoCTPDockPositionTop;
    case 2: return msoCTPDockPositionRight;
    case 3: return msoCTPDockPositionBottom;
    case 4: return msoCTPDockPositionFloating;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoCTPDockPosition.class);
    }
  }
}
