/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBarPosition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoBarPosition {
  msoBarLeft(0),
  msoBarTop(1),
  msoBarRight(2),
  msoBarBottom(3),
  msoBarFloating(4),
  msoBarPopup(5),
  msoBarMenuBar(6);

  public final int value;
  private MsoBarPosition(int value) { this.value = value; }
  public static  MsoBarPosition valueOf(int value) {
    switch(value) {
    case 0: return msoBarLeft;
    case 1: return msoBarTop;
    case 2: return msoBarRight;
    case 3: return msoBarBottom;
    case 4: return msoBarFloating;
    case 5: return msoBarPopup;
    case 6: return msoBarMenuBar;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoBarPosition.class);
    }
  }
}
