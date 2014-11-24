/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * BackstageGroupStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class BackstageGroupStyle {

  // Typed constants
  public final static BackstageGroupStyle BackstageGroupStyleNormal = new BackstageGroupStyle(0);
  public final static BackstageGroupStyle BackstageGroupStyleWarning = new BackstageGroupStyle(1);
  public final static BackstageGroupStyle BackstageGroupStyleError = new BackstageGroupStyle(2);

  // Integer constants for bitsets and switch statements
  public final static int _BackstageGroupStyleNormal = 0;
  public final static int _BackstageGroupStyleWarning = 1;
  public final static int _BackstageGroupStyleError = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private BackstageGroupStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  BackstageGroupStyle valueOf(int value) {
    switch(value) {
    case 0: return BackstageGroupStyleNormal;
    case 1: return BackstageGroupStyleWarning;
    case 2: return BackstageGroupStyleError;
    default: return new BackstageGroupStyle(value);
    }
  }
}
