/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmPicturePosition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{317A54C2-C7B1-11CE-9AFD-00AA00600AB8}")
public class fmPicturePosition {

  // Typed constants
  public final static fmPicturePosition fmPicturePositionLeftTop = new fmPicturePosition(0);
  public final static fmPicturePosition fmPicturePositionLeftCenter = new fmPicturePosition(1);
  public final static fmPicturePosition fmPicturePositionLeftBottom = new fmPicturePosition(2);
  public final static fmPicturePosition fmPicturePositionRightTop = new fmPicturePosition(3);
  public final static fmPicturePosition fmPicturePositionRightCenter = new fmPicturePosition(4);
  public final static fmPicturePosition fmPicturePositionRightBottom = new fmPicturePosition(5);
  public final static fmPicturePosition fmPicturePositionAboveLeft = new fmPicturePosition(6);
  public final static fmPicturePosition fmPicturePositionAboveCenter = new fmPicturePosition(7);
  public final static fmPicturePosition fmPicturePositionAboveRight = new fmPicturePosition(8);
  public final static fmPicturePosition fmPicturePositionBelowLeft = new fmPicturePosition(9);
  public final static fmPicturePosition fmPicturePositionBelowCenter = new fmPicturePosition(10);
  public final static fmPicturePosition fmPicturePositionBelowRight = new fmPicturePosition(11);
  public final static fmPicturePosition fmPicturePositionCenter = new fmPicturePosition(12);

  // Integer constants for bitsets and switch statements
  public final static int _fmPicturePositionLeftTop = 0;
  public final static int _fmPicturePositionLeftCenter = 1;
  public final static int _fmPicturePositionLeftBottom = 2;
  public final static int _fmPicturePositionRightTop = 3;
  public final static int _fmPicturePositionRightCenter = 4;
  public final static int _fmPicturePositionRightBottom = 5;
  public final static int _fmPicturePositionAboveLeft = 6;
  public final static int _fmPicturePositionAboveCenter = 7;
  public final static int _fmPicturePositionAboveRight = 8;
  public final static int _fmPicturePositionBelowLeft = 9;
  public final static int _fmPicturePositionBelowCenter = 10;
  public final static int _fmPicturePositionBelowRight = 11;
  public final static int _fmPicturePositionCenter = 12;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmPicturePosition(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new fmPicturePosition(value);
    }
  }
}
