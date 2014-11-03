/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * BackstageGroupStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum BackstageGroupStyle {
  BackstageGroupStyleNormal(0),
  BackstageGroupStyleWarning(1),
  BackstageGroupStyleError(2);

  public final int value;
  private BackstageGroupStyle(int value) { this.value = value; }
  public static  BackstageGroupStyle valueOf(int value) {
    switch(value) {
    case 0: return BackstageGroupStyleNormal;
    case 1: return BackstageGroupStyleWarning;
    case 2: return BackstageGroupStyleError;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + BackstageGroupStyle.class);
    }
  }
}
