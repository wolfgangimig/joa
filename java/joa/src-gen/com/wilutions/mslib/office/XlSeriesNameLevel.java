/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlSeriesNameLevel.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{76D9466C-84C2-4355-81FE-CB1B9CB03C19}")
public class XlSeriesNameLevel implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlSeriesNameLevel xlSeriesNameLevelNone = new XlSeriesNameLevel(-3);
  public final static XlSeriesNameLevel xlSeriesNameLevelCustom = new XlSeriesNameLevel(-2);
  public final static XlSeriesNameLevel xlSeriesNameLevelAll = new XlSeriesNameLevel(-1);

  // Integer constants for bitsets and switch statements
  public final static int _xlSeriesNameLevelNone = -3;
  public final static int _xlSeriesNameLevelCustom = -2;
  public final static int _xlSeriesNameLevelAll = -1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlSeriesNameLevel(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlSeriesNameLevel valueOf(int value) {
    switch(value) {
    case -3: return xlSeriesNameLevelNone;
    case -2: return xlSeriesNameLevelCustom;
    case -1: return xlSeriesNameLevelAll;
    default: return new XlSeriesNameLevel(value);
    }
  }

  public String toString() {
    switch(value) {
    case -3: return "xlSeriesNameLevelNone";
    case -2: return "xlSeriesNameLevelCustom";
    case -1: return "xlSeriesNameLevelAll";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -3) != 0) sbuf.append("|xlSeriesNameLevelNone");
      if ((value & -2) != 0) sbuf.append("|xlSeriesNameLevelCustom");
      if ((value & -1) != 0) sbuf.append("|xlSeriesNameLevelAll");
      return sbuf.toString();
      }
    }
  }
}
