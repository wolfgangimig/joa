/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmPicturePosition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{317A54C2-C7B1-11CE-9AFD-00AA00600AB8}")
public enum fmPicturePosition {
  fmPicturePositionLeftTop(0),
  fmPicturePositionLeftCenter(1),
  fmPicturePositionLeftBottom(2),
  fmPicturePositionRightTop(3),
  fmPicturePositionRightCenter(4),
  fmPicturePositionRightBottom(5),
  fmPicturePositionAboveLeft(6),
  fmPicturePositionAboveCenter(7),
  fmPicturePositionAboveRight(8),
  fmPicturePositionBelowLeft(9),
  fmPicturePositionBelowCenter(10),
  fmPicturePositionBelowRight(11),
  fmPicturePositionCenter(12);

  public final int value;
  private fmPicturePosition(int value) { this.value = value; }
  public static  fmPicturePosition valueOf(int value) {
    switch(value) {
    case 0: return fmPicturePositionLeftTop;
    case 1: return fmPicturePositionLeftCenter;
    case 2: return fmPicturePositionLeftBottom;
    case 3: return fmPicturePositionRightTop;
    case 4: return fmPicturePositionRightCenter;
    case 5: return fmPicturePositionRightBottom;
    case 6: return fmPicturePositionAboveLeft;
    case 7: return fmPicturePositionAboveCenter;
    case 8: return fmPicturePositionAboveRight;
    case 9: return fmPicturePositionBelowLeft;
    case 10: return fmPicturePositionBelowCenter;
    case 11: return fmPicturePositionBelowRight;
    case 12: return fmPicturePositionCenter;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmPicturePosition.class);
    }
  }
}
