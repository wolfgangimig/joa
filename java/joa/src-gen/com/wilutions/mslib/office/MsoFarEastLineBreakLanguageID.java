/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFarEastLineBreakLanguageID.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoFarEastLineBreakLanguageID {
  MsoFarEastLineBreakLanguageJapanese(1041),
  MsoFarEastLineBreakLanguageKorean(1042),
  MsoFarEastLineBreakLanguageSimplifiedChinese(2052),
  MsoFarEastLineBreakLanguageTraditionalChinese(1028);

  public final int value;
  private MsoFarEastLineBreakLanguageID(int value) { this.value = value; }
  public static  MsoFarEastLineBreakLanguageID valueOf(int value) {
    switch(value) {
    case 1041: return MsoFarEastLineBreakLanguageJapanese;
    case 1042: return MsoFarEastLineBreakLanguageKorean;
    case 2052: return MsoFarEastLineBreakLanguageSimplifiedChinese;
    case 1028: return MsoFarEastLineBreakLanguageTraditionalChinese;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoFarEastLineBreakLanguageID.class);
    }
  }
}
