/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCharacterSet.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoCharacterSet {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoCharacterSet msoCharacterSetArabic = new MsoCharacterSet(1);
  public final static MsoCharacterSet msoCharacterSetCyrillic = new MsoCharacterSet(2);
  public final static MsoCharacterSet msoCharacterSetEnglishWesternEuropeanOtherLatinScript = new MsoCharacterSet(3);
  public final static MsoCharacterSet msoCharacterSetGreek = new MsoCharacterSet(4);
  public final static MsoCharacterSet msoCharacterSetHebrew = new MsoCharacterSet(5);
  public final static MsoCharacterSet msoCharacterSetJapanese = new MsoCharacterSet(6);
  public final static MsoCharacterSet msoCharacterSetKorean = new MsoCharacterSet(7);
  public final static MsoCharacterSet msoCharacterSetMultilingualUnicode = new MsoCharacterSet(8);
  public final static MsoCharacterSet msoCharacterSetSimplifiedChinese = new MsoCharacterSet(9);
  public final static MsoCharacterSet msoCharacterSetThai = new MsoCharacterSet(10);
  public final static MsoCharacterSet msoCharacterSetTraditionalChinese = new MsoCharacterSet(11);
  public final static MsoCharacterSet msoCharacterSetVietnamese = new MsoCharacterSet(12);

  // Integer constants for bitsets and switch statements
  public final static int _msoCharacterSetArabic = 1;
  public final static int _msoCharacterSetCyrillic = 2;
  public final static int _msoCharacterSetEnglishWesternEuropeanOtherLatinScript = 3;
  public final static int _msoCharacterSetGreek = 4;
  public final static int _msoCharacterSetHebrew = 5;
  public final static int _msoCharacterSetJapanese = 6;
  public final static int _msoCharacterSetKorean = 7;
  public final static int _msoCharacterSetMultilingualUnicode = 8;
  public final static int _msoCharacterSetSimplifiedChinese = 9;
  public final static int _msoCharacterSetThai = 10;
  public final static int _msoCharacterSetTraditionalChinese = 11;
  public final static int _msoCharacterSetVietnamese = 12;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoCharacterSet(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new MsoCharacterSet(value);
    }
  }
}
