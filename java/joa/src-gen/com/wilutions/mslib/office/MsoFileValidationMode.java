/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileValidationMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoFileValidationMode {
  msoFileValidationDefault(0),
  msoFileValidationSkip(1);

  public final int value;
  private MsoFileValidationMode(int value) { this.value = value; }
  public static  MsoFileValidationMode valueOf(int value) {
    switch(value) {
    case 0: return msoFileValidationDefault;
    case 1: return msoFileValidationSkip;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoFileValidationMode.class);
    }
  }
}
