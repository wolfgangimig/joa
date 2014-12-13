/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlCategoryLabelLevel.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{BFFE8F80-6A67-4B7A-AEAA-8823E7932C87}")
public class XlCategoryLabelLevel implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlCategoryLabelLevel xlCategoryLabelLevelNone = new XlCategoryLabelLevel(-3);
  public final static XlCategoryLabelLevel xlCategoryLabelLevelCustom = new XlCategoryLabelLevel(-2);
  public final static XlCategoryLabelLevel xlCategoryLabelLevelAll = new XlCategoryLabelLevel(-1);

  // Integer constants for bitsets and switch statements
  public final static int _xlCategoryLabelLevelNone = -3;
  public final static int _xlCategoryLabelLevelCustom = -2;
  public final static int _xlCategoryLabelLevelAll = -1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlCategoryLabelLevel(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlCategoryLabelLevel valueOf(int value) {
    switch(value) {
    case -3: return xlCategoryLabelLevelNone;
    case -2: return xlCategoryLabelLevelCustom;
    case -1: return xlCategoryLabelLevelAll;
    default: return new XlCategoryLabelLevel(value);
    }
  }

  public String toString() {
    switch(value) {
    case -3: return "xlCategoryLabelLevelNone";
    case -2: return "xlCategoryLabelLevelCustom";
    case -1: return "xlCategoryLabelLevelAll";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -3) != 0) sbuf.append("|xlCategoryLabelLevelNone");
      if ((value & -2) != 0) sbuf.append("|xlCategoryLabelLevelCustom");
      if ((value & -1) != 0) sbuf.append("|xlCategoryLabelLevelAll");
      return sbuf.toString();
      }
    }
  }
}
