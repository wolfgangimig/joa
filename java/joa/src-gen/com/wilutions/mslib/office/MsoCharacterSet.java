/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCharacterSet.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoCharacterSet {
  msoCharacterSetArabic(1),
  msoCharacterSetCyrillic(2),
  msoCharacterSetEnglishWesternEuropeanOtherLatinScript(3),
  msoCharacterSetGreek(4),
  msoCharacterSetHebrew(5),
  msoCharacterSetJapanese(6),
  msoCharacterSetKorean(7),
  msoCharacterSetMultilingualUnicode(8),
  msoCharacterSetSimplifiedChinese(9),
  msoCharacterSetThai(10),
  msoCharacterSetTraditionalChinese(11),
  msoCharacterSetVietnamese(12);

  public final int value;
  private MsoCharacterSet(int value) { this.value = value; }
  public static  MsoCharacterSet valueOf(int value) {
    switch(value) {
    case 1: return msoCharacterSetArabic;
    case 2: return msoCharacterSetCyrillic;
    case 3: return msoCharacterSetEnglishWesternEuropeanOtherLatinScript;
    case 4: return msoCharacterSetGreek;
    case 5: return msoCharacterSetHebrew;
    case 6: return msoCharacterSetJapanese;
    case 7: return msoCharacterSetKorean;
    case 8: return msoCharacterSetMultilingualUnicode;
    case 9: return msoCharacterSetSimplifiedChinese;
    case 10: return msoCharacterSetThai;
    case 11: return msoCharacterSetTraditionalChinese;
    case 12: return msoCharacterSetVietnamese;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoCharacterSet.class);
    }
  }
}
