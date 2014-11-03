/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoThemeColorIndex.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoThemeColorIndex {
  msoThemeColorMixed(-2),
  msoNotThemeColor(0),
  msoThemeColorDark1(1),
  msoThemeColorLight1(2),
  msoThemeColorDark2(3),
  msoThemeColorLight2(4),
  msoThemeColorAccent1(5),
  msoThemeColorAccent2(6),
  msoThemeColorAccent3(7),
  msoThemeColorAccent4(8),
  msoThemeColorAccent5(9),
  msoThemeColorAccent6(10),
  msoThemeColorHyperlink(11),
  msoThemeColorFollowedHyperlink(12),
  msoThemeColorText1(13),
  msoThemeColorBackground1(14),
  msoThemeColorText2(15),
  msoThemeColorBackground2(16);

  public final int value;
  private MsoThemeColorIndex(int value) { this.value = value; }
  public static  MsoThemeColorIndex valueOf(int value) {
    switch(value) {
    case -2: return msoThemeColorMixed;
    case 0: return msoNotThemeColor;
    case 1: return msoThemeColorDark1;
    case 2: return msoThemeColorLight1;
    case 3: return msoThemeColorDark2;
    case 4: return msoThemeColorLight2;
    case 5: return msoThemeColorAccent1;
    case 6: return msoThemeColorAccent2;
    case 7: return msoThemeColorAccent3;
    case 8: return msoThemeColorAccent4;
    case 9: return msoThemeColorAccent5;
    case 10: return msoThemeColorAccent6;
    case 11: return msoThemeColorHyperlink;
    case 12: return msoThemeColorFollowedHyperlink;
    case 13: return msoThemeColorText1;
    case 14: return msoThemeColorBackground1;
    case 15: return msoThemeColorText2;
    case 16: return msoThemeColorBackground2;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoThemeColorIndex.class);
    }
  }
}
