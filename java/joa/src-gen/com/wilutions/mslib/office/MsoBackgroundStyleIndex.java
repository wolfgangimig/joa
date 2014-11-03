/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBackgroundStyleIndex.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoBackgroundStyleIndex {
  msoBackgroundStyleMixed(-2),
  msoBackgroundStyleNotAPreset(0),
  msoBackgroundStylePreset1(1),
  msoBackgroundStylePreset2(2),
  msoBackgroundStylePreset3(3),
  msoBackgroundStylePreset4(4),
  msoBackgroundStylePreset5(5),
  msoBackgroundStylePreset6(6),
  msoBackgroundStylePreset7(7),
  msoBackgroundStylePreset8(8),
  msoBackgroundStylePreset9(9),
  msoBackgroundStylePreset10(10),
  msoBackgroundStylePreset11(11),
  msoBackgroundStylePreset12(12);

  public final int value;
  private MsoBackgroundStyleIndex(int value) { this.value = value; }
  public static  MsoBackgroundStyleIndex valueOf(int value) {
    switch(value) {
    case -2: return msoBackgroundStyleMixed;
    case 0: return msoBackgroundStyleNotAPreset;
    case 1: return msoBackgroundStylePreset1;
    case 2: return msoBackgroundStylePreset2;
    case 3: return msoBackgroundStylePreset3;
    case 4: return msoBackgroundStylePreset4;
    case 5: return msoBackgroundStylePreset5;
    case 6: return msoBackgroundStylePreset6;
    case 7: return msoBackgroundStylePreset7;
    case 8: return msoBackgroundStylePreset8;
    case 9: return msoBackgroundStylePreset9;
    case 10: return msoBackgroundStylePreset10;
    case 11: return msoBackgroundStylePreset11;
    case 12: return msoBackgroundStylePreset12;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoBackgroundStyleIndex.class);
    }
  }
}
