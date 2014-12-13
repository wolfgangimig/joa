/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFarEastLineBreakLanguageID.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoFarEastLineBreakLanguageID implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoFarEastLineBreakLanguageID MsoFarEastLineBreakLanguageJapanese = new MsoFarEastLineBreakLanguageID(1041);
  public final static MsoFarEastLineBreakLanguageID MsoFarEastLineBreakLanguageKorean = new MsoFarEastLineBreakLanguageID(1042);
  public final static MsoFarEastLineBreakLanguageID MsoFarEastLineBreakLanguageSimplifiedChinese = new MsoFarEastLineBreakLanguageID(2052);
  public final static MsoFarEastLineBreakLanguageID MsoFarEastLineBreakLanguageTraditionalChinese = new MsoFarEastLineBreakLanguageID(1028);

  // Integer constants for bitsets and switch statements
  public final static int _MsoFarEastLineBreakLanguageJapanese = 1041;
  public final static int _MsoFarEastLineBreakLanguageKorean = 1042;
  public final static int _MsoFarEastLineBreakLanguageSimplifiedChinese = 2052;
  public final static int _MsoFarEastLineBreakLanguageTraditionalChinese = 1028;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoFarEastLineBreakLanguageID(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoFarEastLineBreakLanguageID valueOf(int value) {
    switch(value) {
    case 1041: return MsoFarEastLineBreakLanguageJapanese;
    case 1042: return MsoFarEastLineBreakLanguageKorean;
    case 2052: return MsoFarEastLineBreakLanguageSimplifiedChinese;
    case 1028: return MsoFarEastLineBreakLanguageTraditionalChinese;
    default: return new MsoFarEastLineBreakLanguageID(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1041: return "MsoFarEastLineBreakLanguageJapanese";
    case 1028: return "MsoFarEastLineBreakLanguageTraditionalChinese";
    case 1042: return "MsoFarEastLineBreakLanguageKorean";
    case 2052: return "MsoFarEastLineBreakLanguageSimplifiedChinese";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1041) != 0) sbuf.append("|MsoFarEastLineBreakLanguageJapanese");
      if ((value & 1028) != 0) sbuf.append("|MsoFarEastLineBreakLanguageTraditionalChinese");
      if ((value & 1042) != 0) sbuf.append("|MsoFarEastLineBreakLanguageKorean");
      if ((value & 2052) != 0) sbuf.append("|MsoFarEastLineBreakLanguageSimplifiedChinese");
      return sbuf.toString();
      }
    }
  }
}
