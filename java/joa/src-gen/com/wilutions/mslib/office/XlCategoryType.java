/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlCategoryType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{78F07E6C-4BC5-41B8-8FE1-F1643184BA3F}")
public enum XlCategoryType {
  xlCategoryScale(2),
  xlTimeScale(3),
  xlAutomaticScale(-4105);

  public final int value;
  private XlCategoryType(int value) { this.value = value; }
  public static  XlCategoryType valueOf(int value) {
    switch(value) {
    case 2: return xlCategoryScale;
    case 3: return xlTimeScale;
    case -4105: return xlAutomaticScale;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlCategoryType.class);
    }
  }
}
