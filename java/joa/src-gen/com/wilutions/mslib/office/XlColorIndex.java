/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlColorIndex.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{F6BA0ED9-B530-466E-83D5-325653CC1068}")
public class XlColorIndex {

  // Typed constants
  public final static XlColorIndex xlColorIndexAutomatic = new XlColorIndex(-4105);
  public final static XlColorIndex xlColorIndexNone = new XlColorIndex(-4142);

  // Integer constants for bitsets and switch statements
  public final static int _xlColorIndexAutomatic = -4105;
  public final static int _xlColorIndexNone = -4142;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlColorIndex(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlColorIndex valueOf(int value) {
    switch(value) {
    case -4105: return xlColorIndexAutomatic;
    case -4142: return xlColorIndexNone;
    default: return new XlColorIndex(value);
    }
  }
}
