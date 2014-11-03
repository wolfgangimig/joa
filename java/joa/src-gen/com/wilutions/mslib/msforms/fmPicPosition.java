/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmPicPosition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{9011F7A0-C130-11CD-9BE1-00006B82871A}")
public enum fmPicPosition {
  fmPicPositionCenter(0),
  fmPicPositionTopLeft(1),
  fmPicPositionTopCenter(2),
  fmPicPositionTopRight(3),
  fmPicPositionCenterLeft(4),
  fmPicPositionCenterRight(5),
  fmPicPositionBottomLeft(6),
  fmPicPositionBottomCenter(7),
  fmPicPositionBottomRight(8);

  public final int value;
  private fmPicPosition(int value) { this.value = value; }
  public static  fmPicPosition valueOf(int value) {
    switch(value) {
    case 0: return fmPicPositionCenter;
    case 1: return fmPicPositionTopLeft;
    case 2: return fmPicPositionTopCenter;
    case 3: return fmPicPositionTopRight;
    case 4: return fmPicPositionCenterLeft;
    case 5: return fmPicPositionCenterRight;
    case 6: return fmPicPositionBottomLeft;
    case 7: return fmPicPositionBottomCenter;
    case 8: return fmPicPositionBottomRight;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmPicPosition.class);
    }
  }
}
