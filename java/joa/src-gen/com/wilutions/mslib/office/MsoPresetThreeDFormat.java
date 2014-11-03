/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPresetThreeDFormat.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoPresetThreeDFormat {
  msoPresetThreeDFormatMixed(-2),
  msoThreeD1(1),
  msoThreeD2(2),
  msoThreeD3(3),
  msoThreeD4(4),
  msoThreeD5(5),
  msoThreeD6(6),
  msoThreeD7(7),
  msoThreeD8(8),
  msoThreeD9(9),
  msoThreeD10(10),
  msoThreeD11(11),
  msoThreeD12(12),
  msoThreeD13(13),
  msoThreeD14(14),
  msoThreeD15(15),
  msoThreeD16(16),
  msoThreeD17(17),
  msoThreeD18(18),
  msoThreeD19(19),
  msoThreeD20(20);

  public final int value;
  private MsoPresetThreeDFormat(int value) { this.value = value; }
  public static  MsoPresetThreeDFormat valueOf(int value) {
    switch(value) {
    case -2: return msoPresetThreeDFormatMixed;
    case 1: return msoThreeD1;
    case 2: return msoThreeD2;
    case 3: return msoThreeD3;
    case 4: return msoThreeD4;
    case 5: return msoThreeD5;
    case 6: return msoThreeD6;
    case 7: return msoThreeD7;
    case 8: return msoThreeD8;
    case 9: return msoThreeD9;
    case 10: return msoThreeD10;
    case 11: return msoThreeD11;
    case 12: return msoThreeD12;
    case 13: return msoThreeD13;
    case 14: return msoThreeD14;
    case 15: return msoThreeD15;
    case 16: return msoThreeD16;
    case 17: return msoThreeD17;
    case 18: return msoThreeD18;
    case 19: return msoThreeD19;
    case 20: return msoThreeD20;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoPresetThreeDFormat.class);
    }
  }
}
