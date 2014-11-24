/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmPicPosition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{9011F7A0-C130-11CD-9BE1-00006B82871A}")
public class fmPicPosition {

  // Typed constants
  public final static fmPicPosition fmPicPositionCenter = new fmPicPosition(0);
  public final static fmPicPosition fmPicPositionTopLeft = new fmPicPosition(1);
  public final static fmPicPosition fmPicPositionTopCenter = new fmPicPosition(2);
  public final static fmPicPosition fmPicPositionTopRight = new fmPicPosition(3);
  public final static fmPicPosition fmPicPositionCenterLeft = new fmPicPosition(4);
  public final static fmPicPosition fmPicPositionCenterRight = new fmPicPosition(5);
  public final static fmPicPosition fmPicPositionBottomLeft = new fmPicPosition(6);
  public final static fmPicPosition fmPicPositionBottomCenter = new fmPicPosition(7);
  public final static fmPicPosition fmPicPositionBottomRight = new fmPicPosition(8);

  // Integer constants for bitsets and switch statements
  public final static int _fmPicPositionCenter = 0;
  public final static int _fmPicPositionTopLeft = 1;
  public final static int _fmPicPositionTopCenter = 2;
  public final static int _fmPicPositionTopRight = 3;
  public final static int _fmPicPositionCenterLeft = 4;
  public final static int _fmPicPositionCenterRight = 5;
  public final static int _fmPicPositionBottomLeft = 6;
  public final static int _fmPicPositionBottomCenter = 7;
  public final static int _fmPicPositionBottomRight = 8;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmPicPosition(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new fmPicPosition(value);
    }
  }
}
