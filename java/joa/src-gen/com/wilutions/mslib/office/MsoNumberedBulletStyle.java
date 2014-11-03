/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoNumberedBulletStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoNumberedBulletStyle {
  msoBulletStyleMixed(-2),
  msoBulletAlphaLCPeriod(0),
  msoBulletAlphaUCPeriod(1),
  msoBulletArabicParenRight(2),
  msoBulletArabicPeriod(3),
  msoBulletRomanLCParenBoth(4),
  msoBulletRomanLCParenRight(5),
  msoBulletRomanLCPeriod(6),
  msoBulletRomanUCPeriod(7),
  msoBulletAlphaLCParenBoth(8),
  msoBulletAlphaLCParenRight(9),
  msoBulletAlphaUCParenBoth(10),
  msoBulletAlphaUCParenRight(11),
  msoBulletArabicParenBoth(12),
  msoBulletArabicPlain(13),
  msoBulletRomanUCParenBoth(14),
  msoBulletRomanUCParenRight(15),
  msoBulletSimpChinPlain(16),
  msoBulletSimpChinPeriod(17),
  msoBulletCircleNumDBPlain(18),
  msoBulletCircleNumWDWhitePlain(19),
  msoBulletCircleNumWDBlackPlain(20),
  msoBulletTradChinPlain(21),
  msoBulletTradChinPeriod(22),
  msoBulletArabicAlphaDash(23),
  msoBulletArabicAbjadDash(24),
  msoBulletHebrewAlphaDash(25),
  msoBulletKanjiKoreanPlain(26),
  msoBulletKanjiKoreanPeriod(27),
  msoBulletArabicDBPlain(28),
  msoBulletArabicDBPeriod(29),
  msoBulletThaiAlphaPeriod(30),
  msoBulletThaiAlphaParenRight(31),
  msoBulletThaiAlphaParenBoth(32),
  msoBulletThaiNumPeriod(33),
  msoBulletThaiNumParenRight(34),
  msoBulletThaiNumParenBoth(35),
  msoBulletHindiAlphaPeriod(36),
  msoBulletHindiNumPeriod(37),
  msoBulletKanjiSimpChinDBPeriod(38),
  msoBulletHindiNumParenRight(39),
  msoBulletHindiAlpha1Period(40);

  public final int value;
  private MsoNumberedBulletStyle(int value) { this.value = value; }
  public static  MsoNumberedBulletStyle valueOf(int value) {
    switch(value) {
    case -2: return msoBulletStyleMixed;
    case 0: return msoBulletAlphaLCPeriod;
    case 1: return msoBulletAlphaUCPeriod;
    case 2: return msoBulletArabicParenRight;
    case 3: return msoBulletArabicPeriod;
    case 4: return msoBulletRomanLCParenBoth;
    case 5: return msoBulletRomanLCParenRight;
    case 6: return msoBulletRomanLCPeriod;
    case 7: return msoBulletRomanUCPeriod;
    case 8: return msoBulletAlphaLCParenBoth;
    case 9: return msoBulletAlphaLCParenRight;
    case 10: return msoBulletAlphaUCParenBoth;
    case 11: return msoBulletAlphaUCParenRight;
    case 12: return msoBulletArabicParenBoth;
    case 13: return msoBulletArabicPlain;
    case 14: return msoBulletRomanUCParenBoth;
    case 15: return msoBulletRomanUCParenRight;
    case 16: return msoBulletSimpChinPlain;
    case 17: return msoBulletSimpChinPeriod;
    case 18: return msoBulletCircleNumDBPlain;
    case 19: return msoBulletCircleNumWDWhitePlain;
    case 20: return msoBulletCircleNumWDBlackPlain;
    case 21: return msoBulletTradChinPlain;
    case 22: return msoBulletTradChinPeriod;
    case 23: return msoBulletArabicAlphaDash;
    case 24: return msoBulletArabicAbjadDash;
    case 25: return msoBulletHebrewAlphaDash;
    case 26: return msoBulletKanjiKoreanPlain;
    case 27: return msoBulletKanjiKoreanPeriod;
    case 28: return msoBulletArabicDBPlain;
    case 29: return msoBulletArabicDBPeriod;
    case 30: return msoBulletThaiAlphaPeriod;
    case 31: return msoBulletThaiAlphaParenRight;
    case 32: return msoBulletThaiAlphaParenBoth;
    case 33: return msoBulletThaiNumPeriod;
    case 34: return msoBulletThaiNumParenRight;
    case 35: return msoBulletThaiNumParenBoth;
    case 36: return msoBulletHindiAlphaPeriod;
    case 37: return msoBulletHindiNumPeriod;
    case 38: return msoBulletKanjiSimpChinDBPeriod;
    case 39: return msoBulletHindiNumParenRight;
    case 40: return msoBulletHindiAlpha1Period;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoNumberedBulletStyle.class);
    }
  }
}
