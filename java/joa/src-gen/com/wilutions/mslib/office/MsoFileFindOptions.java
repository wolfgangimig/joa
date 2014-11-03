/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileFindOptions.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoFileFindOptions {
  msoOptionsNew(1),
  msoOptionsAdd(2),
  msoOptionsWithin(3);

  public final int value;
  private MsoFileFindOptions(int value) { this.value = value; }
  public static  MsoFileFindOptions valueOf(int value) {
    switch(value) {
    case 1: return msoOptionsNew;
    case 2: return msoOptionsAdd;
    case 3: return msoOptionsWithin;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoFileFindOptions.class);
    }
  }
}
