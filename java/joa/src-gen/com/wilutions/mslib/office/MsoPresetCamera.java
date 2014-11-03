/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPresetCamera.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoPresetCamera {
  msoPresetCameraMixed(-2),
  msoCameraLegacyObliqueTopLeft(1),
  msoCameraLegacyObliqueTop(2),
  msoCameraLegacyObliqueTopRight(3),
  msoCameraLegacyObliqueLeft(4),
  msoCameraLegacyObliqueFront(5),
  msoCameraLegacyObliqueRight(6),
  msoCameraLegacyObliqueBottomLeft(7),
  msoCameraLegacyObliqueBottom(8),
  msoCameraLegacyObliqueBottomRight(9),
  msoCameraLegacyPerspectiveTopLeft(10),
  msoCameraLegacyPerspectiveTop(11),
  msoCameraLegacyPerspectiveTopRight(12),
  msoCameraLegacyPerspectiveLeft(13),
  msoCameraLegacyPerspectiveFront(14),
  msoCameraLegacyPerspectiveRight(15),
  msoCameraLegacyPerspectiveBottomLeft(16),
  msoCameraLegacyPerspectiveBottom(17),
  msoCameraLegacyPerspectiveBottomRight(18),
  msoCameraOrthographicFront(19),
  msoCameraIsometricTopUp(20),
  msoCameraIsometricTopDown(21),
  msoCameraIsometricBottomUp(22),
  msoCameraIsometricBottomDown(23),
  msoCameraIsometricLeftUp(24),
  msoCameraIsometricLeftDown(25),
  msoCameraIsometricRightUp(26),
  msoCameraIsometricRightDown(27),
  msoCameraIsometricOffAxis1Left(28),
  msoCameraIsometricOffAxis1Right(29),
  msoCameraIsometricOffAxis1Top(30),
  msoCameraIsometricOffAxis2Left(31),
  msoCameraIsometricOffAxis2Right(32),
  msoCameraIsometricOffAxis2Top(33),
  msoCameraIsometricOffAxis3Left(34),
  msoCameraIsometricOffAxis3Right(35),
  msoCameraIsometricOffAxis3Bottom(36),
  msoCameraIsometricOffAxis4Left(37),
  msoCameraIsometricOffAxis4Right(38),
  msoCameraIsometricOffAxis4Bottom(39),
  msoCameraObliqueTopLeft(40),
  msoCameraObliqueTop(41),
  msoCameraObliqueTopRight(42),
  msoCameraObliqueLeft(43),
  msoCameraObliqueRight(44),
  msoCameraObliqueBottomLeft(45),
  msoCameraObliqueBottom(46),
  msoCameraObliqueBottomRight(47),
  msoCameraPerspectiveFront(48),
  msoCameraPerspectiveLeft(49),
  msoCameraPerspectiveRight(50),
  msoCameraPerspectiveAbove(51),
  msoCameraPerspectiveBelow(52),
  msoCameraPerspectiveAboveLeftFacing(53),
  msoCameraPerspectiveAboveRightFacing(54),
  msoCameraPerspectiveContrastingLeftFacing(55),
  msoCameraPerspectiveContrastingRightFacing(56),
  msoCameraPerspectiveHeroicLeftFacing(57),
  msoCameraPerspectiveHeroicRightFacing(58),
  msoCameraPerspectiveHeroicExtremeLeftFacing(59),
  msoCameraPerspectiveHeroicExtremeRightFacing(60),
  msoCameraPerspectiveRelaxed(61),
  msoCameraPerspectiveRelaxedModerately(62);

  public final int value;
  private MsoPresetCamera(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoPresetCamera.class);
    }
  }
}
