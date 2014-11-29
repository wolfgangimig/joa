/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlCategoryType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{78F07E6C-4BC5-41B8-8FE1-F1643184BA3F}")
public class XlCategoryType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlCategoryType xlCategoryScale = new XlCategoryType(2);
  public final static XlCategoryType xlTimeScale = new XlCategoryType(3);
  public final static XlCategoryType xlAutomaticScale = new XlCategoryType(-4105);

  // Integer constants for bitsets and switch statements
  public final static int _xlCategoryScale = 2;
  public final static int _xlTimeScale = 3;
  public final static int _xlAutomaticScale = -4105;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlCategoryType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlCategoryType valueOf(int value) {
    switch(value) {
    case 2: return xlCategoryScale;
    case 3: return xlTimeScale;
    case -4105: return xlAutomaticScale;
    default: return new XlCategoryType(value);
    }
  }
}
