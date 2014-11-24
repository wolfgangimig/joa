/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPresetCamera.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoPresetCamera {

  // Typed constants
  public final static MsoPresetCamera msoPresetCameraMixed = new MsoPresetCamera(-2);
  public final static MsoPresetCamera msoCameraLegacyObliqueTopLeft = new MsoPresetCamera(1);
  public final static MsoPresetCamera msoCameraLegacyObliqueTop = new MsoPresetCamera(2);
  public final static MsoPresetCamera msoCameraLegacyObliqueTopRight = new MsoPresetCamera(3);
  public final static MsoPresetCamera msoCameraLegacyObliqueLeft = new MsoPresetCamera(4);
  public final static MsoPresetCamera msoCameraLegacyObliqueFront = new MsoPresetCamera(5);
  public final static MsoPresetCamera msoCameraLegacyObliqueRight = new MsoPresetCamera(6);
  public final static MsoPresetCamera msoCameraLegacyObliqueBottomLeft = new MsoPresetCamera(7);
  public final static MsoPresetCamera msoCameraLegacyObliqueBottom = new MsoPresetCamera(8);
  public final static MsoPresetCamera msoCameraLegacyObliqueBottomRight = new MsoPresetCamera(9);
  public final static MsoPresetCamera msoCameraLegacyPerspectiveTopLeft = new MsoPresetCamera(10);
  public final static MsoPresetCamera msoCameraLegacyPerspectiveTop = new MsoPresetCamera(11);
  public final static MsoPresetCamera msoCameraLegacyPerspectiveTopRight = new MsoPresetCamera(12);
  public final static MsoPresetCamera msoCameraLegacyPerspectiveLeft = new MsoPresetCamera(13);
  public final static MsoPresetCamera msoCameraLegacyPerspectiveFront = new MsoPresetCamera(14);
  public final static MsoPresetCamera msoCameraLegacyPerspectiveRight = new MsoPresetCamera(15);
  public final static MsoPresetCamera msoCameraLegacyPerspectiveBottomLeft = new MsoPresetCamera(16);
  public final static MsoPresetCamera msoCameraLegacyPerspectiveBottom = new MsoPresetCamera(17);
  public final static MsoPresetCamera msoCameraLegacyPerspectiveBottomRight = new MsoPresetCamera(18);
  public final static MsoPresetCamera msoCameraOrthographicFront = new MsoPresetCamera(19);
  public final static MsoPresetCamera msoCameraIsometricTopUp = new MsoPresetCamera(20);
  public final static MsoPresetCamera msoCameraIsometricTopDown = new MsoPresetCamera(21);
  public final static MsoPresetCamera msoCameraIsometricBottomUp = new MsoPresetCamera(22);
  public final static MsoPresetCamera msoCameraIsometricBottomDown = new MsoPresetCamera(23);
  public final static MsoPresetCamera msoCameraIsometricLeftUp = new MsoPresetCamera(24);
  public final static MsoPresetCamera msoCameraIsometricLeftDown = new MsoPresetCamera(25);
  public final static MsoPresetCamera msoCameraIsometricRightUp = new MsoPresetCamera(26);
  public final static MsoPresetCamera msoCameraIsometricRightDown = new MsoPresetCamera(27);
  public final static MsoPresetCamera msoCameraIsometricOffAxis1Left = new MsoPresetCamera(28);
  public final static MsoPresetCamera msoCameraIsometricOffAxis1Right = new MsoPresetCamera(29);
  public final static MsoPresetCamera msoCameraIsometricOffAxis1Top = new MsoPresetCamera(30);
  public final static MsoPresetCamera msoCameraIsometricOffAxis2Left = new MsoPresetCamera(31);
  public final static MsoPresetCamera msoCameraIsometricOffAxis2Right = new MsoPresetCamera(32);
  public final static MsoPresetCamera msoCameraIsometricOffAxis2Top = new MsoPresetCamera(33);
  public final static MsoPresetCamera msoCameraIsometricOffAxis3Left = new MsoPresetCamera(34);
  public final static MsoPresetCamera msoCameraIsometricOffAxis3Right = new MsoPresetCamera(35);
  public final static MsoPresetCamera msoCameraIsometricOffAxis3Bottom = new MsoPresetCamera(36);
  public final static MsoPresetCamera msoCameraIsometricOffAxis4Left = new MsoPresetCamera(37);
  public final static MsoPresetCamera msoCameraIsometricOffAxis4Right = new MsoPresetCamera(38);
  public final static MsoPresetCamera msoCameraIsometricOffAxis4Bottom = new MsoPresetCamera(39);
  public final static MsoPresetCamera msoCameraObliqueTopLeft = new MsoPresetCamera(40);
  public final static MsoPresetCamera msoCameraObliqueTop = new MsoPresetCamera(41);
  public final static MsoPresetCamera msoCameraObliqueTopRight = new MsoPresetCamera(42);
  public final static MsoPresetCamera msoCameraObliqueLeft = new MsoPresetCamera(43);
  public final static MsoPresetCamera msoCameraObliqueRight = new MsoPresetCamera(44);
  public final static MsoPresetCamera msoCameraObliqueBottomLeft = new MsoPresetCamera(45);
  public final static MsoPresetCamera msoCameraObliqueBottom = new MsoPresetCamera(46);
  public final static MsoPresetCamera msoCameraObliqueBottomRight = new MsoPresetCamera(47);
  public final static MsoPresetCamera msoCameraPerspectiveFront = new MsoPresetCamera(48);
  public final static MsoPresetCamera msoCameraPerspectiveLeft = new MsoPresetCamera(49);
  public final static MsoPresetCamera msoCameraPerspectiveRight = new MsoPresetCamera(50);
  public final static MsoPresetCamera msoCameraPerspectiveAbove = new MsoPresetCamera(51);
  public final static MsoPresetCamera msoCameraPerspectiveBelow = new MsoPresetCamera(52);
  public final static MsoPresetCamera msoCameraPerspectiveAboveLeftFacing = new MsoPresetCamera(53);
  public final static MsoPresetCamera msoCameraPerspectiveAboveRightFacing = new MsoPresetCamera(54);
  public final static MsoPresetCamera msoCameraPerspectiveContrastingLeftFacing = new MsoPresetCamera(55);
  public final static MsoPresetCamera msoCameraPerspectiveContrastingRightFacing = new MsoPresetCamera(56);
  public final static MsoPresetCamera msoCameraPerspectiveHeroicLeftFacing = new MsoPresetCamera(57);
  public final static MsoPresetCamera msoCameraPerspectiveHeroicRightFacing = new MsoPresetCamera(58);
  public final static MsoPresetCamera msoCameraPerspectiveHeroicExtremeLeftFacing = new MsoPresetCamera(59);
  public final static MsoPresetCamera msoCameraPerspectiveHeroicExtremeRightFacing = new MsoPresetCamera(60);
  public final static MsoPresetCamera msoCameraPerspectiveRelaxed = new MsoPresetCamera(61);
  public final static MsoPresetCamera msoCameraPerspectiveRelaxedModerately = new MsoPresetCamera(62);

  // Integer constants for bitsets and switch statements
  public final static int _msoPresetCameraMixed = -2;
  public final static int _msoCameraLegacyObliqueTopLeft = 1;
  public final static int _msoCameraLegacyObliqueTop = 2;
  public final static int _msoCameraLegacyObliqueTopRight = 3;
  public final static int _msoCameraLegacyObliqueLeft = 4;
  public final static int _msoCameraLegacyObliqueFront = 5;
  public final static int _msoCameraLegacyObliqueRight = 6;
  public final static int _msoCameraLegacyObliqueBottomLeft = 7;
  public final static int _msoCameraLegacyObliqueBottom = 8;
  public final static int _msoCameraLegacyObliqueBottomRight = 9;
  public final static int _msoCameraLegacyPerspectiveTopLeft = 10;
  public final static int _msoCameraLegacyPerspectiveTop = 11;
  public final static int _msoCameraLegacyPerspectiveTopRight = 12;
  public final static int _msoCameraLegacyPerspectiveLeft = 13;
  public final static int _msoCameraLegacyPerspectiveFront = 14;
  public final static int _msoCameraLegacyPerspectiveRight = 15;
  public final static int _msoCameraLegacyPerspectiveBottomLeft = 16;
  public final static int _msoCameraLegacyPerspectiveBottom = 17;
  public final static int _msoCameraLegacyPerspectiveBottomRight = 18;
  public final static int _msoCameraOrthographicFront = 19;
  public final static int _msoCameraIsometricTopUp = 20;
  public final static int _msoCameraIsometricTopDown = 21;
  public final static int _msoCameraIsometricBottomUp = 22;
  public final static int _msoCameraIsometricBottomDown = 23;
  public final static int _msoCameraIsometricLeftUp = 24;
  public final static int _msoCameraIsometricLeftDown = 25;
  public final static int _msoCameraIsometricRightUp = 26;
  public final static int _msoCameraIsometricRightDown = 27;
  public final static int _msoCameraIsometricOffAxis1Left = 28;
  public final static int _msoCameraIsometricOffAxis1Right = 29;
  public final static int _msoCameraIsometricOffAxis1Top = 30;
  public final static int _msoCameraIsometricOffAxis2Left = 31;
  public final static int _msoCameraIsometricOffAxis2Right = 32;
  public final static int _msoCameraIsometricOffAxis2Top = 33;
  public final static int _msoCameraIsometricOffAxis3Left = 34;
  public final static int _msoCameraIsometricOffAxis3Right = 35;
  public final static int _msoCameraIsometricOffAxis3Bottom = 36;
  public final static int _msoCameraIsometricOffAxis4Left = 37;
  public final static int _msoCameraIsometricOffAxis4Right = 38;
  public final static int _msoCameraIsometricOffAxis4Bottom = 39;
  public final static int _msoCameraObliqueTopLeft = 40;
  public final static int _msoCameraObliqueTop = 41;
  public final static int _msoCameraObliqueTopRight = 42;
  public final static int _msoCameraObliqueLeft = 43;
  public final static int _msoCameraObliqueRight = 44;
  public final static int _msoCameraObliqueBottomLeft = 45;
  public final static int _msoCameraObliqueBottom = 46;
  public final static int _msoCameraObliqueBottomRight = 47;
  public final static int _msoCameraPerspectiveFront = 48;
  public final static int _msoCameraPerspectiveLeft = 49;
  public final static int _msoCameraPerspectiveRight = 50;
  public final static int _msoCameraPerspectiveAbove = 51;
  public final static int _msoCameraPerspectiveBelow = 52;
  public final static int _msoCameraPerspectiveAboveLeftFacing = 53;
  public final static int _msoCameraPerspectiveAboveRightFacing = 54;
  public final static int _msoCameraPerspectiveContrastingLeftFacing = 55;
  public final static int _msoCameraPerspectiveContrastingRightFacing = 56;
  public final static int _msoCameraPerspectiveHeroicLeftFacing = 57;
  public final static int _msoCameraPerspectiveHeroicRightFacing = 58;
  public final static int _msoCameraPerspectiveHeroicExtremeLeftFacing = 59;
  public final static int _msoCameraPerspectiveHeroicExtremeRightFacing = 60;
  public final static int _msoCameraPerspectiveRelaxed = 61;
  public final static int _msoCameraPerspectiveRelaxedModerately = 62;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoPresetCamera(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoPresetCamera valueOf(int value) {
    switch(value) {
    case -2: return msoPresetCameraMixed;
    case 1: return msoCameraLegacyObliqueTopLeft;
    case 2: return msoCameraLegacyObliqueTop;
    case 3: return msoCameraLegacyObliqueTopRight;
    case 4: return msoCameraLegacyObliqueLeft;
    case 5: return msoCameraLegacyObliqueFront;
    case 6: return msoCameraLegacyObliqueRight;
    case 7: return msoCameraLegacyObliqueBottomLeft;
    case 8: return msoCameraLegacyObliqueBottom;
    case 9: return msoCameraLegacyObliqueBottomRight;
    case 10: return msoCameraLegacyPerspectiveTopLeft;
    case 11: return msoCameraLegacyPerspectiveTop;
    case 12: return msoCameraLegacyPerspectiveTopRight;
    case 13: return msoCameraLegacyPerspectiveLeft;
    case 14: return msoCameraLegacyPerspectiveFront;
    case 15: return msoCameraLegacyPerspectiveRight;
    case 16: return msoCameraLegacyPerspectiveBottomLeft;
    case 17: return msoCameraLegacyPerspectiveBottom;
    case 18: return msoCameraLegacyPerspectiveBottomRight;
    case 19: return msoCameraOrthographicFront;
    case 20: return msoCameraIsometricTopUp;
    case 21: return msoCameraIsometricTopDown;
    case 22: return msoCameraIsometricBottomUp;
    case 23: return msoCameraIsometricBottomDown;
    case 24: return msoCameraIsometricLeftUp;
    case 25: return msoCameraIsometricLeftDown;
    case 26: return msoCameraIsometricRightUp;
    case 27: return msoCameraIsometricRightDown;
    case 28: return msoCameraIsometricOffAxis1Left;
    case 29: return msoCameraIsometricOffAxis1Right;
    case 30: return msoCameraIsometricOffAxis1Top;
    case 31: return msoCameraIsometricOffAxis2Left;
    case 32: return msoCameraIsometricOffAxis2Right;
    case 33: return msoCameraIsometricOffAxis2Top;
    case 34: return msoCameraIsometricOffAxis3Left;
    case 35: return msoCameraIsometricOffAxis3Right;
    case 36: return msoCameraIsometricOffAxis3Bottom;
    case 37: return msoCameraIsometricOffAxis4Left;
    case 38: return msoCameraIsometricOffAxis4Right;
    case 39: return msoCameraIsometricOffAxis4Bottom;
    case 40: return msoCameraObliqueTopLeft;
    case 41: return msoCameraObliqueTop;
    case 42: return msoCameraObliqueTopRight;
    case 43: return msoCameraObliqueLeft;
    case 44: return msoCameraObliqueRight;
    case 45: return msoCameraObliqueBottomLeft;
    case 46: return msoCameraObliqueBottom;
    case 47: return msoCameraObliqueBottomRight;
    case 48: return msoCameraPerspectiveFront;
    case 49: return msoCameraPerspectiveLeft;
    case 50: return msoCameraPerspectiveRight;
    case 51: return msoCameraPerspectiveAbove;
    case 52: return msoCameraPerspectiveBelow;
    case 53: return msoCameraPerspectiveAboveLeftFacing;
    case 54: return msoCameraPerspectiveAboveRightFacing;
    case 55: return msoCameraPerspectiveContrastingLeftFacing;
    case 56: return msoCameraPerspectiveContrastingRightFacing;
    case 57: return msoCameraPerspectiveHeroicLeftFacing;
    case 58: return msoCameraPerspectiveHeroicRightFacing;
    case 59: return msoCameraPerspectiveHeroicExtremeLeftFacing;
    case 60: return msoCameraPerspectiveHeroicExtremeRightFacing;
    case 61: return msoCameraPerspectiveRelaxed;
    case 62: return msoCameraPerspectiveRelaxedModerately;
    default: return new MsoPresetCamera(value);
    }
  }
}
