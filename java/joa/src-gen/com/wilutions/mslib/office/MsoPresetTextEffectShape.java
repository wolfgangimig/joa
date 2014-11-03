/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPresetTextEffectShape.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoPresetTextEffectShape {
  msoTextEffectShapeMixed(-2),
  msoTextEffectShapePlainText(1),
  msoTextEffectShapeStop(2),
  msoTextEffectShapeTriangleUp(3),
  msoTextEffectShapeTriangleDown(4),
  msoTextEffectShapeChevronUp(5),
  msoTextEffectShapeChevronDown(6),
  msoTextEffectShapeRingInside(7),
  msoTextEffectShapeRingOutside(8),
  msoTextEffectShapeArchUpCurve(9),
  msoTextEffectShapeArchDownCurve(10),
  msoTextEffectShapeCircleCurve(11),
  msoTextEffectShapeButtonCurve(12),
  msoTextEffectShapeArchUpPour(13),
  msoTextEffectShapeArchDownPour(14),
  msoTextEffectShapeCirclePour(15),
  msoTextEffectShapeButtonPour(16),
  msoTextEffectShapeCurveUp(17),
  msoTextEffectShapeCurveDown(18),
  msoTextEffectShapeCanUp(19),
  msoTextEffectShapeCanDown(20),
  msoTextEffectShapeWave1(21),
  msoTextEffectShapeWave2(22),
  msoTextEffectShapeDoubleWave1(23),
  msoTextEffectShapeDoubleWave2(24),
  msoTextEffectShapeInflate(25),
  msoTextEffectShapeDeflate(26),
  msoTextEffectShapeInflateBottom(27),
  msoTextEffectShapeDeflateBottom(28),
  msoTextEffectShapeInflateTop(29),
  msoTextEffectShapeDeflateTop(30),
  msoTextEffectShapeDeflateInflate(31),
  msoTextEffectShapeDeflateInflateDeflate(32),
  msoTextEffectShapeFadeRight(33),
  msoTextEffectShapeFadeLeft(34),
  msoTextEffectShapeFadeUp(35),
  msoTextEffectShapeFadeDown(36),
  msoTextEffectShapeSlantUp(37),
  msoTextEffectShapeSlantDown(38),
  msoTextEffectShapeCascadeUp(39),
  msoTextEffectShapeCascadeDown(40);

  public final int value;
  private MsoPresetTextEffectShape(int value) { this.value = value; }
  public static  MsoPresetTextEffectShape valueOf(int value) {
    switch(value) {
    case -2: return msoTextEffectShapeMixed;
    case 1: return msoTextEffectShapePlainText;
    case 2: return msoTextEffectShapeStop;
    case 3: return msoTextEffectShapeTriangleUp;
    case 4: return msoTextEffectShapeTriangleDown;
    case 5: return msoTextEffectShapeChevronUp;
    case 6: return msoTextEffectShapeChevronDown;
    case 7: return msoTextEffectShapeRingInside;
    case 8: return msoTextEffectShapeRingOutside;
    case 9: return msoTextEffectShapeArchUpCurve;
    case 10: return msoTextEffectShapeArchDownCurve;
    case 11: return msoTextEffectShapeCircleCurve;
    case 12: return msoTextEffectShapeButtonCurve;
    case 13: return msoTextEffectShapeArchUpPour;
    case 14: return msoTextEffectShapeArchDownPour;
    case 15: return msoTextEffectShapeCirclePour;
    case 16: return msoTextEffectShapeButtonPour;
    case 17: return msoTextEffectShapeCurveUp;
    case 18: return msoTextEffectShapeCurveDown;
    case 19: return msoTextEffectShapeCanUp;
    case 20: return msoTextEffectShapeCanDown;
    case 21: return msoTextEffectShapeWave1;
    case 22: return msoTextEffectShapeWave2;
    case 23: return msoTextEffectShapeDoubleWave1;
    case 24: return msoTextEffectShapeDoubleWave2;
    case 25: return msoTextEffectShapeInflate;
    case 26: return msoTextEffectShapeDeflate;
    case 27: return msoTextEffectShapeInflateBottom;
    case 28: return msoTextEffectShapeDeflateBottom;
    case 29: return msoTextEffectShapeInflateTop;
    case 30: return msoTextEffectShapeDeflateTop;
    case 31: return msoTextEffectShapeDeflateInflate;
    case 32: return msoTextEffectShapeDeflateInflateDeflate;
    case 33: return msoTextEffectShapeFadeRight;
    case 34: return msoTextEffectShapeFadeLeft;
    case 35: return msoTextEffectShapeFadeUp;
    case 36: return msoTextEffectShapeFadeDown;
    case 37: return msoTextEffectShapeSlantUp;
    case 38: return msoTextEffectShapeSlantDown;
    case 39: return msoTextEffectShapeCascadeUp;
    case 40: return msoTextEffectShapeCascadeDown;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoPresetTextEffectShape.class);
    }
  }
}
