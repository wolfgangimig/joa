/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlColorIndex.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{F6BA0ED9-B530-466E-83D5-325653CC1068}")
public enum XlColorIndex {
  xlColorIndexAutomatic(-4105),
  xlColorIndexNone(-4142);

  public final int value;
  private XlColorIndex(int value) { this.value = value; }
  public static  XlColorIndex valueOf(int value) {
    switch(value) {
    case -4105: return xlColorIndexAutomatic;
    case -4142: return xlColorIndexNone;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlColorIndex.class);
    }
  }
}
