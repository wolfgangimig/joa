/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBarProtection.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoBarProtection {
  msoBarNoProtection(0),
  msoBarNoCustomize(1),
  msoBarNoResize(2),
  msoBarNoMove(4),
  msoBarNoChangeVisible(8),
  msoBarNoChangeDock(16),
  msoBarNoVerticalDock(32),
  msoBarNoHorizontalDock(64);

  public final int value;
  private MsoBarProtection(int value) { this.value = value; }
  public static  MsoBarProtection valueOf(int value) {
    switch(value) {
    case 0: return msoBarNoProtection;
    case 1: return msoBarNoCustomize;
    case 2: return msoBarNoResize;
    case 4: return msoBarNoMove;
    case 8: return msoBarNoChangeVisible;
    case 16: return msoBarNoChangeDock;
    case 32: return msoBarNoVerticalDock;
    case 64: return msoBarNoHorizontalDock;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoBarProtection.class);
    }
  }
}
