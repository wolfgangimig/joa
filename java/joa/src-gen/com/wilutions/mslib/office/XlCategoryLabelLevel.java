/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlCategoryLabelLevel.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{BFFE8F80-6A67-4B7A-AEAA-8823E7932C87}")
public enum XlCategoryLabelLevel {
  xlCategoryLabelLevelNone(-3),
  xlCategoryLabelLevelCustom(-2),
  xlCategoryLabelLevelAll(-1);

  public final int value;
  private XlCategoryLabelLevel(int value) { this.value = value; }
  public static  XlCategoryLabelLevel valueOf(int value) {
    switch(value) {
    case -3: return xlCategoryLabelLevelNone;
    case -2: return xlCategoryLabelLevelCustom;
    case -1: return xlCategoryLabelLevelAll;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlCategoryLabelLevel.class);
    }
  }
}
